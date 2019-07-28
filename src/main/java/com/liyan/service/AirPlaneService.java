package com.liyan.service;

import com.liyan.pojo.Airplane;

import java.util.List;

public interface AirPlaneService {
    List<Airplane> showTakeLan(Integer takeid, Integer landid);
}
