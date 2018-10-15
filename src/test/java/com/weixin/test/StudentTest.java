package com.weixin.test;

import com.weixin.bean.student;
import com.weixin.dao.StudentDAO;
import com.weixin.dao.impl.StudentDAOImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class StudentTest {
    StudentDAO studentDAO = new StudentDAOImpl();

    @Test
    public void test1() throws SQLException {
        List<student> studentList = studentDAO.selectAll();
        System.out.println(studentList);
    }

    @Test
    public void test2() throws SQLException {
        student student = studentDAO.selectById(10);
        System.out.println(student);
    }

    @Test
    public void test3() throws SQLException {
        student student = new student();
        student.setName("uzi");
        student.setAge(20);
        student.setGender("男");

        boolean bo = studentDAO.insert(student);
        System.out.println(bo);
    }


    @Test
    public void test4() throws SQLException {
        boolean bo = studentDAO.deleteById(4);
        System.out.println(bo);
    }

    @Test
    public void test5() throws SQLException {
        //先查id是3的数据：
        student student = studentDAO.selectById(3);

        student.setAge(35);

        boolean bo = studentDAO.update(student);
        System.out.println(bo);
    }

    @Test
    public void test6() throws SQLException {
        Integer count = studentDAO.count();
        System.out.println(count);
    }

}
