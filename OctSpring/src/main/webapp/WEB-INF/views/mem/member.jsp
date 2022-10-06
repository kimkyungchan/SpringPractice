<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>submit 수행</title>
</head>
<body>
	${member.name}
	${member.age}
	${member.address}
	<c:forEach var="ani" items="${member.pet}">
		${ani}
	</c:forEach>
</body>
</html>