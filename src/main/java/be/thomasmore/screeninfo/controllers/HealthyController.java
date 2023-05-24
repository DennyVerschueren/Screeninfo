package be.thomasmore.screeninfo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HealthyController {




    @GetMapping("/healthy")
    public String healthCheck() {
        return "200 OK";
    }
}
