package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/22 15:16
 */
public class MaterialBeat {
  private Integer id;
  private Integer materialId;
  private Long itemId;
  private String title;
  private String itemDescription;
  private String pictUrl;
  private Integer couponAmount;
  private Integer couponTotalCount;
  private String couponStartFee;
  private String couponShareUrl;
  private String couponClickUrl;
  private String clickUrl;
  private String commissionRate;
  private Integer volume;
  private String zkFinalPrice;
  private String finalPrice;

  public MaterialBeat() {
    super();
  }

  public MaterialBeat(
      Integer id, Integer materialId, Long itemId, String title, String itemDescription,
      String pictUrl, Integer couponAmount, Integer couponTotalCount, String couponStartFee,
      String couponShareUrl, String couponClickUrl, String clickUrl, String commissionRate,
      Integer volume, String zkFinalPrice, String finalPrice) {
    this.id = id;
    this.materialId = materialId;
    this.itemId = itemId;
    this.title = title;
    this.itemDescription = itemDescription;
    this.pictUrl = pictUrl;
    this.couponAmount = couponAmount;
    this.couponTotalCount = couponTotalCount;
    this.couponStartFee = couponStartFee;
    this.couponShareUrl = couponShareUrl;
    this.couponClickUrl = couponClickUrl;
    this.clickUrl = clickUrl;
    this.commissionRate = commissionRate;
    this.volume = volume;
    this.zkFinalPrice = zkFinalPrice;
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

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getItemDescription() {
    return itemDescription;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getPictUrl() {
    return pictUrl;
  }

  public void setPictUrl(String pictUrl) {
    this.pictUrl = pictUrl;
  }

  public Integer getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(Integer couponAmount) {
    this.couponAmount = couponAmount;
  }

  public Integer getCouponTotalCount() {
    return couponTotalCount;
  }

  public void setCouponTotalCount(Integer couponTotalCount) {
    this.couponTotalCount = couponTotalCount;
  }

  public String getCouponStartFee() {
    return couponStartFee;
  }

  public void setCouponStartFee(String couponStartFee) {
    this.couponStartFee = couponStartFee;
  }

  public String getCouponShareUrl() {
    return couponShareUrl;
  }

  public void setCouponShareUrl(String couponShareUrl) {
    this.couponShareUrl = couponShareUrl;
  }

  public String getCouponClickUrl() {
    return couponClickUrl;
  }

  public void setCouponClickUrl(String couponClickUrl) {
    this.couponClickUrl = couponClickUrl;
  }

  public String getClickUrl() {
    return clickUrl;
  }

  public void setClickUrl(String clickUrl) {
    this.clickUrl = clickUrl;
  }

  public String getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
  }

  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public String getZkFinalPrice() {
    return zkFinalPrice;
  }

  public void setZkFinalPrice(String zkFinalPrice) {
    this.zkFinalPrice = zkFinalPrice;
  }

  public String getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(String finalPrice) {
    this.finalPrice = finalPrice;
  }

  @Override
  public String toString() {
    return "MaterialBeat{" +
        "id=" + id +
        ", materialId=" + materialId +
        ", itemId=" + itemId +
        ", title='" + title + '\'' +
        ", itemDescription='" + itemDescription + '\'' +
        ", pictUrl='" + pictUrl + '\'' +
        ", couponAmount=" + couponAmount +
        ", couponTotalCount=" + couponTotalCount +
        ", couponStartFee='" + couponStartFee + '\'' +
        ", couponShareUrl='" + couponShareUrl + '\'' +
        ", couponClickUrl='" + couponClickUrl + '\'' +
        ", clickUrl='" + clickUrl + '\'' +
        ", commissionRate='" + commissionRate + '\'' +
        ", volume=" + volume +
        ", zkFinalPrice='" + zkFinalPrice + '\'' +
        ", finalPrice='" + finalPrice + '\'' +
        '}';
  }
}
