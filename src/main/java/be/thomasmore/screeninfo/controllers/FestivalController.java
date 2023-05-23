package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.model.FestivalItem;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FestivalController {

    @Autowired
    FestivalRepository festivalRepository;

    @GetMapping({"/","/festivallijst"})
    public String festivalList(Model model, Principal principal) {

        List<Festival> festivals = festivalRepository.findAllByOrderByStartDateAsc();
        List<FestivalItem> festivalItems = new ArrayList<>(); // om een makelijker manier te hebben voor html scripts

        for (Festival festival:festivals) {
            FestivalItem newFestivalItem = new FestivalItem(festival);
            festivalItems.add(newFestivalItem);
        }

        model.addAttribute("festivals", festivalItems);

        return "festivallijst";
    }

}
