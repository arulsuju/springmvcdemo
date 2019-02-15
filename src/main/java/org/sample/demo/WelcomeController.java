package org.sample.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/start")
public class WelcomeController {

    @RequestMapping("/")
    public String welcome(){
        return "hello";
    }
    @RequestMapping("/add")
    public String add(@RequestParam("fnumber") int a,@RequestParam("snumber") int b,Model model){
        String name=new String("Yadav");
        int c=a+b;
        model.addAttribute("sum",c);
        return "display";
    }

}
