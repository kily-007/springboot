package com.example.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubwayDataFile {

  @Id
  @Column
  private long id;
  @Column
  private String number;
  @Column
  private String todayTimes;
  @Column
  private String name;
  @Column
  private String type;
  @Column
  private String size;
  @Column
  private String inTime;
  @Column
  private String outTime;
  @Column
  private String direction;
  @Column
  private String throughDampArea;
  @Column
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public String getTodayTimes() {
    return todayTimes;
  }

  public void setTodayTimes(String todayTimes) {
    this.todayTimes = todayTimes;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public String getInTime() {
    return inTime;
  }

  public void setInTime(String inTime) {
    this.inTime = inTime;
  }


  public String getOutTime() {
    return outTime;
  }

  public void setOutTime(String outTime) {
    this.outTime = outTime;
  }


  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }


  public String getThroughDampArea() {
    return throughDampArea;
  }

  public void setThroughDampArea(String throughDampArea) {
    this.throughDampArea = throughDampArea;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
