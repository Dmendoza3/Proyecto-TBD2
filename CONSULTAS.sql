--queries

/*PRIMER CONSULTA
	Obtener todas las marcas de cigarrillos extranjeros
*/
SELECT man.MARCA, fab.PAIS
FROM MANUFACTURA man
INNER JOIN FABRICANTE fab
ON fab.IDFABRICANTE=man.IDFABRICANTE
WHERE (fab.PAIS != 'Espa?a')
Group by man.MARCA;

/*SEGUNDA CONSULTA
	Obtener el valor de todas las compras realizadas por el estanco '11111' de la marca 'Camel'
	desde el año 1996 hasta la fecha.
*/

SELECT SUM(com.CANTIDAD)
FROM COMPRA com
INNER JOIN Cigarrillo cig
ON cig.IDCIGARRILLO=com.IDCIGARRILLO
WHERE (FECHAC >= to_date('1.1.' || 1996, 'DD.MM.YYYY')
  		and com.NUMFISCAL='11111' and cig.MARCA='Camel');

/*3RA CONSULTA
	Obtener el valor de todas las ventas de la marca 'Ducados' que han realizado los estancos de la
	provincia de Madrid.

*/
SELECT SUM(ven.PRECIOVENTA) FROM VENTA ven INNER JOIN Cigarrillo cig ON cig.IDCIGARRILLO=ven.IDCIGARRILLO INNER JOIN Manufactura man ON cig.MARCA=man.MARCA INNER JOIN ESTANCO est ON est.NUMFISCAL = ven.NUMFISCAL WHERE (cig.MARCA = 'Ducados' AND est.PROVINCIA = 'Madrid');

/*4TA CONSULTA
	Obtener la marca de cigarrillos estadounidense que vende más
	cigarrillos
*/
SELECT cig.MARCA, MAX(ven.CANTIDAD)
FROM CIGARRILLO cig
INNER JOIN MANUFACTURA man
ON cig.MARCA = man.MARCA
INNER JOIN FABRICANTE fab
ON fab.IDFABRICANTE = man.IDFABRICANTE
INNER JOIN VENTA ven
ON cig.IDCIGARRILLO = ven.IDCIGARRILLO
WHERE (fab.PAIS = 'USA')
GROUP BY cig.MARCA, ven.CANTIDAD
ORDER BY ven.CANTIDAD DESC;

/*5th
	Obtener los ingresos por ventas de la marca ‘winston’ el 22 de agosto de 1995
*/
SELECT SUM(ven.PRECIOVENTA) FROM Cigarrillo cig INNER JOIN Venta ven ON cig.IDCIGARRILLO = ven.IDCIGARRILLO WHERE (ven.FECHAV = '1996-22-08' AND cig.Marca = 'Winston');

/*6th
	
*/
ALTER TABLE CIGARRILLO
    ADD (MED_CALIDAD NUMBER);

/*7th
	nop
*/


/*8va ya está hecha, (trigger)
*/

/*9th*/

SELECT est.numFiscal, est.nombre
FROM Estanco est
INNER JOIN Almacen alm
ON alm.numFiscal=est.numFiscal
INNER JOIN CIGARRILLO cig
ON alm.idCigarrillo=cig.idCigarrillo
WHERE (cig.Marca != 'Winston' AND cig.mentolado = 0 AND cig.Marca = 'Celtas' AND cig.filtro = 0);