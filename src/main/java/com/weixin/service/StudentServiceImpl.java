package com.weixin.service;

import com.weixin.bean.student;
import com.weixin.dao.StudentDAO;
import com.weixin.dao.impl.StudentDAOImpl;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDAO studentDAO = new StudentDAOImpl();
    @Override
    public List<student> selectAll() throws SQLException {

        return studentDAO.selectAll();
    }
}
