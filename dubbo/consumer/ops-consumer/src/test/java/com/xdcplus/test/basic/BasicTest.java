package com.xdcplus.test.basic;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : Martin Ji
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Before
    public void init() {
        System.out.println("-----------------开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("-----------------测试结束-----------------");
    }

}
