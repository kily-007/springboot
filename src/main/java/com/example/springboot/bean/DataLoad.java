package com.example.springboot.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class DataLoad {

  @Id
  @Column
  private long id;
  @Column
  private String module;
  @Column
  private String panel;
  @Column
  private String type;
  @Column
  private String startTime;
  @Column
  private String endTime;
  @Column
  private String dataGrain;
  @Column
  private String isLoad;
  @Column
  private String remarks;

}
