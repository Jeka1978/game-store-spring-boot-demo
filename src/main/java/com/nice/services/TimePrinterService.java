package com.nice.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

/**
 * Created by Evegeny on 12/07/2017.
 */
@Service
@Profile("DEV")
public class TimePrinterService {

    @PostConstruct
    public void printTime(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
    }
}
