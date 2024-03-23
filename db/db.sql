
USE testProjet;
CREATE DATABASE IF NOT EXISTS testProjet;
CREATE TABLE IF NOT EXISTS students(
    id int NOT NULL AUTO_INCREMENT,
    nom varchar(100) NOT NULL,
    prenom varchar(100) NOT NULL,
    PRIMARY KEY (id)
    );

INSERT INTO students(nom, prenom)
VALUES('Amaury', 'Enzo'), ('Gabriel', 'Romain');
