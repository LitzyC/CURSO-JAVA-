-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS ReinoFantasia;
USE ReinoFantasia;

-- Eliminar tablas si existen
DROP TABLE IF EXISTS ParticipantesBatalla;
DROP TABLE IF EXISTS ArtefactosMagicos;
DROP TABLE IF EXISTS Personajes;
DROP TABLE IF EXISTS Batallas;
DROP TABLE IF EXISTS Reinos;

-- Crear tabla de Reinos
CREATE TABLE Reinos (
    ReinoID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Región VARCHAR(50),
    Poblacion INT
);

-- Crear tabla de Personajes
CREATE TABLE Personajes (
    PersonajeID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Titulo VARCHAR(50),
    Tipo VARCHAR(50), -- Ejemplos: Rey, Caballero, Dragón, Hechicero
    Nivel INT DEFAULT 1,
    ReinoID INT,
    FOREIGN KEY (ReinoID) REFERENCES Reinos(ReinoID) ON DELETE CASCADE 
);

-- Crear tabla de ArtefactosMagicos
CREATE TABLE ArtefactosMagicos (
    ArtefactoID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Tipo VARCHAR(50), -- Ejemplos: Espada, Amuleto, Vara, Armadura
    Poder INT,
    DueñoID INT,
    FOREIGN KEY (DueñoID) REFERENCES Personajes(PersonajeID) ON DELETE CASCADE 
);

-- Crear tabla de Batallas
CREATE TABLE Batallas (
    BatallaID INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL,
    Ubicacion VARCHAR(100),
    Fecha DATE,
    Resultado VARCHAR(20) -- Ejemplos: Victoria, Derrota, Empate
);

-- Crear tabla de ParticipantesBatalla (relación entre Personajes y Batallas)
CREATE TABLE ParticipantesBatalla (
    ParticipanteID INT AUTO_INCREMENT PRIMARY KEY,
    BatallaID INT,
    PersonajeID INT,
    Rol VARCHAR(50), -- Ejemplos: Atacante, Defensor
    FOREIGN KEY (BatallaID) REFERENCES Batallas(BatallaID) ON DELETE CASCADE ,
    FOREIGN KEY (PersonajeID) REFERENCES Personajes(PersonajeID) ON DELETE CASCADE 
);

-- Insertar datos de prueba en Reinos
INSERT INTO Reinos (Nombre, Región, Poblacion)
VALUES
    ('Reino de Eldoria', 'Norte', 50000),
    ('Imperio de Drakonis', 'Sur', 75000),
    ('Territorio de Umbría', 'Oeste', 30000),
    ('Dominio de Lunaris', 'Este', 45000),
    ('Principado de Solstheim', 'Centro', 20000);

-- Agregar personajes a la tabla Personajes
INSERT INTO Personajes (Nombre, Titulo, Tipo, Nivel, ReinoID)
VALUES
    ('Baldric', 'Guerrero', 'Humano', 7, 1),
    ('Eldric', 'Mago', 'Humano', 8, 1),
    ('Gorim', 'Bárbaro', 'Orco', 6, 3),
    ('Lyra', 'Cazadora', 'Elfo', 9, 4),
    ('Fenrir', 'Lobo Gigante', 'Bestia', 10, 2),
    ('Alaric', 'Paladín', 'Humano', 8, 5),
    ('Valeria', 'Hechicera', 'Elfa', 12, 1),
    ('Nyx', 'Asesina', 'Humana', 7, 4),
    ('Ulrick', 'Rey', 'Humano', 11, 3),
    ('Thorvald', 'Guerrero', 'Gigante', 10, 2),
    ('Erik', 'Lancero', 'Humano', 6, 1),
    ('Hilda', 'Valkiria', 'Humana', 9, 5),
    ('Sigrid', 'Bárbara', 'Humana', 7, 3),
    ('Morgana', 'Hechicera', 'Elfa oscura', 10, 2),
    ('Thorin', 'Enano', 'Guerrero', 8, 3),
    ('Bran', 'Explorador', 'Elfo', 9, 4),
    ('Elena', 'Arquera', 'Humana', 7, 1),
    ('Draka', 'Chamana', 'Orco', 9, 2),
    ('Alduin', 'Dragón', 'Dragón', 15, 2);
    
-- Agregar artefactos mágicos para los personajes existentes
INSERT INTO ArtefactosMagicos (Nombre, Tipo, Poder, DueñoID)
VALUES
    ('Espada de Fuego', 'Espada', 80, 1),           -- Baldric
    ('Báculo del Sabio', 'Báculo', 75, 2),          -- Eldric
    ('Hacha de los Salvajes', 'Hacha', 65, 3),      -- Gorim
    ('Arco de los Vientos', 'Arco', 70, 4),         -- Lyra
    ('Collar del Lobo', 'Amuleto', 85, 5),          -- Fenrir
    ('Escudo de la Luz', 'Escudo', 78, 6),          -- Alaric
    ('Orbe de la Hechicería', 'Orbe', 90, 7),       -- Valeria
    ('Daga de las Sombras', 'Daga', 72, 8),         -- Nyx
    ('Corona de los Reyes', 'Corona', 60, 9),       -- Ulrick
    ('Martillo del Gigante', 'Martillo', 80, 10),   -- Thorvald
    ('Lanza de Acero', 'Lanza', 65, 11),            -- Erik
    ('Escudo de la Valkiria', 'Escudo', 74, 12),    -- Hilda
    ('Espada de los Bárbaros', 'Espada', 68, 13),   -- Sigrid
    ('Anillo de las Sombras', 'Anillo', 82, 14),    -- Morgana
    ('Hacha de la Montaña', 'Hacha', 70, 15),       -- Thorin
    ('Capa del Bosque', 'Capa', 68, 16),            -- Bran
    ('Arco del Sol', 'Arco', 65, 17),               -- Elena
    ('Amuleto de la Tierra', 'Amuleto', 78, 18),    -- Draka
    ('Gema del Dragón', 'Gema', 90, 19);            -- Alduin


-- Agregar batallas adicionales a la tabla Batallas
INSERT INTO Batallas (Nombre, Ubicacion, Fecha, Resultado)
VALUES
    ('Batalla de la Luna Llena', 'Bosque Sombrío', '2024-03-15', 'Victoria'),
    ('Asalto a la Torre de Eld', 'Torre de Eld', '2024-04-10', 'Derrota'),
    ('Guerra de los Dragones', 'Montaña Roja', '2024-05-20', 'Empate'),
    ('Invasión de la Costa', 'Costa Helada', '2024-06-01', 'Victoria'),
    ('Emboscada en el Valle Oscuro', 'Valle Oscuro', '2024-07-25', 'Victoria'),
    ('Sitio de Drakonis', 'Ciudadela de Fuego', '2024-08-13', 'Derrota'),
    ('Conquista de Lunaris', 'Bosques de Lunaris', '2024-09-30', 'Empate'),
    ('Batalla de la Noche Eterna', 'Llanura de los Ecos', '2024-10-01', 'Victoria'),
    ('Asedio de la Torre Esmeralda', 'Torre Esmeralda', '2024-10-15', 'Derrota'),
    ('Guerra de los Tres Reinos', 'Llanura del Amanecer', '2024-11-05', 'Victoria'),
    ('Invasión del Mar Oculto', 'Costa de los Muertos', '2024-11-20', 'Empate'),
    ('Masacre del Valle de los Susurros', 'Valle de los Susurros', '2024-12-03', 'Derrota'),
    ('Resistencia de la Ciudad Plateada', 'Ciudad Plateada', '2024-12-18', 'Victoria'),
    ('Batalla de las Sombras Perdidas', 'Bosque Profundo', '2025-01-05', 'Derrota'),
    ('Defensa de la Fortaleza de Hielo', 'Fortaleza de Hielo', '2025-01-20', 'Victoria'),
    ('Conquista de la Isla Oscura', 'Isla Oscura', '2025-02-10', 'Victoria'),
    ('Asalto a la Puerta del Amanecer', 'Puerta del Amanecer', '2025-03-01', 'Empate'),
    ('Emboscada en el Desfiladero de la Serpiente', 'Desfiladero de la Serpiente', '2025-03-15', 'Victoria'),
    ('Sitio de la Caverna de las Almas', 'Caverna de las Almas', '2025-04-01', 'Derrota'),
    ('Guerra del Bosque Rojo', 'Bosque Rojo', '2025-04-20', 'Victoria'),
    ('Batalla de los Tres Soles', 'Desierto Luminoso', '2025-05-10', 'Empate'),
    ('Invasión de la Ciudad Espectral', 'Ciudad Espectral', '2025-06-01', 'Victoria'),
    ('Defensa de la Muralla de Cristal', 'Muralla de Cristal', '2025-06-15', 'Derrota'),
    ('Conquista de las Laderas Oscuras', 'Laderas Oscuras', '2025-07-05', 'Victoria'),
    ('Masacre de las Tierras de Nieve', 'Tierras de Nieve', '2025-07-20', 'Derrota'),
    ('Guerra de las Sombras Escarlata', 'Llanura Escarlata', '2025-08-05', 'Victoria'),
    ('Batalla de las Cuatro Lunas', 'Islas Brillantes', '2025-08-25', 'Empate'),
    ('Emboscada en la Cascada de Cristal', 'Cascada de Cristal', '2025-09-15', 'Victoria'),
    ('Asalto a las Ruinas del Abismo', 'Ruinas del Abismo', '2025-09-30', 'Derrota'),
    ('Conquista de la Torre del Alba', 'Torre del Alba', '2025-10-10', 'Victoria'),
    ('Defensa de la Ciudad Dorada', 'Ciudad Dorada', '2025-10-25', 'Empate'),
    ('Sitio de la Fortaleza Oscura', 'Fortaleza Oscura', '2025-11-05', 'Victoria'),
    ('Batalla del Lago Espejado', 'Lago Espejado', '2025-11-20', 'Derrota'),
    ('Invasión de la Muralla Verde', 'Muralla Verde', '2025-12-05', 'Victoria'),
    ('Masacre del Valle de las Lágrimas', 'Valle de las Lágrimas', '2025-12-20', 'Victoria'),
    ('Guerra de las Aguas Profundas', 'Bahía Infinita', '2026-01-10', 'Derrota'),
    ('Batalla del Pantano Helado', 'Pantano Helado', '2026-01-25', 'Victoria'),
    ('Emboscada en el Claro Encantado', 'Claro Encantado', '2026-02-15', 'Empate'),
    ('Asedio del Castillo de Hueso', 'Castillo de Hueso', '2026-03-05', 'Victoria'),
    ('Conquista de la Cima del Trueno', 'Cima del Trueno', '2026-03-25', 'Derrota'),
    ('Defensa del Templo de las Estrellas', 'Templo de las Estrellas', '2026-04-15', 'Victoria'),
    ('Invasión de la Frontera del Sur', 'Frontera del Sur', '2026-04-30', 'Empate'),
    ('Sitio de la Ciudadela de la Sombra', 'Ciudadela de la Sombra', '2026-05-20', 'Victoria'),
    ('Batalla de la Garganta del Lobo', 'Garganta del Lobo', '2026-06-05', 'Victoria'),
    ('Conquista de la Fortaleza de Hierro', 'Fortaleza de Hierro', '2026-06-25', 'Derrota'),
    ('Defensa de las Montañas Púrpuras', 'Montañas Púrpuras', '2026-07-10', 'Victoria'),
    ('Guerra de los Mil Vientos', 'Llanura de Viento', '2026-07-30', 'Victoria'),
    ('Emboscada en el Valle de las Sombras', 'Valle de las Sombras', '2026-08-15', 'Empate'),
    ('Asedio de la Torre de Plata', 'Torre de Plata', '2026-09-01', 'Derrota'),
    ('Invasión de las Colinas Gemelas', 'Colinas Gemelas', '2026-09-20', 'Victoria'),
    ('Masacre de las Tierras Negras', 'Tierras Negras', '2026-10-10', 'Victoria'),
    ('Conquista de la Ciudadela de Cristal', 'Ciudadela de Cristal', '2026-10-25', 'Derrota'),
    ('Batalla del Bosque Inmortal', 'Bosque Inmortal', '2026-11-05', 'Victoria'),
    ('Defensa del Mar Oculto', 'Mar Oculto', '2026-11-20', 'Empate'),
    ('Sitio de la Fortaleza de Luz', 'Fortaleza de Luz', '2026-12-10', 'Victoria'),
    ('Emboscada en el Río de Plata', 'Río de Plata', '2026-12-25', 'Derrota');

-- Agregar participantes para las batallas
INSERT INTO ParticipantesBatalla (BatallaID, PersonajeID, Rol)
VALUES
    (1, 1, 'Atacante'),       -- Baldric ataca en Batalla de la Luna Llena
    (1, 2, 'Defensor'),       -- Eldric defiende en Batalla de la Luna Llena
    (2, 3, 'Atacante'),       -- Gorim ataca en Asalto a la Torre de Eld
    (2, 4, 'Defensor'),       -- Lyra defiende en Asalto a la Torre de Eld
    (3, 5, 'Atacante'),       -- Fenrir ataca en Guerra de los Dragones
    (3, 6, 'Defensor'),       -- Alaric defiende en Guerra de los Dragones
    (4, 7, 'Atacante'),       -- Valeria ataca en Invasión de la Costa
    (4, 8, 'Defensor'),       -- Nyx defiende en Invasión de la Costa
    (5, 9, 'Atacante'),       -- Ulrick ataca en Emboscada en el Valle Oscuro
    (5, 10, 'Defensor'),      -- Thorvald defiende en Emboscada en el Valle Oscuro
    (6, 11, 'Atacante'),      -- Erik ataca en Sitio de Drakonis
    (6, 12, 'Defensor'),      -- Hilda defiende en Sitio de Drakonis
    (7, 13, 'Atacante'),      -- Sigrid ataca en Conquista de Lunaris
    (7, 14, 'Defensor'),      -- Morgana defiende en Conquista de Lunaris
    (8, 15, 'Atacante'),      -- Thorin ataca en Batalla de la Noche Eterna
    (8, 16, 'Defensor'),      -- Bran defiende en Batalla de la Noche Eterna
    (9, 17, 'Atacante'),      -- Elena ataca en Asedio de la Torre Esmeralda
    (9, 18, 'Defensor'),      -- Draka defiende en Asedio de la Torre Esmeralda
    (10, 19, 'Atacante'),     -- Alduin ataca en Guerra de los Tres Reinos
    (10, 1, 'Defensor'),      -- Baldric defiende en Guerra de los Tres Reinos
    (11, 2, 'Atacante'),      -- Eldric ataca en Invasión del Mar Oculto
    (11, 3, 'Defensor'),      -- Gorim defiende en Invasión del Mar Oculto
    (12, 4, 'Atacante'),      -- Lyra ataca en Masacre del Valle de los Susurros
    (12, 5, 'Defensor'),      -- Fenrir defiende en Masacre del Valle de los Susurros
    (13, 6, 'Atacante'),      -- Alaric ataca en Resistencia de la Ciudad Plateada
    (13, 7, 'Defensor'),      -- Valeria defiende en Resistencia de la Ciudad Plateada
    (14, 8, 'Atacante'),      -- Nyx ataca en Batalla de las Sombras Perdidas
    (14, 9, 'Defensor'),      -- Ulrick defiende en Batalla de las Sombras Perdidas
    (15, 10, 'Atacante'),     -- Thorvald ataca en Defensa de la Fortaleza de Hielo
    (15, 11, 'Defensor'),     -- Erik defiende en Defensa de la Fortaleza de Hielo
    (16, 12, 'Atacante'),     -- Hilda ataca en Conquista de la Isla Oscura
    (16, 13, 'Defensor'),     -- Sigrid defiende en Conquista de la Isla Oscura
    (17, 14, 'Atacante'),     -- Morgana ataca en Asalto a la Puerta del Amanecer
    (17, 15, 'Defensor'),     -- Thorin defiende en Asalto a la Puerta del Amanecer
    (18, 16, 'Atacante'),     -- Bran ataca en Emboscada en el Desfiladero de la Serpiente
    (18, 17, 'Defensor'),     -- Elena defiende en Emboscada en el Desfiladero de la Serpiente
    (19, 18, 'Atacante'),     -- Draka ataca en Sitio de la Caverna de lartefactosmagicosartefactosmagicosas Almas
    (19, 19, 'Defensor'),     -- Alduin defiende en Sitio de la Caverna de las Almas
    (20, 1, 'Atacante'),      -- Baldric ataca en Guerra del Bosque Rojo
    (20, 2, 'Defensor');      -- Eldric defiende en Guerra del Bosque Rojo
