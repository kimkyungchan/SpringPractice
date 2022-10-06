<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>주문 완료</title>
</head>
<body>
	주문완료
	<br> 주문아이템
	<ui>	
		<c:forEach var="item" items="${order.orderItems}">
			<li>${item.itemId} / ${item.number} / ${item.remark} </li>
		</c:forEach>
	</ui>
	배송지: ${order.address}	
</body>
</html>