INSERT INTO climate (climateType) VALUES ('Full Sun');
INSERT INTO climate (climateType) VALUES ('Partial Sun');
INSERT INTO climate (climateType) VALUES ('Full Shade');
INSERT INTO climate (climateType) VALUES ('Partial Shade');

INSERT INTO bed (bedType) VALUES ('Vertical');
INSERT INTO bed (bedType) VALUES ('Container');
INSERT INTO bed (bedType) VALUES ('Raised');

INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Early Spring', 'Late Spring', 'Early Summer');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Early Spring', 'Late Spring', 'Mid Summer');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Mid Summer', 'Early Fall', 'Late Fall');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Mid Summer', 'Early Fall', 'Mid Fall');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Mid Spring', 'Late Spring', 'Early Summer');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Late Summer', 'Early Fall', 'Mid Fall');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Late Spring', 'Mid Summer', 'Early Fall');
INSERT INTO schedule (sowDate, transplantDate, harvestDate) VALUES ('Early Spring', 'Mid Spring', 'Early Summer');

INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Bell Pepper', 'Vegetable', 1, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Broccoli', 'Vegetable', 2, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Carrots', 'Root Vegetable', 5, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Cucumber', 'Vining Vegetable', 7, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Green Beans', 'Vining Vegetable', 7, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Lettuce', 'Leafy Green Vegetable', 5, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Loofah', 'Squash/Gourd', 2, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Peas', 'Vining Vegetable', 8, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Spinach', 'Leafy Green Vegetable', 5, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Tomatoes', 'Vining Vegetable', 2, 1);
INSERT INTO plant (plantName, plantType,scheduleId, climateId) VALUES ('Zucchini', 'Squash/Gourd', 7, 1);