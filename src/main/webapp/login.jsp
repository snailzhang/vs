<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html lang="zh-cn" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>投票系统</title>
<link href="${contextPath}/css/bootstrap.min.css" rel="stylesheet" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse" role="navigation">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">投票系统</a>
	</div>
	<div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">首页</a>
			</li>
			<li><a href="#">短信投票</a>
			</li>
			<li><a href="#">电话投票</a>
			</li>
			<li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"> 关于 <b class="caret"></b> </a>
				<ul class="dropdown-menu">
					<li><a href="#">jmeter</a>
					</li>
					<li><a href="#">EJB</a>
					</li>
					<li><a href="#">Jasper Report</a>
					</li>
					<li class="divider"></li>
					<li><a href="#">分离的链接</a>
					</li>
					<li class="divider"></li>
					<li><a href="#">另一个分离的链接</a>
					</li>
				</ul></li>
		</ul>
	</div>
	</nav>
	<h1>Hello, world!</h1>

</body>
</html>