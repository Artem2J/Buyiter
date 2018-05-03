
-- Create tables

CREATE TABLE users (

  id        INT           NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username  VARCHAR (255) NOT NULL,
  password  VARCHAR (255) NOT NULL
)
  ENGINE = InnoDB;



CREATE TABLE roles (

  id        INT           NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name      VARCHAR(100)  NOT NULL
)
  ENGINE = INNODB;



CREATE TABLE user_roles (

  user_id INT NOT NULL ,
  role_id INT NOT NULL ,

  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id),

  UNIQUE (user_id, role_id)
)
  ENGINE = INNODB;


-- Insert data

INSERT INTO users VALUES (1 , 'Artem2J', '$2a$10$raJ31mE96ios8qPlP4Qs6OnzoHWJap32iwcC/dih3mlLCTQfUnXe2');

INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_roles VALUES (1, 2);