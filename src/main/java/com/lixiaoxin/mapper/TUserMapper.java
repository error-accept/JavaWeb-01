package com.lixiaoxin.mapper;

import com.lixiaoxin.domain.TUser;

import java.util.List;

/**
* @author lixiaoxin
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-09-28 16:05:26
* @Entity com.lixiaoxin.domain.TUser
*/
public interface TUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    List<TUser> findAll();
    TUser selectByName(String name);
}
