package com.lixiaoxin.mapper;

import com.lixiaoxin.domain.TVote;

import java.util.Date;
import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【t_vote】的数据库操作Mapper
* @createDate 2022-09-23 10:39:28
* @Entity com.lixiaoxin.domain.TVote
*/
public interface TVoteMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TVote record);

    int insertSelective(TVote record);

    TVote selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVote record);

    int updateByPrimaryKey(TVote record);

    Date getTimeByUser(Integer UId);

    int updateById(Integer id);

    List<TVote> getall();


}
