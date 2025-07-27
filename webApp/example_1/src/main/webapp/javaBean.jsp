<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
    <center>
        <h2>Using JavaBeans in JSP</h2>
        <jsp:useBean id = "javaBean" class = "com.javarush.module3_servlets.JavaBean"/>
        <jsp:setProperty name = "javaBean" property = "name" value = "Гоша"/>
        <jsp:setProperty name = "javaBean" property = "age" value = "12"/>
        <p>
            Имя: <jsp:getProperty name = "javaBean" property = "name"/>, возраст: <jsp:getProperty name = "javaBean" property = "age"/
            >
        </p>
    </center>
</body>