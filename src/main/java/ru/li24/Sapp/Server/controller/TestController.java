package ru.li24.Sapp.Server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getTestString(){

        return "YEEEEEEEEEES! YOU DID IT!!!!!!!!!!!";
    }
}
