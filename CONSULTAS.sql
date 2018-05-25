--queries

/*PRIMER CONSULTA
	Obtener todas las marcas de cigarrillos extranjeros
*/
SELECT M.MARCA, F.PAIS
FROM MANUFACTURA M
INNER JOIN FABRICANTE F
ON M.IDFABRICANTE=F.IDFABRICANTE
WHERE F.PAIS='USA';
/*SEGUNDA CONSULTA
	Obtener el valor de todas las compras realizadas por el estanco '11111' de la marca 'Camel'
	desde el año 1996 hasta la fecha.
*/

SELECT SUM(PRECIOCOMPRA*CANTIDAD) AS "Importe de las Compras"
FROM (COMPRA c INNER JOIN CIGARRILLO cig ON c.IDCIGARRILLO=cig.IDCIGARRILLO) 
    INNER JOIN ESTANCO e ON c.NUMFISCAL = e.NUMFISCAL WHERE 
cig.Marca = 'Camel' AND e.NUMFISCAL = '11111' AND (EXTRACT(YEAR FROM c.FECHAC) >= 1996);


/*3RA CONSULTA
	Obtener el valor de todas las ventas de la marca 'Ducados' que han realizado los estancos de la
	provincia de Madrid.

*/
SELECT SUM(ven.PRECIOVENTA*ven.CANTIDAD) AS "Venta en Madrid de Ducados"
FROM VENTA ven
INNER JOIN Cigarrillo cig
ON cig.IDCIGARRILLO=ven.IDCIGARRILLO
INNER JOIN Manufactura man ON
cig.MARCA=man.MARCA
INNER JOIN ESTANCO est
ON est.NUMFISCAL = ven.NUMFISCAL
WHERE (cig.MARCA = 'Ducados' AND est.PROVINCIA = 'Madrid');

/*4TA CONSULTA
	Obtener la marca de cigarrillos estadounidense que vende más
	cigarrillos
*/
SELECT * FROM (SELECT SUM(ven.CANTIDAD), cig.MARCA
FROM VENTA ven
INNER JOIN CIGARRILlO cig
ON ven.IDCIGARRILLO = cig.IDCIGARRILLO
INNER JOIN MANUFACTURA man
ON cig.MARCA = man.MARCA
INNER JOIN FABRICANTE fab
ON man.IDFABRICANTE = fab.IDFABRICANTE
WHERE(fab.PAIS = 'USA')
GROUP BY cig.MARCA
ORDER BY SUM(ven.CANTIDAD) desc) WHERE ROWNUM = 1;
/*5ta consulta
	Obtener los ingresos por ventas de la marca ‘winston’ el 22 de agosto de 1995
*/
SELECT SUM(ven.PRECIOVENTA*ven.CANTIDAD) AS "Ingresos"
FROM CIGARRILLO cig
INNER JOIN VENTA ven
ON cig.IDCIGARRILLO = ven.IDCIGARRILLO
WHERE ven.FECHAV = to_date('22.8.' || 1995, 'DD.MM.YYYY') AND cig.MARCA = 'Winston'
GROUP BY ven.FECHAV;

/*6ta consulta*/
ALTER TABLE CIGARRILLO
    ADD (MED_CALIDAD NUMBER);

/*7ma consulta*/
ALTER TABLE Almacen MODIFY existencia NUMBER(5,0)

/*8va ya está hecha, (trigger)*/
ALTER TABLE ESTANCO Add CONSTRAINT chk_12_1 CHECK (LENGTH(NUMFISCAL)) >= 12)

/*9th*/
SELECT * FROM (SELECT est.numFiscal, est.nombre
FROM Estanco est
INNER JOIN Almacen alm
ON alm.numFiscal=est.numFiscal
INNER JOIN CIGARRILLO cig
ON alm.idCigarrillo=cig.idCigarrillo
WHERE (cig.Marca != 'Winston' AND cig.mentolado = 0 AND cig.Marca = 'Celtas' AND cig.filtro = 0))
WHERE ROWNUM = 1;

/*10*/

create or replace PROCEDURE procVentas_Menores

/*Procedimiento para obtener las marcas de cigarrillos para los cuales se hayan vendido menos de una determinada
cantidad (primer parametro de procedimiento), eliminando todas estas marcas en el almacén de un determinado estanco,
cuyo NIF constituye el segundo parámetro del procedimiento.*/

 (amountp IN NUMBER, numestp IN VARCHAR2) AS --amountp es la cantidad mínima que ocupa y numestp es el numfiscal del estanco
    cigarrilloIdp CIGARRILLO.IDCIGARRILLO%TYPE;
    marcaIdp CIGARRILLO.MARCA%TYPE;
    CURSOR ventas_menores IS
        SELECT cig.MARCA
        FROM CIGARRILLO cig
        INNER JOIN VENTA ven
        ON cig.IDCIGARRILLO = ven.IDCIGARRILLO
        INNER JOIN ALMACEN alm
        ON alm.IDCIGARRILLO = cig.IDCIGARRILLO
        WHERE (ven.NUMVENTA < amountp) AND (ven.NUMFISCAL = numestp)
        GROUP BY cig.MARCA;

        a_comment VARCHAR2(200) :='deleted: ';
 BEGIN
    OPEN ventas_menores;
    FETCH ventas_menores INTO marcaIdp;
        WHILE ventas_menores%FOUND LOOP
        DELETE FROM ALMACEN
        WHERE cigarrilloIdp = IDCIGARRILLO;
        DBMS_OUTPUT.PUT_LINE(a_comment || amountp);
    END LOOP;
 END procVentas_Menores;