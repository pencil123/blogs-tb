package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 13:45
 */
public class Keyword {
  private Integer id;
  private String keywordName;
  private Integer keywordClick;

  public Keyword() {
    super();
  }

  public Keyword(Integer id, String keywordName, Integer keywordClick) {
    this.id = id;
    this.keywordName = keywordName;
    this.keywordClick = keywordClick;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getKeywordName() {
    return keywordName;
  }

  public void setKeywordName(String keywordName) {
    this.keywordName = keywordName;
  }

  public Integer getKeywordClick() {
    return keywordClick;
  }

  public void setKeywordClick(Integer keywordClick) {
    this.keywordClick = keywordClick;
  }

  @Override
  public String toString() {
    return "Keyword{" +
        "id=" + id +
        ", keywordName='" + keywordName + '\'' +
        ", keywordClick=" + keywordClick +
        '}';
  }
}
