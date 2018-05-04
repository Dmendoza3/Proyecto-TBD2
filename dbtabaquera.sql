--------------------------------------------------------
--  File created - Friday-May-04-2018   
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
	"COLUMN1" NUMBER(*,0), 
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
--  DDL for Table LOCAL
--------------------------------------------------------

  CREATE TABLE "LANA"."LOCAL" 
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
REM INSERTING into LANA.LOCAL
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

  CREATE UNIQUE INDEX "LANA"."LOCAL_PK" ON "LANA"."LOCAL" ("NUMLOCALIDAD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PEDIDO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LANA"."PEDIDO_PK" ON "LANA"."PEDIDO" ("IDPEDIDO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
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
--  Constraints for Table CIGARRILLO
--------------------------------------------------------

  ALTER TABLE "LANA"."CIGARRILLO" MODIFY ("IDCIGARRILLO" NOT NULL ENABLE);
  ALTER TABLE "LANA"."CIGARRILLO" ADD CONSTRAINT "CIGARRILLO_PK" PRIMARY KEY ("IDCIGARRILLO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
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
--  Constraints for Table LOCAL
--------------------------------------------------------

  ALTER TABLE "LANA"."LOCAL" ADD CONSTRAINT "LOCAL_PK" PRIMARY KEY ("NUMLOCALIDAD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "LANA"."LOCAL" MODIFY ("NUMLOCALIDAD" NOT NULL ENABLE);
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
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "LANA"."PEDIDO" MODIFY ("IDPEDIDO" NOT NULL ENABLE);
