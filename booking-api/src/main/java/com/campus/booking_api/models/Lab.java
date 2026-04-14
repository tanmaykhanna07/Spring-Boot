package com.campus.booking_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "labs")
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int labId;

    @Column(name = "lab_name", nullable = false)
    private String labName;

    @Column(name = "building", nullable = false)
    private String building;


    public Lab(){};

    public int getLabId(){
        return labId;
    }
    public void setLabId(int labId){
        this.labId = labId;
    }

    public String getLabName(){
        return labName;
    }
    public void setLabName(String labName){
        this.labName = labName;
    }

    public String getBuilding(){
        return building;

    }
    public void setBuilding(String building){
        this.building = building;
    }
}
