package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login(Principal principal, Model model) {
        if (principal != null) return "redirect:/home";
        return "/login";
    }

    @GetMapping( "/login-error")
    public String loginError(Model model) {
        return "loginError";
    }
}
