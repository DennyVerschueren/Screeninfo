package be.thomasmore.screeninfo.controller;

import be.thomasmore.screeninfo.model.Spot;
import be.thomasmore.screeninfo.repositories.SpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {

    @Autowired
    private SpotRepository spotRepository;
    @GetMapping("/map")
    public String defaultMapView(Model model){

        List<Spot> spots = spotRepository.findAll();
        List<Spot> toilletes = new ArrayList<Spot>();
        List<Spot> festivals = new ArrayList<Spot>();
        List<Spot> voedselKraampjes = new ArrayList<Spot>();
        for (Spot spot: spots) {
            System.out.println(spot.getSpotType());
            if(spot.getSpotType().equals("TOILET")){
                toilletes.add(spot);
            }
            else if(spot.getSpotType().equals("FESTIVAL")){
                festivals.add(spot);
            }
            else if(spot.getSpotType().equals("VOEDSELKRAAM")){
               voedselKraampjes.add(spot);
            }
        }

        model.addAttribute("toilletes",toilletes);
        model.addAttribute("festivals",festivals);
        model.addAttribute("voedselKraampjes",voedselKraampjes);
        return "map";
    }
}
