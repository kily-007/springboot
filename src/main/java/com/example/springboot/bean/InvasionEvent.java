package com.example.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvasionEvent {

  @Id
  @Column
  private long id;
  @Column
  private String invasionType;
  @Column
  private String time;
  @Column
  private String passNum;
  @Column
  private String blockNum;
  @Column
  private String position;
  @Column
  private String externalClass;
  @Column
  private String isDealed;
  @Column
  private String dealMan;
  @Column
  private String dealTime;
  @Column
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getInvasionType() {
    return invasionType;
  }

  public void setInvasionType(String invasionType) {
    this.invasionType = invasionType;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public String getPassNum() {
    return passNum;
  }

  public void setPassNum(String passNum) {
    this.passNum = passNum;
  }


  public String getBlockNum() {
    return blockNum;
  }

  public void setBlockNum(String blockNum) {
    this.blockNum = blockNum;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getExternalClass() {
    return externalClass;
  }

  public void setExternalClass(String externalClass) {
    this.externalClass = externalClass;
  }


  public String getIsDealed() {
    return isDealed;
  }

  public void setIsDealed(String isDealed) {
    this.isDealed = isDealed;
  }


  public String getDealMan() {
    return dealMan;
  }

  public void setDealMan(String dealMan) {
    this.dealMan = dealMan;
  }


  public String getDealTime() {
    return dealTime;
  }

  public void setDealTime(String dealTime) {
    this.dealTime = dealTime;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
