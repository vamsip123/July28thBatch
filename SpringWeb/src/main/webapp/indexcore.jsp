<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring 3, MVC Examples</title>
  </head>
  <body>
    <h1>Hello World </h1>
    <ul>
      <li><a href="hi.htm">Hi World</a></li>
      <li><a href="customer/add.htm">Add MAC</a></li>
      <li><a href="customer/delete.htm">Delete MAC</a></li>
      
       ****************Below is Annotation Based*********************
      enable component scan in dispatcher-servlet along with view resolver.
      
    	<li><a href="helloworld.htm">Hello World</a></li>
    	<li><a href="byeworld.htm">Bye World</a></li>
    	<li><a href="welcome.htm">Welcome</a></li>
    	<li><a href="welcome/goodbyee.htm">Good Bye World</a></li>

    </ul>
  </body>
</html>
