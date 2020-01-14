CREATE TABLE Jaegers (
  	id SERIAL  PRIMARY KEY,
  	modelName  TEXT,
  	mark       INTEGER,
  	height     REAL,
  	weight     INTEGER,
  	status     TEXT,
  	origin     TEXT,
	launch     DATE,
	kaijuKill INTEGER )
;