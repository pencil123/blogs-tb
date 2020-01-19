package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 14:58
 */
public class MaterialSeller {
  private Integer id;
  private Integer userType;
  private String nick;
  private String sellerId;
  private Integer shopDsr;
  private String shopTitle;

  public MaterialSeller() {
    super();
  }

  public MaterialSeller(
      Integer id, Integer userType, String nick, String sellerId, Integer shopDsr,
      String shopTitle) {
    this.id = id;
    this.userType = userType;
    this.nick = nick;
    this.sellerId = sellerId;
    this.shopDsr = shopDsr;
    this.shopTitle = shopTitle;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  public String getNick() {
    return nick;
  }

  public void setNick(String nick) {
    this.nick = nick;
  }

  public String getSellerId() {
    return sellerId;
  }

  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }

  public Integer getShopDsr() {
    return shopDsr;
  }

  public void setShopDsr(Integer shopDsr) {
    this.shopDsr = shopDsr;
  }

  public String getShopTitle() {
    return shopTitle;
  }

  public void setShopTitle(String shopTitle) {
    this.shopTitle = shopTitle;
  }

  @Override
  public String toString() {
    return "MaterialSeller{" +
        "id=" + id +
        ", userType=" + userType +
        ", nick='" + nick + '\'' +
        ", sellerId='" + sellerId + '\'' +
        ", shopDsr=" + shopDsr +
        ", shopTitle='" + shopTitle + '\'' +
        '}';
  }
}
