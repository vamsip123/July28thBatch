<%@ page import="java.io.*,java.util.*" session="true"%>
<%
   // Get session creation time.
   Date createTime = new Date(session.getCreationTime());
   // Get last access time of this web page.
   Date lastAccessTime = new Date(session.getLastAccessedTime());

   String title = "Welcome Back to my website";
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("ABCD");

   // Check if this is new comer on your web page.
   if (session.isNew()){
      title = "Welcome to my website";
      session.setAttribute(userIDKey, userID);
      session.setAttribute(visitCountKey,  visitCount);
   }
   
   visitCount = (Integer)session.getAttribute(visitCountKey);
   if(visitCount != null){
	   visitCount = visitCount + 1;
	   userID = (String)session.getAttribute(userIDKey);
   }
   session.setAttribute(visitCountKey,  visitCount);
   
%>
<html>
<head>
<script type="text/javascript">
	function loadXMLDoc() {
		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.open("GET", "makeAjaxCall", true); // true (asynchronous) or false (synchronous)
		xmlhttp.send();
		xmlhttp.onreadystatechange = function() {
			alert("Status = "+ xmlhttp.status + " ReadyState= " + xmlhttp.readyState + " "+  xmlhttp.responseText);
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				//alert("INSIDE Status = "+ xmlhttp.status + " ReadyState= " + xmlhttp.readyState);
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;//HELLO
			}
		}

	}
</script>
</head>
<body>
<center>
<h1>Session Tracking</h1>
<h1><%=title%></h1>
</center>
<table border="1" align="center"> 
<tr bgcolor="#949494">
   <th>Session info</th>
   <th>Value</th>
</tr>
<% 
	System.out.println("I am here....."+ visitCount);
%> 
<tr>
   <td>id</td>
   <td><% out.print( session.getId()); %></td>
</tr> 
<tr>
   <td>Creation Time</td>
   <td><% out.print(createTime); %></td>
</tr> 
<tr>
   <td>Time of Last Access</td>
   <td><% out.print(lastAccessTime); %></td>
</tr> 
<tr>
   <td>User ID</td>
   <td><% out.print(userID); %></td>
</tr> 
<tr>
   <td>Number of visits</td>
   <td><% out.print(visitCount); %></td>
</tr> 
</table>
<div id="myDiv">
		<h2>Let AJAX change this text</h2>
	</div>
	<button type="button" onclick="loadXMLDoc()">Change Content</button>

</body>
</html>