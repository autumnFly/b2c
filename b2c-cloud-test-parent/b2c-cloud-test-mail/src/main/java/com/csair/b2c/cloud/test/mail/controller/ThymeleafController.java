package com.csair.b2c.cloud.test.mail.controller;

import com.csair.b2c.cloud.test.mail.entity.Actor;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("thymeleaf/*")
public class ThymeleafController {
    @Autowired
    private TemplateEngine engine;
    @RequestMapping(value = "sample", method = {RequestMethod.GET})
    public String sample(Model model,HttpServletRequest request,HttpSession session) {
        Actor actor = new Actor();
        actor.setActorId(RandomUtils.nextInt());
        actor.setFirstName("liang");
        actor.setLastName("yudong");
        actor.setLevel("JK");
        actor.setSex("M");
        actor.setVip(true);
        actor.setLastUpdate(new Timestamp(System.currentTimeMillis()));
        session.setAttribute("actor",actor);

        List<Actor> actors = new ArrayList<>();
        for(int i=0;i<3;i++){
            Actor actor1 = new Actor();
            actor1.setActorId(RandomUtils.nextInt());
            actor1.setFirstName(RandomStringUtils.randomAlphabetic(5));
            actor1.setLastName(RandomStringUtils.randomAlphabetic(8));
            actor1.setLastUpdate(new Timestamp(System.currentTimeMillis()));
            actors.add(actor1);
        }
        model.addAttribute("actors",actors);
        return "sample";
    }
    @RequestMapping(value = "home", method = { RequestMethod.GET })
    public void home(Model model, HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws IOException {
        ServletContext servletContext = request.getServletContext();
        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        ctx.setVariable("today", new Date());
        engine.process("home", ctx, response.getWriter());
    }
}
