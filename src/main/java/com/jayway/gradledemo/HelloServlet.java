package com.jayway.gradledemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // Set the response message's MIME type
        response.setContentType("text/html;charset=UTF-8");

        // Write the response message, in an HTML page
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Hello, World!</title></head>");
            out.println("<body>");
            out.println("<h1>Hello, World!</h1>");

            // Echo client's request information
            out.println("<p>Protocol: <strong>" + request.getProtocol() + "</strong></p>");
            out.println("<p>Remote address: <strong>" + request.getRemoteAddr() + "</strong></p>");
            out.println("<p>Context path: <strong>" + request.getContextPath() + "</strong></p>");
            out.println("<p>Servlet path: <strong>" + request.getServletPath() + "</strong></p>");
            out.println("<p>Path info: <strong>" + request.getPathInfo() + "</strong></p>");
            out.println("<p>Query string: <strong>" + request.getQueryString() + "</strong></p>");

            // Generate the current time upon each request
            out.println("<p>Current time: <strong>" + new Date() + "</strong></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}