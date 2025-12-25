package com.vikas.hotel.hotelManagement.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(public Hotel com.vikas.hotel.hotelManagement.services.impl.getHotel(..))")
    public void beforeAspectLogging(){
        System.out.println("<<<<<<<<<<<<-------------   Before get Hotel API  ---------------->>>>>>>>>>>>>");
    }

}
