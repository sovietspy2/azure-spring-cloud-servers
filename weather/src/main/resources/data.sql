INSERT INTO address (house_number,city_id,street_id) VALUES
(12,2,1),
(1,2,2),
(13,3,1);

INSERT INTO address_recycle_bin (address_id,recycle_bin_id) VALUES
(1,1),
(2,2),
(1,3);

INSERT INTO city (city_name,county_id) VALUES
('Pecs',1),
('Kaposvar',2);

INSERT INTO county (county_name,x,y) VALUES
('Baranya',2,3),
('Kapos',3,4),
('Somogy',66,69);

INSERT INTO postal_code (value) VALUES
(1234),
(4567),
(1212);

INSERT INTO recycle_bin (recycle_bin_name) VALUES
('A'),
('B'),
('C');

INSERT INTO street (street_name,postal_code_id) VALUES
('Csillag koz',1),
('Petofi utca',2),
('Nagy ter',3);
