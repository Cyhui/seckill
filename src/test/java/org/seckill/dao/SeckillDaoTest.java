package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test,junit
 * Created by 54459 on 2017/2/2 0002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
    @Resource
    private SeckillDao seckillDao;
    @Test
    public void testqueryById() throws Exception {
        long id=1000;
        Seckill seckill=seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void testqueryAll() throws Exception {
        /**
         * java没有记录形参的记录
         */
        List<Seckill> seckills = seckillDao.queryAll(0,100);
        for (Seckill seckill: seckills) {
            System.out.println(seckill);
        }
    }
    @Test
    public void testreduceNumeber() throws Exception {
        Date killTime =new Date();
        int updateCount = seckillDao.reduceNumber(1000L,killTime);
        System.out.println("updateCount="+updateCount);
    }
}