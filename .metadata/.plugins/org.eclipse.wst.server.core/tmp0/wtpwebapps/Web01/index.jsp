<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<!-- java code = scriptlet 스크립트릿 -->
	<%
		String name = "lion";
	%>
	
	<!-- 표현식 -->
	<%=name%>
	
	<!-- <p>호랑쓰</p> -->
	
	<!-- 함수작성시 : 잘안쓴다(이론상으로존재하지만) = 선언문 -->	
	<%!
	int sum(int a,int b){
		return a+b;
	}
	%>
	<%=sum(1,2) %>
	
	<%if(true){%>
	<h4>5단출력쓰</h4>
	<%}%>
	
	
	<% for(int i =1;i<10;i++){ %>
	<h5><%=i %> X <%=5 %> = <%=i*5 %></h5>
	<%}%>
	<h1>end</h1>
</body>
</html>