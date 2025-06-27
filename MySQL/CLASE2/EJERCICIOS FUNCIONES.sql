DELIMITER //
CREATE FUNCTION TotalPoderArtefactos(artefactoPoder INT) RETURNS DECIMAL(5,2)
READS SQL DATA
BEGIN
	DECLARE sumaPoderArtefacto DECIMAL (5,2);
    
    SELECT SUM(Poder) INTO sumaPoderArtefacto
    FROM Artefactosmagicos WHERE ArtefactoID = artefactoPoder;
    RETURN sumaPoderArtefacto;
END //
DELIMITER ;
SELECT TotalPoderArtefactos(5);