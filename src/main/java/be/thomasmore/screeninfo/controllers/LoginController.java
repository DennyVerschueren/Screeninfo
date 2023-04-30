package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping({"/", "/home"})
    public String home(Model model, Principal principal) {
        final String loginName = principal==null ? "NOBODY" : principal.getName();
        logger.info("homepage - logged in as " + loginName);
        return "home";
    }

    @GetMapping({"/login", "/user/login"})
    public String login(Principal principal, Model model) {
        if (principal != null) return "redirect:/home";
        return "user/login";
    }

    @GetMapping({"/logout", "/user/logout"})
    public String logout(Principal principal, Model model) {
        if (principal == null) return "redirect:/home";
        return "user/logout";
    }

    @GetMapping( "/login-error")
    public String loginError(Model model) {
        return "loginError";
    }
}
