package com.lixiaoxin.mapper;

import com.lixiaoxin.domain.TTeacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【t_teacher】的数据库操作Mapper
* @createDate 2022-09-24 20:11:28
* @Entity com.lixiaoxin.domain.TTeacher
*/
public interface TTeacherMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    TTeacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);

    List<TTeacher> findAll();

    int updateByid(Integer id);

    int banStatue(@Param("id") Integer id, @Param("statue") Integer statue);
}
