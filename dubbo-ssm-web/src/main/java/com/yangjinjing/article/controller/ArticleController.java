package com.yangjinjing.article.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.yangjinjing.article.entity.Article;
import com.yangjinjing.article.service.ArticleService;

/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月26日 下午5:49:31
* 类功能说明 
*/
@Controller
public class ArticleController {
	
	@Reference(url="dubbo://127.0.0.1:20881")
	ArticleService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int page,@RequestParam(defaultValue="0") String orderValue,Model model,@RequestParam(defaultValue="")String beginDate,@RequestParam(defaultValue="")String endDate){
		PageInfo<Article> list = service.list(page, beginDate, endDate, orderValue);
		List<Article> articleList = list.getList();
		model.addAttribute("list", articleList);
		return "list";
	}
	
	
}
