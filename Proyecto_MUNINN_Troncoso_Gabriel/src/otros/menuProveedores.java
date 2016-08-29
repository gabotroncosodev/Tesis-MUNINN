package otros;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import conexion.ConexionBD;
import inicio.inicioRapido;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class menuProveedores extends javax.swing.JFrame {
ConexionBD conexionbd = new ConexionBD();
SQLCategoria sqlCategoria = new SQLCategoria();
SQLProveedor sqlProveedor = new SQLProveedor();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    
    public menuProveedores() {
        initComponents();
        setResizable(true);
        setLocationRelativeTo(null);
        
        //proveedores
        sqlProveedor.tablaTodosProv.addColumn("Codigo");
        sqlProveedor.tablaTodosProv.addColumn("Nombre");    
        //categorias
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreUsuarioProv = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtxBuscadorProv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProv = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbCodProv = new javax.swing.JLabel();
        lbNombProv = new javax.swing.JLabel();
        lbDirProv = new javax.swing.JLabel();
        lbFonoProv = new javax.swing.JLabel();
        lbCiuProv = new javax.swing.JLabel();
        lbMailProv = new javax.swing.JLabel();
        lbSitioWebProv = new javax.swing.JLabel();
        btNuevoProv = new javax.swing.JButton();
        btModifProv = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btArriendosTerm1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Proveedores");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(920, 560));
        setMinimumSize(new java.awt.Dimension(920, 560));
        setPreferredSize(new java.awt.Dimension(930, 560));
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

        lbNombreUsuarioProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNombreUsuarioProv.setText("usuario nombre");
        getContentPane().add(lbNombreUsuarioProv);
        lbNombreUsuarioProv.setBounds(90, 480, 130, 14);

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setText("Usuario");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 480, 50, 14);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barraProveedoresUsuario.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 470, 990, 60);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel15.setText("Proveedores");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(653, 312, 186, 44);

        jPanel1.setBackground(new java.awt.Color(195, 213, 195));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);

        txtxBuscadorProv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtxBuscadorProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtxBuscadorProvKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Busque por Codigo o Nombre");

        tablaProv.setBackground(new java.awt.Color(222, 245, 222));
        tablaProv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProvMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaProvMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProv);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtxBuscadorProv, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 193, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtxBuscadorProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 879, 193);

        jPanel2.setBackground(new java.awt.Color(195, 213, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Codigo Proveedor");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Correo Electronico");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Sitio Web");

        lbCodProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbCodProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbNombProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNombProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbDirProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbDirProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbFonoProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbFonoProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbCiuProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbCiuProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbMailProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbMailProv.setBorder(new javax.swing.border.MatteBorder(null));

        lbSitioWebProv.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbSitioWebProv.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNombProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(lbDirProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFonoProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCiuProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbMailProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSitioWebProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbCodProv, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lbCodProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lbNombProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lbDirProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbFonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCiuProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMailProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lbSitioWebProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 210, 448, 181);

        btNuevoProv.setBackground(new java.awt.Color(95, 107, 95));
        btNuevoProv.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btNuevoProv.setForeground(new java.awt.Color(255, 255, 255));
        btNuevoProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btNuevoProv.setText("                 Nuevo Registro Proveedor");
        btNuevoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoProvActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevoProv);
        btNuevoProv.setBounds(489, 210, 400, 49);

        btModifProv.setBackground(new java.awt.Color(95, 107, 95));
        btModifProv.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btModifProv.setForeground(new java.awt.Color(255, 255, 255));
        btModifProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoLapiz.png"))); // NOI18N
        btModifProv.setText("Modificar registro de un Proveedor");
        btModifProv.setEnabled(false);
        btModifProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifProvActionPerformed(evt);
            }
        });
        getContentPane().add(btModifProv);
        btModifProv.setBounds(10, 403, 448, 49);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProveedorRed.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(497, 270, 127, 127);

        btArriendosTerm1.setBackground(new java.awt.Color(95, 107, 95));
        btArriendosTerm1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btArriendosTerm1.setForeground(new java.awt.Color(255, 255, 255));
        btArriendosTerm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonProveedor.png"))); // NOI18N
        btArriendosTerm1.setText("Volver al Inicio Rapido");
        btArriendosTerm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArriendosTerm1ActionPerformed(evt);
            }
        });
        getContentPane().add(btArriendosTerm1);
        btArriendosTerm1.setBounds(500, 400, 390, 60);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProveedores.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 970, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModifProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifProvActionPerformed
     
       
       System.out.print("Mostrar Modificar Proveedor... \n");  
       
       dialogModificarProveedor modifprov = new dialogModificarProveedor(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
       
       modifprov.txtCodProvMod.setText(lbCodProv.getText()); 
       System.out.print(lbCodProv.getText()+" \n"); 
       
       modifprov.setVisible(true);
       modifprov.setResizable(false);
       modifprov.setLocationRelativeTo(null);   
       
       limpiarlabelsProveed();    
       
       
    }//GEN-LAST:event_btModifProvActionPerformed

    private void btNuevoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoProvActionPerformed
       System.out.print("Mostrar Nuevo Proveedor... \n");  
       new dialogNuevoProveedor(this, true).setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);       
    }//GEN-LAST:event_btNuevoProvActionPerformed

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

    private void txtxBuscadorProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxBuscadorProvKeyReleased
        String buscador = txtxBuscadorProv.getText();
        sqlProveedor.buscarProveedor(buscador);
        tablaProv.setModel(sqlProveedor.tablaTodosProv);
    }//GEN-LAST:event_txtxBuscadorProvKeyReleased

    private void tablaProvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProvMouseClicked
       
         
    }//GEN-LAST:event_tablaProvMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sqlProveedor.llenadolistaProv();
        tablaProv.setModel(sqlProveedor.tablaTodosProv);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
tablaProv.getTableHeader().setReorderingAllowed(false) ;
        System.out.print("Actualizando Tabla de Proveedores\n");
        sqlProveedor.llenadolistaProv();
        tablaProv.setModel(sqlProveedor.tablaTodosProv);
        
    }//GEN-LAST:event_formWindowActivated

    private void btArriendosTerm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArriendosTerm1ActionPerformed

        int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ir al Inicio Rapido?", "\tConfirmacion al Inicio Rapido",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
        if (mensaje == JOptionPane.YES_NO_OPTION) {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            principal.lbNombreUusario.setText(lbNombreUsuarioProv.getText());

        } else {
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btArriendosTerm1ActionPerformed

    private void tablaProvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProvMousePressed
        btModifProv.setEnabled(true);
        int row = tablaProv.getSelectedRow();         
         String id=tablaProv.getValueAt(row, 0).toString();
         lbCodProv.setText(id);
         limpiarlabelsProveed();
         
         ArrayList datos=new ArrayList();
         datos=sqlProveedor.buscarProvSelecc(id);         
         
         lbCodProv.setText(datos.get(0).toString());// aca obtengo los datos de arreglo
         lbNombProv.setText(datos.get(1).toString());
         lbDirProv.setText(datos.get(2).toString());
         lbFonoProv.setText(datos.get(3).toString());
         lbCiuProv.setText(datos.get(4).toString());
         lbMailProv.setText(datos.get(5).toString());
         lbSitioWebProv.setText(datos.get(6).toString());
    }//GEN-LAST:event_tablaProvMousePressed

    
 void limpiarlabelsProveed()
{
lbCodProv.setText("");
lbNombProv.setText("");
lbDirProv.setText("");
lbFonoProv.setText("");
lbCiuProv.setText("");
lbMailProv.setText("");
lbSitioWebProv.setText("");
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
            java.util.logging.Logger.getLogger(menuProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuProveedores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArriendosTerm1;
    private javax.swing.JButton btModifProv;
    private javax.swing.JButton btNuevoProv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCiuProv;
    private javax.swing.JLabel lbCodProv;
    private javax.swing.JLabel lbDirProv;
    private javax.swing.JLabel lbFonoProv;
    private javax.swing.JLabel lbMailProv;
    private javax.swing.JLabel lbNombProv;
    public static javax.swing.JLabel lbNombreUsuarioProv;
    private javax.swing.JLabel lbSitioWebProv;
    private javax.swing.JTable tablaProv;
    private javax.swing.JTextField txtxBuscadorProv;
    // End of variables declaration//GEN-END:variables
}
