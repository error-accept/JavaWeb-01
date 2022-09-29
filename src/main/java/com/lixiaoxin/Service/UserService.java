package com.lixiaoxin.Service;

import com.lixiaoxin.Util.SqlUtil;
import com.lixiaoxin.domain.TUser;
import com.lixiaoxin.mapper.TUserMapper;

import java.util.List;

public class UserService {
    private TUserMapper tUserMapper;

    public UserService() {
        this.tUserMapper = SqlUtil.getTUserMapper();
    }
    public List<TUser> getall(){
        return tUserMapper.findAll();
    }
    public TUser getByName(String name){
        return  tUserMapper.selectByName(name);
    }
    public int register(TUser user) {
        return tUserMapper.insert(user);
    }
}
