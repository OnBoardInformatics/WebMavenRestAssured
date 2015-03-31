<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.jayway.restassured.RestAssured.*" %>
<%@ page import="org.junit.Test.*" %>
<%@ page import="TestingPackage.*" %>



<html>

<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>


<body>
  
  <%
  SearchByRadius tc = new SearchByRadius();
   tc.byRadiusTest001();
   tc.byRadiusTest002();
   tc.byRadiusTest003();
   tc.byRadiusTest004();
   tc.byRadiusTest005();
  %>


<h2> Testing </h2>

</body>
</html>
