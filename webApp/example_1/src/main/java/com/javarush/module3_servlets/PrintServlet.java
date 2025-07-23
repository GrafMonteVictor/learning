package com.javarush.module3_servlets;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import java.util.Enumeration;

//в web.xml объявили параметры сервлета
public class PrintServlet extends HttpServlet {
    ServletConfig servletConfig = this.getServletConfig();
    Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//    while (initParameterNames.)
//    {
//        String key = initParameterNames.nextElement();
//        System.out.println("%s: %s\n", key, config.getInitParameter(key));
//    }
}
