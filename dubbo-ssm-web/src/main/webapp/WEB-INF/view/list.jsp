<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="/resource/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
	<script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.js" ></script>
	<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script>
	<script type="text/javascript" src="/resource/js/jqueryvalidate/jquery.validate.js"></script>
	<script type="text/javascript" src="/resource/js/jqueryvalidate/localization/messages_zh.js"></script>
<title>Insert title here</title>

</head>
<body>
	<form action="list" method="post">
	<input name="beginDate">---<input name="endDate"><br>
		<select name="orderValue">
			<option value="1">评论数量</option>
			<option value="2">发表时间</option>
			<option value="3">文章作者</option>
		</select>
		<button>搜索</button>
	</form>
	<table>
		<tr>
			<td>文章标题</td>
			<td>文章内容</td>
			<td>发表时间</td>
			<td>评论数量</td>
			<td>作者</td>
		</tr>
		<c:forEach items="${list }" var="a">
			<tr>
				<td>${a.title }</td>
				<td>${a.content }</td>
				<td>${a.created }</td>
				<td>${a.commentCnt }</td>
				<td>${a.username }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>