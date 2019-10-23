package com.csair.b2c.cloud.test.actuator.model;

/**
 * Created on 2018/10/25.<br/>
 *
 * @author yudong
 */
public class SaveSuiteReqVO {

    private FileBean mainPic;
    private FileBean specificsPic;
    private FileBean detailPic;

    public FileBean getMainPic() {
        return mainPic;
    }

    public void setMainPic(FileBean mainPic) {
        this.mainPic = mainPic;
    }

    public FileBean getSpecificsPic() {
        return specificsPic;
    }

    public void setSpecificsPic(FileBean specificsPic) {
        this.specificsPic = specificsPic;
    }

    public FileBean getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(FileBean detailPic) {
        this.detailPic = detailPic;
    }
}
