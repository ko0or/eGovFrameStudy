<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="deptWriteSave.do">
		<table>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno"> </td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td><input type="text" name="dname"> </td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="loc"> </td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<button type="submit">저장</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>