---- Female gymnasts
insert into FGYMNAST(id, firstname, lastname, nickname, gender, country)
values (1, 'Catalina', 'Ponor', 'Cata', '0', 'romania');
insert into FGYMNAST(id, firstname, lastname, nickname, gender, country)
values (2, 'Vanessa', 'Ferrarri', 'Vany', '0', 'italy');
insert into FGYMNAST(id, firstname, lastname, nickname, gender, country)
values (3, 'Aliya', 'Mustafina', 'Musty', '0', 'russia');
insert into FGYMNAST(id, firstname, lastname, nickname, gender, country)
values (4, 'Alexandra', 'Raisman', 'Aly', '0', 'USA');

---- Male gymnasts
insert into MGYMNAST(id, firstname, lastname, nickname, gender, country)
values (1, 'Oleg', 'Vernaiev', 'Oleg', '1', 'ukraine');
insert into MGYMNAST(id, firstname, lastname, nickname, gender, country)
values (2, 'Nikita', 'Nargonii', 'Nik', '1', 'russia');
insert into MGYMNAST(id, firstname, lastname, nickname, gender, country)
values (3, 'Samir', 'Ait Said', 'Sam', '1', 'france');

---- Content
insert into CONTENT(id, text, title)
values (1, 'Article 1 ', 'Texte');

---- User & role

insert into ROLE(name)
values ('ROLE_ADMIN');
insert into ROLE(name)
values ('ROLE_USER');

insert into USERS(id, login, password)
values (1, 'Chiara', 'loginchiara');
insert into USERS(id, login, password)
values (2, 'Brichot', 'loginbrichot');