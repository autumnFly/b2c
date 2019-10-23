package com.csair.b2c.test.mybatis.model;

public class StudentsExam {
    private Long studExamId;

    private String examCode;

    private String studId;

    private Byte delFlag;

    public Long getStudExamId() {
        return studExamId;
    }

    public void setStudExamId(Long studExamId) {
        this.studExamId = studExamId;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}