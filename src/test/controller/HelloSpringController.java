package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 20081 on 2018/10/16.
 */
@Controller
public class HelloSpringController {
    @RequestMapping("/user/hello")
    public String hello(){
        return "hello" ;
    }

    @RequestMapping("/user/login")
    public String login(Model model){
        model.addAttribute("user","david.zhang");

        return "/user/login" ;
    }

    private void test(){
//
    }
}
