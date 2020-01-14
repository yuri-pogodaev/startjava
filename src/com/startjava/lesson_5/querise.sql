SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status = 'Not destroyed';
SELECT * FROM Jaegers WHERE mark = '6' OR mark = '1';
SELECT * FROM Jaegers ORDER BY mark DESC; 
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijuKill = (SELECT MIN(KaijuKill) FROM Jaegers) OR kaijuKill = (SELECT MAX(kaijuKill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Not destroyed';
DELETE FROM Jaegers WHERE status = 'Destroyed';