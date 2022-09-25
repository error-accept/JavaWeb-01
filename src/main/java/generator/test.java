package generator;

import generator.Service.TeacherService;
import generator.domain.TTeacher;
import generator.domain.TUser;
import generator.mapper.TUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test{
    public SqlSession getSqlSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        return session;
    }

    @Test
    public  void test() throws IOException {
        SqlSession session = getSqlSession();
//使用SqlSession创建Mapper接口的代理对象
        TUserMapper userMapper = session.getMapper(TUserMapper.class);
//使用代理对象执行方法
        List<TUser> users = userMapper.findAll();
        for ( TUser user : users){
            System.out.println(user);
        }

    }
    @Test
    public  void test2(){


        TeacherService teacherService = new TeacherService();
        List<TTeacher> getall = teacherService.getall();
        for (TTeacher tea:getall
             ) {
            System.out.println(tea);
        }
    }
}
