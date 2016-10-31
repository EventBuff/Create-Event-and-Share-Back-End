package com.SpringBootTest;

import com.SpringBootTest.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.SystemProfileValueSource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.sql.Timestamp;

//import org.springframework.util.Assert;
//import junit.framework.Assert;
//import com.SpringBootTest.domain.com.SpringBootTest.com.SpringBootTest.domain.User.User;
//import static junit.framework.Assert.*;

/**
 * Created by lich on 10/24/16.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTests {

    @Autowired
    //private UserRepository userRepository;
    //private CommentRepository commentRepository;
    //private EquipmentRepository equipmentRepository;
    //private EventRepository eventRepository;
    //private UserEventRepository userEventRepository;
    private EventEquipmentRepository eventEquipmentRepository;

    @Test
    public void test() throws Exception {


        // 创建10条记录

        //userRepository.save(new com.SpringBootTest.domain.User("CCC", 12));
        //userRepository.save(new com.SpringBootTest.domain.User("DDD", 13));



        // 测试findAll, 查询所有记录
//        assertEquals(10, userRepository.findAll().size());

        //System.out.println(userRepository.findUser("DDD").getAge());
        // 测试findByName, 查询姓名为FFF的User
//        assertEquals(60, userRepository.findByName("abc").getEmail());

        // 测试findUser, 查询姓名为FFF的User
//        Assert.assertEquals(60, userRepository.findUser("FFF").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//        Assert.assertEquals("FFF", userRepository.findByNameAndAge("FFF", 60).getName());

        // 测试删除姓名为AAA的User
//        userRepository.delete(userRepository.findByName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
//        Assert.assertEquals(9, userRepository.findAll().size());

    }


}