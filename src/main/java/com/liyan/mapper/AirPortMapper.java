package com.liyan.mapper;

import com.liyan.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AirPortMapper {
    @Select("SELECT * FROM airport")
    List<Airport> findAll();

    @Select("select * from airport where id in(select distinct takeid from airplane)")
    List<Airport> findTakePort();//查询起飞机场

    @Select("select * from airport where id in(select distinct landid from airplane)")
    List<Airport> findLandPort();//查询降落机场

}
