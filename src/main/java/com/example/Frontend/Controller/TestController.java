package com.example.Frontend.Controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "welcome.html";
    }
}