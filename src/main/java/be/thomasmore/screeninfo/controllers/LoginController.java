package be.thomasmore.screeninfo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping( "/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping( "/login-error")
    public String loginError(Model model) {
        return "loginError";
    }
}
