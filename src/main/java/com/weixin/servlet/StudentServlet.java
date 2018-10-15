package com.weixin.servlet;

import com.weixin.bean.student;
import com.weixin.service.StudentService;
import com.weixin.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentService studentService = new StudentServiceImpl();
        try {
            List<student> studentList = studentService.selectAll();
            request.setAttribute("studentList",studentList);
            request.getRequestDispatcher("/Student/table_basic.jsp").forward(request,response);
            System.out.println(studentList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
