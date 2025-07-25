<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setAttribute("rs","Балтика нулевка - заебис");
%>
<jsp:forward page="random.jsp">
    <jsp:param name="number" value="0.75"/>
    <jsp:param name="rs" value="Балтика нулевка - заебис"/>
</jsp:forward>