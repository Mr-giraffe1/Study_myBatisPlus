package com.qiankai.study.mapper;

import com.qiankai.study.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    UserMapper usermapper;
    @Test
    void TestSelectList() {
        List<User> userLists = usermapper.selectList(null);
        System.out.println(userLists);
    }
    /**全局唯一ID常见实现方案   雪花算法*/
}