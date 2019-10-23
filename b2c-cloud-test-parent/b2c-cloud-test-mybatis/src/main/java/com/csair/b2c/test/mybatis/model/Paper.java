package com.csair.b2c.test.mybatis.model;

import javax.persistence.*;

public class Paper {
    @Column
    private Long paperId;

    @Column
    private String paperCode;

    @Column
    private String paperName;

    @Column
    private String paperType;

    @Column
    private Byte readType;

    @Column
    private Byte status;

    @Column
    private Integer topicTotalNum;

    @Column
    private Integer topicTotalPoint;

    @Column
    private Byte delFlag;

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode == null ? null : paperCode.trim();
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType == null ? null : paperType.trim();
    }

    public Byte getReadType() {
        return readType;
    }

    public void setReadType(Byte readType) {
        this.readType = readType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getTopicTotalNum() {
        return topicTotalNum;
    }

    public void setTopicTotalNum(Integer topicTotalNum) {
        this.topicTotalNum = topicTotalNum;
    }

    public Integer getTopicTotalPoint() {
        return topicTotalPoint;
    }

    public void setTopicTotalPoint(Integer topicTotalPoint) {
        this.topicTotalPoint = topicTotalPoint;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}