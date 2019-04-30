package net.jiaoxiliang.shici.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        // if(true) {
        //     throw new Exception("some thing is wrong");
        // }
        return "hello";
    }
    
}