
/* Drop Tables */

DROP TABLE SCHOOL_REGISTRATIONS CASCADE CONSTRAINTS;
DROP TABLE SCHOOL_COURSES CASCADE CONSTRAINTS;
DROP TABLE SCHOOL_STUDENT CASCADE CONSTRAINTS;
DROP TABLE SCHOOL_PROFESSOR CASCADE CONSTRAINTS;
DROP TABLE SCHOOL_SUBJECT CASCADE CONSTRAINTS;
DROP TABLE SCHOOL_DEPTS CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE SCHOOL_COURSES
(
	COURSE_NO number(4,0) NOT NULL,
	COURSE_ROOM number(4,0) NOT NULL,
	COURSE_QUOTA number(2,0) NOT NULL,
	COURSE_REG_NUM number(2,0) NOT NULL,
	PROF_NO number(4,0) NOT NULL,
	SUB_NO number(4,0) NOT NULL,
	PRIMARY KEY (COURSE_NO)
);


CREATE TABLE SCHOOL_DEPTS
(
	DEPT_NO number(4,0) NOT NULL,
	DEPT_NAME varchar2(100) NOT NULL,
	PRIMARY KEY (DEPT_NO)
);


CREATE TABLE SCHOOL_PROFESSOR
(
	PROF_NO number(4,0) NOT NULL,
	PROF_NAME varchar2(100) NOT NULL,
	PROF_POSITION varchar2(20),
	DEPT_NO number(4,0) NOT NULL,
	PRIMARY KEY (PROF_NO)
);


CREATE TABLE SCHOOL_REGISTRATIONS
(
	COURSE_SCORE char,
	COURSE_NO number(4,0) NOT NULL,
	STUD_NO number(4,0) NOT NULL
);


CREATE TABLE SCHOOL_STUDENT
(
	STUD_NO number(4,0) NOT NULL,
	STUD_NAME varchar2(100),
	STUD_GRADE number(1),
	DEPT_NO number(4,0) NOT NULL,
	PROF_NO number(4,0) NOT NULL,
	PRIMARY KEY (STUD_NO)
);


CREATE TABLE SCHOOL_SUBJECT
(
	SUB_NO number(4,0) NOT NULL,
	SUB_NAME varchar2(100) NOT NULL,
	SUB_TYPE varchar2(10),
	DEPT_NO number(4,0) NOT NULL,
	PRIMARY KEY (SUB_NO)
);



/* Create Foreign Keys */

ALTER TABLE SCHOOL_REGISTRATIONS
	ADD FOREIGN KEY (COURSE_NO)
	REFERENCES SCHOOL_COURSES (COURSE_NO)
;


ALTER TABLE SCHOOL_PROFESSOR
	ADD FOREIGN KEY (DEPT_NO)
	REFERENCES SCHOOL_DEPTS (DEPT_NO)
;


ALTER TABLE SCHOOL_STUDENT
	ADD FOREIGN KEY (DEPT_NO)
	REFERENCES SCHOOL_DEPTS (DEPT_NO)
;


ALTER TABLE SCHOOL_SUBJECT
	ADD FOREIGN KEY (DEPT_NO)
	REFERENCES SCHOOL_DEPTS (DEPT_NO)
;


ALTER TABLE SCHOOL_COURSES
	ADD FOREIGN KEY (PROF_NO)
	REFERENCES SCHOOL_PROFESSOR (PROF_NO)
;


ALTER TABLE SCHOOL_STUDENT
	ADD FOREIGN KEY (PROF_NO)
	REFERENCES SCHOOL_PROFESSOR (PROF_NO)
;


ALTER TABLE SCHOOL_REGISTRATIONS
	ADD FOREIGN KEY (STUD_NO)
	REFERENCES SCHOOL_STUDENT (STUD_NO)
;


ALTER TABLE SCHOOL_COURSES
	ADD FOREIGN KEY (SUB_NO)
	REFERENCES SCHOOL_SUBJECT (SUB_NO)
;



