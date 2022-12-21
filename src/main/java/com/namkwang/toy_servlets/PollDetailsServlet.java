package com.namkwang.toy_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.namkwang.toy_servlets.dao.PollWithDB;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/simple/WithDBServlets")
public class PollDetailsServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // business 부분
    PollWithDB simpleWithDB = new PollWithDB();
    ArrayList<HashMap> bundle_list = simpleWithDB.getList();
    response.setContentType("text/html;charset=UTF-8"); // 응답을 보낼 때 한글이 깨지지 않게 해주는 것. 백엔드를 위한 것

    // display
    PrintWriter printWriter = response.getWriter();
    printWriter.println("<div>SimpleWithDBServlets</div>");
    for (int i = 0; i < bundle_list.size(); i++) {
      HashMap<String, Object> bundle = bundle_list.get(i);
      HashMap<String, Object> question = (HashMap<String, Object>) bundle.get("question");
      int orders = (int) question.get("ORDERS");
      String questions = (String) question.get("QUESTIONS");
      String questions_uid = (String) question.get("QUESTIONS_UID");
      printWriter
          .println("<div>" + orders + ". " + questions + "<input type='hidden' value='" + questions_uid + "' /></div>");
    }
    printWriter.close();

  }
}
