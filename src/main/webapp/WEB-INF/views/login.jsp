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
<script src="${contextPath}/js/jquery-1.11.0.min.js"></script>
<script src="${contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<!--  
	<jsp:include page="header.jsp" />
	-->
	<div class="container-fluid">
		<div class="row-fluid">
			
			<form class="form-horizontal" role="form" action="${contextPath}/login" method="post">
				<h3>登录</h3>
				<div class="form-group">
					<label for="username" class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名" />
					</div>
				</div>
				<div class="form-group">
					<label for="username" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" name="password" id="password" placeholder="请输入密码" />
					</div>
				</div>
				<div class="form-group">
					<label for="checkCode" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="checkCode" id="checkCode" placeholder="请输入验证码" />
						<img src="/wp-content/uploads/2014/06/download.png" class="img-thumbnail">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label> <input type="checkbox" /> 请记住我 </label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">登录</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>