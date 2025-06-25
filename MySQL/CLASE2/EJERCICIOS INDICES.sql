CREATE INDEX idx_tipo_personaje ON Personajes (Nombre, Tipo);
DROP INDEX idx_tipo_personaje ON Personajes;
CREATE UNIQUE INDEX idx_nombre_unico ON Reinos (Nombre);
CREATE INDEX idx_nivel_personaje ON Personajes (Nivel);
CREATE FULLTEXT INDEX idx_busq_nom_tit ON Personajes(Nombre, Titulo);
DROP INDEX idx_busq_nom_tit ON Personajes;
SHOW INDEX FROM Personajes;