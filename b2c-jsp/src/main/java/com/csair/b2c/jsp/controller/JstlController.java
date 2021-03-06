package com.csair.b2c.jsp.controller;

import com.csair.b2c.jsp.model.JstlReqVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author yudong
 * @date 2020/3/18
 */
@Slf4j
@Controller
@RequestMapping("${app.adminPath}/jstl")
public class JstlController extends BaseController {

    @RequestMapping("/springJstlTest")
    public String springJstlTest(Model model) {
        JstlReqVo reqVo = new JstlReqVo();
        reqVo.setName("梁煜东");
        reqVo.setPassword("");
        model.addAttribute("reqVo", reqVo);
        return "springJstlTest";
    }

    @RequestMapping("/save")
    public String save(@Valid JstlReqVo reqVo, Errors errors, Model model) {
        log.info("req:{}", reqVo);
        if (errors.hasErrors()) {
            log.error("req error:{}", errors.getAllErrors());
            model.addAttribute("reqVo", reqVo);
            return "springJstlTest";
        }
        return "redirect:/success.jsp";
    }

}
