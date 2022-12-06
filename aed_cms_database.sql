create database aed;
use aed;

#
# TABLE STRUCTURE FOR: ambulance
#

DROP TABLE IF EXISTS `ambulance`;

CREATE TABLE `ambulance` (
  `ambulance_id` int primary key NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `hospital_id` int NOT NULL,
  `incident_type` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `comment` varchar(255) NOT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  constraint ambulance_fk1 foreign key (work_id) references work_request (work_id),
  constraint ambulance_fk2 foreign key (victim_id) references victim_details (victim_id),
  constraint ambulance_fk3 foreign key (hospital_id) references hospital (hospital_id)
);

#
# TABLE STRUCTURE FOR: hospital_queue
#

DROP TABLE IF EXISTS `hospital_queue`;

CREATE TABLE `hospital_queue` (
  `hospital_queue_id` int primary key NOT NULL,
  `hospital_id` int NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `diagnosis` varchar(255) NOT NULL,
  `pulse` varchar(255) NOT NULL,
  `blood_pressure` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `pain_level` int NOT NULL,
  constraint hospital_queue_fk1 foreign key (hospital_id) references hospital (hospital_id),
  constraint hospital_queue_fk2 foreign key (work_id) references work_request (work_id),
  constraint hospital_queue_fk3 foreign key (victim_id) references victim_details (victim_id)
);

#
# TABLE STRUCTURE FOR: hospital
#

DROP TABLE IF EXISTS `hospital`;

CREATE TABLE `hospital` (
  `hospital_id` int primary key NOT NULL,
  `hospital_address` varchar(255) NOT NULL,
  `hospital_city` varchar(255) NOT NULL,
  `hospital_state` varchar(255) NOT NULL,
  `hospital_zip` varchar(255) NOT NULL,
  `no_of_doctors` int NOT NULL
);

#
# TABLE STRUCTURE FOR: operator
#

DROP TABLE IF EXISTS `operator`;

CREATE TABLE `operator` (
  `operator_id` int primary key NOT NULL,
  `operator_name` varchar(100) NOT NULL,
  `emergency_type` varchar(255) NOT NULL,
  `victim_id` int NOT NULL
);

#
# TABLE STRUCTURE FOR: victim_details
#

DROP TABLE IF EXISTS `victim_details`;

CREATE TABLE `victim_details` (
  `victim_id` int primary key NOT NULL,
  `victim_name` varchar(100) NOT NULL,
  `victim_phone` varchar(255) NOT NULL,
  `victim_address` varchar(255) NOT NULL,
  `victim_city` varchar(255) NOT NULL,
  `victim_state` varchar(255) NOT NULL,
  `victim_zip` varchar(255) NOT NULL
);

#
# TABLE STRUCTURE FOR: work_request
#

DROP TABLE IF EXISTS `work_request`;

CREATE TABLE `work_request` (
  `work_id` int primary key NOT NULL,
  `operator_id` int NOT NULL,
  `initial_description` varchar(255) NOT NULL,
  `assigned_to` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `received_date` date DEFAULT NULL,
  `resolved_date` date DEFAULT NULL,
  constraint work_request_fk1 foreign key (operator_id) references operator (operator_id)
);

#
# TABLE STRUCTURE FOR: police_queue
#

DROP TABLE IF EXISTS `police_queue`;

CREATE TABLE `police_queue` (
  `police_queue_id` int primary key NOT NULL,
  `police_id` int NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `case_type` varchar(255) NOT NULL,
  `date` date DEFAULT NULL,
  `comments` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  `suspect_name` varchar(100) NOT NULL,
  `suspect_address` varchar(255) NOT NULL,
  `suspect_city` varchar(255) NOT NULL,
  `suspect_state` varchar(255) NOT NULL,
  `suspect_zip` varchar(255) NOT NULL,
  constraint police_queue_fk1 foreign key (police_id) references police (police_id),
  constraint police_queue_fk2 foreign key (work_id) references work_request (work_id),
  constraint police_queue_fk3 foreign key (victim_id) references victim_details (victim_id)
);

#
# TABLE STRUCTURE FOR: police
#

DROP TABLE IF EXISTS `police`;

CREATE TABLE `police` (
  `police_id` int primary key NOT NULL,
  `police_address` varchar(255) NOT NULL,
  `police_city` varchar(255) NOT NULL,
  `police_state` varchar(255) NOT NULL,
  `police_zip` varchar(255) NOT NULL,
  `no_of_personnel` int NOT NULL
);

#
# TABLE STRUCTURE FOR: fire_queue
#

DROP TABLE IF EXISTS `fire_queue`;

CREATE TABLE `fire_queue` (
  `fire_queue_id` int primary key NOT NULL,
  `fire_id` int NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `alert_time` time DEFAULT NULL,
  `incident_description` varchar(500) DEFAULT NULL,
  `status` varchar(255) NOT NULL,
  `assigned_marshal` varchar(255) NOT NULL,
  constraint fire_queue_fk1 foreign key (fire_id) references fire (fire_id),
  constraint fire_queue_fk2 foreign key (work_id) references work_request (work_id),
  constraint fire_queue_fk3 foreign key (victim_id) references victim_details (victim_id)
);

#
# TABLE STRUCTURE FOR: fire
#

DROP TABLE IF EXISTS `fire`;

CREATE TABLE `fire` (
  `fire_id` int primary key NOT NULL,
  `fire_address` varchar(255) NOT NULL,
  `fire_city` varchar(255) NOT NULL,
  `fire_state` varchar(255) NOT NULL,
  `fire_zip` varchar(255) NOT NULL,
  `no_of_vehicles` int NOT NULL
);

#
# TABLE STRUCTURE FOR: user
#

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int primary key NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
);

#
# TABLE STRUCTURE FOR: dea_queue
#

DROP TABLE IF EXISTS `dea_queue`;

CREATE TABLE `dea_queue` (
  `dea_queue_id` int primary key NOT NULL,
  `dea_id` int NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `suspect_name` varchar(100) NOT NULL,
  `suspect_address` varchar(255) NOT NULL,
  `suspect_city` varchar(255) NOT NULL,
  `suspect_state` varchar(255) NOT NULL,
  `suspect_zip` varchar(255) NOT NULL,
  `drug` varchar(255) NOT NULL,
  `history` varchar(255) NOT NULL,
  `case_status` varchar(255) NOT NULL,
  `assigned_officer` varchar(255) NOT NULL,
  constraint dea_queue_fk1 foreign key (dea_id) references dea (dea_id),
  constraint dea_queue_fk2 foreign key (work_id) references work_request (work_id),
  constraint dea_queue_fk3 foreign key (victim_id) references victim_details (victim_id)
);

#
# TABLE STRUCTURE FOR: dea
#

DROP TABLE IF EXISTS `dea`;

CREATE TABLE `dea` (
  `dea_id` int primary key NOT NULL,
  `dea_address` varchar(255) NOT NULL,
  `dea_city` varchar(255) NOT NULL,
  `dea_state` varchar(255) NOT NULL,
  `dea_zip` varchar(255) NOT NULL,
  `no_of_personnel` int NOT NULL
);

#
# TABLE STRUCTURE FOR: dhs_queue
#

DROP TABLE IF EXISTS `dhs_queue`;

CREATE TABLE `dhs_queue` (
  `dhs_queue_id` int primary key NOT NULL,
  `dhs_id` int NOT NULL,
  `work_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `comments` varchar(255) NOT NULL,
  constraint dhs_queue_fk1 foreign key (dhs_id) references dhs (dhs_id),
  constraint dhs_queue_fk2 foreign key (work_id) references work_request (work_id),
  constraint dhs_queue_fk3 foreign key (victim_id) references victim_details (victim_id)
);

#
# TABLE STRUCTURE FOR: dhs
#

DROP TABLE IF EXISTS `dhs`;


CREATE TABLE `dhs` (
  `dhs_id` int primary key NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `zip` varchar(255) NOT NULL,
  `no_of_personnel` int NOT NULL
);

#
# TABLE STRUCTURE FOR: rescue_queue
#

DROP TABLE IF EXISTS `rescue_queue`;


CREATE TABLE `rescue_queue` (
  `rescue_queue_id` int primary key NOT NULL,
  `rescue_id` int NOT NULL,
  `victim_id` int NOT NULL,
  `work_id` int NOT NULL,
  `last_seen` datetime NOT NULL,
  `last_address` varchar(255) NOT NULL,
  `last_city` varchar(255) NOT NULL,
  `last_state` varchar(255) NOT NULL,
  `last_zip` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  constraint rescue_queue_fk1 foreign key (rescue_id) references rescue (rescue_id),
  constraint rescue_queue_fk2 foreign key (victim_id) references victim_details (victim_id),
  constraint rescue_queue_fk3 foreign key (work_id) references work_request (work_id)
);

#
# TABLE STRUCTURE FOR: rescue
#

DROP TABLE IF EXISTS `rescue`;

CREATE TABLE `rescue` (
  `rescue_id` int primary key NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `zip` varchar(255) NOT NULL,
  `no_of_personnel` int NOT NULL
);