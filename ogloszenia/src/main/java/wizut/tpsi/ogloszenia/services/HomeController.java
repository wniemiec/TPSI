package wizut.tpsi.ogloszenia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import wizut.tpsi.*;
import wizut.tpsi.ogloszenia.jpa.*;
import wizut.tpsi.ogloszenia.services.OffersService;
import wizut.tpsi.ogloszenia.web.OfferFilter;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@Controller
public class HomeController
{

    @Autowired
    private OffersService offersService;


    @GetMapping("/home")
    public String home_zad1(Model model)
    {
        CarModel carModel;
        CarManufacturer carManufacturer;

        carManufacturer = offersService.getCarManufacturer(2);
        carModel = offersService.getCarModel(3);

        model.addAttribute("producent",carManufacturer.getName());
        model.addAttribute("model", carModel.getName());
        return "home";
    }



    @GetMapping("/")
    public String home(Model model, OfferFilter offerFilter) {

        List<CarManufacturer> carManufacturers = offersService.getCarManufacturers();

        List<CarModel> carModels = offersService.getCarModels();
      //  List<Offer> offers = offersService.getOffers();

        List<Offer> offers;

        if(offerFilter.getManufacturerId() != null) {
            offers = offersService.getOffersByManufacturer(offerFilter.getManufacturerId());
        } else {
            offers = offersService.getOffers();
        }

        model.addAttribute("carManufacturers", carManufacturers);

        model.addAttribute("carModels", carModels);
        model.addAttribute("offers", offers);
        return "offersList";
    }


    @GetMapping("/offer/{id}")
    public String offerDetails(Model model, @PathVariable("id") Integer id) {
        Offer offer = offersService.getOffer(id);
        model.addAttribute("offer", offer);
        return "offerDetails";
    }

    @GetMapping("/newoffer")
    public String newOfferForm(Model model, Offer offer) {

        List<CarModel> carModels = offersService.getCarModels();
        List<BodyStyle> bodyStyles = offersService.getBodyStyles();
        List<FuelType> fuelTypes = offersService.getFuelTypes();

        model.addAttribute("carModels", carModels);
        model.addAttribute("bodyStyles", bodyStyles);
        model.addAttribute("fuelTypes", fuelTypes);

        return "offerForm";
    }

    @PostMapping("/newoffer")
    public String saveNewOffer(Model model, @Valid Offer offer, BindingResult binding) {
        if(binding.hasErrors()) {
            List<CarModel> carModels = offersService.getCarModels();
            List<BodyStyle> bodyStyles = offersService.getBodyStyles();
            List<FuelType> fuelTypes = offersService.getFuelTypes();

            model.addAttribute("carModels", carModels);
            model.addAttribute("bodyStyles", bodyStyles);
            model.addAttribute("fuelTypes", fuelTypes);

            return "offerForm";
        }
        offer = offersService.createOffer(offer);

        return "redirect:/offer/" + offer.getId();
    }

}
