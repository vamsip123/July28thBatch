<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>
<%-- <%
	request.setAttribute("salary", new Integer(2000));
%>
 --%>
<c:set var="salary" scope="session" value="${2000}"/>

<c:if test="${salary > 2000}">
   <p>My salary is: <c:out value="${salary}"/><p>
</c:if>

</body>
</html>