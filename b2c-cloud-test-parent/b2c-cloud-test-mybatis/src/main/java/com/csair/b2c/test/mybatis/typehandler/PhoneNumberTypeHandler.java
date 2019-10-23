package com.csair.b2c.test.mybatis.typehandler;

import com.csair.b2c.test.mybatis.model.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created on 2019/2/2.<br/>
 *
 * @author yudong
 */
@MappedTypes(PhoneNumber.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class PhoneNumberTypeHandler extends BaseTypeHandler<PhoneNumber> {


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, PhoneNumber parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getAsString());
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String s = rs.getString(columnName);
        if (s == null) {
            return null;
        }
        return new PhoneNumber(s);
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String s = rs.getString(columnIndex);
        if (s == null) {
            return null;
        }
        return new PhoneNumber(s);
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String s = cs.getString(columnIndex);
        if (s == null) {
            return null;
        }
        return new PhoneNumber(s);
    }
}
