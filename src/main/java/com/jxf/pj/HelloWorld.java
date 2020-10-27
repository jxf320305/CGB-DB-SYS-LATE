package com.jxf.pj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jxf
 * @create 2020-10-20 21:40
 */
@Controller
@RequestMapping("hello")
public class HelloWorld {
    @RequestMapping("world")
    public String welcome1(){
        return "starter";
    }
    @RequestMapping("hello")
    @ResponseBody
    public String  wel(){
        return "欢迎来到SpringBoot";
    }
}
