package cn.com.bluemoon.common.customizingwash.po;

public class MallWashGoodsServiceConfig {
    private Long id;

    private Long pid;

    private String goodsCode;

    private String serviceItemName;

    private String serviceTypeName;

    private Integer defaultServiceFlag;

    private String itemRef;

    private Integer servicePrice;

    private Integer mutualFlag;

    private Integer sort;

    private Integer delFlag;

    private Integer level;

    private Integer serviceTypeSort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getServiceItemName() {
        return serviceItemName;
    }

    public void setServiceItemName(String serviceItemName) {
        this.serviceItemName = serviceItemName == null ? null : serviceItemName.trim();
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName == null ? null : serviceTypeName.trim();
    }

    public Integer getDefaultServiceFlag() {
        return defaultServiceFlag;
    }

    public void setDefaultServiceFlag(Integer defaultServiceFlag) {
        this.defaultServiceFlag = defaultServiceFlag;
    }

    public String getItemRef() {
        return itemRef;
    }

    public void setItemRef(String itemRef) {
        this.itemRef = itemRef == null ? null : itemRef.trim();
    }

    public Integer getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Integer servicePrice) {
        this.servicePrice = servicePrice;
    }

    public Integer getMutualFlag() {
        return mutualFlag;
    }

    public void setMutualFlag(Integer mutualFlag) {
        this.mutualFlag = mutualFlag;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getServiceTypeSort() {
        return serviceTypeSort;
    }

    public void setServiceTypeSort(Integer serviceTypeSort) {
        this.serviceTypeSort = serviceTypeSort;
    }
}