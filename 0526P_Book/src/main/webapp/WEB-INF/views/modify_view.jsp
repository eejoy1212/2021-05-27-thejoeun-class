<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>수정할 내용을 입력하세요</h2>
<table width="400">
<form action="modify" method="post">
	<input type="hidden" name="booknum" value="${mm.booknum}">
	<tr>
		<td>일련번호</td>
		<td>${mm.booknum}</td>
	</tr>
	
	<tr>
		<td> 도 서 명 </td>
		<td><input type="text" name="book" value="${mm.book}"></td>
	</tr>

	<tr>
		<td>저   자 </td>
		<td><input type="text" name="author" value="${mm.author}"></td>
	</tr>
		
	<tr>
		<td>가   격</td>
		<td><input type="text" name="price" value="${mm.price}"></td>
	</tr>
	
	<tr>
	<td colspan="2"><input type="submit" value="수정하기">&emsp;
		<input type="reset" value="다시쓰기"></td></tr>


</form>
</table>



</body>
</html>