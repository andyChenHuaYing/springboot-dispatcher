package com.ztesoft.dispatcher.modules.oa.dao;

import com.ztesoft.dispatcher.common.persistence.CrudDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.oa.entity.OaNotify;

/**
 * 通知通告DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OaNotifyDao extends CrudDao<OaNotify> {

    /**
     * 获取通知数目
     *
     * @param oaNotify
     * @return
     */
    public Long findCount(OaNotify oaNotify);

}