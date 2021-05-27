<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="400">
	<form action="savdprocess" method="post">
		<tr>
			<td> 도 서 명 </td>
			<td><input type="text" name="book"></td>
		</tr>
		<tr>
			<td>저   자 </td>
			<td><input type="text" name="author"></td>
		</tr>
		<tr>
			<td>일련번호 </td>
			<td><input type="text" name="booknum" value="ISBN-"></td>
		</tr>
		<tr>
			<td>가   격 </td>
			<td><input type="text" name="price"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="저장하기">&emsp;
				<input type="reset" value="다시쓰기"></td>
		</tr>
	</form>
</table>
</body>
</html>