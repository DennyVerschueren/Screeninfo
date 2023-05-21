package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class FestivalController {

    @Autowired
    FestivalRepository festivalRepository;

    @GetMapping({"/","/festivallijst"})
    public String festivalList(Model model, Principal principal) {

        Iterable<Festival> festivals = festivalRepository.findAllByOrderByOnGoingDesc();
        model.addAttribute("festivals", festivals);

        return "festivallijst";
    }

}
