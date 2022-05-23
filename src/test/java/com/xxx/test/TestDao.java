package com.xxx.test;


import com.worker.bean.Painter;
import com.worker.dao.PainterMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @Classname TestDao
 * @Version 1.0.0
 * @Description TODO
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestDao {
    @Autowired
    SqlSession sqlSession;
    @Autowired
    PainterMapper painterMapper;
    @Autowired
    DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        PainterMapper painterMapper = sqlSession.getMapper(PainterMapper.class);
        Painter painter = painterMapper.getPainterByName();
        System.out.println(painter);
    }
}
