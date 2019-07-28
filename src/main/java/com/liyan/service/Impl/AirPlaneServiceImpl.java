package com.liyan.service.Impl;

import com.liyan.mapper.AirPlaneMapper;
import com.liyan.pojo.Airplane;
import com.liyan.service.AirPlaneService;

import java.util.List;

public class AirPlaneServiceImpl implements AirPlaneService {
    private AirPlaneMapper airPlaneMapper;

    public void setAirPlaneMapper(AirPlaneMapper airPlaneMapper) {
        this.airPlaneMapper = airPlaneMapper;
    }

    @Override
    public List<Airplane> showTakeLan(Integer takeid, Integer landid) {
        List<Airplane> list = airPlaneMapper.findTakeLandById(takeid, landid);
        return list;
    }
}
