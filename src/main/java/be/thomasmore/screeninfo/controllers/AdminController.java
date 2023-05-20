package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FestivalRepository festivalRepository;

    @ModelAttribute("festival")
    public Festival findParty(@PathVariable(required = false) Integer id) {
        if (id!=null) {
            Optional<Festival> optionalFestival = festivalRepository.findById(id);
            if (optionalFestival.isPresent()) return optionalFestival.get();
        }
        return new Festival();
    }

    @GetMapping({"/festivaleditor/{id}"})
    public String editFestival(Model model, @PathVariable int id) {
        model.addAttribute("festivals", festivalRepository.findAll());
        return "admin/festivaleditor";
    }

    @PostMapping("/festivaleditor/{id}")
    public String editFestivalPost(@Valid Festival festival, @PathVariable int id) {
        festivalRepository.save(festival);
        return "redirect:/festivallijst";
    }

    @GetMapping("/festivalcreator")
    public String addFestival() {
        return "admin/festivalcreator";
    }

    @PostMapping("/festivalcreator")
    public String addFestivalPost(Model model, @Valid Festival festival) {
        festivalRepository.save(festival);
        return "redirect:/festivallijst";
    }
}
