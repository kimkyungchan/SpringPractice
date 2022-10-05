<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
	게시글 등록됨 : 
	<!-- command라는 이름으로 결과값 전송받았으니 command.이름값으로 꺼내오기 -->
	<br> 제목 : ${command.title}
	<br> 내용 : ${command.content}
</body>
</html>