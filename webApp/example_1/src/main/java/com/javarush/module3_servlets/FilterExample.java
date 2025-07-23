package com.javarush.module3_servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*") //не забываем параметр урла
public class FilterExample implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //servletContext context
        //requestDispathcer dispatcher
        //dispatcher.forward()
        String error = "/secret"; //куда перенаправляю
        ServletContext context = servletRequest.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher(error); //инициализируем диспетчера
        dispatcher.forward(servletRequest, servletResponse);
    }
}
