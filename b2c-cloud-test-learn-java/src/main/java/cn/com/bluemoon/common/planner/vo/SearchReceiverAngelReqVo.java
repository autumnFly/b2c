package cn.com.bluemoon.common.planner.vo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author yudong
 * @date 2019/8/21
 */
@Data
public class SearchReceiverAngelReqVo {
    @NotBlank
    private String token;
    @NotBlank
    private String angel;

}
