package victory.garden.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import victory.garden.controller.model.BedData;
import victory.garden.controller.model.ClimateData;
import victory.garden.controller.model.PlantData;
import victory.garden.service.GardenService;

@RestController
@RequestMapping("/victory_garden")
@Slf4j
public class GardenController {
	@Autowired
	private GardenService gardenService;
//Elise
//	@PostMapping("/plant")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public PlantData insertPlant(@RequestBody PlantData plantData) {
//		log.info("Creating plant {}", plantData);
//		return gardenService.savePlant(plantData);
//	}

//	@PutMapping("/plant/{plantId}")
//	public PlantData updatePlant(@PathVariable Long plantId, @RequestBody PlantData plantData) {
//		plantData.setPlantId(plantId);
//		log.info("Updating plant {}", plantData);
//		return gardenService.savePlant(plantData);
//	}

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

	@GetMapping("/plant/{plantId}")
	public PlantData retrievePlantById(@PathVariable Long plantId) {
		log.info("Retrieving plant with ID={}", plantId);
		return gardenService.retrievePlantById(plantId);
	}

	@DeleteMapping("/plant")
	public void deleteAllPlants() {
		log.info("Attempting to delete all plants");
		throw new UnsupportedOperationException("Deleting all plants is not allowed.");
	}

	@DeleteMapping("/plant/{plantId}")
	public Map<String, String> deletePlantById(@PathVariable Long plantId) {
		log.info("Deleting plant with ID={}", plantId);

		gardenService.deletePlantById(plantId);
		return Map.of("message", "Deletion of plant with ID=" + plantId + " was successful.");
	}
	
	@GetMapping("/climate/{climateId}")
	public ClimateData retrieveClimateById(@PathVariable Long climateId) {
		log.info("Retrieving climate with ID={}", climateId);
		return gardenService.retrieveClimateById(climateId);
	}
	
	@PostMapping("/climate")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClimateData insertClimate(@RequestBody ClimateData climateData) {
		log.info("Creating climate {}", climateData);
		return gardenService.saveClimate(climateData);
	}

	//@PostMapping("/plant/{plantId}/bed")
	//@ResponseStatus(code = HttpStatus.CREATED)
	//public BedData insertBed(@PathVariable Long plantId, @RequestBody BedData bedData) {

	//	log.info("Creating bed {} for plant with ID={}", plantId, bedData);
		
		//return gardenService.saveBed(plantId, bedData);
		
	}

