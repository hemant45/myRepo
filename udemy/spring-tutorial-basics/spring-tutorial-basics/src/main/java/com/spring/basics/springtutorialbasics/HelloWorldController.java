package com.spring.basics.springtutorialbasics;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method= RequestMethod.GET, path="/hello-world")
    public String helloWorld(){
        return "helloWorld";
    }
    @GetMapping(path="/helloWorldBean")
    public HelloWorldBean helloGetMap(){
        System.out.print("Where am i?");
        return new HelloWorldBean("This is hello World bean");
    }

    @GetMapping(path="/helloWorldBean/param/{nam}")
    public HelloWorldBean helloGetMap(@PathVariable String nam){
        return new HelloWorldBean("This is hello World bean " + nam);
    }
}
