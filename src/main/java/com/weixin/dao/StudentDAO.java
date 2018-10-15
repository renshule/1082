package com.weixin.dao;

import com.weixin.bean.student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    /**
     * 查询所有学生
     * @return 所有学生
     * @throws SQLException
     */
    List<student> selectAll() throws SQLException;

    /**
     * 根据id查询某个学生
     * @param id
     * @return 如果查到返回学生对象，如果查不到，返回null
     * @throws SQLException
     */
    student selectById(Integer id)throws SQLException;

    /**
     * 增加学生
     * @param student
     * @throws SQLException
     */
    boolean insert(student student)throws SQLException;

    /**
     * 根据id删除学生
     * @param id
     * @return 删除成功返回true，删除失败返回false
     * @throws SQLException
     */
    boolean deleteById(Integer id)throws SQLException;

    /**
     * 根据参数修改学生信息
     * @param student
     * @return 修改成功返回true，修改失败返回false
     * @throws SQLException
     */
    boolean update(student student)throws SQLException;

    /**
     * 查询学生数据条数
     * @return
     * @throws SQLException
     */
    Integer count()throws SQLException;


}
