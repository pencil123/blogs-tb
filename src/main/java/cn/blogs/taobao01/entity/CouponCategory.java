package cn.blogs.taobao01.entity;

import java.util.Date;

/**
 * @author lyzhang
 * @since 2020/1/22 22:24
 */
public class CouponCategory {
  private Integer id;
  private Integer materialId;
  private Integer materialType;
  private String materialName;
  private Date updateTime;

  public CouponCategory() {
    super();
  }

  public CouponCategory(
      Integer id, Integer materialId, Integer materialType, String materialName,
      Date updateTime) {
    this.id = id;
    this.materialId = materialId;
    this.materialType = materialType;
    this.materialName = materialName;
    this.updateTime = updateTime;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMaterialId() {
    return materialId;
  }

  public void setMaterialId(Integer materialId) {
    this.materialId = materialId;
  }

  public Integer getMaterialType() {
    return materialType;
  }

  public void setMaterialType(Integer materialType) {
    this.materialType = materialType;
  }

  public String getMaterialName() {
    return materialName;
  }

  public void setMaterialName(String materialName) {
    this.materialName = materialName;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "CouponCategory{" +
        "id=" + id +
        ", materialId=" + materialId +
        ", materialType=" + materialType +
        ", materialName='" + materialName + '\'' +
        ", updateTime=" + updateTime +
        '}';
  }
}
