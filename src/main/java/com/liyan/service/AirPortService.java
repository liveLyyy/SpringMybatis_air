package com.liyan.service;

import com.liyan.pojo.Airport;

import java.util.List;

public interface AirPortService {
    List<Airport> findAll();

    /*
     * 显示所有起飞机场*/
    List<Airport> showTakeAirPort();

    /*
     * 显示所有降落机场*/
    List<Airport> showLandAirPort();
}
