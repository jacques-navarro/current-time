package dev.passingarguments.Devops.with.Docker.Exercises15;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }
}