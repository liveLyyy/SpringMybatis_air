package com.liyan.test;

import com.liyan.pojo.Airport;
import com.liyan.service.Impl.AirPortServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AirTest {
    @Test
    public void findAll(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        AirPortServiceImpl airPortService=applicationContext.getBean(AirPortServiceImpl.class);
        List<Airport> list=airPortService.findAll();
        for (Airport airport:list){
            System.out.println(list);
        }

    }
}
