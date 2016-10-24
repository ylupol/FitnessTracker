package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ylupol on 24.10.16.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {

        model.addAttribute("greeting", "Hello world");

        return "hello";
    }

}
