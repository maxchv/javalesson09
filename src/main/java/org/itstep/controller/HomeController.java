package org.itstep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HomeController {

    @RequestMapping(path = "/")
    String index(Model model) {
        model.addAttribute("title", "Home page");
        model.addAttribute("time", LocalDateTime.now());
        return "/WEB-INF/views/index.jsp";
    }

}
