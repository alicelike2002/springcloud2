package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("toAddGoods")
    public String toAddGoods() {
        return "addGood";
    }

    @RequestMapping("togoodPage")
    public String togoodPage(){
        return "goodPage";
    }
}
