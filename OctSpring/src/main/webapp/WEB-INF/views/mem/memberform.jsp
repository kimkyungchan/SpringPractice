<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>form 출력</title>
</head>
<body>
	form  출력
	<form action="membersubmit" method="post">
	이름 : <input type="text" name="name"/><br>
	나이 : <input type="text" name="age"/><br>
	주소 : <input type="text" name="address"/><br>
	좋아하는 동물 :
	<input type = "checkbox" name="pet" value="dog">강아지
	<input type = "checkbox" name="pet" value="cat">고양이
	<input type = "checkbox" name="pet" value="pig">돼지<br>
	<input type="submit"/>
	</form>
</body>
</html>