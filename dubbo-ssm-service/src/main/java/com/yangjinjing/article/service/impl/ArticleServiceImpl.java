package com.yangjinjing.article.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangjinjing.article.entity.Article;
import com.yangjinjing.article.mapper.ArticleMapper;
import com.yangjinjing.article.service.ArticleService;

/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月26日 下午5:35:46
* 类功能说明 
*/
@Service(interfaceClass=ArticleService.class)
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper mapper;
	
	@Override
	public PageInfo<Article> list(int page, String beginDate, String endDate, String orderValue) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,3);
		return new PageInfo<Article>(mapper.list(beginDate, endDate, orderValue));
	}

}
