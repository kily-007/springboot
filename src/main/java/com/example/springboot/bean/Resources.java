package com.example.springboot.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Resources {

  @Id
  @Column
  private long id;
  @Column
  private String resource;
  @Column
  private String description;
  @Column
  private long available;
  @Column
  private String remarks;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getAvailable() {
    return available;
  }

  public void setAvailable(long available) {
    this.available = available;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
