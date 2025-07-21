package com.javarush.module3_servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(value = "/redirect")
public class RedirectWithEncodingServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String url = "http://google.com?q=";
        String part = "Учись гуглить!";
        String newPart = URLEncoder.encode(part, "UTF-8");
        String redirectUrl = response.encodeRedirectURL(url + newPart);
        response.sendRedirect(redirectUrl);
    }
}
