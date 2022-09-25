package generator.Service;

import generator.Util.SqlUtil;
import generator.domain.TUser;
import generator.mapper.TUserMapper;

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
}
