package com.liyan.pojo;

public class Airplane {
    private Integer id;
    private String airNo;
    private int time;
    private Double price;
    private Airport takePort;
    private Airport landPort;

    public Airport getTakePort() {
        return takePort;
    }

    public void setTakePort(Airport takePort) {
        this.takePort = takePort;
    }

    public Airport getLandPort() {
        return landPort;
    }

    public void setLandPort(Airport landPort) {
        this.landPort = landPort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirNo() {
        return airNo;
    }

    public void setAirNo(String airNo) {
        this.airNo = airNo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
