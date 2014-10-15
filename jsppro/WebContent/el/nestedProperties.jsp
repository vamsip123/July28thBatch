<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.tutorial.jsp.el.*" %>


<br>

<% 
	Person per = (Person)request.getAttribute("person");
	out.println("TEsting "+ per.getAddress().getStreetName());
	out.println("TEsting "+ per.getName());
%>
<br>

<html>
	<table>
		<tr><c:out value="${person.address.streetName}"/></tr>
	</table>
</html>

<c:out value="${person.name}" />