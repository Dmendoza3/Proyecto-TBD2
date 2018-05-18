create or replace PROCEDURE deleteCigarrillo
/*borra un cigarrillo de acuerdo al IDCIGARRILLO recibido*/
 (idcigarrillo_p IN NUMBER) AS
 BEGIN
    DELETE FROM CIGARRILLO
    WHERE CIGARRILLO.IDCIGARRILLO = idcigarrillo_p;
 END deleteCigarrillo;