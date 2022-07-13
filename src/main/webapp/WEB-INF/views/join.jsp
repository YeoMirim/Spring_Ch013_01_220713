<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 가입</title>
</head>
<body>

	<h2>회원 가입</h2>
	<hr>
	<form action="joinOk">
		이름 : <input type="text" name="name"> <br><br>
		아이디 : <input type="text" name="id"> <br><br>
		비밀번호 : <input type="password" name="pw"> <br><br>
		이메일 : <input type="text" name="email"> <br><br>
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>