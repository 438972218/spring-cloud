package com.xdcplus.test;

import cn.hutool.core.thread.ThreadUtil;
import com.demo.starter.service.MailService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;


@SpringBootTest
public class UnitTest {
    @Resource
    MailService mailService;

    @Test
    public void test() {
        String a = mailService.say();

        System.out.println(a);
        ExecutorService executorService = ThreadUtil.newExecutor();
    }
}