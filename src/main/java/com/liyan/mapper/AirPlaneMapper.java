package com.liyan.mapper;

import com.liyan.pojo.Airplane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirPlaneMapper {

    List<Airplane> findTakeLandById(@Param("takeid") Integer takeid, @Param("landid") Integer landid);
}
