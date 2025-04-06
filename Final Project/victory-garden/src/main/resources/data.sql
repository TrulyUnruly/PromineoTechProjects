INSERT INTO climate (climate_type) VALUES ('Full Sun');
INSERT INTO climate (climate_type) VALUES ('Partial Sun');
INSERT INTO climate (climate_type) VALUES ('Full Shade');
INSERT INTO climate (climate_type) VALUES ('Partial Shade');

INSERT INTO bed (bed_type) VALUES ('Vertical');
INSERT INTO bed (bed_type) VALUES ('Container');
INSERT INTO bed (bed_type) VALUES ('Raised');

INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Early Spring', 'Late Spring', 'Early Summer');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Early Spring', 'Late Spring', 'Mid Summer');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Mid Summer', 'Early Fall', 'Late Fall');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Mid Summer', 'Early Fall', 'Mid Fall');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Mid Spring', 'Late Spring', 'Early Summer');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Late Summer', 'Early Fall', 'Mid Fall');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Late Spring', 'Mid Summer', 'Early Fall');
INSERT INTO schedule (sow_date, transplant_date, harvest_date) VALUES ('Early Spring', 'Mid Spring', 'Early Summer');

INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Bell Pepper', 'Fruit Vegetable', 1, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Broccoli', 'Flowering Vegetable', 2, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Carrots', 'Root Vegetable', 5, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Cucumber', 'Gourd', 7, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Green Beans', 'Pod Vegetable', 7, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Lettuce', 'Leafy Green', 4, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Loofah', 'Gourd', 2, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Peas', 'Pod Vegetable', 8, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Spinach', 'Leafy Green', 5, 4);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Tomatoes', 'Fruit Vegetable', 2, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Zucchini', 'Gourd', 7, 1);


INSERT INTO plant_bed (plant_id, bed_id) VALUES (1,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (1,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (2,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (2,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (3,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (3,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (4,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (4,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (5,1);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (5,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (5,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (6,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (6,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (7,1);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (8,1);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (9,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (9,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (10,1);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (10,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (10,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (11,1);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (11,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (11,3);
