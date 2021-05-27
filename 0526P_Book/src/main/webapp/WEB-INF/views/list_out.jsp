<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
table {
	margin: auto;
	border-collapse: collapse;
}
</style>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="550">
	<caption><h2>더조은 서점 현황</h2></caption>
	<thead>
		<tr>
			<th>일련번호</th>
			<th>도서명</th>
			<th>저자</th>
			<th>가격</th>
			<th>표지</th>
			<th>비고</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${list}" var="bb">
		<tr>
			<td>${bb.booknum}</td>
			<td>${bb.book}</td>
			<td>${bb.author}</td>
			<td><fmt:formatNumber value="${bb.price}" pattern="#,###"/> </td>
			<td></td>
			<td><a href="modify_view?booknum=${bb.booknum}">수정</a>&emsp;
			<a href="delete_pro?booknum=${bb.booknum}">삭제</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<p>
&emsp;&emsp;&emsp;&emsp;
<a href="form">자료입력</a>

</body>
</html>