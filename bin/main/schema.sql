CREATE TABLE departament (
  id IDENTITY PRIMARY KEY,
  name VARCHAR(64) NOT NULL
);

CREATE TABLE employee (
  id IDENTITY PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  departament_id INT,
  CONSTRAINT FK_EMP_DEPT_ID FOREIGN KEY(departament_id) REFERENCES departament(id)
);