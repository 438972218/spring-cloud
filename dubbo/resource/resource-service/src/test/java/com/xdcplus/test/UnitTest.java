package com.xdcplus.test;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.core.exceptions.StatefulException;
import cn.hutool.core.lang.Console;
import cn.hutool.core.lang.Dict;
import cn.hutool.core.text.StrFormatter;
import cn.hutool.core.thread.ConcurrencyTester;
import cn.hutool.core.thread.ExecutorBuilder;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ObjectUtil;
import com.xdcplus.resource.basic.entity.Cabinet;

import java.util.concurrent.ExecutorService;

public class UnitTest  {


    public static void main(String args[]){
        Cabinet cabinet=new Cabinet();
        ObjectUtil.cloneByStream(cabinet);
        Dict dict=Dict.create().set("key",1);
        dict.getInt("key");
        Console.log("aaaaaa {}","bbb");
        StrFormatter.format("aa");
        ExecutorService executorService=ExecutorBuilder.create().build();
        ConcurrencyTester tester= ThreadUtil.concurrencyTest(100,()->{

        });
        Console.log(tester.getInterval());
    }

}