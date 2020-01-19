package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 11:12
 */
public class Category {
  private Integer id;
  private Integer parentId;
  private String categoryName;
  private String categoryNick;
  private String categoryTitle;
  private String categoryKeyword;
  private String categoryDescription;
  private String hotPoints;

  public Category() {
    super();
  }

  public Category(
      Integer id, Integer parentId, String categoryName, String categoryNick,
      String categoryTitle, String categoryKeyword, String categoryDescription,
      String hotPoints) {
    this.id = id;
    this.parentId = parentId;
    this.categoryName = categoryName;
    this.categoryNick = categoryNick;
    this.categoryTitle = categoryTitle;
    this.categoryKeyword = categoryKeyword;
    this.categoryDescription = categoryDescription;
    this.hotPoints = hotPoints;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getparentId() {
    return parentId;
  }

  public void setparentId(Integer parentId) {
    this.parentId = parentId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getCategoryNick() {
    return categoryNick;
  }

  public void setCategoryNick(String categoryNick) {
    this.categoryNick = categoryNick;
  }

  public String getCategoryTitle() {
    return categoryTitle;
  }

  public void setCategoryTitle(String categoryTitle) {
    this.categoryTitle = categoryTitle;
  }

  public String getCategoryKeyword() {
    return categoryKeyword;
  }

  public void setCategoryKeyword(String categoryKeyword) {
    this.categoryKeyword = categoryKeyword;
  }

  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }

  public String getHotPoints() {
    return hotPoints;
  }

  public void setHotPoints(String hotPoints) {
    this.hotPoints = hotPoints;
  }

  @Override
  public String toString() {
    return "Category{" +
        "id=" + id +
        ", parentId=" + parentId +
        ", categoryName='" + categoryName + '\'' +
        ", categoryNick='" + categoryNick + '\'' +
        ", categoryTitle='" + categoryTitle + '\'' +
        ", categoryKeyword='" + categoryKeyword + '\'' +
        ", categoryDescription='" + categoryDescription + '\'' +
        ", hotPoints='" + hotPoints + '\'' +
        '}';
  }
}
