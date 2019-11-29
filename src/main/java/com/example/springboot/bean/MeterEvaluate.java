package com.example.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MeterEvaluate {

  @Id
  @Column
  private long id;
  @Column
  private String time;
  @Column
  private String file;
  @Column
  private String size;
  @Column
  private String sensitivity;
  @Column
  private String effect;
  @Column
  private String evaluate;
  @Column
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


  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }


  public String getSensitivity() {
    return sensitivity;
  }

  public void setSensitivity(String sensitivity) {
    this.sensitivity = sensitivity;
  }


  public String getEffect() {
    return effect;
  }

  public void setEffect(String effect) {
    this.effect = effect;
  }


  public String getEvaluate() {
    return evaluate;
  }

  public void setEvaluate(String evaluate) {
    this.evaluate = evaluate;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
