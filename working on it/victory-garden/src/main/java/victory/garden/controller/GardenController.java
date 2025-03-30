package victory.garden.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import victory.garden.controller.model.PlantData;
import victory.garden.service.GardenService;

@RestController
@RequestMapping("/victory_garden")
@Slf4j
public class GardenController {
	@Autowired
	private GardenService gardenService;

	@PostMapping("/plant")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PlantData insertPlant(@RequestBody PlantData plantData) {
		log.info("Creating plant {}", plantData);
		return gardenService.savePlant(plantData);
	}

	@GetMapping("/plant")
	public List<PlantData> retrieveAllPlants() {
		log.info("Retrieve all plants called.");
		return gardenService.retrieveAllPlants();
	}
		// @GetMapping("/plant")
		// @ResponseStatus(code = HttpStatus.OK)
		// public PlantData getPlant() {
		// log.info("Fetching plant {}");
		// return gardenService.getPlant();
	
	@GetMapping ("/plant/{plantId}")
	public PlantData retrievePlantById(@PathVariable Long plantId) {
		log.info("Retrieving plant with ID={}", plantId);
		return gardenService.retrievePlantById(plantId);
	}

}
