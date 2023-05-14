package be.thomasmore.screeninfo.controllers;

import be.thomasmore.screeninfo.model.Festival;
import be.thomasmore.screeninfo.repositories.FestivalRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private FestivalRepository festivalRepository;

    @GetMapping("/admin/festivaleditor")
    public String editFestival(Model model) {
        model.addAttribute("festivals", festivalRepository.findAll());
        return "admin/festivaleditor";
    }

    @PostMapping("/admin/festivaleditor")
    public String editFestivalPost(Model model, @Valid Festival festival) {
        festivalRepository.save(festival);
        return "redirect:/festivallijst/";
    }

    @GetMapping("/admin/festivalcreator")
    public String addFestival() {
        return "admin/festivalcreator";
    }

    @PostMapping("/admin/festivalcreator")
    public String addFestivalPost(Model model, @Valid Festival festival) {
        festivalRepository.save(festival);
        return "redirect:/festivallijst/";
    }
}
