package com.campus.booking_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "workstations")
public class Workstation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stationId;

    @Column(name = "station_name",nullable = false)
    private String stationName;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "lab_id", nullable = false)
    private Lab lab;


    public Workstation(){};
    public int getStationId(){
        return stationId;
    }
    public void setStationId(int stationId){
        this.stationId = stationId;
    }

    public String getStationName(){
        return stationName;
    }
    public void setStationName(String stationName){
        this.stationName = stationName;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
