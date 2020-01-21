package cn.blogs.taobao01.entity;

/**
 * @author lyzhang
 * @since 2020/1/19 15:30
 */
public class MaterialMkt {
  private Integer id;
  private Long itemId;
  private String includeDxjh;
  private String infoDxjh;
  private String includeMkt;
  private String presaleDeposit;
  private Integer presaleEndTime;
  private Integer presaleStartTime;
  private Integer presaleTailEndTime;
  private Integer presaleTailStartTime;


  public MaterialMkt() {
    super();
  }

  public MaterialMkt(
      Integer id, Long itemId, String includeDxjh, String infoDxjh, String includeMkt,
      String presaleDeposit, Integer presaleEndTime, Integer presaleStartTime,
      Integer presaleTailEndTime, Integer presaleTailStartTime) {
    this.id = id;
    this.itemId = itemId;
    this.includeDxjh = includeDxjh;
    this.infoDxjh = infoDxjh;
    this.includeMkt = includeMkt;
    this.presaleDeposit = presaleDeposit;
    this.presaleEndTime = presaleEndTime;
    this.presaleStartTime = presaleStartTime;
    this.presaleTailEndTime = presaleTailEndTime;
    this.presaleTailStartTime = presaleTailStartTime;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public String getIncludeDxjh() {
    return includeDxjh;
  }

  public void setIncludeDxjh(String includeDxjh) {
    this.includeDxjh = includeDxjh;
  }

  public String getInfoDxjh() {
    return infoDxjh;
  }

  public void setInfoDxjh(String infoDxjh) {
    this.infoDxjh = infoDxjh;
  }

  public String getIncludeMkt() {
    return includeMkt;
  }

  public void setIncludeMkt(String includeMkt) {
    this.includeMkt = includeMkt;
  }

  public String getPresaleDeposit() {
    return presaleDeposit;
  }

  public void setPresaleDeposit(String presaleDeposit) {
    this.presaleDeposit = presaleDeposit;
  }

  public Integer getPresaleEndTime() {
    return presaleEndTime;
  }

  public void setPresaleEndTime(Integer presaleEndTime) {
    this.presaleEndTime = presaleEndTime;
  }

  public Integer getPresaleStartTime() {
    return presaleStartTime;
  }

  public void setPresaleStartTime(Integer presaleStartTime) {
    this.presaleStartTime = presaleStartTime;
  }

  public Integer getPresaleTailEndTime() {
    return presaleTailEndTime;
  }

  public void setPresaleTailEndTime(Integer presaleTailEndTime) {
    this.presaleTailEndTime = presaleTailEndTime;
  }

  public Integer getPresaleTailStartTime() {
    return presaleTailStartTime;
  }

  public void setPresaleTailStartTime(Integer presaleTailStartTime) {
    this.presaleTailStartTime = presaleTailStartTime;
  }

  @Override
  public String toString() {
    return "MaterialMkt{" +
        "id=" + id +
        ", itemId=" + itemId +
        ", includeDxjh='" + includeDxjh + '\'' +
        ", infoDxjh='" + infoDxjh + '\'' +
        ", includeMkt='" + includeMkt + '\'' +
        ", presaleDeposit='" + presaleDeposit + '\'' +
        ", presaleEndTime=" + presaleEndTime +
        ", presaleStartTime=" + presaleStartTime +
        ", presaleTailEndTime=" + presaleTailEndTime +
        ", presaleTailStartTime=" + presaleTailStartTime +
        '}';
  }
}
