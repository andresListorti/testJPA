-- Insertar direcciones
INSERT INTO direccion (calle, altura, piso, ciudad) VALUES 
('Av. Corrientes', '1234', 5, 'BUENOS_AIRES'),
('Bv. San Juan', '567', 3, 'CORDOBA'),
('Av. San Martín', '4321', 2, 'MENDOZA'),
('Av. Libertador', '789', 1, 'SAN_JUAN'),
('Av. Santa Fe', '2468', 4, 'BUENOS_AIRES');

-- Insertar personas
INSERT INTO persona (nombre, apellido, telefono, email, dni, direccion_id) VALUES 
('Juan', 'Pérez', '1123456789', 'juan.perez@email.com', '12345678', 1),
('María', 'González', '1187654321', 'maria.gonzalez@email.com', '23456789', 2),
('Carlos', 'Rodríguez', '3514567890', 'carlos.rodriguez@email.com', '34567890', 3),
('Juan', 'Perez', '3414567890', 'jp.ramirez@email.com', '33456789', 1),
('Juan', 'Perez', '3614567890', 'juan.testV1@email.com', '30345678', 2),
('Carlos', 'Gosling', '1143678145', 'carlos.gosling@email.com', '35323897', 5),
('Laura', 'Fernández', '2614567890', 'laura.fernandez@email.com', '45678901', 4);

-- Insertar empresas
INSERT INTO empresa (nombre, telefono, email, direccion_id) VALUES 
('TechSolutions SA', '1145678901', 'info@techsolutions.com', 5),
('GreenEnergy Argentina', '3516789012', 'contacto@greenenergy.com', 2);

-- Insertar contactos
INSERT INTO contacto (id, empresa_id) VALUES 
(1, 1),  -- Juan Pérez es un contacto de TechSolutions SA
(2, 1),  -- María González también es un contacto de TechSolutions SA
(3, 2);  -- Carlos Rodríguez es un contacto de GreenEnergy Argentina