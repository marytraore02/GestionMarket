--
-- File generated with SQLiteStudio v3.3.3 on mer. août 10 14:02:58 2022
--
-- Text encoding used: UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: achat
CREATE TABLE achat (codebarre VARCHAR (20) PRIMARY KEY, nom VARCHAR (20) NOT NULL, categories VARCHAR (20) REFERENCES categories (NomCat) MATCH SIMPLE, fournisseurs VARCHAR (20), prixht INTEGER (20) NOT NULL, prixvente INTEGER (20) NOT NULL, quantites INTEGER (20) NOT NULL, stockalerte VARCHAR (20) NOT NULL, dateIns VARCHAR (20) NOT NULL);
INSERT INTO achat (codebarre, nom, categories, fournisseurs, prixht, prixvente, quantites, stockalerte, dateIns) VALUES ('005', 'Huile nationale', 'Huile', 'Mary', 6000, 6500, 12, '41', '04-06-2002');
INSERT INTO achat (codebarre, nom, categories, fournisseurs, prixht, prixvente, quantites, stockalerte, dateIns) VALUES ('003', 'Huile internationale', 'Huile', 'Mary', 7000, 7500, 15, '27', '08-06-2022');
INSERT INTO achat (codebarre, nom, categories, fournisseurs, prixht, prixvente, quantites, stockalerte, dateIns) VALUES ('001', 'Sucre', 'Sucre', 'Nene', 550, 650, 20, '7', '25-06-2022');
INSERT INTO achat (codebarre, nom, categories, fournisseurs, prixht, prixvente, quantites, stockalerte, dateIns) VALUES ('004', 'Poisson', 'poisson', 'Nene', 700, 800, 12, '3', '25-06-2022');
INSERT INTO achat (codebarre, nom, categories, fournisseurs, prixht, prixvente, quantites, stockalerte, dateIns) VALUES ('002', 'Riz', 'Nourriture', 'Mary', 12000, 13500, 14, '2', '23-06-2022');

-- Table: categories
CREATE TABLE categories (reference VARCHAR (20) PRIMARY KEY, NomCat VARCHAR (20));
INSERT INTO categories (reference, NomCat) VALUES ('001', 'Boisson');
INSERT INTO categories (reference, NomCat) VALUES ('002', 'Nourriture');
INSERT INTO categories (reference, NomCat) VALUES ('003', 'Huile');
INSERT INTO categories (reference, NomCat) VALUES ('004', 'Sucre');
INSERT INTO categories (reference, NomCat) VALUES ('005', 'poisson');
INSERT INTO categories (reference, NomCat) VALUES ('006', 'test1');

-- Table: client
CREATE TABLE client (reference VARCHAR (20) PRIMARY KEY, nom VARCHAR (20) NOT NULL, prenom VARCHAR (20) NOT NULL, email VARCHAR (50) NOT NULL, telephone VARCHAR (255) NOT NULL, adresse VARCHAR (255) NOT NULL, type VARCHAR (20) NOT NULL, dateIns VARCHAR (20) NOT NULL, bonus VARCHAR (10) NOT NULL);
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('001', 'TRAORE', 'Mary', 'test33@gmail.com', '0055555555', 'mali', 'FOURNISSEUR', '23-05-2022', 'null');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('002', 'TRAORE', 'Mohammed', 'mohammedtraore@gmail.com', '+22355555555', 'Badalabougou', 'CLIENT', '23-05-2022', '6');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('003', 'DIARRA', 'Tiecoura', 'tiecouradiarra1999@gmail.com', '+22366666666', 'Sogonoko', 'CLIENT', '18-05-2022', '8');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('004', 'KONE', 'Fousseini', 'fousko007@gmail.com', '+22355555555', 'Quartier fleuve', 'CLIENT', '14-05-2022', '5');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('005', 'MAIGA', 'Abasse', 'abassemaiga403@gmail.com', '+22377777777', 'Kalabankoro', 'CLIENT', '15-05-2022', '4');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('006', 'FOFANA', 'Fousseini', 'fousseni@gmail.com', '+22366667777', 'Badalabougou', 'CLIENT', '22-05-2022', '5');
INSERT INTO client (reference, nom, prenom, email, telephone, adresse, type, dateIns, bonus) VALUES ('008', 'SYLLA', 'Nene', 'nenesylla7766@gmail.com', '+22393772486', 'bamako', 'FOURNISSEUR', '23-05-2022', 'null');

-- Table: login
CREATE TABLE login (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nom VARCHAR (30) REFERENCES util (user) NOT NULL, mdp VARCHAR (30) NOT NULL REFERENCES util (mdp), type VARCHAR (30) NOT NULL);
INSERT INTO login (id, nom, mdp, type) VALUES (1, 'admin', 'admin', 'Admin');
INSERT INTO login (id, nom, mdp, type) VALUES (2, 'user1', 'user', 'User');
INSERT INTO login (id, nom, mdp, type) VALUES (3, 'mary', 'mary', 'Admin');

-- Table: OrderTbl
CREATE TABLE OrderTbl (OrderId INTEGER PRIMARY KEY, CustName VARCHAR (20), OrderDate VARCHAR (20), Amount INTEGER);
INSERT INTO OrderTbl (OrderId, CustName, OrderDate, Amount) VALUES (1, 'Abasse', '23/5/2022', 20);
INSERT INTO OrderTbl (OrderId, CustName, OrderDate, Amount) VALUES (2, 'Tiecoura', '25/5/2022', 39);
INSERT INTO OrderTbl (OrderId, CustName, OrderDate, Amount) VALUES (3, 'Fousseini', '29/5/2022', 1300);
INSERT INTO OrderTbl (OrderId, CustName, OrderDate, Amount) VALUES (4, 'Abasse', '2/6/2022', 3200);
INSERT INTO OrderTbl (OrderId, CustName, OrderDate, Amount) VALUES (5, 'Mohammed', '2/6/2022', 1300);

-- Table: parametre
CREATE TABLE parametre (pays VARCHAR (20) NOT NULL, ville VARCHAR (20) NOT NULL, Padresse VARCHAR (100) NOT NULL, Sadresse VARCHAR (100) NOT NULL, telephone VARCHAR (20) NOT NULL, email VARCHAR (20) NOT NULL, codepostal NOT NULL, nomproprietaire VARCHAR (20) NOT NULL, nommagasin VARCHAR (20) NOT NULL);
INSERT INTO parametre (pays, ville, Padresse, Sadresse, telephone, email, codepostal, nomproprietaire, nommagasin) VALUES ('Mali', 'Bamako', 'N''Tomikorobougou', 'Pres du marche', '+22364897331', 'marytraore180@gmail.com', '91093', 'MARY TRAORE', 'SUPERMARKET');

-- Table: util
CREATE TABLE util (reference VARCHAR (20) PRIMARY KEY, nom VARCHAR (255) NOT NULL, user VARCHAR (100) NOT NULL, mdp VARCHAR (100) NOT NULL, telephone VARCHAR (255) NOT NULL, adresse VARCHAR (255) NOT NULL, type VARCHAR (20), salaire VARCHAR (25) NOT NULL, contrat VARCHAR (20) NOT NULL);
INSERT INTO util (reference, nom, user, mdp, telephone, adresse, type, salaire, contrat) VALUES ('001', 'Mary TRAORE', 'mary', '1234', '+22364897331', 'bamako', 'Admin', 'null', 'null');
INSERT INTO util (reference, nom, user, mdp, telephone, adresse, type, salaire, contrat) VALUES ('002', 'Nene SYLLA', 'nene', 'sylla123', '+22355555555', 'bamako', 'Admin', 'null', 'null');
INSERT INTO util (reference, nom, user, mdp, telephone, adresse, type, salaire, contrat) VALUES ('003', 'Mohammed TRAORE', 'Mohpython', 'moh123', '+22377777777', 'bamako', 'User', '5000', 'CDD');
INSERT INTO util (reference, nom, user, mdp, telephone, adresse, type, salaire, contrat) VALUES ('004', 'Tiecoura DIARRA', 'tiec', 'tiec123', '+22366666667', 'Sokoniko', 'User', '1222', 'CDD');
INSERT INTO util (reference, nom, user, mdp, telephone, adresse, type, salaire, contrat) VALUES ('&_2022ABC', 'TEST', 'test', '1111', '299999', 'bko', 'Admin', '222', 'cdd');

-- Table: ventes
CREATE TABLE ventes (NumVente VARCHAR (10) PRIMARY KEY, NomPVente VARCHAR (20) NOT NULL, QteVente VARCHAR (10) NOT NULL, PrixVente VARCHAR (10) NOT NULL, TotalVente VARCHAR (20) NOT NULL);
INSERT INTO ventes (NumVente, NomPVente, QteVente, PrixVente, TotalVente) VALUES ('001', 'Ble', '2', '1500', 'Boisson');
INSERT INTO ventes (NumVente, NomPVente, QteVente, PrixVente, TotalVente) VALUES ('002', 'Fonio', '3', '1200', 'Nourriture');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
