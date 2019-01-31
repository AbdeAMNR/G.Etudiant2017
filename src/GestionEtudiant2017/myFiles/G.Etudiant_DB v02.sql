DROP DATABASE IF EXISTS g_etudiant_2017;
CREATE DATABASE IF NOT EXISTS g_etudiant_2017;

USE g_etudiant_2017;

CREATE TABLE loginInfo
(login_id int(3) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 username VARCHAR(50),
 pass VARCHAR(50)   
);

CREATE TABLE IF NOT EXISTS filiere
    (Filiere_id int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     label VARCHAR(100),
     date_supportée DATE
    );

CREATE TABLE IF NOT EXISTS etudiant_info
    (Etudiant_id int(6) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     nom VARCHAR(30),
     prenom VARCHAR(30),
     annee_naissance DATE,
     filiere int,
     CONSTRAINT fk_filiere FOREIGN KEY (filiere) 
     	REFERENCES filiere(filiere_id)
          	ON UPDATE NO ACTION ON DELETE NO ACTION,
     promo YEAR(4) DEFAULT '2017', 
     genre VARCHAR(10),
     adresse TEXT,
     tele VARCHAR(16),
     email TEXT
    );
    
CREATE TABLE IF NOT EXISTS epreuves
    (Epreuves_id int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     label_epreuves VARCHAR(200),
     coef int(2),
     forme VARCHAR(30)
    );	
    
        
CREATE TABLE IF NOT EXISTS notation
    (Note_id int(2) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     Etudiant_id int,
     CONSTRAINT fk_etudient FOREIGN KEY (Etudiant_id)
     	REFERENCES etudiant_info(Etudiant_id)
     	ON UPDATE NO ACTION ON DELETE CASCADE, 
	 
     E2 int ,
     CONSTRAINT FOREIGN KEY (E2)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E2 REAL(4,2),
     
     E3 int ,
     CONSTRAINT FOREIGN KEY (E3)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E3 REAL(4,2),
     
     E4 int ,
     CONSTRAINT FOREIGN KEY (E4)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E4 REAL(4,2),
     
     E5 int ,
     CONSTRAINT FOREIGN KEY (E5)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E5 REAL(4,2),
     
     E11 int ,
     CONSTRAINT FOREIGN KEY (E11)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E11 REAL(4,2),
     
     E12 int ,
     CONSTRAINT FOREIGN KEY (E12)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E12 REAL(4,2),
     
     E13 int ,
     CONSTRAINT FOREIGN KEY (E13)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E13 REAL(4,2),
     
     E61 int ,
     CONSTRAINT FOREIGN KEY (E61)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E61 REAL(4,2),
     
     E62 int ,
     CONSTRAINT FOREIGN KEY (E62)
     	REFERENCES epreuves(epreuves_id)
     	ON UPDATE NO ACTION ON DELETE NO ACTION,
     note_E62 REAL(4,2),
     
     moyenne_Generale REAL(4,2)
    );	