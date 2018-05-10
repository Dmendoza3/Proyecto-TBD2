CREATE OR REPLACE PROCEDURE procVentas_Menores

/*Procedimiento para obtener las marcas de cigarrillos para los cuales se hayan vendido menos de una determinada
cantidad (primer parametro de procedimiento), eliminando todas estas marcas en el almacén de un determinado estanco,
cuyo NIF constituye el segundo parámetro del procedimiento.*/

 (amountp IN NUMBER, numestp IN NUMBER) AS
    marcaIdp MARCA.IDMARCA%TYPE;
    CURSOR ventas_menores IS
        SELECT m.IDMARCA
        FROM MARCA m
        INNER JOIN CIGARRILLO cig
        ON m.IDMARCA = cig.IDMARCA
        INNER JOIN ALMACEN alm
        ON cig.IDCIGARRILLO = alm.IDCIGARRILLO
        INNER JOIN COMPRA purchase
        ON alm.IDALMACEN = purchase.IDALMACEN
        WHERE purchase.CANTIDAD < amountp;

        a_comment VARCHAR2(200) :='deleted: ';
 BEGIN
    OPEN ventas_menores;
    LOOP
        FETCH ventas_menores INTO marcaIdp;
        EXIT WHEN ventas_menores%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE(a_comment || amountp);
    END LOOP;
 END procVentas_Menores;
