<%@page  isELIgnored="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<% 
String [] countryObj1 = {"U.S.A", "Russia", "France", "China","U.K"};

String [] countryObj2 = {"China", "AUS", "France", "China","U.K"};

request.setAttribute("countries", countryObj2);
session.setAttribute("countries", countryObj1);

request.getAttribute("countries");

%>
<c:out value="${countries[0]}"></c:out>

<%-- ${5 == 2}

The first one is ${countries[0]}<br>

The Big Five are : ${bigFive}<br>

The first one is ${bigFive[0]}<br>

The second one is ${bigFive["1"]}<br>

${ 5 lt 0}

<%=request.getAttribute("bigFive") %><br>
<%=session.getAttribute("bigFive") %><br>

<c:out value="${bigFive}"></c:out><br>
<c:out value="${bigFive[0]}"></c:out><br>
<c:out value="${bigFive['1']}"></c:out> --%>