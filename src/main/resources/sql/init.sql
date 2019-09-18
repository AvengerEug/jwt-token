CREATE DATABASE demo_permission;

CREATE TABLE user(
  user_id INT(11) PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(255),
  password VARCHAR(255)
);

INSERT INTO user(user_name, password) VALUES('Eugene', 'abc123');