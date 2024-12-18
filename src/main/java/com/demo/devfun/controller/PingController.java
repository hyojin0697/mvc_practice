package com.demo.devfun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PingController {
    @RequestMapping( value = "/ping", produces = "application/json")
    @ResponseBody
    public Object healthCheck() {
        Map<String, Object> data = new HashMap<>();
        data.put("today", ZonedDateTime.now().getMonth() + ":" + ZonedDateTime.now().getDayOfMonth());

        return data;
    }
}
