DROP TABLE IF EXISTS plant_bed;
DROP TABLE IF EXISTS bed;      
DROP TABLE IF EXISTS plant;
DROP TABLE IF EXISTS climate;
DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
	schedule_id int NOT NULL AUTO_INCREMENT,
	sow_date varchar(60),
	transplant_date varchar(60),
	harvest_date varchar(60),
	PRIMARY KEY(schedule_id)
);

CREATE TABLE climate (
	climate_id int  NOT NULL AUTO_INCREMENT,
	climate_type varchar(128),
	PRIMARY KEY(climate_id)
);

CREATE TABLE plant (
	plant_id int NOT NULL AUTO_INCREMENT,
	plant_name varchar(128) NOT NULL,
	plant_type varchar(128),
	schedule_id int NOT NULL,
	climate_id int NOT NULL,
	PRIMARY KEY(plant_id),
	FOREIGN KEY(schedule_id) REFERENCES schedule (schedule_id) ON DELETE CASCADE,
	FOREIGN KEY(climate_id) REFERENCES climate (climate_id) ON DELETE CASCADE
);

CREATE TABLE bed (
	bed_id int NOT NULL AUTO_INCREMENT,
	bed_type varchar(128),
	PRIMARY KEY(bed_id)
);

CREATE TABLE plant_bed (
	plant_id int NOT NULL,
	bed_id int NOT NULL,
	FOREIGN KEY(plant_id) REFERENCES plant (plant_id) ON DELETE CASCADE,
	FOREIGN KEY(bed_id) REFERENCES bed (bed_id) ON DELETE CASCADE
);

