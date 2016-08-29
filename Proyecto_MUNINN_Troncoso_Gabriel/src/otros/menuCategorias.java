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
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class menuCategorias extends javax.swing.JFrame {
ConexionBD conexionbd = new ConexionBD();
SQLCategoria sqlCategoria = new SQLCategoria();
SQLProveedor sqlProveedor = new SQLProveedor();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    
    public menuCategorias() {
        initComponents();
        setResizable(true);
        setLocationRelativeTo(null);
        
        //proveedores
        sqlProveedor.tablaTodosProv.addColumn("Codigo");
        sqlProveedor.tablaTodosProv.addColumn("Nombre");    
        //categorias
        sqlCategoria.tablaTodasCateg.addColumn("Codigo");
        sqlCategoria.tablaTodasCateg.addColumn("Nombre");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        lbNombreUsuarioCateg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btModificarCateg = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtxBuscadorCateg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtADescrip = new javax.swing.JTextArea();
        lbNombCat = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbCodCat = new javax.swing.JLabel();
        btArriendosTerm1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Categorias");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(780, 640));
        setMinimumSize(new java.awt.Dimension(780, 640));
        setPreferredSize(new java.awt.Dimension(780, 640));
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

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel18.setText("Usuario:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 570, 50, 17);

        lbNombreUsuarioCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNombreUsuarioCateg.setText("usuario nombre");
        getContentPane().add(lbNombreUsuarioCateg);
        lbNombreUsuarioCateg.setBounds(70, 570, 140, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barraCategoriaUsuario.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 550, 810, 80);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel16.setText("Registro de Categorias ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(470, 440, 259, 36);

        jButton3.setBackground(new java.awt.Color(125, 150, 164));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        jButton3.setText("Nuevo Registro Categoria");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(454, 231, 282, 57);

        btModificarCateg.setBackground(new java.awt.Color(125, 150, 164));
        btModificarCateg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btModificarCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoLapiz.png"))); // NOI18N
        btModificarCateg.setText("Modificar Registro de una Categoria");
        btModificarCateg.setEnabled(false);
        btModificarCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarCategActionPerformed(evt);
            }
        });
        getContentPane().add(btModificarCateg);
        btModificarCateg.setBounds(10, 490, 426, 56);

        jPanel4.setBackground(new java.awt.Color(195, 210, 213));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel4.setOpaque(false);

        txtxBuscadorCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtxBuscadorCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtxBuscadorCategKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Busque por Codigo o Nombre");

        tablaCat.setBackground(new java.awt.Color(195, 210, 213));
        tablaCat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaCatMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCat);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtxBuscadorCateg))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtxBuscadorCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 11, 726, 214);

        jPanel3.setBackground(new java.awt.Color(195, 210, 213));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Descipción");

        txtADescrip.setBackground(new java.awt.Color(204, 204, 204));
        txtADescrip.setColumns(20);
        txtADescrip.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtADescrip.setRows(5);
        txtADescrip.setBorder(null);
        txtADescrip.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtADescrip.setEnabled(false);
        jScrollPane3.setViewportView(txtADescrip);

        lbNombCat.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNombCat.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel14.setText("Codigo");

        lbCodCat.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbCodCat.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbCodCat, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 133, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14)
                    .addComponent(lbCodCat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombCat, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 231, 426, 253);

        btArriendosTerm1.setBackground(new java.awt.Color(125, 150, 164));
        btArriendosTerm1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btArriendosTerm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonCategoria.png"))); // NOI18N
        btArriendosTerm1.setText(" Volver al Inicio Rapido");
        btArriendosTerm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArriendosTerm1ActionPerformed(evt);
            }
        });
        getContentPane().add(btArriendosTerm1);
        btArriendosTerm1.setBounds(460, 490, 280, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCategoria2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 290, 148, 148);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCategoria.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 790, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.print("Mostrar Nueva Categoria... \n");  
       new dialogNuevaCategoria(this, true).setVisible(true);
       setResizable(false);
       setLocationRelativeTo(null);   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtxBuscadorCategKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtxBuscadorCategKeyReleased
        String buscador = txtxBuscadorCateg.getText();
        sqlCategoria.buscarCategoria(buscador);
        tablaCat.setModel(sqlCategoria.tablaTodasCateg);
    }//GEN-LAST:event_txtxBuscadorCategKeyReleased

    private void tablaCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCatMouseClicked
        
        
         
    }//GEN-LAST:event_tablaCatMouseClicked

    private void btModificarCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarCategActionPerformed
       System.out.print("Mostrar Modificar Categoria... \n");  
       
       dialogModificarCategoria modifcateg = new dialogModificarCategoria(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
       modifcateg.txtCodcategM.setText(lbCodCat.getText()); 
       modifcateg.setVisible(true);
       modifcateg.setResizable(false);
       modifcateg.setLocationRelativeTo(null);   
       
       
    }//GEN-LAST:event_btModificarCategActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        sqlCategoria.llenadolistaCateg();
        tablaCat.setModel(sqlCategoria.tablaTodasCateg);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
tablaCat.getTableHeader().setReorderingAllowed(false) ;
        System.out.print("Actualizando Tabla de Categorias\n");
        sqlCategoria.llenadolistaCateg();
        tablaCat.setModel(sqlCategoria.tablaTodasCateg);
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
            principal.lbNombreUusario.setText(lbNombreUsuarioCateg.getText());

        } else {
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }

    }//GEN-LAST:event_btArriendosTerm1ActionPerformed

    private void tablaCatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCatMousePressed
        btModificarCateg.setEnabled(true);
        int row = tablaCat.getSelectedRow();         
         String id=tablaCat.getValueAt(row, 0).toString();
         
         limpiarlabelsCateg();
         
         ArrayList datos=new ArrayList();
         datos=sqlCategoria.buscarCategoriaSelecc(id);
         
         lbCodCat.setText(datos.get(0).toString());
         lbNombCat.setText(datos.get(1).toString());// aca obtengo los datos de arreglo
         txtADescrip.setText(datos.get(2).toString());
    }//GEN-LAST:event_tablaCatMousePressed

 

  void limpiarlabelsCateg()
{
lbCodCat.setText("");
lbNombCat.setText("");
txtADescrip.setText("");
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
            java.util.logging.Logger.getLogger(menuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuCategorias().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArriendosTerm1;
    private javax.swing.JButton btModificarCateg;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbCodCat;
    private javax.swing.JLabel lbNombCat;
    public static javax.swing.JLabel lbNombreUsuarioCateg;
    private javax.swing.JTable tablaCat;
    private javax.swing.JTextArea txtADescrip;
    private javax.swing.JTextField txtxBuscadorCateg;
    // End of variables declaration//GEN-END:variables
}
