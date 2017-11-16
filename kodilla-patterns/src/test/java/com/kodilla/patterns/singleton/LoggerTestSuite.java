package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void test1() {

        //given
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("myLog");
        logger2.log("mySecondLog");

        // when
        String log1 = logger1.getLastLog();


        //then
        Assert.assertEquals("mySecondLog", log1);

    }
}
