/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.tbd2;

import Conexion.Conexion;
import Entidades.*;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author Dario
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm1
     */
    public MainForm() {
        initComponents();
       
        //Edit frames
        Color frameBg = new Color(255, 0, 0);
        addPanel.setBackground(frameBg);
        jPanel1.setBackground(frameBg);
        jPanel12.setBackground(frameBg);
        jPanel13.setBackground(frameBg);
        jPanel2.setBackground(frameBg);
        jPanel3.setBackground(frameBg);
        jPanel4.setBackground(frameBg);
        jPanel5.setBackground(frameBg);
        jPanel6.setBackground(frameBg);
        jPanel7.setBackground(frameBg);
        jPanel8.setBackground(frameBg);
        jPanel9.setBackground(frameBg);
        
        
        //JLabels
        Color foreLabel = new Color(255,255,0);
        jLabel1.setForeground(foreLabel);
        jLabel10.setForeground(foreLabel);
        jLabel100.setForeground(foreLabel);
        jLabel101.setForeground(foreLabel);
        jLabel102.setForeground(foreLabel);
        jLabel103.setForeground(foreLabel);
        jLabel104.setForeground(foreLabel);
        jLabel105.setForeground(foreLabel);
        jLabel106.setForeground(foreLabel);
        jLabel107.setForeground(foreLabel);
        jLabel108.setForeground(foreLabel);
        jLabel109.setForeground(foreLabel);
        jLabel11.setForeground(foreLabel);
        jLabel110.setForeground(foreLabel);
        jLabel111.setForeground(foreLabel);
        jLabel112.setForeground(foreLabel);
        jLabel113.setForeground(foreLabel);
        jLabel114.setForeground(foreLabel);
        jLabel115.setForeground(foreLabel);
        jLabel116.setForeground(foreLabel);
        jLabel117.setForeground(foreLabel);
        jLabel118.setForeground(foreLabel);
        jLabel119.setForeground(foreLabel);
        jLabel12.setForeground(foreLabel);
        jLabel120.setForeground(foreLabel);
        jLabel121.setForeground(foreLabel);
        jLabel122.setForeground(foreLabel);
        jLabel123.setForeground(foreLabel);
        jLabel124.setForeground(foreLabel);
        jLabel125.setForeground(foreLabel);
        jLabel126.setForeground(foreLabel);
        jLabel127.setForeground(foreLabel);
        jLabel128.setForeground(foreLabel);
        jLabel129.setForeground(foreLabel);
        jLabel13.setForeground(foreLabel);
        jLabel131.setForeground(foreLabel);
        jLabel132.setForeground(foreLabel);
        jLabel133.setForeground(foreLabel);
        jLabel134.setForeground(foreLabel);
        jLabel14.setForeground(foreLabel);
        jLabel16.setForeground(foreLabel);
        jLabel17.setForeground(foreLabel);
        jLabel18.setForeground(foreLabel);
        jLabel19.setForeground(foreLabel);
        jLabel2.setForeground(foreLabel);
        jLabel20.setForeground(foreLabel);
        jLabel21.setForeground(foreLabel);
        jLabel22.setForeground(foreLabel);
        jLabel23.setForeground(foreLabel);
        jLabel24.setForeground(foreLabel);
        jLabel25.setForeground(foreLabel);
        jLabel26.setForeground(foreLabel);
        jLabel29.setForeground(foreLabel);
        jLabel3.setForeground(foreLabel);
        jLabel30.setForeground(foreLabel);
        jLabel31.setForeground(foreLabel);
        jLabel32.setForeground(foreLabel);
        jLabel33.setForeground(foreLabel);
        jLabel34.setForeground(foreLabel);
        jLabel35.setForeground(foreLabel);
        jLabel36.setForeground(foreLabel);
        jLabel37.setForeground(foreLabel);
        jLabel38.setForeground(foreLabel);
        jLabel39.setForeground(foreLabel);
        jLabel4.setForeground(foreLabel);
        jLabel40.setForeground(foreLabel);
        jLabel41.setForeground(foreLabel);
        jLabel42.setForeground(foreLabel);
        jLabel5.setForeground(foreLabel);
        jLabel6.setForeground(foreLabel);
        jLabel7.setForeground(foreLabel);
        jLabel8.setForeground(foreLabel);
        jLabel86.setForeground(foreLabel);
        jLabel87.setForeground(foreLabel);
        jLabel88.setForeground(foreLabel);
        jLabel89.setForeground(foreLabel);
        jLabel9.setForeground(foreLabel);
        jLabel90.setForeground(foreLabel);
        jLabel91.setForeground(foreLabel);
        jLabel92.setForeground(foreLabel);
        jLabel93.setForeground(foreLabel);
        jLabel94.setForeground(foreLabel);
        jLabel95.setForeground(foreLabel);
        jLabel97.setForeground(foreLabel);
        jLabel98.setForeground(foreLabel);
        jLabel99.setForeground(foreLabel);
        
        //JFrame
        Color bgFrame = new Color(255, 0, 0);
        createAlmacen.setBackground(bgFrame);
        createCigarrillo.setBackground(bgFrame);
        createCompra.setBackground(bgFrame);
        createEstancos.setBackground(bgFrame);
        createFabricante.setBackground(bgFrame);
        createManufacturera.setBackground(bgFrame);
        createVenta.setBackground(bgFrame);
        updateAlmacen.setBackground(bgFrame);
        updateCigarrillo.setBackground(bgFrame);
        updateCompras.setBackground(bgFrame);
        updateEstancos.setBackground(bgFrame);
        updateFabricante.setBackground(bgFrame);
        updateManufacturera.setBackground(bgFrame);
        updateVentas.setBackground(bgFrame);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAlmacen = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        agregarAlmacenBtn = new javax.swing.JButton();
        idAlmacenATxt = new javax.swing.JTextField();
        idCigarrilloATxt = new javax.swing.JTextField();
        exitenciaASpn = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        nifEstancoATxt1 = new javax.swing.JTextField();
        createCigarrillo = new javax.swing.JFrame();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        marcaCTxt = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        ContaminanteCCmb = new javax.swing.JComboBox<>();
        FiltroCChk = new javax.swing.JCheckBox();
        MentoladoCChk = new javax.swing.JCheckBox();
        Hoja1CRdo = new javax.swing.JRadioButton();
        Hoja2CRDo = new javax.swing.JRadioButton();
        createCompra = new javax.swing.JFrame();
        fechaCoTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        idAlmacenCoTxt = new javax.swing.JTextField();
        precioCoSpn = new javax.swing.JSpinner();
        cantidadCoSpn = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        nifEstancoCoTxt1 = new javax.swing.JTextField();
        createEstancos = new javax.swing.JFrame();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        agregarEstancoBtn = new javax.swing.JButton();
        numExpendioEsTxt = new javax.swing.JTextField();
        numFiscalEsTxt = new javax.swing.JTextField();
        nombreEsTxt = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        localEsTxt = new javax.swing.JTextField();
        createFabricante = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idFabricanteFTxt = new javax.swing.JTextField();
        nombreFabricanteFTxt = new javax.swing.JTextField();
        paisFTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agregarFabricanteBtn = new javax.swing.JButton();
        createVenta = new javax.swing.JFrame();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        agregarVentaBtn = new javax.swing.JButton();
        numVentaVTxt = new javax.swing.JTextField();
        numExpendioVTxt = new javax.swing.JTextField();
        idCigarrilloVTxt = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        precioVentaVSpn = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        fechaVTxt = new javax.swing.JTextField();
        cantidadVSpn = new javax.swing.JSpinner();
        createManufacturera = new javax.swing.JFrame();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        agregarManufactureraBtn = new javax.swing.JButton();
        cartonManSpn1 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        embalajeManSpn2 = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        idFabricanteManTxt = new javax.swing.JTextField();
        updateAlmacen = new javax.swing.JFrame();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        agregarAlmacenBtn1 = new javax.swing.JButton();
        idAlmacenATxtMod = new javax.swing.JTextField();
        idCigarrilloATxtMod = new javax.swing.JTextField();
        exitenciaASpnMod = new javax.swing.JSpinner();
        jLabel94 = new javax.swing.JLabel();
        nifEstancoATxtMod = new javax.swing.JTextField();
        updateCigarrillo = new javax.swing.JFrame();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        idCigarrilloCTxtMod = new javax.swing.JTextField();
        marcaCTxtMod = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        ContaminanteCCmbMod = new javax.swing.JComboBox<>();
        FiltroCChkMod = new javax.swing.JCheckBox();
        MentoladoCChkMod = new javax.swing.JCheckBox();
        Hoja1CRdoMod = new javax.swing.JRadioButton();
        Hoja2CRDoMod = new javax.swing.JRadioButton();
        jLabel105 = new javax.swing.JLabel();
        idFabricanteCTxtMod = new javax.swing.JTextField();
        updateCompras = new javax.swing.JFrame();
        jLabel106 = new javax.swing.JLabel();
        fechaCoTxtMod = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        numCompraCoTxtMod = new javax.swing.JTextField();
        idCigarrilloCoTxtMod = new javax.swing.JTextField();
        precioCoSpnMod = new javax.swing.JSpinner();
        cantidadCoSpnMod = new javax.swing.JSpinner();
        jLabel112 = new javax.swing.JLabel();
        nifEstancoCoTxtMod = new javax.swing.JTextField();
        updateEstancos = new javax.swing.JFrame();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        agregarEstancoBtnMod = new javax.swing.JButton();
        numExpendioEsTxtMod = new javax.swing.JTextField();
        numFiscalEsTxtMod = new javax.swing.JTextField();
        nombreEsTxtMod = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        localEsTxtMod = new javax.swing.JTextField();
        updateFabricante = new javax.swing.JFrame();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        idFabricanteFTxtMod = new javax.swing.JTextField();
        nombreFabricanteFTxtMod = new javax.swing.JTextField();
        paisFTxtMod = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        agregarFabricanteBtnMod = new javax.swing.JButton();
        updateVentas = new javax.swing.JFrame();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        agregarVentaBtn1 = new javax.swing.JButton();
        numVentaVTxtMod = new javax.swing.JTextField();
        numExpendioVTxtMod = new javax.swing.JTextField();
        idCigarrilloVTxtMod = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        precioVentaVSpnMod = new javax.swing.JSpinner();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        fechaVTxtMod = new javax.swing.JTextField();
        cantidadVSpnMod = new javax.swing.JSpinner();
        updateManufacturera = new javax.swing.JFrame();
        jLabel129 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        agregarManufactureraBtnMod = new javax.swing.JButton();
        idManufacturaManTxtMod = new javax.swing.JTextField();
        cartonManSpnMod = new javax.swing.JSpinner();
        jLabel133 = new javax.swing.JLabel();
        embalajeManSpnMod = new javax.swing.JSpinner();
        jLabel134 = new javax.swing.JLabel();
        idFabricanteManTxtMod = new javax.swing.JTextField();
        Hoja = new javax.swing.ButtonGroup();
        tablaEliminar = new javax.swing.ButtonGroup();
        tabPanel = new javax.swing.JTabbedPane();
        addPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarProc1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnBuscarProc3 = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscarProc4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnBuscarProc5 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        btnBuscaProc2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnBuscarProc9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        fabricanteRd = new javax.swing.JRadioButton();
        cigarrillosRd = new javax.swing.JRadioButton();
        comprasRd = new javax.swing.JRadioButton();
        almacenRd = new javax.swing.JRadioButton();
        ventasRd = new javax.swing.JRadioButton();
        estancosRd = new javax.swing.JRadioButton();
        manufactureraRd = new javax.swing.JRadioButton();
        jButton36 = new javax.swing.JButton();
        delId = new javax.swing.JTextField();

        createAlmacen.setTitle("Agregar Almacen");

        jLabel8.setText("Id del almacen");

        jLabel9.setText("Id del cigarrillo");

        jLabel10.setText("Existencia");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Agregar Almacen");

        agregarAlmacenBtn.setText("Agregar");
        agregarAlmacenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarAlmacenBtnMouseClicked(evt);
            }
        });

        exitenciaASpn.setModel(new javax.swing.SpinnerNumberModel());

        jLabel14.setText("nif Estanco");

        javax.swing.GroupLayout createAlmacenLayout = new javax.swing.GroupLayout(createAlmacen.getContentPane());
        createAlmacen.getContentPane().setLayout(createAlmacenLayout);
        createAlmacenLayout.setHorizontalGroup(
            createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAlmacenLayout.createSequentialGroup()
                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAlmacenLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(createAlmacenLayout.createSequentialGroup()
                                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createAlmacenLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idCigarrilloATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idAlmacenATxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAlmacenLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitenciaASpn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(createAlmacenLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nifEstancoATxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(createAlmacenLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(agregarAlmacenBtn)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAlmacenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(108, 108, 108))
        );
        createAlmacenLayout.setVerticalGroup(
            createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAlmacenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idAlmacenATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idCigarrilloATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(exitenciaASpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nifEstancoATxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(agregarAlmacenBtn)
                .addGap(18, 18, 18))
        );

        createCigarrillo.setTitle("Agregar Fabricantes");

        jLabel86.setText("Marca");

        jLabel87.setText("Contaminante");

        jLabel88.setText("Filtro");

        jLabel89.setText("Mentolado");

        jLabel90.setText("Hoja");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel91.setText("Agregar Cigarrillos");

        jButton31.setText("Agregar");
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton31MouseClicked(evt);
            }
        });

        ContaminanteCCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Light", "Super Light", "Ultra Light" }));

        FiltroCChk.setText("Tiene filtro");

        MentoladoCChk.setText("Es mentolado");

        Hoja.add(Hoja1CRdo);
        Hoja1CRdo.setText("Rubia");

        Hoja.add(Hoja2CRDo);
        Hoja2CRDo.setText("jRadioButton2");

        javax.swing.GroupLayout createCigarrilloLayout = new javax.swing.GroupLayout(createCigarrillo.getContentPane());
        createCigarrillo.getContentPane().setLayout(createCigarrilloLayout);
        createCigarrilloLayout.setHorizontalGroup(
            createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createCigarrilloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel91)
                .addGap(94, 94, 94))
            .addGroup(createCigarrilloLayout.createSequentialGroup()
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCigarrilloLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89))
                        .addGap(2, 2, 2)
                        .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createCigarrilloLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marcaCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ContaminanteCCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FiltroCChk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MentoladoCChk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(createCigarrilloLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Hoja1CRdo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Hoja2CRDo))))
                    .addGroup(createCigarrilloLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton31)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        createCigarrilloLayout.setVerticalGroup(
            createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createCigarrilloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91)
                .addGap(59, 59, 59)
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(marcaCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(ContaminanteCCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(FiltroCChk))
                .addGap(7, 7, 7)
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89)
                    .addComponent(MentoladoCChk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90)
                    .addGroup(createCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hoja1CRdo)
                        .addComponent(Hoja2CRDo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton31)
                .addGap(21, 21, 21))
        );

        createCompra.setTitle("Agregar Compras");

        jLabel16.setText("Id de cigarrillo");

        jLabel17.setText("Precio de Compra");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Agregar Compra");

        jLabel19.setText("Cantidad");

        jButton9.setText("Agregar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jLabel20.setText("Fecha");

        precioCoSpn.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        cantidadCoSpn.setModel(new javax.swing.SpinnerNumberModel());

        jLabel21.setText("nif Estanco");

        javax.swing.GroupLayout createCompraLayout = new javax.swing.GroupLayout(createCompra.getContentPane());
        createCompra.getContentPane().setLayout(createCompraLayout);
        createCompraLayout.setHorizontalGroup(
            createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createCompraLayout.createSequentialGroup()
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createCompraLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton9))
                    .addGroup(createCompraLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel18))
                    .addGroup(createCompraLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(6, 6, 6)
                        .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createCompraLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaCoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nifEstancoCoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createCompraLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioCoSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCoSpn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idAlmacenCoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(createCompraLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel21)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        createCompraLayout.setVerticalGroup(
            createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(idAlmacenCoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(precioCoSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cantidadCoSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(fechaCoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(nifEstancoCoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton9)
                .addGap(18, 18, 18))
        );

        createEstancos.setTitle("Agregar Estancos");

        jLabel36.setText("Numero de expendio");

        jLabel37.setText("Numero Fiscal");

        jLabel38.setText("Nombre");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel39.setText("Agregar Estanco");

        agregarEstancoBtn.setText("Agregar");
        agregarEstancoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarEstancoBtnMouseClicked(evt);
            }
        });

        jLabel40.setText("Local");

        javax.swing.GroupLayout createEstancosLayout = new javax.swing.GroupLayout(createEstancos.getContentPane());
        createEstancos.getContentPane().setLayout(createEstancosLayout);
        createEstancosLayout.setHorizontalGroup(
            createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createEstancosLayout.createSequentialGroup()
                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createEstancosLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(agregarEstancoBtn))
                    .addGroup(createEstancosLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel39))
                    .addGroup(createEstancosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(createEstancosLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(localEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createEstancosLayout.createSequentialGroup()
                                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel38))
                                .addGap(63, 63, 63)
                                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numFiscalEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numExpendioEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        createEstancosLayout.setVerticalGroup(
            createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createEstancosLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(numExpendioEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(numFiscalEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(nombreEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(createEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(localEsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarEstancoBtn)
                .addContainerGap())
        );

        createFabricante.setTitle("Agregar Fabricantes");

        jLabel1.setText("Id Fabricante");

        jLabel2.setText("Nombre Fabricante");

        jLabel3.setText("Pais");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Agregar Fabricante");

        agregarFabricanteBtn.setText("Agregar");
        agregarFabricanteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarFabricanteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout createFabricanteLayout = new javax.swing.GroupLayout(createFabricante.getContentPane());
        createFabricante.getContentPane().setLayout(createFabricanteLayout);
        createFabricanteLayout.setHorizontalGroup(
            createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createFabricanteLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFabricanteLayout.createSequentialGroup()
                        .addComponent(agregarFabricanteBtn)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFabricanteLayout.createSequentialGroup()
                        .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(54, 54, 54)
                        .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreFabricanteFTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(idFabricanteFTxt)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFabricanteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(87, 87, 87))))
        );
        createFabricanteLayout.setVerticalGroup(
            createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createFabricanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idFabricanteFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreFabricanteFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(paisFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(agregarFabricanteBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        createVenta.setTitle("Agregar Ventas");

        jLabel22.setText("Numero de Venta");

        jLabel23.setText("Numero de Expendio");

        jLabel24.setText("id de Cigarrillo");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Agregar Venta");

        agregarVentaBtn.setText("Agregar");
        agregarVentaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarVentaBtnMouseClicked(evt);
            }
        });

        jLabel32.setText("precioVenta");

        precioVentaVSpn.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel33.setText("cantidad");

        jLabel34.setText("fecha");

        cantidadVSpn.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout createVentaLayout = new javax.swing.GroupLayout(createVenta.getContentPane());
        createVenta.getContentPane().setLayout(createVentaLayout);
        createVentaLayout.setHorizontalGroup(
            createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createVentaLayout.createSequentialGroup()
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createVentaLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel25))
                    .addGroup(createVentaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createVentaLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(agregarVentaBtn))
                            .addGroup(createVentaLayout.createSequentialGroup()
                                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel24))
                                .addGap(66, 66, 66)
                                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCigarrilloVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numExpendioVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numVentaVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioVentaVSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadVSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        createVentaLayout.setVerticalGroup(
            createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(numVentaVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(numExpendioVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(idCigarrilloVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(precioVentaVSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cantidadVSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(fechaVTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(agregarVentaBtn)
                .addContainerGap())
        );

        createManufacturera.setTitle("Agregar Almacen");

        jLabel29.setText("Carton");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Agregar Manufacturera");

        agregarManufactureraBtn.setText("Agregar");
        agregarManufactureraBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarManufactureraBtnMouseClicked(evt);
            }
        });

        cartonManSpn1.setModel(new javax.swing.SpinnerNumberModel());

        jLabel31.setText("Embalaje");

        embalajeManSpn2.setModel(new javax.swing.SpinnerNumberModel());

        jLabel35.setText("id Fabricante");

        javax.swing.GroupLayout createManufactureraLayout = new javax.swing.GroupLayout(createManufacturera.getContentPane());
        createManufacturera.getContentPane().setLayout(createManufactureraLayout);
        createManufactureraLayout.setHorizontalGroup(
            createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createManufactureraLayout.createSequentialGroup()
                .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createManufactureraLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(embalajeManSpn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createManufactureraLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(39, 39, 39)
                                .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createManufactureraLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(idFabricanteManTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createManufactureraLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cartonManSpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(createManufactureraLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(createManufactureraLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(agregarManufactureraBtn)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        createManufactureraLayout.setVerticalGroup(
            createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createManufactureraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(idFabricanteManTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cartonManSpn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(embalajeManSpn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(agregarManufactureraBtn)
                .addContainerGap())
        );

        updateAlmacen.setTitle("Agregar Almacen");

        jLabel41.setText("Id del almacen");

        jLabel42.setText("Id del cigarrillo");

        jLabel92.setText("Existencia");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel93.setText("Modificar Almacen");

        agregarAlmacenBtn1.setText("Modificar");
        agregarAlmacenBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarAlmacenBtn1MouseClicked(evt);
            }
        });

        exitenciaASpnMod.setModel(new javax.swing.SpinnerNumberModel());

        jLabel94.setText("nif Estanco");

        javax.swing.GroupLayout updateAlmacenLayout = new javax.swing.GroupLayout(updateAlmacen.getContentPane());
        updateAlmacen.getContentPane().setLayout(updateAlmacenLayout);
        updateAlmacenLayout.setHorizontalGroup(
            updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateAlmacenLayout.createSequentialGroup()
                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateAlmacenLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(updateAlmacenLayout.createSequentialGroup()
                                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel92))
                                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(updateAlmacenLayout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(idCigarrilloATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idAlmacenATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateAlmacenLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitenciaASpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(updateAlmacenLayout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nifEstancoATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(updateAlmacenLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(agregarAlmacenBtn1)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateAlmacenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel93)
                .addGap(108, 108, 108))
        );
        updateAlmacenLayout.setVerticalGroup(
            updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateAlmacenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(idAlmacenATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(idCigarrilloATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(exitenciaASpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(nifEstancoATxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(agregarAlmacenBtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateCigarrillo.setTitle("Agregar Fabricantes");

        jLabel97.setText("Id del cigarrillo");

        jLabel98.setText("Marca");

        jLabel99.setText("Contaminante");

        jLabel100.setText("Filtro");

        jLabel102.setText("Mentolado");

        jLabel103.setText("Hoja");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel104.setText("Modificar Cigarrillos");

        jButton34.setText("Modificar");
        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton34MouseClicked(evt);
            }
        });

        ContaminanteCCmbMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Light", "Super Light", "Ultra Light" }));

        FiltroCChkMod.setText("Tiene filtro");

        MentoladoCChkMod.setText("Es mentolado");

        Hoja.add(Hoja1CRdoMod);
        Hoja1CRdoMod.setText("Rubia");

        Hoja.add(Hoja2CRDoMod);
        Hoja2CRDoMod.setText("jRadioButton2");

        jLabel105.setText("idFabricante");

        javax.swing.GroupLayout updateCigarrilloLayout = new javax.swing.GroupLayout(updateCigarrillo.getContentPane());
        updateCigarrillo.getContentPane().setLayout(updateCigarrilloLayout);
        updateCigarrilloLayout.setHorizontalGroup(
            updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateCigarrilloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel104)
                .addGap(94, 94, 94))
            .addGroup(updateCigarrilloLayout.createSequentialGroup()
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateCigarrilloLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateCigarrilloLayout.createSequentialGroup()
                                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel103)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel100)
                                    .addComponent(jLabel102))
                                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(updateCigarrilloLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marcaCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(idCigarrilloCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ContaminanteCCmbMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FiltroCChkMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MentoladoCChkMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(updateCigarrilloLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(Hoja1CRdoMod)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Hoja2CRDoMod))))
                            .addGroup(updateCigarrilloLayout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addGap(70, 70, 70)
                                .addComponent(idFabricanteCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(updateCigarrilloLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton34)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        updateCigarrilloLayout.setVerticalGroup(
            updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateCigarrilloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104)
                .addGap(28, 28, 28)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(idCigarrilloCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(marcaCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(ContaminanteCCmbMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(FiltroCChkMod))
                .addGap(7, 7, 7)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102)
                    .addComponent(MentoladoCChkMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hoja1CRdoMod)
                        .addComponent(Hoja2CRDoMod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateCigarrilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(idFabricanteCTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addGap(21, 21, 21))
        );

        updateCompras.setTitle("Agregar Compras");

        jLabel106.setText("Numero de compra");

        jLabel107.setText("Id de Cigarrillo");

        jLabel108.setText("Precio de Compra");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel109.setText("Modificar Compra");

        jLabel110.setText("Cantidad");

        jButton10.setText("Modificar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jLabel111.setText("Fecha");

        precioCoSpnMod.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        cantidadCoSpnMod.setModel(new javax.swing.SpinnerNumberModel());

        jLabel112.setText("nif Estanco");

        javax.swing.GroupLayout updateComprasLayout = new javax.swing.GroupLayout(updateCompras.getContentPane());
        updateCompras.getContentPane().setLayout(updateComprasLayout);
        updateComprasLayout.setHorizontalGroup(
            updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateComprasLayout.createSequentialGroup()
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateComprasLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jButton10))
                    .addGroup(updateComprasLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel109))
                    .addGroup(updateComprasLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel106)
                            .addComponent(jLabel108)
                            .addComponent(jLabel110)
                            .addComponent(jLabel111))
                        .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateComprasLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numCompraCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nifEstancoCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateComprasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioCoSpnMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCoSpnMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idCigarrilloCoTxtMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(updateComprasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel112)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        updateComprasLayout.setVerticalGroup(
            updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(numCompraCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(idCigarrilloCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(precioCoSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(cantidadCoSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(fechaCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(nifEstancoCoTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButton10)
                .addGap(18, 18, 18))
        );

        updateEstancos.setTitle("Agregar Estancos");

        jLabel113.setText("Numero de expendio");

        jLabel114.setText("Numero Fiscal");

        jLabel115.setText("Nombre");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel116.setText("Modificar Estanco");

        agregarEstancoBtnMod.setText("Modificar");
        agregarEstancoBtnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarEstancoBtnModMouseClicked(evt);
            }
        });

        jLabel117.setText("Local");

        javax.swing.GroupLayout updateEstancosLayout = new javax.swing.GroupLayout(updateEstancos.getContentPane());
        updateEstancos.getContentPane().setLayout(updateEstancosLayout);
        updateEstancosLayout.setHorizontalGroup(
            updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEstancosLayout.createSequentialGroup()
                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateEstancosLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(agregarEstancoBtnMod))
                    .addGroup(updateEstancosLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel116))
                    .addGroup(updateEstancosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(updateEstancosLayout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(localEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateEstancosLayout.createSequentialGroup()
                                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel113)
                                    .addComponent(jLabel115))
                                .addGap(63, 63, 63)
                                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numFiscalEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numExpendioEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        updateEstancosLayout.setVerticalGroup(
            updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateEstancosLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addGap(18, 18, 18)
                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(numExpendioEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(numFiscalEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(nombreEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(updateEstancosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(localEsTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarEstancoBtnMod)
                .addContainerGap())
        );

        updateFabricante.setTitle("Agregar Fabricantes");

        jLabel118.setText("Id Fabricante");

        jLabel119.setText("Nombre Fabricante");

        jLabel120.setText("Pais");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel121.setText("Modificar Fabricante");

        agregarFabricanteBtnMod.setText("Agregar");
        agregarFabricanteBtnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarFabricanteBtnModMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateFabricanteLayout = new javax.swing.GroupLayout(updateFabricante.getContentPane());
        updateFabricante.getContentPane().setLayout(updateFabricanteLayout);
        updateFabricanteLayout.setHorizontalGroup(
            updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateFabricanteLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateFabricanteLayout.createSequentialGroup()
                        .addComponent(agregarFabricanteBtnMod)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateFabricanteLayout.createSequentialGroup()
                        .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jLabel118)
                            .addComponent(jLabel120))
                        .addGap(54, 54, 54)
                        .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisFTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreFabricanteFTxtMod, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(idFabricanteFTxtMod)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateFabricanteLayout.createSequentialGroup()
                        .addComponent(jLabel121)
                        .addGap(87, 87, 87))))
        );
        updateFabricanteLayout.setVerticalGroup(
            updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateFabricanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(idFabricanteFTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(nombreFabricanteFTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(paisFTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(agregarFabricanteBtnMod)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        updateVentas.setTitle("Agregar Ventas");

        jLabel122.setText("Numero de Venta");

        jLabel123.setText("Numero de Expendio");

        jLabel124.setText("id de Cigarrillo");

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel125.setText("Modificar Venta");

        agregarVentaBtn1.setText("Modificar");
        agregarVentaBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarVentaBtn1MouseClicked(evt);
            }
        });

        jLabel126.setText("precioVenta");

        precioVentaVSpnMod.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        jLabel127.setText("cantidad");

        jLabel128.setText("fecha");

        cantidadVSpnMod.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout updateVentasLayout = new javax.swing.GroupLayout(updateVentas.getContentPane());
        updateVentas.getContentPane().setLayout(updateVentasLayout);
        updateVentasLayout.setHorizontalGroup(
            updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateVentasLayout.createSequentialGroup()
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateVentasLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel125))
                    .addGroup(updateVentasLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateVentasLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(agregarVentaBtn1))
                            .addGroup(updateVentasLayout.createSequentialGroup()
                                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123)
                                    .addComponent(jLabel122)
                                    .addComponent(jLabel126)
                                    .addComponent(jLabel128)
                                    .addComponent(jLabel127)
                                    .addComponent(jLabel124))
                                .addGap(66, 66, 66)
                                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCigarrilloVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numExpendioVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numVentaVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioVentaVSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadVSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        updateVentasLayout.setVerticalGroup(
            updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel125)
                .addGap(18, 18, 18)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(numVentaVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(numExpendioVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(idCigarrilloVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(precioVentaVSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(cantidadVSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updateVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(fechaVTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(agregarVentaBtn1)
                .addContainerGap())
        );

        updateManufacturera.setTitle("Agregar Almacen");

        jLabel129.setText("id Manufactura");

        jLabel131.setText("Carton");

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel132.setText("Modificar Manufacturera");

        agregarManufactureraBtnMod.setText("Modificar");
        agregarManufactureraBtnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarManufactureraBtnModMouseClicked(evt);
            }
        });

        cartonManSpnMod.setModel(new javax.swing.SpinnerNumberModel());

        jLabel133.setText("Embalaje");

        embalajeManSpnMod.setModel(new javax.swing.SpinnerNumberModel());

        jLabel134.setText("id Fabricante");

        javax.swing.GroupLayout updateManufactureraLayout = new javax.swing.GroupLayout(updateManufacturera.getContentPane());
        updateManufacturera.getContentPane().setLayout(updateManufactureraLayout);
        updateManufactureraLayout.setHorizontalGroup(
            updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateManufactureraLayout.createSequentialGroup()
                .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateManufactureraLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateManufactureraLayout.createSequentialGroup()
                                    .addComponent(jLabel133)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(embalajeManSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updateManufactureraLayout.createSequentialGroup()
                                    .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel129)
                                        .addComponent(jLabel131))
                                    .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(updateManufactureraLayout.createSequentialGroup()
                                            .addGap(79, 79, 79)
                                            .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(idManufacturaManTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idFabricanteManTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateManufactureraLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cartonManSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel134, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(updateManufactureraLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(agregarManufactureraBtnMod)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        updateManufactureraLayout.setVerticalGroup(
            updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateManufactureraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel132)
                .addGap(30, 30, 30)
                .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(idManufacturaManTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(idFabricanteManTxtMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(cartonManSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updateManufactureraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133)
                    .addComponent(embalajeManSpnMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(agregarManufactureraBtnMod)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Fabricante");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Compras");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Cigarrillos");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Almacen");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Ventas");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Estancos");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton7.setText("Manufacturera");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(200, 200, 200)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(jButton4)))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton7)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(30, 30, 30)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(38, 38, 38)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        tabPanel.addTab("Agregar", addPanel);

        jButton13.setText("Cigarrillos");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setText("Compras");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        jButton15.setText("Fabricante");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        jButton16.setText("Estancos");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });

        jButton17.setText("Ventas");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        jButton18.setText("Almacen");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });

        jButton32.setText("Manufacturera");
        jButton32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13)
                            .addComponent(jButton15)
                            .addComponent(jButton14))
                        .addGap(200, 200, 200)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton32)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton18))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton17))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton16))
                .addGap(18, 18, 18)
                .addComponent(jButton32)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        tabPanel.addTab("Modificar", jPanel3);

        btnBuscarProc1.setText("Buscar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marcas", "Pais"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnBuscarProc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnBuscarProc1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel6.setText("NIF Estanco");

        jLabel12.setText("Marca");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        btnBuscarProc3.setText("Buscar");

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Ventas");

        jTextField10.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnBuscarProc3)
                .addGap(147, 147, 147)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnBuscarProc3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel6);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Ventas", "Marcas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnBuscarProc4.setText("Buscar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnBuscarProc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarProc4)
                .addGap(68, 68, 68))
        );

        jTabbedPane1.addTab("tab4", jPanel7);

        btnBuscarProc5.setText("Buscar");

        jLabel101.setText("Ingresos");

        jTextField16.setEditable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnBuscarProc5)
                .addGap(112, 112, 112)
                .addComponent(jLabel101)
                .addGap(34, 34, 34)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarProc5))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel8);

        jLabel26.setText("Importe de la compra");

        jTextField7.setEditable(false);

        btnBuscaProc2.setText("Buscar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBuscaProc2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab8", jPanel13);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIF_Estanco", "Nombre_Estanco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        btnBuscarProc9.setText("Buscar");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnBuscarProc9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarProc9)
                .addGap(121, 121, 121))
        );

        jTabbedPane1.addTab("tab9", jPanel12);

        jLabel5.setText("Cantidad");

        jLabel13.setText("nif Estanco");

        jButton33.setText("Buscar");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("tab 10", jPanel9);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Procedimientos Almacenados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabPanel.addTab("Buscar", jPanel4);

        tablaEliminar.add(fabricanteRd);
        fabricanteRd.setSelected(true);
        fabricanteRd.setText("Fabricante");

        tablaEliminar.add(cigarrillosRd);
        cigarrillosRd.setText("Cigarrillos");

        tablaEliminar.add(comprasRd);
        comprasRd.setText("Compras");

        tablaEliminar.add(almacenRd);
        almacenRd.setText("Almacen");

        tablaEliminar.add(ventasRd);
        ventasRd.setText("Ventas");

        tablaEliminar.add(estancosRd);
        estancosRd.setText("Estancos");

        tablaEliminar.add(manufactureraRd);
        manufactureraRd.setText("Manufacturera");

        jButton36.setText("Eliminar");
        jButton36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cigarrillosRd)
                    .addComponent(comprasRd)
                    .addComponent(almacenRd)
                    .addComponent(ventasRd)
                    .addComponent(estancosRd)
                    .addComponent(manufactureraRd)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(fabricanteRd)
                        .addGap(72, 72, 72)
                        .addComponent(delId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton36)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fabricanteRd)
                    .addComponent(jButton36)
                    .addComponent(delId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comprasRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cigarrillosRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(almacenRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ventasRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estancosRd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manufactureraRd)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        tabPanel.addTab("Borrar", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        createFabricante.setVisible(true);
        createFabricante.pack();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        createCompra.setVisible(true);
        createCompra.pack();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        createCigarrillo.setVisible(true);
        createCigarrillo.pack();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        createAlmacen.setVisible(true);
        createAlmacen.pack();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        createVenta.setVisible(true);
        createVenta.pack();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        createEstancos.setVisible(true);
        createEstancos.pack();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        createEstancos.setVisible(true);
        createEstancos.pack();
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        updateCompras.setVisible(true);
        updateCompras.pack();
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        updateFabricante.setVisible(true);
        updateFabricante.pack();
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        updateEstancos.setVisible(true);
        updateEstancos.pack();
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        updateVentas.setVisible(true);
        updateVentas.pack();
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        updateAlmacen.setVisible(true);
        updateAlmacen.pack();
    }//GEN-LAST:event_jButton18MouseClicked

    private void agregarAlmacenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarAlmacenBtnMouseClicked
        Almacen newAlmacen = new Almacen(Integer.parseInt(idAlmacenATxt.getText()),
                Integer.parseInt(idCigarrilloATxt.getText()), (int) exitenciaASpn.getValue(),
                Integer.parseInt(nifEstancoATxt1.getText()));
        
        conn.insertPro(newAlmacen.toString());
    }//GEN-LAST:event_agregarAlmacenBtnMouseClicked

    private void jButton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseClicked
        Cigarrillo newCigarrillo = new Cigarrillo( 
            marcaCTxt.getText(), ContaminanteCCmb.getSelectedIndex(), FiltroCChk.isSelected(), 
            MentoladoCChk.isSelected(), Hoja1CRdo.isSelected());
        
        conn.insertPro(newCigarrillo.toString());
    }//GEN-LAST:event_jButton31MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        Compra newCompra = new Compra(
                Integer.parseInt(idAlmacenCoTxt.getText()), Integer.parseInt(nifEstancoCoTxt1.getText()),
                (double) precioCoSpn.getValue(), (int) cantidadCoSpn.getValue(), fechaCoTxt.getText());

        conn.insertPro(newCompra.toString());
    }//GEN-LAST:event_jButton9MouseClicked

    private void agregarEstancoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarEstancoBtnMouseClicked
        Estanco newEstanco = new Estanco(Integer.parseInt(numExpendioEsTxt.getText()), 
                Integer.parseInt(numFiscalEsTxt.getText()), nombreEsTxt.getText(), localEsTxt.getText());

        conn.insertPro(newEstanco.toString());
    }//GEN-LAST:event_agregarEstancoBtnMouseClicked

    private void agregarFabricanteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarFabricanteBtnMouseClicked
        Fabricante newFabricante = new Fabricante(Integer.parseInt(idFabricanteFTxt.getText()), 
                nombreFabricanteFTxt.getText(), paisFTxt.getText());

        conn.insertPro(newFabricante.toString());
    }//GEN-LAST:event_agregarFabricanteBtnMouseClicked

    private void agregarVentaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarVentaBtnMouseClicked
        Venta newVenta = new Venta(Integer.parseInt(numVentaVTxt.getText()), Integer.parseInt(numExpendioVTxt.getText()),
                 Integer.parseInt(idCigarrilloVTxt.getText()), (double)precioVentaVSpn.getValue(), (int)cantidadVSpn.getValue(), fechaVTxt.getText());
        
        conn.insertPro(newVenta.toString());
    }//GEN-LAST:event_agregarVentaBtnMouseClicked

    private void agregarManufactureraBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarManufactureraBtnMouseClicked
        Manufactura newManufactura = new Manufactura(Integer.parseInt(idFabricanteManTxt.getText()), (int) cartonManSpn1.getValue(), (int) embalajeManSpn2.getValue());
        
        conn.insertPro(newManufactura.toString());
    }//GEN-LAST:event_agregarManufactureraBtnMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        createManufacturera.setVisible(true);
        createManufacturera.pack();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton36MouseClicked
        String entidad = "";
        
        if(almacenRd.isSelected()){
            entidad = "Almacen";
        } else if (cigarrillosRd.isSelected()){
            entidad = "Cigarrillo";
        } else if (comprasRd.isSelected()){
            entidad = "Compras";
        } else if (estancosRd.isSelected()){
            entidad = "Estanco";
        }  else if (fabricanteRd.isSelected()){
            entidad = "Fabricante";
        } else if (ventasRd.isSelected()){
            entidad = "Venta";
        } else if (manufactureraRd.isSelected()){
            entidad = "Manufacturera";
        }
        
        conn.deletePro(entidad,delId.getText());
    }//GEN-LAST:event_jButton36MouseClicked

    private void jButton32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton32MouseClicked
        updateManufacturera.setVisible(true);
        updateManufacturera.pack();
    }//GEN-LAST:event_jButton32MouseClicked

    private void agregarAlmacenBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarAlmacenBtn1MouseClicked
        Almacen newAlmacen = new Almacen(Integer.parseInt(idAlmacenATxtMod.getText()),
                Integer.parseInt(idCigarrilloATxtMod.getText()), (int) exitenciaASpnMod.getValue(),
                Integer.parseInt(nifEstancoATxtMod.getText()));
        
        conn.update(newAlmacen.toString());
    }//GEN-LAST:event_agregarAlmacenBtn1MouseClicked

    private void jButton34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MouseClicked
        Cigarrillo newCigarrillo = new Cigarrillo(Integer.parseInt(idCigarrilloCTxtMod.getText()), 
            marcaCTxtMod.getText(), ContaminanteCCmbMod.getSelectedIndex(), FiltroCChkMod.isSelected(), 
            MentoladoCChkMod.isSelected(), Hoja1CRdoMod.isSelected());
        
        conn.update(newCigarrillo.toString());
    }//GEN-LAST:event_jButton34MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        Compra newCompra = new Compra(Integer.parseInt(numCompraCoTxtMod.getText()),
                Integer.parseInt(idCigarrilloCoTxtMod.getText()), Integer.parseInt(nifEstancoCoTxtMod.getText()),
                (double) precioCoSpnMod.getValue(), (int) cantidadCoSpnMod.getValue(), fechaCoTxtMod.getText());

        conn.update(newCompra.toString());
    }//GEN-LAST:event_jButton10MouseClicked

    private void agregarEstancoBtnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarEstancoBtnModMouseClicked
        Estanco newEstanco = new Estanco(Integer.parseInt(numExpendioEsTxtMod.getText()), 
                Integer.parseInt(numFiscalEsTxtMod.getText()), nombreEsTxtMod.getText(), localEsTxtMod.getText());

        conn.updatePro(newEstanco.toString());
    }//GEN-LAST:event_agregarEstancoBtnModMouseClicked

    private void agregarFabricanteBtnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarFabricanteBtnModMouseClicked
        Fabricante newFabricante = new Fabricante(Integer.parseInt(idFabricanteFTxtMod.getText()), 
                nombreFabricanteFTxtMod.getText(), paisFTxtMod.getText());

        conn.updatePro(newFabricante.toString());
    }//GEN-LAST:event_agregarFabricanteBtnModMouseClicked

    private void agregarVentaBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarVentaBtn1MouseClicked
        Venta newVenta = new Venta(Integer.parseInt(numVentaVTxtMod.getText()), Integer.parseInt(numExpendioVTxtMod.getText()),
                 Integer.parseInt(idCigarrilloVTxtMod.getText()), (double)precioVentaVSpnMod.getValue(), (int)cantidadVSpnMod.getValue(), fechaVTxtMod.getText());
        
        conn.updatePro(newVenta.toString());
    }//GEN-LAST:event_agregarVentaBtn1MouseClicked

    private void agregarManufactureraBtnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarManufactureraBtnModMouseClicked
        Manufactura newManufactura = new Manufactura(Integer.parseInt(idManufacturaManTxtMod.getText()), Integer.parseInt(idFabricanteManTxtMod.getText()), (int) cartonManSpnMod.getValue(), (int) embalajeManSpnMod.getValue());
        
        conn.updatePro(newManufactura.toString());
    }//GEN-LAST:event_agregarManufactureraBtnModMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    Conexion conn = new Conexion();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ContaminanteCCmb;
    private javax.swing.JComboBox<String> ContaminanteCCmbMod;
    private javax.swing.JCheckBox FiltroCChk;
    private javax.swing.JCheckBox FiltroCChkMod;
    private javax.swing.ButtonGroup Hoja;
    private javax.swing.JRadioButton Hoja1CRdo;
    private javax.swing.JRadioButton Hoja1CRdoMod;
    private javax.swing.JRadioButton Hoja2CRDo;
    private javax.swing.JRadioButton Hoja2CRDoMod;
    private javax.swing.JCheckBox MentoladoCChk;
    private javax.swing.JCheckBox MentoladoCChkMod;
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton agregarAlmacenBtn;
    private javax.swing.JButton agregarAlmacenBtn1;
    private javax.swing.JButton agregarEstancoBtn;
    private javax.swing.JButton agregarEstancoBtnMod;
    private javax.swing.JButton agregarFabricanteBtn;
    private javax.swing.JButton agregarFabricanteBtnMod;
    private javax.swing.JButton agregarManufactureraBtn;
    private javax.swing.JButton agregarManufactureraBtnMod;
    private javax.swing.JButton agregarVentaBtn;
    private javax.swing.JButton agregarVentaBtn1;
    private javax.swing.JRadioButton almacenRd;
    private javax.swing.JButton btnBuscaProc2;
    private javax.swing.JButton btnBuscarProc1;
    private javax.swing.JButton btnBuscarProc3;
    private javax.swing.JButton btnBuscarProc4;
    private javax.swing.JButton btnBuscarProc5;
    private javax.swing.JButton btnBuscarProc9;
    private javax.swing.JSpinner cantidadCoSpn;
    private javax.swing.JSpinner cantidadCoSpnMod;
    private javax.swing.JSpinner cantidadVSpn;
    private javax.swing.JSpinner cantidadVSpnMod;
    private javax.swing.JSpinner cartonManSpn1;
    private javax.swing.JSpinner cartonManSpnMod;
    private javax.swing.JRadioButton cigarrillosRd;
    private javax.swing.JRadioButton comprasRd;
    private javax.swing.JFrame createAlmacen;
    private javax.swing.JFrame createCigarrillo;
    private javax.swing.JFrame createCompra;
    private javax.swing.JFrame createEstancos;
    private javax.swing.JFrame createFabricante;
    private javax.swing.JFrame createManufacturera;
    private javax.swing.JFrame createVenta;
    private javax.swing.JTextField delId;
    private javax.swing.JSpinner embalajeManSpn2;
    private javax.swing.JSpinner embalajeManSpnMod;
    private javax.swing.JRadioButton estancosRd;
    private javax.swing.JSpinner exitenciaASpn;
    private javax.swing.JSpinner exitenciaASpnMod;
    private javax.swing.JRadioButton fabricanteRd;
    private javax.swing.JTextField fechaCoTxt;
    private javax.swing.JTextField fechaCoTxtMod;
    private javax.swing.JTextField fechaVTxt;
    private javax.swing.JTextField fechaVTxtMod;
    private javax.swing.JTextField idAlmacenATxt;
    private javax.swing.JTextField idAlmacenATxtMod;
    private javax.swing.JTextField idAlmacenCoTxt;
    private javax.swing.JTextField idCigarrilloATxt;
    private javax.swing.JTextField idCigarrilloATxtMod;
    private javax.swing.JTextField idCigarrilloCTxtMod;
    private javax.swing.JTextField idCigarrilloCoTxtMod;
    private javax.swing.JTextField idCigarrilloVTxt;
    private javax.swing.JTextField idCigarrilloVTxtMod;
    private javax.swing.JTextField idFabricanteCTxtMod;
    private javax.swing.JTextField idFabricanteFTxt;
    private javax.swing.JTextField idFabricanteFTxtMod;
    private javax.swing.JTextField idFabricanteManTxt;
    private javax.swing.JTextField idFabricanteManTxtMod;
    private javax.swing.JTextField idManufacturaManTxtMod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField localEsTxt;
    private javax.swing.JTextField localEsTxtMod;
    private javax.swing.JRadioButton manufactureraRd;
    private javax.swing.JTextField marcaCTxt;
    private javax.swing.JTextField marcaCTxtMod;
    private javax.swing.JTextField nifEstancoATxt1;
    private javax.swing.JTextField nifEstancoATxtMod;
    private javax.swing.JTextField nifEstancoCoTxt1;
    private javax.swing.JTextField nifEstancoCoTxtMod;
    private javax.swing.JTextField nombreEsTxt;
    private javax.swing.JTextField nombreEsTxtMod;
    private javax.swing.JTextField nombreFabricanteFTxt;
    private javax.swing.JTextField nombreFabricanteFTxtMod;
    private javax.swing.JTextField numCompraCoTxtMod;
    private javax.swing.JTextField numExpendioEsTxt;
    private javax.swing.JTextField numExpendioEsTxtMod;
    private javax.swing.JTextField numExpendioVTxt;
    private javax.swing.JTextField numExpendioVTxtMod;
    private javax.swing.JTextField numFiscalEsTxt;
    private javax.swing.JTextField numFiscalEsTxtMod;
    private javax.swing.JTextField numVentaVTxt;
    private javax.swing.JTextField numVentaVTxtMod;
    private javax.swing.JTextField paisFTxt;
    private javax.swing.JTextField paisFTxtMod;
    private javax.swing.JSpinner precioCoSpn;
    private javax.swing.JSpinner precioCoSpnMod;
    private javax.swing.JSpinner precioVentaVSpn;
    private javax.swing.JSpinner precioVentaVSpnMod;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.ButtonGroup tablaEliminar;
    private javax.swing.JFrame updateAlmacen;
    private javax.swing.JFrame updateCigarrillo;
    private javax.swing.JFrame updateCompras;
    private javax.swing.JFrame updateEstancos;
    private javax.swing.JFrame updateFabricante;
    private javax.swing.JFrame updateManufacturera;
    private javax.swing.JFrame updateVentas;
    private javax.swing.JRadioButton ventasRd;
    // End of variables declaration//GEN-END:variables
}
