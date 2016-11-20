package com.ztesoft.dispatcher.modules.test.service;

import com.ztesoft.dispatcher.common.persistence.Page;
import com.ztesoft.dispatcher.common.service.CrudService;
import com.ztesoft.dispatcher.modules.test.dao.TestDataDao;
import com.ztesoft.dispatcher.modules.test.entity.TestData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 单表生成Service
 *
 * @author ThinkGem
 * @version 2015-04-06
 */
@Service
@Transactional(readOnly = true)
public class TestDataService extends CrudService<TestDataDao, TestData> {

    public TestData get(String id) {
        return super.get(id);
    }

    public List<TestData> findList(TestData testData) {
        return super.findList(testData);
    }

    public Page<TestData> findPage(Page<TestData> page, TestData testData) {
        return super.findPage(page, testData);
    }

    @Transactional
    public void save(TestData testData) {
        super.save(testData);
    }

    @Transactional()
    public void delete(TestData testData) {
        super.delete(testData);
    }

}