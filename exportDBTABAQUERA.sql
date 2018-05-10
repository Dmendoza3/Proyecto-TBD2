--------------------------------------------------------
--  File created - Thursday-May-10-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ALMACEN
--------------------------------------------------------

  CREATE TABLE "LANA"."ALMACEN" 
   (	"IDALMACEN" NUMBER(*,0), 
	"EXISTENCIA" NUMBER(*,0), 
	"IDCIGARRILLO" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CIGARRILLO
--------------------------------------------------------

  CREATE TABLE "LANA"."CIGARRILLO" 
   (	"IDCIGARRILLO" NUMBER(*,0), 
	"CONTAMINANTE" NUMBER(*,0), 
	"FILTRO" NUMBER(*,0), 
	"HOJA" NUMBER(*,0), 
	"IDMARCA" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table COMPRA
--------------------------------------------------------

  CREATE TABLE "LANA"."COMPRA" 
   (	"NUMCOMPRA" NUMBER(*,0), 
	"FECHAC" DATE, 
	"PRECIOCOMPRA" FLOAT(126), 
	"CANTIDAD" NUMBER(*,0), 
	"IDALMACEN" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table ESTANCO
--------------------------------------------------------

  CREATE TABLE "LANA"."ESTANCO" 
   (	"NUMEXP" NUMBER(*,0), 
	"NUMFISCAL" NUMBER(*,0), 
	"NOMBRE" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table FABRICANTE
--------------------------------------------------------

  CREATE TABLE "LANA"."FABRICANTE" 
   (	"IDFABRICANTE" NUMBER(*,0), 
	"NOMBRE" VARCHAR2(50 BYTE), 
	"PAIS" VARCHAR2(30 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table LOCAL_TB
--------------------------------------------------------

  CREATE TABLE "LANA"."LOCAL_TB" 
   (	"NUMLOCALIDAD" NUMBER(*,0), 
	"NUMEXP" NUMBER(*,0), 
	"LOCAL" VARCHAR2(55 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table MARCA
--------------------------------------------------------

  CREATE TABLE "LANA"."MARCA" 
   (	"IDMARCA" NUMBER(*,0), 
	"NOMBREM" VARCHAR2(20 BYTE), 
	"IDFABRICANTE" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PEDIDO
--------------------------------------------------------

  CREATE TABLE "LANA"."PEDIDO" 
   (	"IDPEDIDO" NUMBER(*,0), 
	"IDALMACEN" NUMBER(*,0), 
	"NUMEXP" NUMBER(*,0), 
	"CANTIDAD" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table VENTA
--------------------------------------------------------

  CREATE TABLE "LANA"."VENTA" 
   (	"NUMVENTA" NUMBER(*,0), 
	"NUMEXP" NUMBER(*,0), 
	"IDALMACEN" NUMBER(*,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into LANA.ALMACEN
SET DEFINE OFF;
REM INSERTING into LANA.CIGARRILLO
SET DEFINE OFF;
REM INSERTING into LANA.COMPRA
SET DEFINE OFF;
REM INSERTING into LANA.ESTANCO
SET DEFINE OFF;
REM INSERTING into LANA.FABRICANTE
SET DEFINE OFF;
REM INSERTING into LANA.LOCAL_TB
SET DEFINE OFF;
REM INSERTING into LANA.MARCA
SET DEFINE OFF;
REM INSERTING into LANA.PEDIDO
SET DEFINE OFF;
REM INSERTING into LANA.VENTA
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index CIGARRILLO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."CIGARRILLO_PK" ON "LANA"."CIGARRILLO" ("IDCIGARRILLO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index FABRICANTE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."FABRICANTE_PK" ON "LANA"."FABRICANTE" ("IDFABRICANTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index COMPRAS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."COMPRAS_PK" ON "LANA"."COMPRA" ("NUMCOMPRA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index LOCAL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."LOCAL_PK" ON "LANA"."LOCAL_TB" ("NUMLOCALIDAD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PEDIDO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."PEDIDO_PK" ON "LANA"."PEDIDO" ("IDPEDIDO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index VENTAS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."VENTAS_PK" ON "LANA"."VENTA" ("NUMVENTA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TABLE1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."TABLE1_PK" ON "LANA"."MARCA" ("IDMARCA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ALMACEN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."ALMACEN_PK" ON "LANA"."ALMACEN" ("IDALMACEN") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ESTANCOS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."ESTANCOS_PK" ON "LANA"."ESTANCO" ("NUMEXP") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Procedure INSERTCIGARRILLO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTCIGARRILLO" 
 (contaminante_p IN NUMBER, filtro_p IN NUMBER, hoja_p IN NUMBER, idmarca_p IN NUMBER) AS
    lastCigarrilloId NUMBER;
 BEGIN
    SELECT IDCIGARRILLO
    INTO lastCigarrilloId
    FROM CIGARRILLO
    WHERE IDCIGARRILLO = (select max(IDCIGARRILLO) from CIGARRILLO);
    INSERT INTO CIGARRILLO(IDCIGARRILLO, CONTAMINANTE, FILTRO, HOJA, IDMARCA) VALUES (lastCigarrilloId + 1, contaminante_p,
                            filtro_p, hoja_p, idmarca_p);
 END insertCigarrillo;

/
--------------------------------------------------------
--  DDL for Procedure INSERTCOMPRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTCOMPRA" 
 (fechac_p IN DATE, preciocompra_p IN FLOAT, cantidad_p IN NUMBER, idalmacen_p IN NUMBER) AS
    lastCompraId NUMBER;
 BEGIN
    SELECT NUMCOMPRA
    INTO lastCompraId
    FROM COMPRA
    WHERE NUMCOMPRA = (select max(NUMCOMPRA) from COMPRA);
    INSERT INTO COMPRA(NUMCOMPRA, FECHAC, PRECIOCOMPRA, CANTIDAD, IDALMACEN) VALUES (lastCompraId + 1, fechac_p, preciocompra_p,
                    cantidad_p, idalmacen_p);
 END insertCompra;

/
--------------------------------------------------------
--  DDL for Procedure INSERTESTANCO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTESTANCO" 
 (numfiscal_p IN NUMBER, nombre_p IN VARCHAR2) AS
    lastEstancoId NUMBER;
 BEGIN
    SELECT NUMEXP
    INTO lastEstancoId
    FROM ESTANCO
    WHERE NUMEXP = (select max(NUMEXP) from ESTANCO);
    INSERT INTO ESTANCO(NUMEXP, NUMFISCAL, NOMBRE) VALUES(lastEstancoId + 1, numfiscal_p, nombre_p);
 END insertEstanco;

/
--------------------------------------------------------
--  DDL for Procedure INSERTFABRICANTE
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTFABRICANTE" 
(nombre_p IN VARCHAR2, pais_p IN VARCHAR2) AS 

   lastFabricanteId NUMBER;
 BEGIN
    SELECT IDFABRICANTE
    INTO lastFabricanteId
    FROM FABRICANTE
    WHERE IDFABRICANTE = (select max(IDFABRICANTE) from FABRICANTE);
    INSERT INTO FABRICANTE(IDFABRICANTE, NOMBRE, PAIS) VALUES(lastFabricanteId + 1, nombre_p, pais_p);
 END insertFabricante;

/
--------------------------------------------------------
--  DDL for Procedure INSERTLOCALTB
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTLOCALTB" 
 (numexp_p IN NUMBER, local_p IN VARCHAR2) AS
    lastNumLocalidad NUMBER;
 BEGIN
    SELECT NUMLOCALIDAD
    INTO lastNumLocalidad
    FROM LOCAL_TB
    WHERE NUMLOCALIDAD = (select max(NUMLOCALIDAD) from LOCAL_TB);
    INSERT INTO LOCAL_TB(NUMLOCALIDAD, NUMEXP, LOCAL) VALUES(lastNumLocalidad + 1, numexp_p, local_p);
 END insertLocalTB;

/
--------------------------------------------------------
--  DDL for Procedure INSERTMARCA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTMARCA" 
 (idFabricante_p IN NUMBER, nombreM_p IN VARCHAR2) AS
    lastMarcaId NUMBER;
 BEGIN
    SELECT IDMARCA
    INTO lastMarcaID
    FROM MARCA
    WHERE IDMARCA = (select max(IDMARCA) from MARCA);
    INSERT INTO MARCA(IDMARCA, NOMBREM, IDFABRICANTE) VALUES(lastMarcaID + 1, nombreM_p, idFabricante_p);
 END insertMarca;

/
--------------------------------------------------------
--  DDL for Procedure INSERTPEDIDO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTPEDIDO" 
 (idalmacenp IN NUMBER, numexpp IN NUMBER, cantidadp IN NUMBER) AS
    lastPedidoId NUMBER;
 BEGIN
    SELECT IDPEDIDO
    INTO lastPedidoId
    FROM PEDIDO
    WHERE IDPEDIDO = (select max(IDPEDIDO) from PEDIDO);
    INSERT INTO PEDIDO(IDPEDIDO, IDALMACEN, NUMEXP, CANTIDAD) VALUES(lastPedidoId + 1, idalmacenp, numexpp, cantidadp);
 END insertPedido;

/
--------------------------------------------------------
--  DDL for Procedure INSERTVENTA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."INSERTVENTA" 
 (numexpp IN NUMBER, idalmacenp IN NUMBER) AS
    lastVentaId NUMBER;
 BEGIN
    SELECT NUMVENTA
    INTO lastVentaId
    FROM VENTA
    WHERE NUMVENTA = (select max(NUMVENTA) from VENTA);
    INSERT INTO VENTA(NUMVENTA, NUMEXP, IDALMACEN) VALUES(lastVentaId + 1, numexpp, idalmacenp);
 END insertVenta;

/
--------------------------------------------------------
--  DDL for Procedure PROCVENTAS_MENORES
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "LANA"."PROCVENTAS_MENORES" 

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

/
--------------------------------------------------------
--  Constraints for Table CIGARRILLO
--------------------------------------------------------

  ALTER TABLE "LANA"."CIGARRILLO" MODIFY ("IDCIGARRILLO" NOT NULL ENABLE);
  ALTER TABLE "LANA"."CIGARRILLO" ADD CONSTRAINT "CIGARRILLO_PK" PRIMARY KEY ("IDCIGARRILLO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table LOCAL_TB
--------------------------------------------------------

  ALTER TABLE "LANA"."LOCAL_TB" ADD CONSTRAINT "LOCAL_PK" PRIMARY KEY ("NUMLOCALIDAD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "LANA"."LOCAL_TB" MODIFY ("NUMLOCALIDAD" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table COMPRA
--------------------------------------------------------

  ALTER TABLE "LANA"."COMPRA" MODIFY ("NUMCOMPRA" NOT NULL ENABLE);
  ALTER TABLE "LANA"."COMPRA" ADD CONSTRAINT "COMPRAS_PK" PRIMARY KEY ("NUMCOMPRA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table VENTA
--------------------------------------------------------

  ALTER TABLE "LANA"."VENTA" MODIFY ("NUMVENTA" NOT NULL ENABLE);
  ALTER TABLE "LANA"."VENTA" ADD CONSTRAINT "VENTAS_PK" PRIMARY KEY ("NUMVENTA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ESTANCO
--------------------------------------------------------

  ALTER TABLE "LANA"."ESTANCO" MODIFY ("NUMEXP" NOT NULL ENABLE);
  ALTER TABLE "LANA"."ESTANCO" ADD CONSTRAINT "ESTANCOS_PK" PRIMARY KEY ("NUMEXP")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table MARCA
--------------------------------------------------------

  ALTER TABLE "LANA"."MARCA" MODIFY ("IDMARCA" NOT NULL ENABLE);
  ALTER TABLE "LANA"."MARCA" ADD CONSTRAINT "TABLE1_PK" PRIMARY KEY ("IDMARCA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table FABRICANTE
--------------------------------------------------------

  ALTER TABLE "LANA"."FABRICANTE" MODIFY ("IDFABRICANTE" NOT NULL ENABLE);
  ALTER TABLE "LANA"."FABRICANTE" ADD CONSTRAINT "FABRICANTE_PK" PRIMARY KEY ("IDFABRICANTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ALMACEN
--------------------------------------------------------

  ALTER TABLE "LANA"."ALMACEN" MODIFY ("IDALMACEN" NOT NULL ENABLE);
  ALTER TABLE "LANA"."ALMACEN" ADD CONSTRAINT "ALMACEN_PK" PRIMARY KEY ("IDALMACEN")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PEDIDO
--------------------------------------------------------

  ALTER TABLE "LANA"."PEDIDO" ADD CONSTRAINT "PEDIDO_PK" PRIMARY KEY ("IDPEDIDO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "LANA"."PEDIDO" MODIFY ("IDPEDIDO" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table ALMACEN
--------------------------------------------------------

  ALTER TABLE "LANA"."ALMACEN" ADD CONSTRAINT "FK_IDCIGARRILLO" FOREIGN KEY ("IDCIGARRILLO")
	  REFERENCES "LANA"."CIGARRILLO" ("IDCIGARRILLO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CIGARRILLO
--------------------------------------------------------

  ALTER TABLE "LANA"."CIGARRILLO" ADD CONSTRAINT "FK_IDMARCA" FOREIGN KEY ("IDMARCA")
	  REFERENCES "LANA"."MARCA" ("IDMARCA") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table LOCAL_TB
--------------------------------------------------------

  ALTER TABLE "LANA"."LOCAL_TB" ADD CONSTRAINT "FK_NUMEXP" FOREIGN KEY ("NUMEXP")
	  REFERENCES "LANA"."ESTANCO" ("NUMEXP") ENABLE;
