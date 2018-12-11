CREATE DATABASE Todo;
USE Todo;
CREATE TABLE Users(
  userID INT AUTO_INCREMENT,
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  PRIMARY KEY (userID)
  );
  
  INSERT INTO Users (first_name, last_name)
 VALUES ("Peter", "Vadasz"), ("Joe", "Black");

CREATE TABLE TodoItems (
    itemID INT AUTO_INCREMENT,
  userID INT,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(255) NOT NULL,
  date1 DATE,
  completed BOOLEAN,
  PRIMARY KEY (itemID),
  FOREIGN KEY (userID) REFERENCES Users(userID)
);
  
INSERT INTO TodoItems (userID, name, description, date1, completed)
 VALUES (1, "Go to school", "Wake up and get ready to go", '1111-11-11', true),
  (1, "Go home", "Take my car and drive home", '2222-11-22', false);