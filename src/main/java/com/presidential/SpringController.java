package com.presidential;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

    @RequestMapping(value = "/output_hello", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap) {

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World! This is Spring MVC Project.");

        // return the name of the file to be loaded "hello_world.jsp"
        return "output_hello";
    }
}
