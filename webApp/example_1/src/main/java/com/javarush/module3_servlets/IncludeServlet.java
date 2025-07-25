package com.javarush.module3_servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/include")
public class IncludeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("number", Math.random());
        request.setAttribute("rs", "Пахуй, какое число, все равно - лох");
        RequestDispatcher dispatcher = request.getRequestDispatcher("include.jsp");
        dispatcher.forward(request, response);
    }
}
