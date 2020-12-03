package com.demo.docker.demoDocker.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {

    @Scheduled(cron = "${scheduler.interval}")
    public void schedulerSayHello() {
        System.out.println("Hello from scheduler!");
    }

}
