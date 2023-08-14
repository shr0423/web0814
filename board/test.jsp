<%@ page contentType="text/html;charset=utf-8"%>
<%!
//여기는 멤버영역이다 
	int age=5;

	public void test(int age){
		this.age=age;
	}
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
</head>
<body>
나의 웹어플리케이션 생성 성공
<%
	out.print("this is my test");
%>
</body>
</html>