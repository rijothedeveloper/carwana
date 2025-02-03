CREATE TABLE makes (
                       id SERIAL,
                       name varchar(15),
                       PRIMARY KEY (id)
);

CREATE TABLE models (
                        id SERIAL,
                        makeId int,
                        name varchar(15),
                        PRIMARY KEY (id),
                        FOREIGN KEY (makeId) REFERENCES makes(id)
);

CREATE TABLE bodyTypes (
                           id SERIAL,
                           name varchar(15),
                           PRIMARY KEY (id)
);

CREATE TABLE fuelTypes (
                           id SERIAL,
                           name varchar(15),
                           PRIMARY KEY (id)
);

CREATE TABLE colors (
                        id SERIAL,
                        name varchar(15),
                        hex varchar(10),
                        PRIMARY KEY (id)
);

CREATE TABLE driveTrains (
                             id SERIAL,
                             name varchar(15),
                             PRIMARY KEY (id)
);

CREATE TABLE transmissions (
                               id SERIAL,
                               name varchar(15),
                               PRIMARY KEY (id)
);

CREATE TABLE cylinders (
                           id SERIAL,
                           name varchar(15),
                           PRIMARY KEY (id)
);

CREATE TABLE vehicle (
                         id SERIAL,
                         name varchar(15),
                         price bigint,
                         year int,
                         milage bigint,
                         mpg int,
                         seatingCapacity int,
                         makeId int,
                         modelId int,
                         bodyTypeId int,
                         fuelTypeId int,
                         interiorColorId int,
                         exteriorColorId int,
                         driveTrainId int,
                         transmissionId int,
                         cylindersId int,
                         PRIMARY KEY (id),
                         FOREIGN KEY (makeId) REFERENCES makes(id),
                         FOREIGN KEY (modelId) REFERENCES models(id),
                         FOREIGN KEY (bodyTypeId) REFERENCES bodyTypes(id),
                         FOREIGN KEY (fuelTypeId) REFERENCES fuelTypes(id),
                         FOREIGN KEY (interiorColorId) REFERENCES colors(id),
                         FOREIGN KEY (exteriorColorId) REFERENCES colors(id),
                         FOREIGN KEY (driveTrainId) REFERENCES driveTrains(id),
                         FOREIGN KEY (transmissionId) REFERENCES transmissions(id),
                         FOREIGN KEY (cylindersId) REFERENCES cylinders(id)
);
