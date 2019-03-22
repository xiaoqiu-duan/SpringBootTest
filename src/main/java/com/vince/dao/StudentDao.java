package com.vince.dao;

import com.vince.model.StudentEbo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Package: com.vince.dao
 * User: 诸葛子房
 * Email: xiaoiqu2017wy@163.com
 * Date: 2019/3/21
 * Time: 11:36
 * Description:
 */
@Mapper
public interface StudentDao {

    @Select("select id,name,create_time as createTime from t_student")
    List<StudentEbo> findAll();

    List<StudentEbo> listStu(@Param("name") String name);

    StudentEbo getStuById(@Param("id") int id);

    void addStu(StudentEbo stu);

}
