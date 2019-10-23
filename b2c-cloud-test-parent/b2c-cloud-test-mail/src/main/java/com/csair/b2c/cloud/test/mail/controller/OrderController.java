package com.csair.b2c.cloud.test.mail.controller;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.csair.b2c.cloud.test.common.constant.SessionConst;
import com.csair.b2c.cloud.test.common.util.HeaderUtils;
import com.csair.b2c.cloud.test.mail.ControllerAdviceMail;
import com.csair.b2c.cloud.test.mail.model.QueryOrderResponse;
import com.csair.b2c.cloud.test.mail.model.QueryPlaneOrdersResponse;
import com.csair.b2c.cloud.test.mail.util.CityUtils;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by yu on 2018/5/10.
 */
@Controller
@RequestMapping("order/*")
public class OrderController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private RestTemplate rest;

    @GetMapping("orderManagementPage")
    public String orderManagementPage(Model model, HttpServletRequest request,
                                      HttpSession session) {
        model.addAttribute("cityMap", CityUtils.getCityMap());

        LinkedMultiValueMap<String, String> reqMap = new LinkedMultiValueMap<>();
        reqMap.add("groupflag", "0");
        reqMap.add("bookTimeFrom", "2017-11-18");
        reqMap.add("page", "1");
        logger.info("orderManagementPage req:{}", JSONObject.toJSONString(reqMap));
        HttpEntity<LinkedMultiValueMap<String, String>> httpEntity = new HttpEntity<>(reqMap
                , HeaderUtils.getMockChromeHeader(request.getHeader("cookie")));
        session.setAttribute(SessionConst.COOKIES,request.getHeader("cookie"));
        ResponseEntity<QueryOrderResponse> responseEntity = rest.postForEntity(ProjectConst.CSAIR_HOST
                        + "/portal/ordermanage/planeOrder/queryPlaneOrders",
                httpEntity, QueryOrderResponse.class);
        if(responseEntity.getStatusCode().is3xxRedirection()){
            logger.info("登录失效");
            return "redirect:/login/loginPage";
        }
        logger.info("orderManagementPage res:{}", responseEntity.getBody().toString());

        if (StringUtils.isNotBlank(responseEntity.getBody().getErrorMsg())) {
            throw new RuntimeException("查询订单出错");
        }

        List<QueryPlaneOrdersResponse> orders = responseEntity.getBody().getOrder();
        model.addAttribute("orders", orders);

        return "/csair/orderManagement";
    }

    @ResponseBody
    @PostMapping("orderList")
    public String orderList(@RequestBody JsonNode jsonNode, Model model, HttpServletRequest request,
                            HttpSession session) {
        String orderUrl = model.asMap().get(ControllerAdviceMail.CSAIR_HOST)
                + "/portal/ordermanage/planeOrder/queryPlaneOrders";
        return null;
    }
}
