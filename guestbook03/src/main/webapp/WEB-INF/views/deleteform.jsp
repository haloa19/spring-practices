<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/delete" method="post">
	<table>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="password" value=""></td>
			<td><input type="submit" value="확인"></td>
			<td><a href="${pageContext.request.contextPath }">메인으로 돌아가기</a></td>
		</tr>
	</table>
	</form>
</body>
</html>