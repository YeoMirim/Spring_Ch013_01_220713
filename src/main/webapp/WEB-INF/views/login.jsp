<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� �α���</title>
</head>
<body>

	<h2>ȸ�� �α���</h2>
	<hr>
	<form action="loginOk">  <!-- ��û�� �̸� ����(request) => controller�� �޾Ƽ� ó�� -->
		���̵� : <input type="text" name="id"> <br><br>
		��й�ȣ : <input type="password" name="pw"> <br><br>
		<input type="submit" value="�α���">
		
	</form>
	<!-- controller�� ������ ������ �ȵ� -->
</body>
</html>