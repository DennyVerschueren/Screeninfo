package be.thomasmore.screeninfo.controller;

import be.thomasmore.screeninfo.model.Spot;
import be.thomasmore.screeninfo.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MapController {

    @Autowired
    private SpotRepository spotRepository;
    @GetMapping("/map")
    public String defaultMapView(Model model){

        List<Spot> spots = spotRepository.findAll();

        model.addAttribute("spots",spots);
        return "map";
    }

}
