package com.ztesoft.dispatcher.modules.oa.dao;

import com.ztesoft.dispatcher.common.persistence.CrudDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.oa.entity.OaNotifyRecord;

import java.util.List;

/**
 * 通知通告记录DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OaNotifyRecordDao extends CrudDao<OaNotifyRecord> {

    /**
     * 插入通知记录
     *
     * @param oaNotifyRecordList
     * @return
     */
    public int insertAll(List<OaNotifyRecord> oaNotifyRecordList);

    /**
     * 根据通知ID删除通知记录
     *
     * @param oaNotifyId 通知ID
     * @return
     */
    public int deleteByOaNotifyId(String oaNotifyId);

}