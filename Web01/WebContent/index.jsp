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
	<!-- java code = scriptlet ��ũ��Ʈ�� -->
	<%
		String name = "lion";
	%>
	
	<!-- ǥ���� -->
	<%=name%>
	
	<!-- <p>ȣ����</p> -->
	
	<!-- �Լ��ۼ��� : �߾Ⱦ���(�̷л���������������) = ���� -->	
	<%!
	int sum(int a,int b){
		return a+b;
	}
	%>
	<%=sum(1,2) %>
	
	<%if(true){%>
	<h4>5����¾�</h4>
	<%}%>
	
	
	<% for(int i =1;i<10;i++){ %>
	<h5><%=i %> X <%=5 %> = <%=i*5 %></h5>
	<%}%>
	<h1>end</h1>
</body>
</html>