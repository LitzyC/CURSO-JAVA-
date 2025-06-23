-- SELECT p.Nombre AS 'NOMBRE DEL PERSONAJE', r.Nombre AS 'NOMBRE DEL REINO' FROM Personajes p INNER JOIN Reinos r ON p.ReinoID = r.ReinoID;
-- SELECT r.Nombre AS'REINOS', p.Nombre 'PERSONAJES' FROM Reinos r LEFT JOIN Personajes p ON r.ReinoID = p.ReinoID;
-- SELECT b.Nombre AS 'Nombre de Batalla', p.Nombre 'Participante'  FROM Batallas b  RIGHT JOIN personajes p ON b.BatallaID = p.PersonajeID;
-- SELECT Nombre AS 'REINOS', count(*) FROM Reinos GROUP BY ReinoID;
SELECT  r.Nombre, p.COUNT() AS 'Numero Personajes' FROM Personajes p INNER JOIN Reinos r ON r.Nombre GROUP BY ReinoID;