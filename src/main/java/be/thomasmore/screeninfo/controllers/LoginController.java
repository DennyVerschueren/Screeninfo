package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.EmailService;
import be.thomasmore.screeninfo.model.EndUser;
import be.thomasmore.screeninfo.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.Optional;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @GetMapping( "/home")
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

    @GetMapping({"/signup", "/user/signup"})
    public String register(Principal principal) {
        if (principal != null) return "redirect:/home";
        return "user/signup";
    }

    @PostMapping({"/signup", "/user/signup"})
    public String registerPost(Principal principal,
                               @RequestParam String userName,
                               @RequestParam String password) {
        if (principal != null) return "redirect:/home";
        if (userName==null || userName.trim().equals("")) return "redirect:/home";
        if (password==null || password.trim().equals("")) return "redirect:/home";
        userName = userName.trim();
        String encodedPassword = encoder.encode(password.trim());
        EndUser user = new EndUser(userName, encodedPassword, "ROLE_USER");
        userRepository.save(user);
        autologin(userName, password.trim());
        EmailService emailService = new EmailService();
        emailService.sendEmail("versdenny@gmail.com","test","dit is een test");
        return "redirect:/home";
    }

    private void autologin(String userName, String password) {
        SecurityContext sc = SecurityContextHolder.getContext();
        try {
            UsernamePasswordAuthenticationToken token
                    = new UsernamePasswordAuthenticationToken(userName, password);
            Authentication auth = authenticationManager.authenticate(token);
            logger.info("authentication: " + auth.isAuthenticated());
            logger.info("Logging in with [{}]", auth.getPrincipal());
            sc.setAuthentication(auth);
        } catch (AuthenticationException e) {
            sc.setAuthentication(null);
            logger.error("Failure in autoLogin", e);
        }
    }

    @GetMapping( "/login-error")
    public String loginError(Model model) {
        return "loginError";
    }
}
