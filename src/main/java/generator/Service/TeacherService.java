package generator.Service;

import generator.Util.SqlUtil;
import generator.domain.TTeacher;
import generator.mapper.TTeacherMapper;

import java.util.List;

public class TeacherService {
    private TTeacherMapper TTeacherMapper;

    public TeacherService() {
        this.TTeacherMapper = SqlUtil.getTTeacherMapper();
    }
    public List<TTeacher> getall(){
        return TTeacherMapper.findAll();
    }
//    public TUser getByName(String name){
//        return  TTeacherMapper.selectByName(name);
//    }

    public int addVoteById(Integer id){

        return TTeacherMapper.updateByid(id);
    }


    public int setStatueById(Integer id, int i) {
        return TTeacherMapper.banStatue(id,Integer.valueOf(i));
    }

    public int addTeacher(TTeacher tTeacher) {
        return TTeacherMapper.insert(tTeacher);

    }
}
