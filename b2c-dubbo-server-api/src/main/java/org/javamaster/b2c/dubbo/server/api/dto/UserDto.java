package org.javamaster.b2c.dubbo.server.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private static final long serialVersionUID = -2668999377589717337L;
    private Long id;
    private String username;
    private String password;
    private Integer age;
}
