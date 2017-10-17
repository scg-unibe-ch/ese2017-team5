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
@RequestMapping(path="/drivers")
public class DriverController {
	@Autowired
	private DriverRepository driverRepository;

  @GetMapping(path="/new")
  public String addNewDriver() {
    return "drivers/new";
  }

	@RequestMapping(path="/new", method=RequestMethod.POST)
	public ModelAndView addNewDriver (@RequestParam String name) {
		Driver driver = new Driver();
		driver.setName(name);
		driverRepository.save(driver);
    //return new ModelAndView(new RedirectView("all", true, false));
    return new ModelAndView("redirect:all");
  }

	@GetMapping(path="/all")
	public ModelAndView getAllDrivers() {
    return new ModelAndView("drivers/list", "drivers", driverRepository.findAll());
	}

  @GetMapping(path="/{id}/delete")
  public ModelAndView deleteDriver(@PathVariable Integer id) {
    Driver driver = driverRepository.findOne(id);
    if (driver != null) {
      driverRepository.delete(driver);
    }

    return new ModelAndView("redirect:/drivers/all");
  }
}
