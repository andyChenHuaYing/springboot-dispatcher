package com.ztesoft.dispatcher.modules.test.dao;

import com.ztesoft.dispatcher.common.persistence.TreeDao;
import com.ztesoft.dispatcher.common.persistence.annotation.MyBatisDao;
import com.ztesoft.dispatcher.modules.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 *
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {

}