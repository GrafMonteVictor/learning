package com.javarush.module3_servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/random"})
public class RandomNumberServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Double randomNumber = Math.random();
        String rs;
        if (randomNumber > 0.95) {
            rs = "Ты - счастливчик";
        } else {
            rs = "Ты - лох";
        }
        request.setAttribute("rs", rs);
        request.setAttribute("number", randomNumber);
        RequestDispatcher dispatcher = request.getRequestDispatcher("random.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
