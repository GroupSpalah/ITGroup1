CREATE DATABASE Bank;

USE Bank;

CREATE TABLE Accounts(
account_id INT PRIMARY KEY AUTO_INCREMENT,
account_number INT,
currency ENUM('UAN','USD','EUR'),
FK_accounts_amounts INT,
FOREIGN KEY(FK_accounts_amounts)REFERENCES Amounts(amounts_id));

INSERT INTO Accounts(account_number,currency,FK_accounts_amounts)
VALUES
(2300,'UAN',1),
(2650,'EUR',2),
(2700,'UAN',3),
(2100,'UAN',4),
(2600,'UAN',5);

CREATE TABLE Amounts(
amounts_id INT PRIMARY KEY AUTO_INCREMENT,
client_id INT,
amount INT);

INSERT INTO Amounts(client_id,amount)
VALUES
(555,100),
(555,200),
(300,50);

SELECT * FROM Accounts A
INNER JOIN Amounts Am
ON A.FK_accounts_amounts = Am.amounts_id;

SELECT A.account_number ,A.currency ,A.FK_accounts_amounts,Am.amount 
FROM Accounts A 
INNER JOIN Amounts Am 
ON A.FK_accounts_amounts = Am.amounts_id
WHERE  A.account_number >= 2600 AND A.currency = 'UAN' AND Am.amount > 55;

UPDATE Amounts Am
SET amount = 0
WHERE client_id = 555;