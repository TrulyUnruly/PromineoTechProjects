//package victory.garden.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.jdbc.JdbcTestUtils;
//
//import victory.garden.controller.model.PlantData;
//import victory.garden.entity.Plant;
//
//public class RescueServiceTestSupport {
//	
//	private static final String PLANT_TABLE = "plant";
//	
//	//@formatter:off
//	private PlantData insertPlantName1 = new PlantData(
//			1L,
//			"Pumpkin",
//			"Squash/Gourd",
//			"Full Sun",
//			7L
//			);
//	
//	private PlantData insertPlantName2 = new PlantData(
//			2L,
//			"Potato",
//			"Root Vegetable",
//			"Full Sun",
//			5L
//			);
//	//@formatter:on
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//	@Autowired
//	private GardenController gardenController;
//	
//	protected PlantData buildInsertPlant(int which) {		
//		return which == 1 ? insertPlantName1 : insertPlantName2;
//	}
//	
//	protected PlantData insertPlant(PlantData request {
//		Plant plant = request.toPlant();
//		plant.setPlantId(null);
//		return gardenController.createPlant(request);
//		return null;
//	}
//	
//	protected int rowsInPlantTable() {
//		return JdbcTestUtils.countRowsInTable(jdbcTemplate, PLANT_TABLE);
//	}
//
//	
//	
//	protected PlantData retrievePlant(Long plantId) {
//		return gardenController.retrievePlantById(plantId);
//	}
//
//}
