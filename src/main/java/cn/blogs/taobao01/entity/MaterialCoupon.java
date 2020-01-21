package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 15:12
 */
public class MaterialCoupon {
  private Integer id;
  private String url;
  private String tkTotalSales;
  private String tkTotalCommi;
  private String couponId;
  private String couponInfo;
  private String couponShareUrl;
  private Integer couponTotalCount;
  private Integer couponRemainCount;
  private String couponStartFee;
  private String couponAmount;
  private String couponStartTime;
  private String couponEndTime;
  private String commissionRate;
  private String commissionType;

  public MaterialCoupon() {
    super();
  }

  public MaterialCoupon(
      Integer id, String url, String tkTotalSales, String tkTotalCommi, String couponId,
      String couponInfo, String couponShareUrl, Integer couponTotalCount,
      Integer couponRemainCount, String couponStartFee, String couponAmount,
      String couponStartTime, String couponEndTime, String commissionRate,
      String commissionType) {
    this.id = id;
    this.url = url;
    this.tkTotalSales = tkTotalSales;
    this.tkTotalCommi = tkTotalCommi;
    this.couponId = couponId;
    this.couponInfo = couponInfo;
    this.couponShareUrl = couponShareUrl;
    this.couponTotalCount = couponTotalCount;
    this.couponRemainCount = couponRemainCount;
    this.couponStartFee = couponStartFee;
    this.couponAmount = couponAmount;
    this.couponStartTime = couponStartTime;
    this.couponEndTime = couponEndTime;
    this.commissionRate = commissionRate;
    this.commissionType = commissionType;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTkTotalSales() {
    return tkTotalSales;
  }

  public void setTkTotalSales(String tkTotalSales) {
    this.tkTotalSales = tkTotalSales;
  }

  public String getTkTotalCommi() {
    return tkTotalCommi;
  }

  public void setTkTotalCommi(String tkTotalCommi) {
    this.tkTotalCommi = tkTotalCommi;
  }

  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }

  public String getCouponInfo() {
    return couponInfo;
  }

  public void setCouponInfo(String couponInfo) {
    this.couponInfo = couponInfo;
  }

  public String getCouponShareUrl() {
    return couponShareUrl;
  }

  public void setCouponShareUrl(String couponShareUrl) {
    this.couponShareUrl = couponShareUrl;
  }

  public Integer getCouponTotalCount() {
    return couponTotalCount;
  }

  public void setCouponTotalCount(Integer couponTotalCount) {
    this.couponTotalCount = couponTotalCount;
  }

  public Integer getCouponRemainCount() {
    return couponRemainCount;
  }

  public void setCouponRemainCount(Integer couponRemainCount) {
    this.couponRemainCount = couponRemainCount;
  }

  public String getCouponStartFee() {
    return couponStartFee;
  }

  public void setCouponStartFee(String couponStartFee) {
    this.couponStartFee = couponStartFee;
  }

  public String getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
  }

  public String getCouponStartTime() {
    return couponStartTime;
  }

  public void setCouponStartTime(String couponStartTime) {
    this.couponStartTime = couponStartTime;
  }

  public String getCouponEndTime() {
    return couponEndTime;
  }

  public void setCouponEndTime(String couponEndTime) {
    this.couponEndTime = couponEndTime;
  }

  public String getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(String commissionRate) {
    this.commissionRate = commissionRate;
  }

  public String getCommissionType() {
    return commissionType;
  }

  public void setCommissionType(String commissionType) {
    this.commissionType = commissionType;
  }

  @Override
  public String toString() {
    return "MaterialCoupon{" +
        "id=" + id +
        ", url='" + url + '\'' +
        ", tkTotalSales=" + tkTotalSales +
        ", tkTotalCommi='" + tkTotalCommi + '\'' +
        ", couponId='" + couponId + '\'' +
        ", couponInfo='" + couponInfo + '\'' +
        ", couponShareUrl='" + couponShareUrl + '\'' +
        ", couponTotalCount=" + couponTotalCount +
        ", couponRemainCount=" + couponRemainCount +
        ", couponStartFee='" + couponStartFee + '\'' +
        ", couponAmount='" + couponAmount + '\'' +
        ", couponStartTime='" + couponStartTime + '\'' +
        ", couponEndTime='" + couponEndTime + '\'' +
        ", commissionRate='" + commissionRate + '\'' +
        ", commissionType='" + commissionType + '\'' +
        '}';
  }
}
