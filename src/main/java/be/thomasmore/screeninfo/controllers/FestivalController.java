package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.model.taal.FestivalEnglish;
import be.thomasmore.screeninfo.model.taal.FestivalNederlands;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import be.thomasmore.screeninfo.repositories.taal.FestivalEnglishRepository;
import be.thomasmore.screeninfo.repositories.taal.FestivalNederlandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Optional;

@Controller
public class FestivalController {

    @Autowired
    FestivalRepository festivalRepository;

    @Autowired
    FestivalNederlandsRepository nederlandsRepository;

    @Autowired
    FestivalEnglishRepository englishRepository;

    @GetMapping({"/","/festivallijst"})
    public String festivalList(Model model, Principal principal) {

        String taal = null;

        if (principal != null) {
            System.out.println("how are you logged in ?");
        } else {
            taal = "NEDERLANDS";
        }

        Iterable<Festival> festivals = festivalRepository.findAll();

        for (Festival festival : festivals) {
            if (taal.equals("NEDERLANDS")) {
                Optional<FestivalNederlands> taalOptionalData = nederlandsRepository.findByFestivalId(festival.getId());

                if (taalOptionalData.isPresent()) {
                    FestivalNederlands taalData = taalOptionalData.get();
                    festival.setFestivalName(taalData.getFestivalName());
                    festival.setFestivalDate(taalData.getFestivalDate());
                }
            }
            if (taal.equals("ENGLISH")) {
                Optional<FestivalEnglish> taalOptionalData = englishRepository.findByFestivalId(festival.getId());

                if (taalOptionalData.isPresent()) {
                    FestivalEnglish taalData = taalOptionalData.get();
                    festival.setFestivalName(taalData.getFestivalName());
                    festival.setFestivalDate(taalData.getFestivalDate());
                }
            }



        }

        model.addAttribute("festivals", festivals);

        return "festivallijst";
    }

}
