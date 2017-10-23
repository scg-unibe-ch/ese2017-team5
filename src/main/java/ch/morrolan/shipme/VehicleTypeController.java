package ch.morrolan.shipme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

// import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ch.morrolan.shipme.Driver;
import ch.morrolan.shipme.DriverRepository;

@Controller
@RequestMapping(path="/trucks")
public class VehicleTypeController {

    @Autowired
    private TruckRepository truckRepository;

    @GetMapping(path="/new")
    public String addNewTruck() {
        return "trucks/new";
    }
    
    @RequestMapping(path="/new", method=RequestMethod.POST)
    public ModelAndView addNewTruck (@RequestParam String model, @RequestParam int weight, @RequestParam int paletteAmount/*, @RequestParam boolean canDrive*/) {


        VehicleType vehicle = new VehicleType(model, weight, paletteAmount, true);
        truckRepository.save(vehicle);
        return new ModelAndView("redirect:all");
/*
               ITruck truck;

        if(model.equals("VW"))
        {
            truck = new Van(VanModel.VW);
        }

        else if(model.equals("Schmitz")||model.equals("Koegel")||model.equals("Schwarzmüller")) {
            if (model.equals("Schmitz"))
            {
                truck = new Trailer(TrailerModel.Schmitz);
            }

            else if (model.equals("Koegel"))
            {
                truck = new Trailer(TrailerModel.Koegel);
            }

            else
            {
                truck = new Trailer(TrailerModel.Schwarzmüller);
            }
        }

        else if(model.equals("ScaniaT")||model.equals("Daf")||model.equals("MercedesBenz"))
        {
            if (model.equals("ScanieT"))
            {
                truck = new TractorMachine(TractorMachineModel.Scania);
            }

            else if (model.equals("Daf"))
            {
                truck = new TractorMachine(TractorMachineModel.DAF);
            }

            else
            {
                truck = new TractorMachine(TractorMachineModel.MercedesBenz);
            }
        }

        else
        {
            truck = new Box(BoxModel.Scania);
        }
        truckRepository.save(truck);
        //return new ModelAndView(new RedirectView("all", true, false));
        return new ModelAndView("redirect:all");*/
    }

    @GetMapping(path="/all")
    public ModelAndView getAllTrucks() {
        return new ModelAndView("trucks/list", "trucks", truckRepository.findAll());
    }

    @GetMapping(path="/{id}/delete")
    public ModelAndView deleteTruck(@PathVariable Integer id) {
        VehicleType truck = truckRepository.findOne(id);
        if (truck != null) {
            truckRepository.delete(truck);
        }

        return new ModelAndView("redirect:/trucks/all");
    }
}
