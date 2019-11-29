package com.example.springboot.bean;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UserRight {

  @Id
  @Column
  private long id;
  @Column
  private long userId;
  @Column
  private String username;
  @Column
  private String employer;
  @Column
  private String rough;
  @Column
  private String detail;
  @Column
  private String systemComposition;
  @Column
  private String systemContent;
  @Column
  private String initMeter;
  @Column
  private String evaluateMeter;
  @Column
  private String evaluateMeterHistory;
  @Column
  private String subwayMonitor;
  @Column
  private String subwayHistory;
  @Column
  private String statusPress;
  @Column
  private String statusTemperature;
  @Column
  private String statusVibration;
  @Column
  private String externalInvasion;
  @Column
  private String internalInvasion;
  @Column
  private String invasionHistory;
  @Column
  private String dataAllLineManage;
  @Column
  private String dataSubwayManage;
  @Column
  private String dataLoadManage;
  @Column
  private String systemUsersManage;
  @Column
  private String userRightManage;
  @Column
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }


  public String getRough() {
    return rough;
  }

  public void setRough(String rough) {
    this.rough = rough;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public String getSystemComposition() {
    return systemComposition;
  }

  public void setSystemComposition(String systemComposition) {
    this.systemComposition = systemComposition;
  }


  public String getSystemContent() {
    return systemContent;
  }

  public void setSystemContent(String systemContent) {
    this.systemContent = systemContent;
  }


  public String getInitMeter() {
    return initMeter;
  }

  public void setInitMeter(String initMeter) {
    this.initMeter = initMeter;
  }


  public String getEvaluateMeter() {
    return evaluateMeter;
  }

  public void setEvaluateMeter(String evaluateMeter) {
    this.evaluateMeter = evaluateMeter;
  }


  public String getEvaluateMeterHistory() {
    return evaluateMeterHistory;
  }

  public void setEvaluateMeterHistory(String evaluateMeterHistory) {
    this.evaluateMeterHistory = evaluateMeterHistory;
  }


  public String getSubwayMonitor() {
    return subwayMonitor;
  }

  public void setSubwayMonitor(String subwayMonitor) {
    this.subwayMonitor = subwayMonitor;
  }


  public String getSubwayHistory() {
    return subwayHistory;
  }

  public void setSubwayHistory(String subwayHistory) {
    this.subwayHistory = subwayHistory;
  }


  public String getStatusPress() {
    return statusPress;
  }

  public void setStatusPress(String statusPress) {
    this.statusPress = statusPress;
  }


  public String getStatusTemperature() {
    return statusTemperature;
  }

  public void setStatusTemperature(String statusTemperature) {
    this.statusTemperature = statusTemperature;
  }


  public String getStatusVibration() {
    return statusVibration;
  }

  public void setStatusVibration(String statusVibration) {
    this.statusVibration = statusVibration;
  }


  public String getExternalInvasion() {
    return externalInvasion;
  }

  public void setExternalInvasion(String externalInvasion) {
    this.externalInvasion = externalInvasion;
  }


  public String getInternalInvasion() {
    return internalInvasion;
  }

  public void setInternalInvasion(String internalInvasion) {
    this.internalInvasion = internalInvasion;
  }


  public String getInvasionHistory() {
    return invasionHistory;
  }

  public void setInvasionHistory(String invasionHistory) {
    this.invasionHistory = invasionHistory;
  }


  public String getDataAllLineManage() {
    return dataAllLineManage;
  }

  public void setDataAllLineManage(String dataAllLineManage) {
    this.dataAllLineManage = dataAllLineManage;
  }


  public String getDataSubwayManage() {
    return dataSubwayManage;
  }

  public void setDataSubwayManage(String dataSubwayManage) {
    this.dataSubwayManage = dataSubwayManage;
  }


  public String getDataLoadManage() {
    return dataLoadManage;
  }

  public void setDataLoadManage(String dataLoadManage) {
    this.dataLoadManage = dataLoadManage;
  }


  public String getSystemUsersManage() {
    return systemUsersManage;
  }

  public void setSystemUsersManage(String systemUsersManage) {
    this.systemUsersManage = systemUsersManage;
  }


  public String getUserRightManage() {
    return userRightManage;
  }

  public void setUserRightManage(String userRightManage) {
    this.userRightManage = userRightManage;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
