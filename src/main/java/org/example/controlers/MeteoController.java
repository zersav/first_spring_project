package org.example.controlers;


import org.example.entity.Meteo;
import org.example.openweatherapi.OpenWeather;
import org.example.repo.MeteoRepo;
import org.example.service.IDK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
    @Autowired
    private MeteoRepo meteoRepo;

    @GetMapping
    public String main(){
        return "index";
    }

    @GetMapping("/all")
    public String getAll(Model model){
        model.addAttribute("meteos",meteoRepo.findAll());
        return "all";
    }

    @GetMapping("/current")
    public String getCurrent(Model model){
        Meteo meteo = new Meteo(OpenWeather.getWeather("691650"));
        meteoRepo.save(meteo);
        meteoRepo.save(meteo);
        model.addAttribute("meteos", meteo);
        return "current";
    }

    @PostMapping("current")
    public String currentWeather(@RequestParam String sity, Model model){
        IDK idk = new IDK();
        Meteo meteo = new Meteo(OpenWeather.getWeather(idk.levenstein(sity)));
        meteoRepo.save(meteo);
        model.addAttribute("meteos", meteo);
        return "current";
    }


}
