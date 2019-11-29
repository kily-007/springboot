package com.example.springboot.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Meter {

  @Id
  @Column
  private String id;
  @Column
  private String number;
  @Column
  private String temperature;
  @Column
  private String time;
  @Column
  private String frequency;
  @Column
  private String flow;
  @Column
  private String remarks;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }


  public String getTemperature() {
    return temperature;
  }

  public void setTemperature(String temperature) {
    this.temperature = temperature;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public String getFlow() {
    return flow;
  }

  public void setFlow(String flow) {
    this.flow = flow;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
