create table person(
     id integer not null primary key,
     name varchar(255) not null,
     description varchar(255) not null,
     joinDate timestamp
);

INSERT INTO person(ID, NAME, DESCRIPTION, JOINDATE)
VALUES (1001, 'Charan', 'Smart', sysdate());

INSERT INTO person(ID, NAME, DESCRIPTION, JOINDATE)
VALUES (1002, 'John', 'Handsome', sysdate());

INSERT INTO person(ID, NAME, DESCRIPTION, JOINDATE)
VALUES (1003, 'Virat', 'Aggressive', sysdate());

INSERT INTO person(ID, NAME, DESCRIPTION, JOINDATE)
VALUES (1004, 'Dhoni', 'Patient', sysdate());

