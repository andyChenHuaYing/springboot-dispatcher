package com.ztesoft.dispatcher.modules.test.service;

import com.ztesoft.dispatcher.common.persistence.Page;
import com.ztesoft.dispatcher.common.service.CrudService;
import com.ztesoft.dispatcher.common.utils.StringUtils;
import com.ztesoft.dispatcher.modules.test.dao.TestDataChildDao;
import com.ztesoft.dispatcher.modules.test.dao.TestDataMainDao;
import com.ztesoft.dispatcher.modules.test.entity.TestDataChild;
import com.ztesoft.dispatcher.modules.test.entity.TestDataMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 主子表生成Service
 *
 * @author ThinkGem
 * @version 2015-04-06
 */
@Service
@Transactional(readOnly = true)
public class TestDataMainService extends CrudService<TestDataMainDao, TestDataMain> {

    @Autowired
    private TestDataChildDao testDataChildDao;

    public TestDataMain get(String id) {
        TestDataMain testDataMain = super.get(id);
        testDataMain.setTestDataChildList(testDataChildDao.findList(new TestDataChild(testDataMain)));
        return testDataMain;
    }

    public List<TestDataMain> findList(TestDataMain testDataMain) {
        return super.findList(testDataMain);
    }

    public Page<TestDataMain> findPage(Page<TestDataMain> page, TestDataMain testDataMain) {
        return super.findPage(page, testDataMain);
    }

    @Transactional(readOnly = false)
    public void save(TestDataMain testDataMain) {
        super.save(testDataMain);
        for (TestDataChild testDataChild : testDataMain.getTestDataChildList()) {
            if (testDataChild.getId() == null) {
                continue;
            }
            if (TestDataChild.DEL_FLAG_NORMAL.equals(testDataChild.getDelFlag())) {
                if (StringUtils.isBlank(testDataChild.getId())) {
                    testDataChild.setTestDataMain(testDataMain);
                    testDataChild.preInsert();
                    testDataChildDao.insert(testDataChild);
                } else {
                    testDataChild.preUpdate();
                    testDataChildDao.update(testDataChild);
                }
            } else {
                testDataChildDao.delete(testDataChild);
            }
        }
    }

    @Transactional(readOnly = false)
    public void delete(TestDataMain testDataMain) {
        super.delete(testDataMain);
        testDataChildDao.delete(new TestDataChild(testDataMain));
    }

}