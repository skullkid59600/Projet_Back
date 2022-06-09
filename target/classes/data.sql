-- Female gymnasts
insert into FGYMNAST(id,firstname,lastname,nickname,gender,country) values (1,'Catalina','Ponor','Cata','0','romania');

-- Male gymnasts
insert into MGYMNAST(id,firstname,lastname,nickname,gender,country) values (1,'Oleg','Vernaiev','Oleg','1','ukraine');

-- medals

-- Content

-- User & role
insert into USERS(id, login, password) values (1, 'Chiara','login');
insert into ROLE(name) values ('ROLE_ADMIN');
insert into ROLE(name) values ('ROLE_USER');