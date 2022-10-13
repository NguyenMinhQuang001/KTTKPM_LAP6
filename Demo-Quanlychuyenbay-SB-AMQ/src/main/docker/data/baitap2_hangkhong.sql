CREATE TABLE chuyenbay (
  macb varchar(5) NOT NULL,
  ga_di varchar(50) DEFAULT NULL,
  ga_den varchar(50) DEFAULT NULL,
  do_dai integer DEFAULT NULL,
  gio_di time DEFAULT NULL,
  gio_den time DEFAULT NULL,
  chi_phi integer DEFAULT NULL,
  PRIMARY KEY (macb)
);

INSERT INTO chuyenbay VALUES ('VN216', 'SGN', 'DIN', '4170', '10:30:00', '14:20:00', '262');
INSERT INTO chuyenbay VALUES ('VN254', 'SGN', 'HUI', '8765', '18:40:00', '20:00:00', '781');
INSERT INTO chuyenbay VALUES ('VN269', 'HAN', 'CXR', '1262', '14:10:00', '15:50:00', '202');
INSERT INTO chuyenbay VALUES ('VN276', 'DAD', 'CXR', '1283', '09:00:00', '12:00:00', '203');
INSERT INTO chuyenbay VALUES ('VN280', 'SGN', 'HPH', '11979', '06:00:00', '08:00:00', '1279');
INSERT INTO chuyenbay VALUES ('VN315', 'HAN', 'DAD', '134', '11:45:00', '13:00:00', '112');
INSERT INTO chuyenbay VALUES ('VN317', 'HAN', 'UIH', '827', '15:00:00', '16:15:00', '190');
INSERT INTO chuyenbay VALUES ('VN320', 'SGN', 'DAD', '2798', '06:00:00', '07:10:00', '221');
INSERT INTO chuyenbay VALUES ('VN338', 'SGN', 'BMV', '4081', '15:25:00', '16:25:00', '375');
INSERT INTO chuyenbay VALUES ('VN374', 'HAN', 'VII', '510', '11:40:00', '13:25:00', '120');
INSERT INTO chuyenbay VALUES ('VN375', 'VII', 'CXR', '752', '14:15:00', '16:00:00', '181');
INSERT INTO chuyenbay VALUES ('VN431', 'SGN', 'CAH', '3693', '05:55:00', '06:55:00', '236');
INSERT INTO chuyenbay VALUES ('VN440', 'SGN', 'BMV', '4081', '18:30:00', '19:30:00', '426');
INSERT INTO chuyenbay VALUES ('VN464', 'SGN', 'DLI', '2002', '07:20:00', '08:05:00', '225');
INSERT INTO chuyenbay VALUES ('VN474', 'PXU', 'PQC', '1586', '08:40:00', '11:20:00', '102');
INSERT INTO chuyenbay VALUES ('VN476', 'UIH', 'PQC', '485', '09:15:00', '11:50:00', '117');
INSERT INTO chuyenbay VALUES ('VN651', 'DAD', 'SGN', '2798', '19:30:00', '08:00:00', '221');
INSERT INTO chuyenbay VALUES ('VN741', 'HAN', 'PXU', '395', '06:30:00', '08:30:00', '120');