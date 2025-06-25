DELIMITER //
CREATE FUNCTION NombreReinos(ReinoID INT) RETURNS INT
BEGIN
	SELECT Nombre FROM Personajes;
    return ReinoID;
END //
DELIMITER ;
-- DROP FUNCTION NivelPromedioReino;
SELECT NombreReinos(1) AS 'Nombre del Rieno';