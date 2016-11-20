package com.ztesoft.dispatcher.modules.gen.dao;

import com.ztesoft.dispatcher.common.persistence.CrudDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.gen.entity.GenTable;
import com.ztesoft.dispatcher.modules.gen.entity.GenTableColumn;

import java.util.List;

/**
 * 业务表字段DAO接口
 *
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenDataBaseDictDao extends CrudDao<GenTableColumn> {

    /**
     * 查询表列表
     *
     * @param genTable
     * @return
     */
    List<GenTable> findTableList(GenTable genTable);

    /**
     * 获取数据表字段
     *
     * @param genTable
     * @return
     */
    List<GenTableColumn> findTableColumnList(GenTable genTable);

    /**
     * 获取数据表主键
     *
     * @param genTable
     * @return
     */
    List<String> findTablePK(GenTable genTable);

}
