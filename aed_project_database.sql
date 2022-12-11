create database aed;
use aed;
drop database aed;
#
# TABLE STRUCTURE FOR: user_account
#

drop table if exists user_account;

create table user_account (
	user_id int primary key not null auto_increment,
	user_name varchar(255) not null,
	user_username varchar(255) not null,
	user_password varchar(255) not null,
	user_role varchar(255) not null
);

#
# TABLE STRUCTURE FOR: victim
#

DROP TABLE IF EXISTS victim;

CREATE TABLE victim (
  victim_id int primary key not null auto_increment,
  victim_name varchar(100) not null,
  victim_phone varchar(255) not null,
  victim_address varchar(255) not null,
  victim_city varchar(255) not null,
  victim_state varchar(255) not null,
  victim_zip varchar(255) not null,
  initial_description varchar(500) not null
);

#
# TABLE STRUCTURE FOR: work_queue
#

drop table if exists work_queue;

create table work_queue (
	work_id int primary key not null auto_increment,
	user_id int not null,
	victim_id int not null,
	assign_to varchar(255) not null,
	case_status varchar(255) not null,
	received_date date default null,
	resolved_date date default null,
	constraint work_queue_fk1 foreign key (user_id) references user_account (user_id),
    constraint work_queue_fk2 foreign key (victim_id) references victim (victim_id)
);

#
# TABLE STRUCTURE FOR: ambulance_report
#

drop table if exists ambulance_report;

create table ambulance_report (
	ambulance_report_id int primary key not null auto_increment,
    user_id int not null,
    work_id int not null,
    victim_id int not null,
    hospital_name varchar(255) not null,
    hospital_address varchar(255) not null,
    comments varchar(500) not null,
    constraint ambulance_report_fk1 foreign key (work_id) references work_queue (work_id),
    constraint ambulance_report_fk2 foreign key (user_id) references user_account (user_id),
    constraint ambulance_report_fk3 foreign key (victim_id) references victim (victim_id)
);

#
# TABLE STRUCTURE FOR: fire_report
#

drop table if exists fire_report;

create table fire_report (
	fire_report_id int primary key not null auto_increment,
    work_id int not null,
    user_id int not null,
    victim_id int not null,
    incident_date date default null,
    resolution_date date default null,
    suspect_name varchar(255) not null,
    suspect_address varchar(255) not null,
    suspect_motive varchar(500) not null,
    comments varchar(500) not null,
    constraint fire_report_fk1 foreign key (work_id) references work_queue (work_id),
    constraint fire_report_fk2 foreign key (user_id) references user_account (user_id),
    constraint fire_report_fk3 foreign key (victim_id) references victim (victim_id)
);

#
# TABLE STRUCTURE FOR: police_report
#

drop table if exists police_report;

create table police_report (
	police_report_id int primary key not null auto_increment,
    work_id int not null,
    user_id int not null,
    victim_id int not null,
    incident_date date default null,
    suspect_name varchar(255) not null,
    suspect_address varchar(255) not null,
    suspect_motive varchar(500) not null,
    has_history char not null,
    has_association char not null,
    association_group varchar(255) not null,
    comments varchar(500) not null,
    constraint police_report_fk1 foreign key (work_id) references work_queue (work_id),
    constraint police_report_fk2 foreign key (user_id) references user_account (user_id),
    constraint police_report_fk3 foreign key (victim_id) references victim (victim_id)
);

#
# TABLE STRUCTURE FOR: hazmat_report
#

drop table if exists hazmat_report;

create table hazmat_report (
	hazmat_report_id int primary key not null auto_increment,
    work_id int not null,
    user_id int not null,
    victim_id int not null,
    incident_date date default null,
    material_name varchar(255) not null,
    incident_address varchar(255) not null,
    casualties int not null,
    comments varchar(500) not null,
    constraint hazmat_report_fk1 foreign key (work_id) references work_queue (work_id),
    constraint hazmat_report_fk2 foreign key (user_id) references user_account (user_id),
    constraint hazmat_report_fk3 foreign key (victim_id) references victim (victim_id)
);

#
# TABLE STRUCTURE FOR: tactical_report
#

drop table if exists tactical_report;

create table tactical_report (
	tactical_report_id int primary key not null auto_increment,
    work_id int not null,
    user_id int not null,
    victim_id int not null,
    incident_date date default null,
    material_name varchar(255) not null,
    incident_address varchar(255) not null,
    casualties int not null,
    comments varchar(500) not null,
    constraint tactical_report_fk1 foreign key (work_id) references work_queue (work_id),
    constraint tactical_report_fk2 foreign key (user_id) references user_account (user_id),
    constraint tactical_report_fk3 foreign key (victim_id) references victim (victim_id)
);