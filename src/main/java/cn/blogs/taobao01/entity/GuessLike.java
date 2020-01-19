package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 13:33
 */
public class GuessLike {
  private Integer id;
  private Integer goodsId;
  private Integer categoryId;
  private String goodsName;
  private String goodsImg;

  public GuessLike() {
    super();
  }

  public GuessLike(
      Integer id, Integer goodsId, Integer categoryId, String goodsName, String goodsImg) {
    this.id = id;
    this.goodsId = goodsId;
    this.categoryId = categoryId;
    this.goodsName = goodsName;
    this.goodsImg = goodsImg;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(Integer goodsId) {
    this.goodsId = goodsId;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }

  public String getGoodsImg() {
    return goodsImg;
  }

  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }

  @Override
  public String toString() {
    return "GuessLike{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", categoryId=" + categoryId +
        ", goodsName='" + goodsName + '\'' +
        ", goodsImg='" + goodsImg + '\'' +
        '}';
  }
}
