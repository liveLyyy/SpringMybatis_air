package com.liyan.service.Impl;

import com.liyan.mapper.AirPortMapper;
import com.liyan.pojo.Airport;
import com.liyan.service.AirPortService;

import java.util.List;

public class AirPortServiceImpl implements AirPortService {
    private AirPortMapper airPortMapper;

    public void setAirPortMapper(AirPortMapper airPortMapper) {
        this.airPortMapper = airPortMapper;
    }

    @Override
    public List<Airport> findAll() {
        List<Airport> list=airPortMapper.findAll();
        return list;
    }

    @Override
    public List<Airport> showTakeAirPort() {
        List<Airport> list = airPortMapper.findTakePort();
        return list;
    }

    @Override
    public List<Airport> showLandAirPort() {
        List<Airport> list = airPortMapper.findLandPort();
        return list;
    }

}
