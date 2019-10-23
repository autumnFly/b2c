package com.csair.b2c.cloud.test.mybatistk.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "mall_enterprise_suite_info")
public class MallEnterpriseSuiteInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 套餐编号,“TC”+“yymm”+“001”
     */
    @Column(name = "suite_code")
    private String suiteCode;

    /**
     * 套餐名字
     */
    @Column(name = "suite_name")
    private String suiteName;

    /**
     * 市场价格,分为单位
     */
    @Column(name = "market_price")
    private Integer marketPrice;

    /**
     * 操作人编号
     */
    @Column(name = "op_code")
    private String opCode;

    /**
     * 操作人名称
     */
    @Column(name = "op_name")
    private String opName;

    /**
     * 操作时间
     */
    @Column(name = "op_time")
    private Date opTime;

    /**
     * 创建人编号
     */
    @Column(name = "create_code")
    private String createCode;

    /**
     * 创建人名称
     */
    @Column(name = "create_name")
    private String createName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 套餐主图,一个url链接
     */
    @Column(name = "main_picture")
    private String mainPicture;

    /**
     * 套餐细节图,多个url链接,以逗号隔开,不超过6个
     */
    @Column(name = "specifics_pictures")
    private String specificsPictures;

    /**
     * 套餐详情图,多个url链接,以逗号隔开,不超过6个
     */
    @Column(name = "detail_pictures")
    private String detailPictures;

    /**
     * 状态,0:无效,1:有效
     */
    private Integer status;

    /**
     * 是否开启查看详情,0:关闭,1:开启
     */
    @Column(name = "show_detail")
    private Integer showDetail;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取套餐编号,“TC”+“yymm”+“001”
     *
     * @return suite_code - 套餐编号,“TC”+“yymm”+“001”
     */
    public String getSuiteCode() {
        return suiteCode;
    }

    /**
     * 设置套餐编号,“TC”+“yymm”+“001”
     *
     * @param suiteCode 套餐编号,“TC”+“yymm”+“001”
     */
    public void setSuiteCode(String suiteCode) {
        this.suiteCode = suiteCode;
    }

    /**
     * 获取套餐名字
     *
     * @return suite_name - 套餐名字
     */
    public String getSuiteName() {
        return suiteName;
    }

    /**
     * 设置套餐名字
     *
     * @param suiteName 套餐名字
     */
    public void setSuiteName(String suiteName) {
        this.suiteName = suiteName;
    }

    /**
     * 获取市场价格,分为单位
     *
     * @return market_price - 市场价格,分为单位
     */
    public Integer getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价格,分为单位
     *
     * @param marketPrice 市场价格,分为单位
     */
    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取操作人编号
     *
     * @return op_code - 操作人编号
     */
    public String getOpCode() {
        return opCode;
    }

    /**
     * 设置操作人编号
     *
     * @param opCode 操作人编号
     */
    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    /**
     * 获取操作人名称
     *
     * @return op_name - 操作人名称
     */
    public String getOpName() {
        return opName;
    }

    /**
     * 设置操作人名称
     *
     * @param opName 操作人名称
     */
    public void setOpName(String opName) {
        this.opName = opName;
    }

    /**
     * 获取操作时间
     *
     * @return op_time - 操作时间
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * 设置操作时间
     *
     * @param opTime 操作时间
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    /**
     * 获取创建人编号
     *
     * @return create_code - 创建人编号
     */
    public String getCreateCode() {
        return createCode;
    }

    /**
     * 设置创建人编号
     *
     * @param createCode 创建人编号
     */
    public void setCreateCode(String createCode) {
        this.createCode = createCode;
    }

    /**
     * 获取创建人名称
     *
     * @return create_name - 创建人名称
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置创建人名称
     *
     * @param createName 创建人名称
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取套餐主图,一个url链接
     *
     * @return main_picture - 套餐主图,一个url链接
     */
    public String getMainPicture() {
        return mainPicture;
    }

    /**
     * 设置套餐主图,一个url链接
     *
     * @param mainPicture 套餐主图,一个url链接
     */
    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture;
    }

    /**
     * 获取套餐细节图,多个url链接,以逗号隔开,不超过6个
     *
     * @return specifics_pictures - 套餐细节图,多个url链接,以逗号隔开,不超过6个
     */
    public String getSpecificsPictures() {
        return specificsPictures;
    }

    /**
     * 设置套餐细节图,多个url链接,以逗号隔开,不超过6个
     *
     * @param specificsPictures 套餐细节图,多个url链接,以逗号隔开,不超过6个
     */
    public void setSpecificsPictures(String specificsPictures) {
        this.specificsPictures = specificsPictures;
    }

    /**
     * 获取套餐详情图,多个url链接,以逗号隔开,不超过6个
     *
     * @return detail_pictures - 套餐详情图,多个url链接,以逗号隔开,不超过6个
     */
    public String getDetailPictures() {
        return detailPictures;
    }

    /**
     * 设置套餐详情图,多个url链接,以逗号隔开,不超过6个
     *
     * @param detailPictures 套餐详情图,多个url链接,以逗号隔开,不超过6个
     */
    public void setDetailPictures(String detailPictures) {
        this.detailPictures = detailPictures;
    }

    /**
     * 获取状态,0:无效,1:有效
     *
     * @return status - 状态,0:无效,1:有效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态,0:无效,1:有效
     *
     * @param status 状态,0:无效,1:有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否开启查看详情,0:关闭,1:开启
     *
     * @return show_detail - 是否开启查看详情,0:关闭,1:开启
     */
    public Integer getShowDetail() {
        return showDetail;
    }

    /**
     * 设置是否开启查看详情,0:关闭,1:开启
     *
     * @param showDetail 是否开启查看详情,0:关闭,1:开启
     */
    public void setShowDetail(Integer showDetail) {
        this.showDetail = showDetail;
    }
}