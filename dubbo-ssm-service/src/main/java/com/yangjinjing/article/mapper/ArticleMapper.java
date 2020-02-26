package com.yangjinjing.article.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yangjinjing.article.entity.Article;

/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月26日 下午5:22:32
* 类功能说明 
*/
public interface ArticleMapper {
	
	List<Article> list(@Param("beginDate") String beginDate,@Param("endDate")String endDate,@Param("orderValue") String orderValue);

}
