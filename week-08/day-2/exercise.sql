CREATE DATABASE Todo;
USE Todo;
CREATE TABLE TodoItems (
  name VARCHAR(255),
  description VARCHAR(255),
  date1 DATE,
  completed BOOLEAN
);
  
  
INSERT INTO TodoItems 
 VALUES ("Go to school", "Wake up and get ready to go", '1111-11-11', false),
  ("Go home", "Take my car and drive home", '1111-11-11', false);