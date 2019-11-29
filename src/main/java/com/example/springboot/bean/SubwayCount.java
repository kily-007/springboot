package com.example.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubwayCount {

  @Id
  @Column
  private long id;

  private String time;
  private String passNum1;
  private String passNum2;
  private String passNum3;
  private String passNum4;
  private String sumUp;
  private String sumDown;
  private String sum;
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public String getPassNum1() {
    return passNum1;
  }

  public void setPassNum1(String passNum1) {
    this.passNum1 = passNum1;
  }


  public String getPassNum2() {
    return passNum2;
  }

  public void setPassNum2(String passNum2) {
    this.passNum2 = passNum2;
  }


  public String getPassNum3() {
    return passNum3;
  }

  public void setPassNum3(String passNum3) {
    this.passNum3 = passNum3;
  }


  public String getPassNum4() {
    return passNum4;
  }

  public void setPassNum4(String passNum4) {
    this.passNum4 = passNum4;
  }


  public String getSumUp() {
    return sumUp;
  }

  public void setSumUp(String sumUp) {
    this.sumUp = sumUp;
  }


  public String getSumDown() {
    return sumDown;
  }

  public void setSumDown(String sumDown) {
    this.sumDown = sumDown;
  }


  public String getSum() {
    return sum;
  }

  public void setSum(String sum) {
    this.sum = sum;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
