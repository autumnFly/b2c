package com.csair.b2c.cloud.test.user.vo;

import com.csair.b2c.cloud.test.common.model.Users;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Created on 2018/12/10.<br/>
 *
 * @author yudong
 */
public class UpdatePasswordReqVo extends Users {

    private static final long serialVersionUID = -1353706614638513233L;
    @NotBlank
    private String newPassword;

    @Override
    public String toString() {
        return "UpdatePasswordReqVo{" +
                "newPassword='" + newPassword + '\'' +
                '}';
    }

    public static UpdatePasswordReqVo getInstance() {
        return new UpdatePasswordReqVo();
    }

    public UpdatePasswordReqVo newPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
