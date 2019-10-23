package cn.com.bluemoon.common.planner.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * @author yudong
 * @date 2019/8/20
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetNeedDispatchOrderListResVo {

    private String outerCode;
    private String customerName;
    private String customerPhone;
    private String remark;
    private AddressInfo visitAddress;
    private Date orderCreateTime;
    private Date appointTime;
    private String appointmentCode;
    private Integer newOrder;
    private Integer orderType;
    private String appointSlot;

}
