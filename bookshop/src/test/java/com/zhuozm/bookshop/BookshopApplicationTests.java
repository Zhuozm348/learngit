package com.zhuozm.bookshop;

import com.zhuozm.bookshop.bean.Person;
import com.zhuozm.bookshop.dao.studentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookshopApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {


    }

}
