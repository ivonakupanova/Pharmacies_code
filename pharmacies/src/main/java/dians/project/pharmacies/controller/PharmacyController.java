package dians.project.pharmacies.controller;

import dians.project.pharmacies.model.Pharmacy;
import dians.project.pharmacies.service.MunicipalitiesServiceImpl;
import dians.project.pharmacies.service.PharmaciesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pharmacies")
public class PharmacyController {

    public final PharmaciesServiceImpl pharmaciesService;
    public final MunicipalitiesServiceImpl municipalitiesService;

    public PharmacyController(PharmaciesServiceImpl pharmaciesService, MunicipalitiesServiceImpl municipalitiesService) {
        this.pharmaciesService = pharmaciesService;
        this.municipalitiesService = municipalitiesService;
    }

    @GetMapping("/home")
    public String homePage(@RequestParam(required = false) String namePharmacy,
                           @RequestParam(required = false) String idMunicipality,
                           Model model) {
        if(namePharmacy != null)
            model.addAttribute("pharmacies", pharmaciesService.findByName(namePharmacy));
        if(idMunicipality != null)
            model.addAttribute("pharmacies", pharmaciesService.findByMunicipality(Long.parseLong(idMunicipality)));
        model.addAttribute("municipalities", municipalitiesService.findAll());
        return "homePage";
    }


    @GetMapping("/aboutUsPage")
    public String aboutUsPage() {

        return "aboutUsPage";
    }

    //REST - VRAKAAT PODATOCI
    @GetMapping("/api/findAll")
    @ResponseBody
    public List<Pharmacy> apiFindAll(){
        return pharmaciesService.findAll();
    }
    @GetMapping("/api/findByMunicipality")
    @ResponseBody
    public List<Pharmacy> apiPharmaciesByOpstina(@RequestParam(required = false) String idMunicipality)
    {
        return pharmaciesService.findByMunicipality(Long.parseLong(idMunicipality));
    }
    @GetMapping("/api/findByName")
    @ResponseBody
    public List<Pharmacy> apiPharmaciesByName(@RequestParam(required = false) String namePharmacy)
    {
        return pharmaciesService.findByName(namePharmacy);
    }

}
