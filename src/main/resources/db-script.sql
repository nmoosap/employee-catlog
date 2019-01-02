CREATE TABLE USER(
	ID INT NOT NULL,
	FIRST_NAME VARCHAR(50),
	LAST_NAME VARCHAR(50),
	USER_ID VARCHAR(20),
	EMAIL VARCHAR(50),
	PRIMARY KEY(ID)
);

INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(1, 'Raghav', 'Sara', 'Rsara', 'Raghavender_Sara@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(2, 'Rajashekar', 'Sayannagari', 'Rsayann', 'Rajashekar_Sayannagari@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(3, 'Sandeep', 'Chowhan', 'Schowhan', 'Sandeep_Chowhan@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(4, 'Kavita', 'Chikatkar', 'Kchikatkar', 'Kavita_Chikatkar@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(5, 'Jagan', 'Kornana', 'Jkornan', 'Jagadeeswararao_Kornana@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(6, 'Zahid', 'Khan', 'Zkhan', 'Zahid_Hassan_A_Khan@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(7, 'Sridhar', 'Sathu', 'Ssathu', 'Sridhar_Sathu@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(8, 'Nikitha', 'Moosapet', 'Nmoosapet', 'Nikitha_Moosapet@gap.com');
INSERT INTO USER(ID, FIRST_NAME, LAST_NAME, USER_ID, EMAIL) VALUES(9, 'Sheshu', 'Chennuru', 'Schennuru', 'Sheshu_Kumar_Chennuru@gap.com');

SELECT * FROM USER;