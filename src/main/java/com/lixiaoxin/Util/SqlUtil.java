package com.lixiaoxin.Util;

import com.lixiaoxin.mapper.TTeacherMapper;
import com.lixiaoxin.mapper.TUserMapper;
import com.lixiaoxin.mapper.TVoteMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class SqlUtil {
    public static SqlSession getSqlSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//使用工厂生产SqlSession对象
        SqlSession session = factory.openSession(true);
        return session;
    }
    public static TUserMapper getTUserMapper() {
        TUserMapper mapper = null;
        try {
            mapper = getSqlSession().getMapper(TUserMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  mapper;
    }
    public static TVoteMapper getTVoteMapper() {
        TVoteMapper mapper = null;
        try {
            mapper = getSqlSession().getMapper(TVoteMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  mapper;
    }

    public static TTeacherMapper getTTeacherMapper() {
        TTeacherMapper mapper = null;
        try {
            mapper = getSqlSession().getMapper(TTeacherMapper.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  mapper;
    }

}
