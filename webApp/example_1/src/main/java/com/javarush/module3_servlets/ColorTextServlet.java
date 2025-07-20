package com.javarush.module3_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/color")
public class ColorTextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String color = request.getParameter("color");
        String text = request.getParameter("text");

        response.setContentType("text/html;charset=UTF-8"); //формат ответа
        //print rs
        PrintWriter out = response.getWriter();

        try {
            out.println("<html>");
            out.println("<head> <title> ColorTextServlet </title> </head>");
            out.println("<body>");
            out.println("<h1 style=color:"+ color + ">"+text+"</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
