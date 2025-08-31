DROP DATABASE IF EXISTS game_db;
CREATE DATABASE game_db;
USE game_db;

CREATE TABLE players (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  age INT NOT NULL,
  rating DOUBLE NOT NULL
);

INSERT INTO players (name, age, rating) VALUES
('Alice', 21, 82.5),
('Bob', 25, 77.3),
('Charlie', 19, 88.9),
('Diana', 23, 91.2),
('Ethan', 28, 69.5),
('Fiona', 22, 73.1),
('George', 30, 95.6),
('Hannah', 20, 81.0),
('Ivan', 24, 79.8),
('Jane', 27, 85.4);
