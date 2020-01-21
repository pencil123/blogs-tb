package cn.blogs.taobao01.entity;

import com.alibaba.fastjson.JSONObject;

/**
 * @author lyzhang
 * @since 2020/1/19 14:03
 */
public class Material {
  private Integer id;
  private Category category;
  private MaterialCoupon MatCoupon;
  private MaterialSeller MatSeller;
  private MaterialMkt MatMkt;
  private String xId;
  private Long itemId;
  private String shortTitle;
  private String title;
  private String itemUrl;
  private String itemDescription;
  private String provcity;
  private String pictUrl;
  private String smallImages;
  private String whiteImage;
  private String realPostFee;
  private String reservePrice;
  private String zkFinalPrice;
  private Integer volume;
  private Integer categoryId;
  private String categoryName;
  private Integer levelOneCategoryId;
  private String levelOneCategoryName;

  public Material() {
  }

  public Material(
      Integer id, Category category, MaterialCoupon matCoupon,
      MaterialSeller matSeller, MaterialMkt matMkt, String xId, Long itemId,
      String shortTitle, String title, String itemUrl, String itemDescription,
      String provcity, String pictUrl, String smallImages, String whiteImage,
      String realPostFee, String reservePrice, String zkFinalPrice, Integer volume,
      Integer categoryId, String categoryName, Integer levelOneCategoryId,
      String levelOneCategoryName) {
    this.id = id;
    this.category = category;
    MatCoupon = matCoupon;
    MatSeller = matSeller;
    MatMkt = matMkt;
    this.xId = xId;
    this.itemId = itemId;
    this.shortTitle = shortTitle;
    this.title = title;
    this.itemUrl = itemUrl;
    this.itemDescription = itemDescription;
    this.provcity = provcity;
    this.pictUrl = pictUrl;
    this.smallImages = smallImages;
    this.whiteImage = whiteImage;
    this.realPostFee = realPostFee;
    this.reservePrice = reservePrice;
    this.zkFinalPrice = zkFinalPrice;
    this.volume = volume;
    this.categoryId = categoryId;
    this.categoryName = categoryName;
    this.levelOneCategoryId = levelOneCategoryId;
    this.levelOneCategoryName = levelOneCategoryName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public MaterialCoupon getMatCoupon() {
    return MatCoupon;
  }

  public void setMatCoupon(MaterialCoupon matCoupon) {
    MatCoupon = matCoupon;
  }

  public MaterialSeller getMatSeller() {
    return MatSeller;
  }

  public void setMatSeller(MaterialSeller matSeller) {
    MatSeller = matSeller;
  }

  public MaterialMkt getMatMkt() {
    return MatMkt;
  }

  public void setMatMkt(MaterialMkt matMkt) {
    MatMkt = matMkt;
  }

  public String getxId() {
    return xId;
  }

  public void setxId(String xId) {
    this.xId = xId;
  }

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public String getShortTitle() {
    return shortTitle;
  }

  public void setShortTitle(String shortTitle) {
    this.shortTitle = shortTitle;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getItemUrl() {
    return itemUrl;
  }

  public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
  }

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getProvcity() {
    return provcity;
  }

  public void setProvcity(String provcity) {
    this.provcity = provcity;
  }

  public String getPictUrl() {
    return pictUrl;
  }

  public void setPictUrl(String pictUrl) {
    this.pictUrl = pictUrl;
  }

  public String getSmallImages() {
    return smallImages;
  }

  public void setSmallImages(String smallImages) {
    this.smallImages = smallImages;
  }

  public String getWhiteImage() {
    return whiteImage;
  }

  public void setWhiteImage(String whiteImage) {
    this.whiteImage = whiteImage;
  }

  public String getRealPostFee() {
    return realPostFee;
  }

  public void setRealPostFee(String realPostFee) {
    this.realPostFee = realPostFee;
  }

  public String getReservePrice() {
    return reservePrice;
  }

  public void setReservePrice(String reservePrice) {
    this.reservePrice = reservePrice;
  }

  public String getZkFinalPrice() {
    return zkFinalPrice;
  }

  public void setZkFinalPrice(String zkFinalPrice) {
    this.zkFinalPrice = zkFinalPrice;
  }

  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Integer getLevelOneCategoryId() {
    return levelOneCategoryId;
  }

  public void setLevelOneCategoryId(Integer levelOneCategoryId) {
    this.levelOneCategoryId = levelOneCategoryId;
  }

  public String getLevelOneCategoryName() {
    return levelOneCategoryName;
  }

  public void setLevelOneCategoryName(String levelOneCategoryName) {
    this.levelOneCategoryName = levelOneCategoryName;
  }

  @Override
  public String toString() {
    return "Material{" +
        "id=" + id +
        ", category=" + category +
        ", MatCoupon=" + MatCoupon +
        ", MatSeller=" + MatSeller +
        ", MatMkt=" + MatMkt +
        ", xId='" + xId + '\'' +
        ", itemId=" + itemId +
        ", shortTitle='" + shortTitle + '\'' +
        ", title='" + title + '\'' +
        ", itemUrl='" + itemUrl + '\'' +
        ", itemDescription='" + itemDescription + '\'' +
        ", provcity='" + provcity + '\'' +
        ", pictUrl='" + pictUrl + '\'' +
        ", smallImages='" + smallImages + '\'' +
        ", whiteImage='" + whiteImage + '\'' +
        ", realPostFee='" + realPostFee + '\'' +
        ", reservePrice='" + reservePrice + '\'' +
        ", zkFinalPrice='" + zkFinalPrice + '\'' +
        ", volume=" + volume +
        ", categoryId=" + categoryId +
        ", categoryName='" + categoryName + '\'' +
        ", levelOneCategoryId=" + levelOneCategoryId +
        ", levelOneCategoryName='" + levelOneCategoryName + '\'' +
        '}';
  }
}
