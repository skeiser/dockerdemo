<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Docker Demo Test Page (Nothing Fancy!!)</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Hey everyone, having fun?</h2>
	<c:forEach items="${data}" var="item">
    	<h5>${item}<br></h5>
	</c:forEach>
	<form action="hello">
  		<input type="submit" value="Submit">
	</form>
	
</body>
</html>