package com.ztesoft.dispatcher.modules.cms.service;

import com.ztesoft.dispatcher.common.service.CrudService;
import com.ztesoft.dispatcher.modules.cms.dao.ArticleDataDao;
import com.ztesoft.dispatcher.modules.cms.entity.ArticleData;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 站点Service
 *
 * @author ThinkGem
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
