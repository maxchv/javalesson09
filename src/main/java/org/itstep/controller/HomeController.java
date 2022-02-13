package org.itstep.controller;

import org.itstep.controller.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class HomeController {

    List<Task> tasks = new CopyOnWriteArrayList<>();

    @GetMapping(path = "/")
    String index(Model model) {
        model.addAttribute("title", "Home page");
        model.addAttribute("time", new Date());
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping(path="/todo")
    String save(Task task) {
        tasks.add(task);
        return "redirect:/";
    }

    @GetMapping(path = "/todo/{id}")
    String info(@PathVariable String id, Model model) {
        model.addAttribute("task", tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst().orElseThrow());
        return "info";
    }

}
