package com.namkwang.toy_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/poll/PollServlet")

public class PollDetailServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        DatasInfo datasInfo = new DatasInfo();
       
        PrintWriter printWriter = response.getWriter();
        
        printWriter.println("<!DOCTYPE html> ");
        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println   (" <meta charset='UTF-8' />");
        printWriter.println  ("<meta http-equiv='X-UA-Compatible' content='IE=edge' />");
        printWriter.println ("<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
        printWriter.println ("<link");
        printWriter.println   ("rel='stylesheet'");
        printWriter.println   ("href='../browser_js/js/CSSs/javascriptWithPoll.css'");
        printWriter.println  ("/>");
        printWriter.println  ("<title>Document</title>");
        printWriter.println ("</head>");
        printWriter.println ("<body>");
        printWriter.println   ("<div>");
        printWriter.println  (" <div class='button'>");
        printWriter.println    ("<button id='prev'>Prev</button>");
        printWriter.println   ("<button id='next'>Next</button>");
        printWriter.println  ("</div>");
        printWriter.println (" <div id='poll-contents'>poll contents</div>");
        printWriter.println ("</div>");
        printWriter.println  ("<script src='../../../../resources/static/javascriptWithPoll.js'></script>");
        printWriter.println  ("</body>");
        printWriter.println(" </html>");
        
        
        
       

       

        printWriter.close();
    }
}
