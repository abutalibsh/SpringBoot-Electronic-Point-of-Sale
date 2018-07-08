package com.imooc.sell;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j

public class LoggerTest {
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.info("name: {}, password: {}", name, password);
        log.debug("debug...");
        log.error("error...");
        log.warn("warn...");
    }
}
