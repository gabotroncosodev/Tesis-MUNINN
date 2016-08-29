
package productos;

import java.awt.Color;
import java.awt.Event;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import otros.Proveedor;

public class dialogModificarProducto extends javax.swing.JDialog {

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
        
    
    
SQLProducto sqlproducto = new SQLProducto();
Producto productoclase = new Producto();
Proveedor proveedorclase = new Proveedor();

    public dialogModificarProducto(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
        sqlproducto.tablaTodosProd.addColumn("ID");
        sqlproducto.tablaTodosProd.addColumn("Producto");
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscadorFotoModif = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbCodProdM = new javax.swing.JLabel();
        btEditListProv1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMarcaM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfo2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtCantidadBod2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCostUniC2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCostUniA2 = new javax.swing.JTextField();
        btGuardarCambios = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        lbVistaPrevia = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        txtDirectorio = new javax.swing.JTextField();
        txtRuta = new javax.swing.JTextField();
        btExaminar = new javax.swing.JButton();
        btModificarImagen = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listProvProdM = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        btEditListProv = new javax.swing.JButton();
        btEliminProvSelecc = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCategoriaMod = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        lbWhite = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Modificar el detalle de Informacion de un Producto");
        setMaximumSize(new java.awt.Dimension(612, 700));
        setMinimumSize(new java.awt.Dimension(612, 700));
        setPreferredSize(new java.awt.Dimension(612, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edicion de la informacion de un Producto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 430, 40);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo del Producto");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(170, 50, 140, 26);

        lbCodProdM.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lbCodProdM.setForeground(new java.awt.Color(255, 255, 255));
        lbCodProdM.setText("2");
        jPanel1.add(lbCodProdM);
        lbCodProdM.setBounds(310, 50, 23, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 20, 520, 80);

        btEditListProv1.setBackground(new java.awt.Color(51, 51, 51));
        btEditListProv1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditListProv1.setForeground(new java.awt.Color(255, 255, 255));
        btEditListProv1.setText("Cerrar Ventana");
        btEditListProv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditListProv1ActionPerformed(evt);
            }
        });
        getContentPane().add(btEditListProv1);
        btEditListProv1.setBounds(40, 620, 530, 40);

        jTabbedPane2.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTabbedPane2.setMaximumSize(new java.awt.Dimension(612, 700));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(612, 700));
        jTabbedPane2.setOpaque(true);
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(612, 700));

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Marca");

        txtMarcaM.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtMarcaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaMKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion del Producto");

        txtInfo2.setColumns(20);
        txtInfo2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtInfo2.setRows(5);
        txtInfo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtInfo2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInfo2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInfo2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtInfo2);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad en Bodega");

        txtCantidadBod2.setEditable(false);
        txtCantidadBod2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCantidadBod2.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCantidadBod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadBod2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadBod2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Costo Unitario (Compra)");

        txtCostUniC2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCostUniC2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostUniC2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostUniC2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostUniC2KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Costo Unitario por Arriendo");

        txtCostUniA2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCostUniA2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostUniA2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCostUniA2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostUniA2KeyTyped(evt);
            }
        });

        btGuardarCambios.setBackground(new java.awt.Color(51, 51, 51));
        btGuardarCambios.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btGuardarCambios.setText("Guardar Cambios");
        btGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("* Recuerde, El Arriendo es por Hora");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar o Quitar Cantidad del Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(btGuardarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtMarcaM))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCostUniA2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCostUniC2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadBod2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMarcaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadBod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostUniA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCostUniC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addComponent(btGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane2.addTab("Informacion General", jPanel12);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setMaximumSize(new java.awt.Dimension(381, 500));
        jPanel14.setMinimumSize(new java.awt.Dimension(381, 500));
        jPanel14.setOpaque(false);

        lbVistaPrevia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbVistaPrevia.setBorder(new javax.swing.border.MatteBorder(null));
        lbVistaPrevia.setMaximumSize(new java.awt.Dimension(324, 255));
        lbVistaPrevia.setMinimumSize(new java.awt.Dimension(324, 255));

        jPanel11.setBackground(new java.awt.Color(217, 215, 198));
        jPanel11.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel11.setMaximumSize(new java.awt.Dimension(151, 98));
        jPanel11.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre del Archivo");

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Directorio");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ruta");

        txtArchivo.setBackground(new java.awt.Color(204, 204, 204));
        txtArchivo.setEditable(false);
        txtArchivo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtArchivo.setMaximumSize(new java.awt.Dimension(6, 20));

        txtDirectorio.setBackground(new java.awt.Color(204, 204, 204));
        txtDirectorio.setEditable(false);
        txtDirectorio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDirectorio.setMaximumSize(new java.awt.Dimension(6, 20));

        txtRuta.setBackground(new java.awt.Color(204, 204, 204));
        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtRuta.setMaximumSize(new java.awt.Dimension(6, 20));
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDirectorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btExaminar.setBackground(new java.awt.Color(51, 51, 51));
        btExaminar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btExaminar.setForeground(new java.awt.Color(255, 255, 255));
        btExaminar.setText("Examinar...");
        btExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExaminarActionPerformed(evt);
            }
        });

        btModificarImagen.setBackground(new java.awt.Color(51, 51, 51));
        btModificarImagen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btModificarImagen.setForeground(new java.awt.Color(255, 255, 255));
        btModificarImagen.setText("Modificar Imagen");
        btModificarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(lbVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btModificarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btExaminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btModificarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Imagen", jPanel14);

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(226, 223, 197));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        listProvProdM.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listProvProdM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProvProdMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listProvProdM);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Proveedores asociados al Producto");

        btEditListProv.setBackground(new java.awt.Color(51, 51, 51));
        btEditListProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEditListProv.setForeground(new java.awt.Color(255, 255, 255));
        btEditListProv.setText("Agregar Proveedor a la lista");
        btEditListProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditListProvActionPerformed(evt);
            }
        });

        btEliminProvSelecc.setBackground(new java.awt.Color(51, 51, 51));
        btEliminProvSelecc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btEliminProvSelecc.setForeground(new java.awt.Color(255, 255, 255));
        btEliminProvSelecc.setText("Eliminar Proveedor seleccionado");
        btEliminProvSelecc.setEnabled(false);
        btEliminProvSelecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminProvSeleccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEliminProvSelecc)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btEditListProv, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditListProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEliminProvSelecc)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, -1));

        jPanel7.setBackground(new java.awt.Color(226, 223, 197));
        jPanel7.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Categoria");

        txtCategoriaMod.setBackground(new java.awt.Color(230, 228, 228));
        txtCategoriaMod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCategoriaMod.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCategoriaMod.setEnabled(false);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Modificar la Categoria Registrada");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(txtCategoriaMod))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCategoriaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 330, 340, -1));

        jTabbedPane2.addTab("Categoria y Proveedores", jPanel13);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(40, 110, 530, 500);

        lbWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoModifProd.png"))); // NOI18N
        getContentPane().add(lbWhite);
        lbWhite.setBounds(0, 0, 670, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
cargarDatosVentana1();

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
cargarDatosProvCateg();

String rutaimg = txtRuta.getText();

if(rutaimg.equals(""))
       {
       btModificarImagen.setEnabled(false);
       }
       else
       {
       btModificarImagen.setEnabled(true);
       }

    }//GEN-LAST:event_formWindowActivated

    private void btEditListProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditListProvActionPerformed
        dialogAddProveedProd addProvP = new dialogAddProveedProd(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        addProvP.lbCodigoProdProv2.setText(lbCodProdM.getText());
        
        addProvP.setVisible(true);
        addProvP.setResizable(false);
        addProvP.setLocationRelativeTo(null);
        addProvP.pack();        
    }//GEN-LAST:event_btEditListProvActionPerformed

    private void btEliminProvSeleccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminProvSeleccActionPerformed
            int valor = listProvProdM.getModel().getSize();
        
        if(valor>1)
        {
            if (verificadorCamposListaProv()) //verificar dejar 1 proveedor
        {
            String nombreProv =listProvProdM.getSelectedValue().toString();            
            int idprov = sqlproducto.obtenerIDProveedor(nombreProv); 
            
            proveedorclase.setId_proveedor(idprov);
              
            String codprod = lbCodProdM.getText();   
            int cdprod= Integer.parseInt(codprod);
            
            productoclase.setId_Producto(cdprod);
            
            sqlproducto.eliminarProveedorProd(cdprod, idprov , proveedorclase, productoclase);
            }
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "No se puede Eliminar el Proveedor \n "
                 + "Es Obligatorio que tenga anexado minimo 1 Proveedor",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoInfo);
        }
        
    }//GEN-LAST:event_btEliminProvSeleccActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dialogModificarCategoriaProd categprod = new dialogModificarCategoriaProd(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        categprod.lbCodProdCateg.setText(lbCodProdM.getText());
        categprod.lbNombrCategM.setText(txtCategoriaMod.getText());
                
        categprod.setVisible(true);
        categprod.setResizable(false);
        categprod.setLocationRelativeTo(null);
        categprod.pack(); 
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarCambiosActionPerformed
        if (verificadorCamposActualizarProd()) {
            System.out.print("Obteniendo información \n");

            //conversiones de String a int

            String id = lbCodProdM.getText();
            int idproducto = Integer.parseInt(id);

            String ctdadbod = txtCantidadBod2.getText();
            int cantidadbod = Integer.parseInt(ctdadbod);
            
            String cstunitc = txtCostUniC2.getText();
            int costounitc = Integer.parseInt(cstunitc);
            
            String cstUnitA = txtCostUniA2.getText();
            int costounitA = Integer.parseInt(cstUnitA);

            productoclase.setId_Producto(idproducto);
            productoclase.setMarca_producto(txtMarcaM.getText().toUpperCase());
            productoclase.setDetalle_producto(txtInfo2.getText().toUpperCase());
            productoclase.setCantidad_bodega(cantidadbod);
            productoclase.setCosto_Producto(costounitc);
            productoclase.setCosto_unit_arr_producto(costounitA);
            
            sqlproducto.actualizarProd(productoclase);
            int mensaje= JOptionPane.showConfirmDialog(rootPane, "Información Acualizada\n¿Quiere Modificar algo más??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, iconoBueno);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                 
                }
                else
                {
                    this.dispose();
                }
        }
       
 }//GEN-LAST:event_btGuardarCambiosActionPerformed

    private void btModificarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarImagenActionPerformed
        
        if (verificadorCamposActualizarProd())
            {
            //foto                
            String codprod = lbCodProdM.getText();   
            int idprod= Integer.parseInt(codprod);
            productoclase.setId_Producto(idprod);
            
            String foto = txtRuta.getText();
            productoclase.setRuta_foto(foto);
            
           if(sqlproducto.actualizarImagenP(productoclase))
                   {
                   int mensaje= JOptionPane.showConfirmDialog(rootPane, "Imagen Acualizada\n¿Quiere Modificar algo más??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoBueno);
                    if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    txtRuta.setText("");
                    txtDirectorio.setText("");
                    txtArchivo.setText("");
                }
                else
                {
                    this.dispose();
                }
                   }
                    
                    
            }
    }//GEN-LAST:event_btModificarImagenActionPerformed

    private void txtInfo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInfo2KeyTyped
if(txtInfo2.getText().length()== 90) {
            evt.consume();
        }         
    }//GEN-LAST:event_txtInfo2KeyTyped

    private void txtInfo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInfo2KeyReleased
        String valor = txtInfo2.getText();        
        if(valor.equals(""))        {
            txtInfo2.setBackground(new Color (255,255,204));
        }
        else        {
            txtInfo2.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtInfo2KeyReleased

    private void txtCantidadBod2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBod2KeyReleased
        String valor = txtCantidadBod2.getText();        
        if(valor.equals(""))        {
            txtCantidadBod2.setBackground(new Color (255,255,204));
        }
        else        {
            txtCantidadBod2.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtCantidadBod2KeyReleased

    private void txtCostUniC2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniC2KeyReleased
        String valor = txtCostUniC2.getText();        
        if(valor.equals(""))        {
            txtCostUniC2.setBackground(new Color (255,255,204));
        }
        else        {
            txtCostUniC2.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtCostUniC2KeyReleased

    private void txtCostUniA2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniA2KeyReleased
        String valor = txtCostUniA2.getText();        
        if(valor.equals(""))        {
            txtCostUniA2.setBackground(new Color (255,255,204));
        }
        else        {
            txtCostUniA2.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtCostUniA2KeyReleased

    private void txtMarcaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaMKeyReleased
        String valor = txtMarcaM.getText();        
        if(valor.equals(""))        {
            txtMarcaM.setBackground(new Color (255,255,204));
        }
        else        {
            txtMarcaM.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtMarcaMKeyReleased

    private void btExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExaminarActionPerformed
        ImageIcon fotto=new ImageIcon("");
        Icon icono1=new ImageIcon(fotto.getImage().getScaledInstance(lbVistaPrevia.getWidth(), lbVistaPrevia.getHeight(),Image.SCALE_DEFAULT));
        lbVistaPrevia.setIcon(icono1);
        
    FileNameExtensionFilter filtro=new FileNameExtensionFilter ("JPG", "JPEG", "jpg", "jpeg");
    File  ruta;
    BuscadorFotoModif.setApproveButtonText("Abrir Archivo");
    BuscadorFotoModif.setDialogTitle("Abrir Archivo...");
    BuscadorFotoModif.setFileFilter(filtro);
    //BuscadorFoto.showDialog(this, null);
    
       
    int status = BuscadorFotoModif.showOpenDialog(null);// Da un entero
    // Si apretamos en aceptar ocurrirá esto
    if (status == JFileChooser.APPROVE_OPTION) 
    {
       // File selectedFile = BuscadorFoto.getSelectedFile();
        //System.out.println(selectedFile.getParent());
        ruta=BuscadorFotoModif.getSelectedFile();//ruta + archivo
        String directorio=String.valueOf(BuscadorFotoModif.getCurrentDirectory());
        String archivo=BuscadorFotoModif.getName(ruta);//nombre archivo
        
        txtRuta.setText(String.valueOf(ruta)); 
        txtDirectorio.setText(String.valueOf(directorio));
        txtArchivo.setText(archivo);
        
        ImageIcon foto=new ImageIcon(txtRuta.getText());
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(lbVistaPrevia.getWidth(), lbVistaPrevia.getHeight(),Image.SCALE_DEFAULT));
        lbVistaPrevia.setIcon(icono);
        
    // Si apretamos en cancelar o cerramos la ventana ocurrirá esto
    } else if (status == JFileChooser.CANCEL_OPTION) {
        String id = lbCodProdM.getText();
        txtRuta.setText("");
        txtDirectorio.setText("");
        txtArchivo.setText("");
        Image dtCat = sqlproducto.getfoto(id);
        Image i = dtCat.getScaledInstance(291,195, Image.SCALE_AREA_AVERAGING);
        Icon icon = new ImageIcon(i);
        lbVistaPrevia.setIcon(icon);
        
        
        
    }

    }//GEN-LAST:event_btExaminarActionPerformed

    private void btEditListProv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditListProv1ActionPerformed
int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta Ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_btEditListProv1ActionPerformed

    private void listProvProdMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProvProdMMouseClicked
        btEliminProvSelecc.setEnabled(true);
    }//GEN-LAST:event_listProvProdMMouseClicked

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
       
    }//GEN-LAST:event_txtRutaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtMarcaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaMKeyTyped
        if(txtMarcaM.getText().length()== 40) {
            evt.consume();
        } 
    }//GEN-LAST:event_txtMarcaMKeyTyped

    private void txtCantidadBod2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadBod2KeyTyped
       if(txtCantidadBod2.getText().length()== 8) {
            evt.consume();
        }  
       
       char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadBod2KeyTyped

    private void txtCostUniA2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniA2KeyTyped
        if(txtCostUniA2.getText().length()== 8) {
            evt.consume();
        }  
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostUniA2KeyTyped

    private void txtCostUniC2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniC2KeyTyped
        if(txtCostUniC2.getText().length()== 8) {
            evt.consume();
        }  
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCostUniC2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dialogCantidadProd dialogModifCatidad = new dialogCantidadProd(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        dialogModifCatidad.lbIdProducto.setText(lbCodProdM.getText());
        dialogModifCatidad.txtCantidadActual.setText(txtCantidadBod2.getText());
        
        dialogModifCatidad.setVisible(true);
        dialogModifCatidad.pack();    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMarcaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaMKeyPressed
InputMap map2 =  txtMarcaM.getInputMap( txtMarcaM.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtMarcaMKeyPressed

    private void txtInfo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInfo2KeyPressed
InputMap map2 =  txtInfo2.getInputMap( txtInfo2.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtInfo2KeyPressed

    private void txtCostUniA2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniA2KeyPressed
InputMap map2 =  txtCostUniA2.getInputMap( txtCostUniA2.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtCostUniA2KeyPressed

    private void txtCostUniC2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostUniC2KeyPressed
InputMap map2 =  txtCostUniC2.getInputMap( txtCostUniC2.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtCostUniC2KeyPressed

  
void cargarDatosVentana1()
{
String id = lbCodProdM.getText();
        
        sqlproducto.buscarProveedorPorProd(id);
        listProvProdM.setModel(sqlproducto.listaProveedoresProducto); 

        Image dtCat = sqlproducto.getfoto(id);
        Image i = dtCat.getScaledInstance(291,195, Image.SCALE_AREA_AVERAGING);
        Icon icon = new ImageIcon(i);
        lbVistaPrevia.setIcon(icon);
        
         ArrayList datos=new ArrayList();
         datos=sqlproducto.buscarProductoSelecc(id);
         
         lbCodProdM.setText(datos.get(0).toString());// aca obtengo los datos de arreglo
         txtMarcaM.setText(datos.get(2).toString());
         txtInfo2.setText(datos.get(1).toString());
         txtCantidadBod2.setText(datos.get(3).toString());
         txtCostUniA2.setText(datos.get(4).toString());
         txtCostUniC2.setText(datos.get(5).toString());
         
         String nombreCategoria= sqlproducto.buscarCategProd(id);  
         txtCategoriaMod.setText(nombreCategoria);

}


        
void cargarDatosProvCateg() //metodo que actulaliza proveedor y categoria al cambiar
{
        String id = lbCodProdM.getText();
        
        ArrayList datos=new ArrayList();
         datos=sqlproducto.buscarProductoSelecc(id);
         
         
         txtCantidadBod2.setText(datos.get(3).toString());
        
        sqlproducto.buscarProveedorPorProd(id);
        listProvProdM.setModel(sqlproducto.listaProveedoresProducto); 

        
        String nombreCategoria= sqlproducto.buscarCategProd(id);  
        txtCategoriaMod.setText(nombreCategoria);
}        
        

public boolean verificadorCamposListaProv ()
{
    boolean respuesta=true;
    String variable1 = "";
   
    if (listProvProdM.getSelectedIndex()==-1)
        {
            variable1=variable1+"Debe Seleccionar un Proveedor de la lista para Eliminar\n";
            respuesta=false;
        }  
       if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    
    return respuesta;
    
}  

public boolean verificadorCamposActualizarProd ()
{
    boolean respuesta=true;
    String variable1 = "";   
   
        if(txtMarcaM.getText().equals(""))
                {
                variable1= variable1 + "Debe tener registrado una Marca\n";
                txtMarcaM.requestFocus();
                txtMarcaM.setBackground(new Color (255,255,204));
                respuesta=false;
                }
        else if(txtInfo2.getText().equals(""))
                {
                variable1= variable1 + "Debe tener una Descripción\n";
                txtInfo2.requestFocus();
                txtInfo2.setBackground(new Color (255,255,204));
                respuesta=false;
                }
        else if(txtCantidadBod2.getText().equals(""))
                {
                variable1= variable1 + "Debe tener registrado la cantidad en Bodega\n";
                txtCantidadBod2.requestFocus();
                txtCantidadBod2.setBackground(new Color (255,255,204));
                respuesta=false;
                }
        else if(txtCostUniC2.getText().equals(""))
                {
                variable1= variable1 + "Debe tener registrado el costo del Producto\n";
                txtCostUniC2.requestFocus();
                txtCostUniC2.setBackground(new Color (255,255,204));
                respuesta=false;
                }
        else if(txtCostUniA2.getText().equals(""))
                {
                variable1= variable1 + "Debe tener registrado el costo del Producto (ARRIENDO)\n";
                txtCostUniA2.requestFocus();
                txtCostUniA2.setBackground(new Color (255,255,204));
                respuesta=false;
                }
        
       if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    
    return respuesta;
    
} 
    


    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogModificarProducto dialog = new dialogModificarProducto(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser BuscadorFotoModif;
    private javax.swing.JButton btEditListProv;
    private javax.swing.JButton btEditListProv1;
    private javax.swing.JButton btEliminProvSelecc;
    private javax.swing.JButton btExaminar;
    private javax.swing.JButton btGuardarCambios;
    private javax.swing.JButton btModificarImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel lbCodProdM;
    private javax.swing.JLabel lbVistaPrevia;
    private javax.swing.JLabel lbWhite;
    private javax.swing.JList listProvProdM;
    private javax.swing.JTextField txtArchivo;
    private javax.swing.JTextField txtCantidadBod2;
    private javax.swing.JTextField txtCategoriaMod;
    private javax.swing.JTextField txtCostUniA2;
    private javax.swing.JTextField txtCostUniC2;
    private javax.swing.JTextField txtDirectorio;
    private javax.swing.JTextArea txtInfo2;
    private javax.swing.JTextField txtMarcaM;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
