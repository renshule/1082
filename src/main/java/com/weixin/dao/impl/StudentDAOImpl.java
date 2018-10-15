package com.weixin.dao.impl;

import com.weixin.bean.student;
import com.weixin.dao.StudentDAO;
import com.weixin.util.c3p0Utils;
import com.weixin.util.c3p0Utils;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public List<student> selectAll() throws SQLException {
        return c3p0Utils.qr.query("select * from student", new BeanListHandler<>(student.class));
    }

    @Override
    public student selectById(Integer id) throws SQLException {
        return c3p0Utils.qr.query("select * from student where id=?",new BeanHandler<>(student.class),id);
    }

    @Override
    public boolean insert(student student) throws SQLException {
        return c3p0Utils.qr.update("insert into student values(null,?,?,?)",student.getName(),student.getAge(),student.getGender())>0;
    }

    @Override
    public boolean deleteById(Integer id) throws SQLException {
        return c3p0Utils.qr.update("delete from student where id=?",id)>0;
    }

    @Override
    public boolean update(student student) throws SQLException {
        return c3p0Utils.qr.update("update student set name=?,age=?,gender=? where id=?",student.getName(),student.getAge(),student.getGender(),student.getId())>0;
    }

    @Override
    public Integer count() throws SQLException {
        return c3p0Utils.qr.query("select count(*) from student", new ScalarHandler<Long>()).intValue();
    }
}
