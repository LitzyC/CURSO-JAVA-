DELIMITER //
CREATE FUNCTION TotalPoderArtefactos(artefactoPoder INT) RETURNS DECIMAL(5,2)
READS SQL DATA
BEGIN
	DECLARE sumaPoderArtefacto DECIMAL (5,2);
    
    SELECT SUM(Poder) INTO sumaPoderArtefacto
    FROM Artefactosmagicos 
    WHERE DueñoID = artefactoPoder;
    RETURN sumaPoderArtefacto;
END //
DELIMITER ;
SELECT TotalPoderArtefactos(7);
SELECT SUM(Poder) FROM Artefactosmagicos group by DueñoID=7;