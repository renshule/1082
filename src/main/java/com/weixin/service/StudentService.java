package com.weixin.service;

import com.weixin.bean.student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    List<student> selectAll() throws SQLException;
}
