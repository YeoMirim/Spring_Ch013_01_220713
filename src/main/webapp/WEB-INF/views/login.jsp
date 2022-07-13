<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 로그인</title>
</head>
<body>

	<h2>회원 로그인</h2>
	<hr>
	<form action="loginOk">  <!-- 요청의 이름 설정(request) => controller가 받아서 처리 -->
		아이디 : <input type="text" name="id"> <br><br>
		비밀번호 : <input type="password" name="pw"> <br><br>
		<input type="submit" value="로그인">
		
	</form>
	<!-- controller에 없으면 실행이 안됨 -->
</body>
</html>