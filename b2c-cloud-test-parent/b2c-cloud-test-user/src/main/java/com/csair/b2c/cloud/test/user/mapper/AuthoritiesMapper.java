package com.csair.b2c.cloud.test.user.mapper;

import com.csair.b2c.cloud.test.common.model.Authorities;
import com.csair.b2c.cloud.test.common.model.GroupAuthoritiesInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface AuthoritiesMapper extends Mapper<Authorities> {
    GroupAuthoritiesInfo selectGroupInfo(@Param("username") String username);
}