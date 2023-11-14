CREATE DATABASE task1_sql;

USE task1_sql;

CREATE TABLE Accounts (
ID_Client INT PRIMARY KEY AUTO_INCREMENT,
Account_No VARCHAR(20),
Currency ENUM ('UAH', 'USD', 'EUR'),
FK_Accounts_Amounts INT,
FOREIGN KEY (FK_Accounts_Amounts) REFERENCES Amounts (ID_Client));

CREATE TABLE Amounts (
ID_Client INT PRIMARY KEY AUTO_INCREMENT,
Amount INT);

INSERT INTO Accounts (Account_No, Currency, FK_Accounts_Amounts) VALUES
('260012345', 'UAH', 1),
('123456789', 'USD', 2),
('260055555', 'EUR', 3);

INSERT INTO Amounts (Amount) VALUES
(50),
(200),
(60);
   
SELECT *
FROM Accounts a
JOIN Amounts b
WHERE a.Currency = 'UAH' AND SUBSTRING(a.Account_No, 1, 4) = '2600' AND b.Amount > 55;

UPDATE Amounts SET Amount = 0
WHERE ID_Client = 555;
