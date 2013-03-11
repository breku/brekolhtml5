package com.brekol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Breku
 * Date: 10.03.13
 * Time: 21:56
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = {"/","index","home"})
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String init(){
        return "home/index";
    }
}
