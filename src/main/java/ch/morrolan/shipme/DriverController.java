package ch.morrolan.shipme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.morrolan.shipme.Driver;
import ch.morrolan.shipme.DriverRepository;

@Controller
@RequestMapping(path="/drivers")
public class DriverController {
	@Autowired
	private DriverRepository driverRepository;

	@GetMapping(path="/new")
	public @ResponseBody String addNewDriver (@RequestParam String name) {
		Driver driver = new Driver();
		driver.setName(name);
		driverRepository.save(driver);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Driver> getAllDrivers() {
		return driverRepository.findAll();
	}
}
