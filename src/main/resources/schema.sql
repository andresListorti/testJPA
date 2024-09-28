CREATE SCHEMA IF NOT EXISTS testJpa_agenda_db;
USE testJpa_agenda_db;

CREATE TABLE direccion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    calle VARCHAR(100) NOT NULL,
    altura VARCHAR(10) NOT NULL,
    piso INT,
    ciudad VARCHAR(20) NOT NULL
);

CREATE TABLE persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(100),
    dni VARCHAR(20) NOT NULL UNIQUE,
    direccion_id BIGINT,
    FOREIGN KEY (direccion_id) REFERENCES direccion(id)
);

CREATE TABLE empresa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(100),
    direccion_id BIGINT,
    FOREIGN KEY (direccion_id) REFERENCES direccion(id)
);

CREATE TABLE contacto (
    id BIGINT PRIMARY KEY,
    empresa_id BIGINT,
    FOREIGN KEY (id) REFERENCES persona(id),
    FOREIGN KEY (empresa_id) REFERENCES empresa(id)
);