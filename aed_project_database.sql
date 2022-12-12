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
    user_role varchar(255) not null,
    Enterprise_Id int
);
select * from user_account;
#
# Table Structure for City
#
DROP TABLE IF EXISTS City;



CREATE TABLE City (
  City_ID int primary key not null auto_increment,
  City_Name varchar(100) not null
);



#
# Table Structure for Enterprise
#
DROP TABLE IF EXISTS Enterprise;



CREATE TABLE Enterprise (
  Enterprise_Id int primary key not null auto_increment,
  city_name varchar(100) not null,
  Enterprise_Name varchar(255) not null,
  type varchar(255) not null
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



#Data Insertion for user_account Table



insert into user_account(user_name,user_username,user_password,user_role, Enterprise_Id)
    values
        ('Jeff','jeff','jeff','dma', 1);
        
select * from user_account;



#Data Insertion for victim Table



INSERT INTO victim (victim_name, victim_phone, victim_address, victim_city, victim_state, victim_zip, initial_description)
VALUES
    ('Amy', '555-555-1234', '123 Main St', 'Boston', 'MA', '02110', 'Gunshot Wound'),
    ('Darth','555-555-4567','58 Barn St','Springfield','MA','01120','Fire in the Apartment'),
    ('Varny','555-555-8765','112 Hayman St','Springfield','MA','01134','Chemical Spill in Lab'),
    ('Lyn','555-555-9012','113 Camel St','Boston','MA','02146','Potential Hostage Situation');
    
#Data Insertion for work_queue Table



insert into work_queue(user_id, victim_id, assign_to, case_status, received_date, resolved_date)
    values
        (8,1,'Tyler','Open','2022-01-02',NULL),
        (7,2,'Justin','Closed','2022-03-22','2022-03-22'),
        (10,3,'Austin','Closed','2022-07-16','2022-07-23'),
        (11,4,'John','Open','2022-12-10',NULL);
        
#Data Insertion for fire_report Table



insert into fire_report(work_id, user_id, victim_id, incident_date, resolution_date, suspect_name, suspect_address, suspect_motive, comments)
    values
        (2,7,2,'2022-03-22','2022-03-22','N/A','N/A','N/A','Fire in the apartment was caused by the failure of the smoke detection system, which could not pick up th smoke coming from burning plastic on stove');



#Data Insertion For police_report Table



insert into police_report(work_id, user_id, victim_id, incident_date, suspect_name, suspect_address, suspect_motive, has_history, has_association, association_group, comments)
    values
        (1,8,1,'2022-01-02','OJ Mike','Unknown','Intent to Steal Wallet','Y','Y','k2O','Suspect wanted to steal the wallet of the victim, but shot the victim after being resisted');
        
#Data Insertion For hazmat_report Table



insert into hazmat_report(work_id, user_id, victim_id, incident_date, material_name, incident_address, casualties, comments)
    values
        (3,10,3,'2022-07-16','Phenoxythalamine','112 Hayman St, Springfield, MA, 01134',0,'Spill of a chemical named Phenoxythalamine was caused by negligent handling of the material. There were no casualties and the case was resolved in a week');
        
#Data Insertion For tactical_report Table



insert into tactical_report(work_id, user_id, victim_id, incident_date, material_name, incident_address, casualties, comments)
    values
        (4,11,4,'2022-12-10','RPG','113 Camel St, Boston, MA, 02146',1,'Developing Hostage situation with multiple hostages, call made by a hostage and 1 casualty so far.');
        



insert into user_account(user_name,user_username,user_password,user_role)
    values
        ('AmbAdmin','ambadmin','ambadmin','aba');
        
        select * from user_account;
