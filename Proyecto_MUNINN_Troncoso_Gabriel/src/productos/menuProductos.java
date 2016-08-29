package productos;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import conexion.ConexionBD;

import inicio.inicioRapido;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class menuProductos extends javax.swing.JFrame {
    
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png");    
    
ConexionBD conexionbd = new ConexionBD();

SQLProducto sqlproducto = new SQLProducto();
Producto productoclase = new Producto ();

    public menuProductos() {
        initComponents();
        System.out.print("Menu Principal de Productos Iniciado \n");   
        setLocationRelativeTo(null);
        setResizable(false);
        
        sqlproducto.tablaTodosProd.addColumn("ID");
        sqlproducto.tablaTodosProd.addColumn("Producto");
        
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lbFotoProducto = new javax.swing.JLabel();
        btModifProduct2 = new javax.swing.JButton();
        btInformeProductoSelec = new javax.swing.JButton();
        btNuevoProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtBuscadorProd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        btDescripCateg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistaProvedores = new javax.swing.JList();
        jLabel34 = new javax.swing.JLabel();
        btModifProduct = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtInfo = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbCodProd = new javax.swing.JLabel();
        lbCantidadBod = new javax.swing.JLabel();
        lbNombreUsuarioProd = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbCostUniA = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lbCostUniC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNIN - Productos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1174, 710));
        setResizable(false);
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

        lbFotoProducto.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbFotoProducto.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lbFotoProducto);
        lbFotoProducto.setBounds(300, 130, 389, 320);

        btModifProduct2.setBackground(new java.awt.Color(51, 51, 51));
        btModifProduct2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btModifProduct2.setForeground(new java.awt.Color(255, 255, 255));
        btModifProduct2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ProductosbotonInicio.png"))); // NOI18N
        btModifProduct2.setText("Volver al Inicio Rapido");
        btModifProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifProduct2ActionPerformed(evt);
            }
        });
        getContentPane().add(btModifProduct2);
        btModifProduct2.setBounds(840, 620, 320, 50);

        btInformeProductoSelec.setBackground(new java.awt.Color(51, 51, 51));
        btInformeProductoSelec.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btInformeProductoSelec.setForeground(new java.awt.Color(255, 255, 255));
        btInformeProductoSelec.setText("Imprimir Reporte del Producto");
        btInformeProductoSelec.setEnabled(false);
        btInformeProductoSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInformeProductoSelecActionPerformed(evt);
            }
        });
        getContentPane().add(btInformeProductoSelec);
        btInformeProductoSelec.setBounds(830, 540, 330, 50);

        btNuevoProd.setBackground(new java.awt.Color(51, 51, 51));
        btNuevoProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btNuevoProd.setForeground(new java.awt.Color(255, 255, 255));
        btNuevoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProductomininuevo.png"))); // NOI18N
        btNuevoProd.setText("Agregar nuevo Producto");
        btNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoProdActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevoProd);
        btNuevoProd.setBounds(710, 320, 440, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        tablaProductos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto"
            }
        ));
        tablaProductos.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tablaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProductosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);

        txtBuscadorProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorProdKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Filtro: Marca, Descripción");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtBuscadorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscadorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 11, 280, 590);

        jPanel1.setOpaque(false);

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Categoria:");

        lbCategoria.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lbCategoria.setBorder(new javax.swing.border.MatteBorder(null));

        btDescripCateg.setBackground(new java.awt.Color(51, 51, 51));
        btDescripCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btDescripCateg.setForeground(new java.awt.Color(255, 255, 255));
        btDescripCateg.setText("Descripcion de Categoria");
        btDescripCateg.setEnabled(false);
        btDescripCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDescripCategActionPerformed(evt);
            }
        });

        jlistaProvedores.setOpaque(false);
        jScrollPane1.setViewportView(jlistaProvedores);

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Proveedores Relacionados");

        btModifProduct.setBackground(new java.awt.Color(51, 51, 51));
        btModifProduct.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        btModifProduct.setForeground(new java.awt.Color(255, 255, 255));
        btModifProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProductominiedit.png"))); // NOI18N
        btModifProduct.setText("Modificar información del Producto Seleccionado");
        btModifProduct.setEnabled(false);
        btModifProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(47, 47, 47)
                        .addComponent(lbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34)
                    .addComponent(btModifProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(btDescripCateg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(lbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btDescripCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btModifProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(700, 10, 460, 300);

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nombre del Producto");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(310, 460, 120, 17);

        txtInfo.setBackground(new java.awt.Color(204, 51, 0));
        txtInfo.setColumns(10);
        txtInfo.setEditable(false);
        txtInfo.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        txtInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtInfo.setRows(5);
        txtInfo.setText("  ");
        txtInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtInfo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInfo.setEnabled(false);
        txtInfo.setMaximumSize(new java.awt.Dimension(390, 130));
        txtInfo.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(txtInfo);
        txtInfo.setBounds(310, 480, 389, 46);

        jPanel3.setOpaque(false);

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Codigo del Producto");

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Cantidad Bodega");

        lbCodProd.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbCodProd.setForeground(new java.awt.Color(255, 255, 255));
        lbCodProd.setBorder(new javax.swing.border.MatteBorder(null));

        lbCantidadBod.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbCantidadBod.setForeground(new java.awt.Color(255, 255, 255));
        lbCantidadBod.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(lbCantidadBod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(lbCantidadBod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(300, 30, 391, 80);

        lbNombreUsuarioProd.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lbNombreUsuarioProd.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuarioProd.setText("Nombre usuario");
        getContentPane().add(lbNombreUsuarioProd);
        lbNombreUsuarioProd.setBounds(160, 640, 120, 20);

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Usuario Logeado:");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(30, 640, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barraProductosUsuario.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 600, 1230, 100);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProducto.png"))); // NOI18N
        jLabel2.setText("Productos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(770, 390, 270, 130);

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Costo unitario por Arriendo:");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(310, 540, 194, 20);

        lbCostUniA.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lbCostUniA.setForeground(new java.awt.Color(255, 255, 255));
        lbCostUniA.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lbCostUniA);
        lbCostUniA.setBounds(540, 540, 120, 17);

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Costo unitario por Compra:");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(310, 560, 186, 20);

        lbCostUniC.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lbCostUniC.setForeground(new java.awt.Color(255, 255, 255));
        lbCostUniC.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lbCostUniC);
        lbCostUniC.setBounds(540, 560, 120, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoProductos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 1180, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoProdActionPerformed
        new dialogNuevoProducto(new javax.swing.JDialog(), true).setVisible(true); //cambie la herencia de frame a jdialog
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }//GEN-LAST:event_btNuevoProdActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Salir de la aplicación?\n Si desea volver a Ventana inicio, "
                + "presione Volver al Inicio Rapido", "\tConfirmacion de Salida", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_formWindowClosing

    private void txtBuscadorProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorProdKeyReleased
        String buscador = txtBuscadorProd.getText();
        sqlproducto.buscarProducto(buscador);
        tablaProductos.setModel(sqlproducto.tablaTodosProd);
    }//GEN-LAST:event_txtBuscadorProdKeyReleased

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sqlproducto.llenarTablaProducto();
        tablaProductos.setModel(sqlproducto.tablaTodosProd);
    }//GEN-LAST:event_formWindowOpened

    private void btModifProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifProductActionPerformed
        
        dialogModificarProducto modifproducto = new dialogModificarProducto(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        modifproducto.lbCodProdM.setText(lbCodProd.getText());
        
        modifproducto.setVisible(true);
        modifproducto.setResizable(false);
        modifproducto.setLocationRelativeTo(null);
        modifproducto.pack();  
        
        lbCodProd.setText("");
        lbCantidadBod.setText("");
        lbCategoria.setText("");
        txtInfo.setText("");
        
        ImageIcon foto=new ImageIcon("");
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(lbFotoProducto.getWidth(), lbFotoProducto.getHeight(),Image.SCALE_DEFAULT));
        lbFotoProducto.setIcon(icono);
        lbCostUniA.setText("");
        lbCostUniC.setText("");
        txtBuscadorProd.setText("");;
        jlistaProvedores.clearSelection();
        
        sqlproducto.listaProveedoresProducto.clear();
        
    }//GEN-LAST:event_btModifProductActionPerformed

    private void btModifProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifProduct2ActionPerformed
        consultaSalir();
    }//GEN-LAST:event_btModifProduct2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        tablaProductos.getTableHeader().setReorderingAllowed(false) ;
        
        sqlproducto.llenarTablaProducto();        
        tablaProductos.setModel(sqlproducto.tablaTodosProd);
        
        if(!lbCodProd.getText().equals(""))
        {
            btDescripCateg.setEnabled(true);
            btModifProduct.setEnabled(true);
            btInformeProductoSelec.setEnabled(true);
                    
                    
        }else
        {
           
            btDescripCateg.setEnabled(false);
            btModifProduct.setEnabled(false);
            btInformeProductoSelec.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowActivated

    private void btDescripCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDescripCategActionPerformed
    dialogDescripCategoria descripcionCateg = new dialogDescripCategoria(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        descripcionCateg.lbNombreCategoria.setText(lbCategoria.getText());
        descripcionCateg.setVisible(true);
        descripcionCateg.setResizable(false);
        descripcionCateg.setLocationRelativeTo(null);
        descripcionCateg.pack();     
        
        
    }//GEN-LAST:event_btDescripCategActionPerformed

    private void btInformeProductoSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInformeProductoSelecActionPerformed
        String idProducto = lbCodProd.getText();
        String nombreusuario = lbNombreUsuarioProd.getText();
                
        ReportesProducto reporte = new ReportesProducto();
        reporte.runReporte(idProducto, nombreusuario);
    }//GEN-LAST:event_btInformeProductoSelecActionPerformed

    private void tablaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMousePressed
            btInformeProductoSelec.setEnabled(true);
        btModifProduct.setEnabled(true);
    btDescripCateg.setEnabled(true);
    
         int row = tablaProductos.getSelectedRow();         
         String id=tablaProductos.getValueAt(row, 0).toString();
        
        //lista Proveedores
        sqlproducto.buscarProveedorPorProd(id);
        jlistaProvedores.setModel(sqlproducto.listaProveedoresProducto); 

        //obtener la foto a partir del registro de la ID
        Image dtCat = sqlproducto.getfoto(id);
        Image i = dtCat.getScaledInstance(390,303, Image.SCALE_AREA_AVERAGING); //aqui se denota 
        //las dimensiones de la imagen en el jlabel
        Icon icon = new ImageIcon(i);
        lbFotoProducto.setIcon(icon);
         
         ArrayList datos=new ArrayList();
         datos=sqlproducto.buscarProductoSelecc(id);
         
         lbCodProd.setText(datos.get(0).toString());// aca obtengo los datos de arreglo
         txtInfo.setText(datos.get(2).toString()+" "+ datos.get(1));
         lbCantidadBod.setText(datos.get(3).toString());
         lbCostUniA.setText(datos.get(4).toString());
         lbCostUniC.setText(datos.get(5).toString());
         
         String nombreCategoria= sqlproducto.buscarCategProd(id);  
         lbCategoria.setText(nombreCategoria);
    }//GEN-LAST:event_tablaProductosMousePressed
///////////////////////////////////////////
public void consultaSalir()
    {
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ir al Inicio Rapido?", "\tConfirmacion al Inicio Rapido",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            principal.lbNombreUusario.setText(lbNombreUsuarioProd.getText());
            
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }    
///////////////////////////////////////////
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuProductos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDescripCateg;
    private javax.swing.JButton btInformeProductoSelec;
    private javax.swing.JButton btModifProduct;
    private javax.swing.JButton btModifProduct2;
    private javax.swing.JButton btNuevoProd;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList jlistaProvedores;
    private javax.swing.JLabel lbCantidadBod;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodProd;
    private javax.swing.JLabel lbCostUniA;
    private javax.swing.JLabel lbCostUniC;
    private javax.swing.JLabel lbFotoProducto;
    public static javax.swing.JLabel lbNombreUsuarioProd;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtBuscadorProd;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables
}
