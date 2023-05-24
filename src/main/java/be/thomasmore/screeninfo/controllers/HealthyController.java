package be.thomasmore.screeninfo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HealthyController {




    @GetMapping("/healthy")
    public ResponseEntity healthCheck() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
