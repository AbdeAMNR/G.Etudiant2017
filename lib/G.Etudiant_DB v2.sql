DROP DATABASE IF EXISTS g_etudiant_2017;
DROP DATABASE IF EXISTS studentManagementSys;
CREATE DATABASE IF NOT EXISTS studentManagementSys;

USE studentManagementSys;

CREATE TABLE loginInfo
(login_id int(3) NOT NULL AUTO_INCREMENT,
 username VARCHAR(50) NOT NULL UNIQUE ,
 pass VARCHAR(50),
 usertype VARCHAR (50),
 GrantedKey VARCHAR(8),
 PRIMARY KEY(login_id,username)
);
 
INSERT INTO loginInfo(username,pass,usertype,GrantedKey) VALUES('m''hamdi','ahmed','Administrateur','Granted');
INSERT INTO loginInfo(username,pass,usertype,GrantedKey) VALUES('bakila','mbark','Administrateur','Granted');
INSERT INTO loginInfo(username,pass,usertype,GrantedKey) VALUES('fardan','abdellatif','Etudiant','');

CREATE TABLE IF NOT EXISTS filiere
    (Filiere_id int(3) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     date_supportée DATE,
     filiere_nom TEXT
    );
    
    INSERT INTO filiere(filiere_nom) VALUES("DSI");
    INSERT INTO filiere(filiere_nom) VALUES("MT");

CREATE TABLE IF NOT EXISTS etudiant_info
    (Etudiant_id int(6) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     nom_prenom VARCHAR(70),
	 annee_naissance DATE,
     filiere int,
     CONSTRAINT fk_filiere FOREIGN KEY (filiere) 
     	REFERENCES filiere(filiere_id)
          	ON UPDATE NO ACTION ON DELETE NO ACTION,
     promo YEAR(4) DEFAULT '2017', 
     genre VARCHAR(10),
     adresse TEXT,
     tele VARCHAR(16),
     email TEXT,
	 photo TEXT
    );
	
	INSERT INTO etudiant_info(nom_prenom,annee_naissance,filiere,promo,genre) VALUES('AMANAR Abderrahim','1995-08-22',1,'2017','Male');
    INSERT INTO etudiant_info(nom_prenom,annee_naissance,filiere,promo,genre) VALUES('FARDAN Abdellatif','1995-08-22',1,'2017','Male');
	INSERT INTO etudiant_info(nom_prenom,annee_naissance,filiere,promo,genre) VALUES('BOUALAM Youness','1995-08-22',1,'2017','Male');
	INSERT INTO etudiant_info(nom_prenom,annee_naissance,filiere,promo,genre) VALUES('FIKRI Adil','1995-08-22',1,'2017','Male');
	INSERT INTO etudiant_info (nom_prenom , annee_naissance ,filiere,promo,  genre , adresse ,  tele , email ) VALUES ('TARIK ABYARI','2017-01-13',1,'2016','Male','Ouarzazate','0612548596','exemple@exemple.com');
		 
 
    
        
CREATE TABLE IF NOT EXISTS notation
    (Notes_id int(2) PRIMARY KEY NOT NULL AUTO_INCREMENT,
     Etudiant_id int,
     CONSTRAINT fk_etudient FOREIGN KEY (Etudiant_id)
     	REFERENCES etudiant_info(Etudiant_id)
     	ON UPDATE NO ACTION ON DELETE CASCADE, 
     note_E2 REAL(4,2),
     note_E3 REAL(4,2),
     note_E4 REAL(4,2),
     note_E5 REAL(4,2),
     note_E11 REAL(4,2),
     note_E12 REAL(4,2),
     note_E13 REAL(4,2),
     note_E61 REAL(4,2),
     note_E62 REAL(4,2),
     moyenne_Generale REAL(4,2)
    );	
	INSERT INTO notation(Etudiant_id,note_E2,note_E3,note_E4,note_E5) VALUES(3,15,16,17,18);
	INSERT INTO notation(Etudiant_id,note_E2,note_E3,note_E4,note_E5) VALUES(2,14,13,12,17);