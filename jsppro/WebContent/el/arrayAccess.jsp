<%@page isELIgnored="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<% 
String [] bigFive = {"U.S.A", "Russia", "France", "China","U.K"};

String [] bigFive2 = {"INDIA", "AUS", "France", "China","U.K"};

session.setAttribute("bigFive", bigFive2);
//request.setAttribute("bigFive", bigFive);

%>

<%-- The Big Five are : ${bigFive}<br>

The first one is ${bigFive[0]}<br>

The second one is ${bigFive["1"]}<br>

${ 5 lt 0}
 --%>
<%=request.getAttribute("bigFive") %><br>
<%=session.getAttribute("bigFive") %><br>

<%-- <c:out value="${bigFive}"></c:out><br> --%>
<c:out value="${bigFive[0]}"></c:out><br>
<%-- <c:out value="${bigFive['1']}"></c:out> --%>