package com.boxfuse.samples.javawarhello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("HelloServlet: You should see this in the Instance Logs :-)");
        System.out.println("HelloServlet:: Ramesh Babu............");
        System.out.println("HelloServlet:: Lakshmi............");
        System.out.println("HelloServlet:: Meenakshi............");
    }
}
