package dev.passingarguments.Devops.with.Docker.Exercises15;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/getTime")
    public String displayTime(Model model) {
        var currentTime = LocalDateTime.now();
        System.out.println(currentTime);
        model.addAttribute("currentTime", currentTime);
        return "display-time";
    }


}