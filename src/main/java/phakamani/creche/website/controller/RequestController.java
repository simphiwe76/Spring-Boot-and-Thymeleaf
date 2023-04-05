package phakamani.creche.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @RequestMapping(value = "/")
    public  String main (){
        return "index";
    }

    @RequestMapping(value = "/Home")
    public  String home (){
        return "index";
    }

    @RequestMapping(value = "/About")
    public  String about (){
        return "about";
    }

    @RequestMapping(value = "/Contact")
    public  String contact (){
        return "contact";
    }

    @RequestMapping(value = "/Register-Login")
    public  String registerOrLogin (){
        return "register.login";
    }

}
