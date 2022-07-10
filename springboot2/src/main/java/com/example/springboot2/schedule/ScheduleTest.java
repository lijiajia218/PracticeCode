package com.example.springboot2.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author lll
 * @Date: 2022/7/5 16:15
 * @Version 1.0
 */
@Component
@Slf4j
public class ScheduleTest {
    public ScheduleTest(){
        log.info("test");
    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void test(){
        log.info("just test @scheduled   -------------------");
    }
}
