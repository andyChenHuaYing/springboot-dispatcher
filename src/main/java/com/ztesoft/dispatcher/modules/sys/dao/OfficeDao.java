package com.ztesoft.dispatcher.modules.sys.dao;

import com.ztesoft.dispatcher.common.persistence.TreeDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.sys.entity.Office;

/**
 * 机构DAO接口
 *
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {

}
