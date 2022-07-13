<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입 완료</title>
</head>
<body>
	이름 : ${memberDto.name } <br>
	아이디 : ${memberDto.id } <br>
	비밀번호 : ${memberDto.pw } <br>
	이메일 : ${memberDto.email }
</body>
</html>