package org.itstep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class HomeController {

    List<String> tasks = new CopyOnWriteArrayList<>();
    private final ResourceHttpRequestHandler handler;

    public HomeController(ResourceHttpRequestHandler handler) {
        this.handler = handler;
    }

    //    @RequestMapping(path = "/", method = RequestMethod.GET)handler = {ResourceHttpRequestHandler@7610} "ResourceHttpRequestHandler [ServletContext [/resources/]]"
    @GetMapping(path = "/")
    String index(Model model) {
        model.addAttribute("title", "Home page");
        model.addAttribute("time", new Date());
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping(path="/todo")
    String save(String task) {
        if(!task.isBlank()) {
            tasks.add(task);
        }
        return "redirect:/";
    }

}
