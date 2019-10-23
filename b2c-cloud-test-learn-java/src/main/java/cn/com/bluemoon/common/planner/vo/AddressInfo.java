package cn.com.bluemoon.common.planner.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author yudong
 * @date 2019/8/20
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AddressInfo {
    private String province;
    private String city;
    private String county;
    private String street;
    private String village;
    private String address;
}
