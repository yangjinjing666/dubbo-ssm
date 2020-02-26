package com.yangjinjing.article.service;

import com.github.pagehelper.PageInfo;
import com.yangjinjing.article.entity.Article;

/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月26日 下午5:16:23
* 类功能说明 
*/
public interface ArticleService {
	
	PageInfo<Article> list(int page,String beginDate,String endDate,String orderVal);
	
	
}
