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

INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Bell Pepper', 'Vegetable', 1, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Broccoli', 'Vegetable', 2, 1);
INSERT INTO plant (plant_name, plant_type,schedule_id, climate_id) VALUES ('Carrots', 'Root Vegetable', 5, 1);


INSERT INTO plant_bed (plant_id, bed_id) VALUES (1,2);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (1,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (2,3);
INSERT INTO plant_bed (plant_id, bed_id) VALUES (3,1);

