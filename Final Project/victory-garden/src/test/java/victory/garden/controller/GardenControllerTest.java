//package victory.garden.controller;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.jdbc.SqlConfig;
//
//import victory.garden.VictoryGardenApplication;
//import victory.garden.controller.model.PlantData;
//
//
//@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes = VictoryGardenApplication.class)
//@ActiveProfiles("test")
//@Sql(scripts = {"classpath:schema.sql", "classpath:data.sql"})
//@SqlConfig(encoding = "utf-8")
//class GardenControllerTest extends RescueServiceTestSupport {
//
//	@Test
//	void testInsertPlant() {
//		
//		//Given: A Plant request
//		PlantData request = buildInsertPlant(1);
//		PlantData expected = buildInsertPlant(1);
//		
//		//When: the plant is added to the plant table
//		PlantData actual = insertPlant(request);
//		
//		//Then: the plant returned is what is expected
//		assertThat(actual).isEqualTo(expected);
//		
//		//And: there is one row in the plant table.
//		assertThat(rowsInPlantTable()).isOne();
//	}
//	
//	@Test
//	void testRetrievePlant() {
//		//Given a plant
//		PlantData plant = insertPlant(buildInsertPlant(1));
//		PlantData expected = buildInsertPlant(1);
//		//When: the plant is retrieved by plant ID
//		PlantData actual = retrievePlant(plant.getPlantId());
//		
//		//Then: the actual plant is eaqual to the expected plant.
//		assertThat(actual).isEqualTo(expected);
//	}
//
//
//
//}
