package com.ztesoft.dispatcher.common.supcan.freeform;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.ztesoft.dispatcher.common.supcan.common.Common;
import com.ztesoft.dispatcher.common.supcan.common.properties.Properties;

/**
 * 硕正FreeForm
 *
 * @author WangZhen
 * @version 2013-11-04
 */
@XStreamAlias("FreeForm")
public class FreeForm extends Common {

    public FreeForm() {
        super();
    }

    public FreeForm(Properties properties) {
        this();
        this.properties = properties;
    }

}
