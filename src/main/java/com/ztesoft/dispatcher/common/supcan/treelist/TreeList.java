package com.ztesoft.dispatcher.common.supcan.treelist;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.ztesoft.dispatcher.common.supcan.annotation.common.fonts.SupFont;
import com.ztesoft.dispatcher.common.supcan.annotation.treelist.SupTreeList;
import com.ztesoft.dispatcher.common.supcan.common.Common;
import com.ztesoft.dispatcher.common.supcan.common.fonts.Font;
import com.ztesoft.dispatcher.common.supcan.common.properties.Properties;

import java.util.List;

/**
 * 硕正TreeList
 *
 * @author WangZhen
 * @version 2013-11-04
 */
@XStreamAlias("TreeList")
public class TreeList extends Common {

    /**
     * 列集合
     */
    @XStreamAlias("Cols")
    private List<Object> cols;

    public TreeList() {
        super();
    }

    public TreeList(Properties properties) {
        this();
        this.properties = properties;
    }

    public TreeList(SupTreeList supTreeList) {
        this();
        if (supTreeList != null) {
            if (supTreeList.properties() != null) {
                this.properties = new Properties(supTreeList.properties());
            }
            if (supTreeList.fonts() != null) {
                for (SupFont supFont : supTreeList.fonts()) {
                    if (this.fonts == null) {
                        this.fonts = Lists.newArrayList();
                    }
                    this.fonts.add(new Font(supFont));
                }
            }
        }
    }

    public List<Object> getCols() {
        if (cols == null) {
            cols = Lists.newArrayList();
        }
        return cols;
    }

    public void setCols(List<Object> cols) {
        this.cols = cols;
    }

}
