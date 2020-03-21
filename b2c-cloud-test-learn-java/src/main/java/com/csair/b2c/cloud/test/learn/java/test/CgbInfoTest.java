package com.csair.b2c.cloud.test.learn.java.test;

import com.csair.b2c.cloud.test.learn.java.model.CgbAngelInfo;
import com.csair.b2c.cloud.test.learn.java.utils.MybatisUtils;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.javamaster.b2c.config.BlueMoonConsts;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.client.RestTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author yudong
 * @date 2020/3/10
 */
@Slf4j
public class CgbInfoTest {
    private static JdbcTemplate jdbcTemplate = MybatisUtils.getJdbcTemplateB2b2cMall();
    private static RestTemplate restTemplate = new RestTemplate();

    Logger logger = LoggerFactory.getLogger("sql.original.CdbInfoTest");
    Logger logger1 = LoggerFactory.getLogger("sql.new.CdbInfoTest");

    @Test
    public void test() {
        List<CgbAngelInfo> list = jdbcTemplate.query("select * from cgb_angel_info",
                new Object[]{},
                (rs, rowNum) -> convert(rs));
        list = new ArrayList<>(new HashSet<>(list));
        handlerList(list);
    }

    private CgbAngelInfo convert(ResultSet rs) throws SQLException {
        CgbAngelInfo info = new CgbAngelInfo();
        info.setId(rs.getLong("id"));
        info.setUserid(rs.getString("userid"));
        info.setStatus(rs.getInt("status"));
        info.setAngelId(rs.getLong("angel_id"));
        info.setAngelName(rs.getString("angel_name"));
        info.setAngelNo(rs.getString("angel_no"));
        info.setLongitude(rs.getString("longitude"));
        info.setLatitude(rs.getString("latitude"));
        info.setValid(rs.getInt("valid"));
        return info;
    }

    private void handlerList(List<CgbAngelInfo> list) {
        String url = "http://restapi.amap.com/v3/assistant/coordinate/convert?locations={1},{2}&coordsys=baidu&output=JSON&key=" + BlueMoonConsts.Map.GAODE_KEY_2;
        for (CgbAngelInfo cgbAngelInfo : list) {
            if (StringUtils.isBlank(cgbAngelInfo.getLongitude())) {
                log.info("address blank userId:{}", cgbAngelInfo.getUserid());
                continue;
            }
            JsonNode jsonNode = restTemplate.getForObject(url, JsonNode.class, cgbAngelInfo.getLongitude(), cgbAngelInfo.getLatitude());
            log.info("req:{},res:{}", cgbAngelInfo.getUserid(), jsonNode);
            if (!"ok".equals(jsonNode.get("info").asText())) {
                log.error("wrong:{},res:{}", cgbAngelInfo.getUserid(), jsonNode);
                continue;
            }
            String locations = jsonNode.get("locations").asText();
            if (StringUtils.isBlank(locations)) {
                log.error("wrong1:{},res:{}", cgbAngelInfo.getUserid(), jsonNode);
                continue;
            }
            String[] strs = locations.split(",");
            log.info("id:{},userId:{},olng:{},olat:{}", cgbAngelInfo.getId(), cgbAngelInfo.getUserid(), cgbAngelInfo.getLongitude(), cgbAngelInfo.getLatitude());
            log.info("id:{},userId:{},lng:{},lat:{}", cgbAngelInfo.getId(), cgbAngelInfo.getUserid(), strs[0], strs[1]);
            String originalSql = "update cgb_angel_info set longitude='%s',latitude='%s' where id=%s";
            originalSql = String.format(originalSql, cgbAngelInfo.getLongitude(), cgbAngelInfo.getLatitude(), cgbAngelInfo.getId());
            logger.info("{}", originalSql);
            String sql = "update cgb_angel_info set longitude='%s',latitude='%s' where id=%s";
            sql = String.format(sql, strs[0], strs[1], cgbAngelInfo.getId());
            logger1.info("{}", sql);
            jdbcTemplate.execute(sql);
        }
    }
}
