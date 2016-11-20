package com.ztesoft.dispatcher.modules.test.service;

import com.ztesoft.dispatcher.common.service.TreeService;
import com.ztesoft.dispatcher.common.utils.StringUtils;
import com.ztesoft.dispatcher.modules.test.dao.TestTreeDao;
import com.ztesoft.dispatcher.modules.test.entity.TestTree;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 树结构生成Service
 *
 * @author ThinkGem
 * @version 2015-04-06
 */
@Service
@Transactional(readOnly = true)
public class TestTreeService extends TreeService<TestTreeDao, TestTree> {

    public TestTree get(String id) {
        return super.get(id);
    }

    public List<TestTree> findList(TestTree testTree) {
        if (StringUtils.isNotBlank(testTree.getParentIds())) {
            testTree.setParentIds("," + testTree.getParentIds() + ",");
        }
        return super.findList(testTree);
    }

    @Transactional
    public void save(TestTree testTree) {
        super.save(testTree);
    }

    @Transactional
    public void delete(TestTree testTree) {
        super.delete(testTree);
    }

}