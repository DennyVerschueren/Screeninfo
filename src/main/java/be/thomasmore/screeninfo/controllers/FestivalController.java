package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalController {

    @Autowired
    FestivalRepository festivalRepository;

    @GetMapping("/festivallist")
    public String festivalList(Model model) {

        Iterable<Festival> festivals = festivalRepository.findAll();

        model.addAttribute("festivals",festivals);

        return "festivallist";
    }

}
