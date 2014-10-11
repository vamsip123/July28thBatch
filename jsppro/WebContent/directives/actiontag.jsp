<%@taglib prefix="test" uri="/WEB-INF/tlds/SubstrDescriptor.tld"%>

<html>
<head>
<title>JSP Custom Taglib example: Substr function</title>
</head>
<body>
	<font color="blue">
		<test:substring input="Jayram Rout"	start="1" end="6" />
		<%-- <%="Nikhil Student".substring(1,6) %> --%>
	</font>
</body>
</html>