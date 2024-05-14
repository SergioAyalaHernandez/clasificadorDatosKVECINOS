CREATE DATABASE `euclidiana`;

CREATE TABLE tabla_a (
                         id_a INT AUTO_INCREMENT,
                         column_x INT,
                         column_y INT,
                         obs_a VARCHAR(255),
                         PRIMARY KEY (id_a)
);
drop table tabla_a;

INSERT INTO `tabla_a` (column_x, column_y, obs_a) VALUES
                                                      (26,50,"Bajos"),
                                                      (20,41,"Bajos"),
                                                      (10,41,"Bajos"),
                                                      (8,30,"Bajos"),
                                                      (20,20,"Bajos"),
                                                      (3,22,"Bajos"),
                                                      (30,8,"Bajos"),
                                                      (2,11,"Bajos"),
                                                      (3,8,"Bajos"),
                                                      (50,70,"Altos"),
                                                      (52,74,"Altos"),
                                                      (60,66,"Altos"),
                                                      (62,74,"Altos"),
                                                      (67,70,"Altos"),
                                                      (60,87,"Altos"),
                                                      (71,69,"Altos"),
                                                      (72,69,"Altos"),
                                                      (75,69,"Altos"),
                                                      (66,89,"Altos"),
                                                      (76,89,"Altos"),
                                                      (87,54,"Altos"),
                                                      (88,52,"Altos"),
                                                      (80,89,"Altos");

SELECT * FROM tabla_a order by column_x asc;