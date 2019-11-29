package com.example.springboot.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class RoleResources {
  @Id
  @Column
  private long id;
  @Column
  private long roleId;
  @Column
  private String role;
  @Column
  private long resourcesId;
  @Column
  private String resources;
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


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public long getResourcesId() {
    return resourcesId;
  }

  public void setResourcesId(long resourcesId) {
    this.resourcesId = resourcesId;
  }


  public String getResources() {
    return resources;
  }

  public void setResources(String resources) {
    this.resources = resources;
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
