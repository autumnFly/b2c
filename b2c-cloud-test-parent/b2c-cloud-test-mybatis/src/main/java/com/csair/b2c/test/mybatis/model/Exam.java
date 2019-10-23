package com.csair.b2c.test.mybatis.model;

import com.csair.b2c.test.mybatis.enums.DelFlagEnum;
import com.csair.b2c.test.mybatis.enums.ExamStatusEnum;
import com.csair.b2c.test.mybatis.enums.ExamTypeEnum;

import java.util.Date;

/**
 * 因为在ObjectMapper注册了针对实现了EnumBase接口的枚举类的module，所以字段不需要在指明如何序列化和反序列化，
 * 也就是不需要在加上这两个注解@JsonSerialize，@JsonDeserialize
 */
public class Exam extends CommonReqVo {
    private Long examId;

    private String examCode;

    private String examName;

//    @JsonSerialize(using = EnumBaseSerializer.class)
//    @JsonDeserialize(using = EnumBaseDeserializer.class)
    private ExamTypeEnum examType;

//    @JsonSerialize(using = EnumBaseSerializer.class)
//    @JsonDeserialize(using = EnumBaseDeserializer.class)
    private ExamStatusEnum examStatus;

    private Date publishStartTime;

    private Date publishEndTime;

    private Integer scorePoint;

//    @JsonSerialize(using = EnumBaseSerializer.class)
//    @JsonDeserialize(using = EnumBaseDeserializer.class)
    private DelFlagEnum delFlag;

    private String examExplain;

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examCode='" + examCode + '\'' +
                ", examName='" + examName + '\'' +
                ", examType=" + examType +
                ", examStatus=" + examStatus +
                ", publishStartTime=" + publishStartTime +
                ", publishEndTime=" + publishEndTime +
                ", scorePoint=" + scorePoint +
                ", delFlag=" + delFlag +
                ", examExplain='" + examExplain + '\'' +
                '}';
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public ExamTypeEnum getExamType() {
        return examType;
    }

    public void setExamType(ExamTypeEnum examType) {
        this.examType = examType;
    }

    public ExamStatusEnum getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(ExamStatusEnum examStatus) {
        this.examStatus = examStatus;
    }

    public Date getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(Date publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public Date getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(Date publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public Integer getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(Integer scorePoint) {
        this.scorePoint = scorePoint;
    }

    public DelFlagEnum getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(DelFlagEnum delFlag) {
        this.delFlag = delFlag;
    }

    public String getExamExplain() {
        return examExplain;
    }

    public void setExamExplain(String examExplain) {
        this.examExplain = examExplain;
    }
}