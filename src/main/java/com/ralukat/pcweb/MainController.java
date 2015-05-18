package com.ralukat.pcweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by catalin on 18/05/15.
 */


@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)



    public String printWelcome(ModelMap model) {

        return "index";
    }
}