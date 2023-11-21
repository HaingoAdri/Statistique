create database statistique;
\c statistique;

create table equipe (
    id serial primary key,
    nom varchar(50)
);

insert into equipe (nom) values
('Equipe1'),
('Equipe2'),
('Equipe3'),
('Equipe4'),
('Equipe5'),
('Equipe6');

create table joueur (
    id serial primary key,
    nom varchar(70),
    prenom varchar(200),
    date_naissance date
);

insert into joueur (nom,prenom, date_naissance) values
('RAKOTO', 'Faneva', '1989-11-12'),
('RABE', 'Ravo', '1989-11-12'),
('TIAVINA', 'Andria', '1989-11-12'),
('RAZAFY', 'Fanilo', '1989-11-12'),
('RABY', 'Fitiavana', '1989-11-12'),
('RAKOTONOMENJANAHARY', 'Tiana', '1989-11-12');

create table liste_joueur (
    id serial,
    id_equipe int,
    id_joueur int,
    date date,
    etat int,
    foreign key (id_equipe) references equipe(id),    
    foreign key (id_joueur) references joueur(id)    
);

ALTER TABLE liste_joueur ADD date date default null;

insert into liste_joueur (id_equipe, id_joueur, date) values
(1, 1, '2020-01-12'),
(1, 2, '2020-01-12'),
(1, 3, '2020-01-12'),
(1, 4, '2020-01-12'),
(2, 5, '2021-07-16'),
(2, 6, '2021-07-16'),
(2, 3, '2021-07-16');


create table etat (
    id int primary key,
    etat varchar(150)
);

insert into etat values
(1, 'Match'),
(5, 'Match Jouer'),
(10, 'Tentative Tirre'),
(15, 'Tirre Reussi'),
(20, 'Rebond'),
(24, 'Passe Decisif'),
(30, 'Tentative Lancers Francs'),
(35, 'Lancers Francs Reussi'),
(40, 'Tentative Trois points'),
(45, 'Tirre Trois points reussi');
insert into etat values
(50, 'Points par Match');

create table Pays (
    id serial primary key,
    nom varchar(50)
);

insert into Pays (nom) values
('Madagascar'),
('Amerique'),
('France');

create table Ville (
    id serial primary key,
    nom varchar(50),
    id_pays int,
    foreign key (id_pays) references Pays (id)
);

insert into ville (nom, id_pays) values
('Ville1', 1),
('Ville2', 1),
('Ville6', 1),
('Ville3', 2),
('Ville4', 3),
('Ville5', 3);

create table Stade (
    id serial primary key,
    nom varchar(50),
    id_ville int,
    foreign key (id_ville) references Ville (id)
);

insert into stade (nom, id_ville) values
('Stade1', 1),
('Stade2', 1),
('Stade3', 2),
('Stade4', 3),
('Stade5', 2),
('Stade4', 2);

create table Match (
    id serial primary key,
    id_equipe1 int,
    id_equipe2 int,
    id_stade int,
    date timestamp
);

insert into Match (id_equipe1, id_equipe2, id_stade, date) values
(1, 2, 1, '2022-01-14 08:15:00'),
(1, 2, 3, '2022-05-20 20:30:00'),
(1, 2, 5, '2023-11-25 10:40:00');

create table statistique (
    id serial,
    id_match int,
    id_equipe int,
    id_joueur int,
    action int,
    points double precision default 0,
    foreign key (id_match) references Match (id),
    foreign key (id_equipe) references equipe (id),
    foreign key (id_joueur) references joueur (id),
    foreign key (action) references etat (id)
);

insert into statistique (id_match, id_equipe, id_joueur, action, points) values
(1, 1, 1, 1, 1),
(1, 1, 2, 1, 1),
(1, 1, 3, 1, 1),
(1, 1, 4, 1, 1),
(1, 1, 1, 5, 1),
(1, 1, 2, 5, 1),
(1, 1, 3, 5, 1),
(1, 1, 1, 10, 5),
(1, 1, 2, 10, 7),
(1, 1, 3, 10, 12),
(1, 1, 1, 15, 8),
(1, 1, 2, 15, 12),
(1, 1, 3, 15, 6),
(1, 1, 1, 20, 6),
(1, 1, 2, 20, 7),
(1, 1, 3, 20, 15),
(1, 1, 1, 24, 12),
(1, 1, 2, 24, 22),
(1, 1, 3, 30, 15),
(1, 1, 1, 35, 12),
(1, 1, 2, 35, 11),
(1, 1, 3, 35, 7),
(1, 1, 1, 45, 6),
(1, 1, 2, 45, 22),
(1, 1, 3, 45, 17);

insert into statistique (id_match, id_equipe, id_joueur, action, points) values
(1, 2, 5, 1, 1),
(1, 2, 6, 1, 1),
(1, 2, 5, 5, 1),
(1, 2, 6, 5, 1),
(1, 2, 5, 10, 15),
(1, 2, 6, 10, 26),
(1, 2, 5, 15, 36),
(1, 2, 6, 15, 40),
(1, 2, 5, 20, 15),
(1, 2, 6, 20, 17),
(1, 2, 5, 24, 18),
(1, 2, 6, 24, 20),
(1, 2, 5, 30, 26),
(1, 2, 6, 30, 2),
(1, 2, 5, 35, 17),
(1, 2, 6, 35, 3),
(1, 2, 5, 40, 22),
(1, 2, 6, 40, 5),
(1, 2, 5, 45, 12),
(1, 2, 6, 1, 16);

insert into statistique (id_match, id_equipe, id_joueur, action, points) values
(1, 1, 1, 50, 1),
(1, 1, 2, 50, 1),
(1, 1, 3, 50, 1),
(1, 1, 4, 50, 1);

-- view
create view liste_joueur_equipe as
select j.*, id_equipe, date from liste_joueur ls join joueur j on ls.id_joueur = j.id;

create view statistique_match as
select s.*, date from statistique s join match m on s.id_match = m.id order by date;

select CASE WHEN count(COALESCE(SUM(points), 0)) > 0 THEN COALESCE(SUM(points), 0) ELSE 0 END as points from statistique_match where id_equipe = 1 and id_joueur = 1 and action = 50 and date <= '2022-11-21' group by id_equipe, id_joueur, action;

curl http://localhost:8080/equipe/listeJoueur/1

Invoke-WebRequest -Uri "http://localhost:8080/statistique/ajoutStatistique" -Method POST -Headers @{"Content-Type"="application/json"} -Body '{"idMatch": "1", "idEquipe": "1", "idJoueur": "1", "action": "1", "points": "1"}'

SELECT
    COALESCE(SUM(points), 0) AS points
FROM
    statistique_match
WHERE
    id_equipe = 1
    AND id_joueur = 1
    AND date <= '2022-11-21'
    and action = 50
GROUP BY
    id_equipe,
    id_joueur,
    action;

SELECT COALESCE(SUM(points), 0) AS points FROM ( SELECT points FROM statistique_match WHERE id_equipe = 1 AND id_joueur = 1 AND action = 50 AND date <= '2022-11-21' GROUP BY id_equipe, id_joueur, action, points) AS subquery;
