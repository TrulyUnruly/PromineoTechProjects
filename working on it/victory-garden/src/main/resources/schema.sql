DROP TABLE IF EXISTS plant_bed;
DROP TABLE IF EXISTS bed;      
DROP TABLE IF EXISTS plant;
DROP TABLE IF EXISTS climate;
DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
	scheduleId int NOT NULL AUTO_INCREMENT,
	sowDate varchar(60),
	transplantDate varchar(60),
	harvestDate varchar(60),
	PRIMARY KEY(scheduleId)
);

CREATE TABLE climate (
	climateId int  NOT NULL AUTO_INCREMENT,
	climateType varchar(128),
	PRIMARY KEY(climateId)
);

CREATE TABLE plant (
	plantId int NOT NULL AUTO_INCREMENT,
	plantName varchar(128) NOT NULL,
	plantType varchar(128),
	scheduleId int NOT NULL,
	climateId int NOT NULL,
	PRIMARY KEY(plantId),
	FOREIGN KEY(scheduleId) REFERENCES schedule (scheduleId) ON DELETE CASCADE,
	FOREIGN KEY(climateId) REFERENCES climate (climateId) ON DELETE CASCADE
);

CREATE TABLE bed (
	bedId int NOT NULL AUTO_INCREMENT,
	bedType varchar(128),
	PRIMARY KEY(bedId)
);

CREATE TABLE plant_bed (
	plantId int NOT NULL,
	bedId int NOT NULL,
	FOREIGN KEY(plantId) REFERENCES plant (plantId) ON DELETE CASCADE,
	FOREIGN KEY(bedId) REFERENCES bed (bedId) ON DELETE CASCADE
);

