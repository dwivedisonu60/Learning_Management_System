INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'Sonu','Admin','-579973474','dwivedisonu60@gmail.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'Amit','Mentor','-579973474','csfd11@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'Raman','Mentor','asfa','csfd12@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'Abhi','Mentee','-579973474','csfd239@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'Shashank','Mentee','afasf3','csfd234@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'astitv','Mentee','afasf345','csfd2345@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'warsi','Mentee','afasf3456','csfd2346@.com');
INSERT INTO User_Table (id,name , Role,Password,Email) VALUES ((select nextval('USER_ID_SEQ')),'nehal','Mentee','afasf4578','csfd2347@.com');




INSERT INTO Course_Table (Course_Id,Course_Name) VALUES ((select nextval('COURSE_ID_SEQ')),'Maths');
INSERT INTO Course_Table (Course_Id,Course_Name) VALUES ((select nextval('COURSE_ID_SEQ')),'Physics');
INSERT INTO Course_Table (Course_Id,Course_Name) VALUES ((select nextval('COURSE_ID_SEQ')),'Chemistry');


INSERT INTO MENTOR_TABLE(MENTOR_REG_ID,COURSE_ID,COURSE_NAME,MENTOR_ID,MENTOR_NAME)VALUES((select nextval('MENTOR_ID_SEQ')),'1','Maths','2','Amit');
INSERT INTO MENTOR_TABLE(MENTOR_REG_ID,COURSE_ID,COURSE_NAME,MENTOR_ID,MENTOR_NAME)VALUES((select nextval('MENTOR_ID_SEQ')),'2','Physics','3','Raman');


INSERT INTO MENTEE_TABLE (MENTEE_REG_ID,COURSE_ID,COURSE_NAME,MENTEE_ID,MENTEE_NAME) VALUES ((select nextval('MENTEE_ID_SEQ')),'1','Maths','5','Shashank');
INSERT INTO MENTEE_TABLE (MENTEE_REG_ID,COURSE_ID,COURSE_NAME,MENTEE_ID,MENTEE_NAME) VALUES ((select nextval('MENTEE_ID_SEQ')),'2','Physics','5','Shashank');
INSERT INTO MENTEE_TABLE (MENTEE_REG_ID,COURSE_ID,COURSE_NAME,MENTEE_ID,MENTEE_NAME) VALUES ((select nextval('MENTEE_ID_SEQ')),'1','Maths','4','Abhi');
INSERT INTO MENTEE_TABLE (MENTEE_REG_ID,COURSE_ID,COURSE_NAME,MENTEE_ID,MENTEE_NAME) VALUES ((select nextval('MENTEE_ID_SEQ')),'2','Physics','4','Abhi');
