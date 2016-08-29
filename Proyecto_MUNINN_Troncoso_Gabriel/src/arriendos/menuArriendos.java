
package arriendos;

import clientes.Cliente;
import conexion.ConexionBD;
import inicio.inicioRapido;
import arriendos.dialogNuevoArriendo;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class menuArriendos extends javax.swing.JFrame {

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);

Cliente cliente = new Cliente();
ConexionBD conexionbd = new ConexionBD();
SQLArriendo sqlarriendo = new SQLArriendo();

    public menuArriendos() {
        initComponents();
        System.out.print("Menu Principal de Arriendos Iniciado \n");    
        setLocationRelativeTo(null);
        setResizable(false);
        
        sqlarriendo.tablaArriendosEnCurso.addColumn("id Arriendo");
        sqlarriendo.tablaArriendosEnCurso.addColumn("Cantidad Productos");
        sqlarriendo.tablaArriendosEnCurso.addColumn("Dia Inicial");
        sqlarriendo.tablaArriendosEnCurso.addColumn("Cliente");
        sqlarriendo.tablaArriendosEnCurso.addColumn("Usuario");
        
     
   
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreUsuarioArr = new javax.swing.JLabel();
        lbNombreUsuarioArr1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaArriendosEnCurso = new javax.swing.JTable();
        btInfoArriendo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btArriendosTerm = new javax.swing.JButton();
        btFinalArr = new javax.swing.JButton();
        btNewArr = new javax.swing.JButton();
        btArriendosTerm1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Arriendos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1062, 580));
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

        lbNombreUsuarioArr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNombreUsuarioArr.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuarioArr.setText("admin");
        getContentPane().add(lbNombreUsuarioArr);
        lbNombreUsuarioArr.setBounds(140, 520, 210, 17);

        lbNombreUsuarioArr1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNombreUsuarioArr1.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreUsuarioArr1.setText("Nombre Usuario");
        getContentPane().add(lbNombreUsuarioArr1);
        lbNombreUsuarioArr1.setBounds(30, 520, 110, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barraArriendosUsuario.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 500, 1120, 70);

        jPanel5.setBackground(new java.awt.Color(219, 228, 235));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Arriendos en Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setOpaque(false);

        tablaArriendosEnCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaArriendosEnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaArriendosEnCurso.setSelectionBackground(new java.awt.Color(87, 113, 194));
        tablaArriendosEnCurso.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaArriendosEnCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArriendosEnCursoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaArriendosEnCursoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaArriendosEnCurso);

        btInfoArriendo.setBackground(new java.awt.Color(65, 85, 128));
        btInfoArriendo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btInfoArriendo.setForeground(new java.awt.Color(255, 254, 254));
        btInfoArriendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniSeguimiento.png"))); // NOI18N
        btInfoArriendo.setText("Ver Detalles del Arriendo Seleccionado");
        btInfoArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfoArriendoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(btInfoArriendo, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btInfoArriendo)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(440, 11, 610, 409);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoArriendos.png"))); // NOI18N
        jLabel5.setText("Arriendos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 380, 210, 100);

        btArriendosTerm.setBackground(new java.awt.Color(65, 85, 128));
        btArriendosTerm.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btArriendosTerm.setForeground(new java.awt.Color(255, 254, 254));
        btArriendosTerm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniArriendosTerminados.png"))); // NOI18N
        btArriendosTerm.setText("Arriendos Completados");
        btArriendosTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArriendosTermActionPerformed(evt);
            }
        });
        getContentPane().add(btArriendosTerm);
        btArriendosTerm.setBounds(41, 186, 360, 53);

        btFinalArr.setBackground(new java.awt.Color(65, 85, 128));
        btFinalArr.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btFinalArr.setForeground(new java.awt.Color(255, 254, 254));
        btFinalArr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/terminar.png"))); // NOI18N
        btFinalArr.setText("      Terminar Arriendo");
        btFinalArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalArrActionPerformed(evt);
            }
        });
        getContentPane().add(btFinalArr);
        btFinalArr.setBounds(41, 78, 360, 49);

        btNewArr.setBackground(new java.awt.Color(65, 85, 128));
        btNewArr.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btNewArr.setForeground(new java.awt.Color(255, 254, 254));
        btNewArr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btNewArr.setText("   Crear Nuevo Arriendo");
        btNewArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewArrActionPerformed(evt);
            }
        });
        getContentPane().add(btNewArr);
        btNewArr.setBounds(41, 23, 360, 49);

        btArriendosTerm1.setBackground(new java.awt.Color(65, 85, 128));
        btArriendosTerm1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btArriendosTerm1.setForeground(new java.awt.Color(255, 254, 254));
        btArriendosTerm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ArriendobotonInicio.png"))); // NOI18N
        btArriendosTerm1.setText("Volver al Inicio Rapido");
        btArriendosTerm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArriendosTerm1ActionPerformed(evt);
            }
        });
        getContentPane().add(btArriendosTerm1);
        btArriendosTerm1.setBounds(700, 430, 350, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoArriendos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1080, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Salir de la aplicación?\n Si desea volver a Ventana inicio, "
                + "presione Volver al Inicio Rapido", "\tConfirmacion de Salida",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_formWindowClosing

    private void btNewArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewArrActionPerformed
        
        String valor1 = sqlarriendo.obtenerIdProductoDisp();
        System.out.print("Valor obtenido: "+valor1+"\n");
        
        if(valor1 == null) //valida si la primera fila de la tabla sql producto esta vaacio o null
        {
        JOptionPane.showMessageDialog(rootPane, "No Se puede Iniciar un Arriendo \n "
                + "RAZON: No hay productos registrados","Notificación", 
                JOptionPane.PLAIN_MESSAGE, iconoInfo);
        }
        else
        {
        dialogAgregarClienteArr addclientarr = new dialogAgregarClienteArr(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        addclientarr.lbNombreUsuario.setText(lbNombreUsuarioArr.getText());
        addclientarr.setVisible(true);
        addclientarr.setResizable(false);
        addclientarr.setLocationRelativeTo(null);
        addclientarr.pack();
        }
       
          
    }//GEN-LAST:event_btNewArrActionPerformed

    private void btFinalArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalArrActionPerformed
         
        
        dialogBuscarIDArriendoFin idarriendofin = new dialogBuscarIDArriendoFin(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
     //   System.out.print("Abriendo Modificar Información del Cliente "+lb_cod.getText());
        idarriendofin.lbUsuarioActual.setText(lbNombreUsuarioArr.getText());
        
        idarriendofin.setVisible(true);
        idarriendofin.setResizable(false);
        idarriendofin.setLocationRelativeTo(null);
        idarriendofin.pack();  
        
    }//GEN-LAST:event_btFinalArrActionPerformed

    private void btArriendosTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArriendosTermActionPerformed
       
        dialogArriendosCompletados inforarrtermin = new dialogArriendosCompletados(new javax.swing.JDialog(), true);
        inforarrtermin.setResizable(false);
        inforarrtermin.setVisible(true);
        inforarrtermin.setLocationRelativeTo(null);
        inforarrtermin.pack();
        
    }//GEN-LAST:event_btArriendosTermActionPerformed

    private void btInfoArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfoArriendoActionPerformed
int rows = tablaArriendosEnCurso.getRowCount();
        
        if(rows > 0)
        {
            if(tablaArriendosEnCurso.getSelectedRows().length > 0)
            {
                int row = tablaArriendosEnCurso.getSelectedRow();         
                String id=tablaArriendosEnCurso.getValueAt(row, 0).toString();
        
                dialogInfoArriendoCurso infoarrcur = new dialogInfoArriendoCurso(new javax.swing.JDialog(), true);
        
                infoarrcur.lbCodArriendo.setText(id);
                
                infoarrcur.setResizable(false);
                infoarrcur.setVisible(true);
                infoarrcur.setLocationRelativeTo(null);
                infoarrcur.pack();
            }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "No ah seleccionado ningun Arriendo","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
            }
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "No hay Arriendos Registrados en la tabla","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btInfoArriendoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      sqlarriendo.buscaArriendosEnCurso();
      tablaArriendosEnCurso.setModel(sqlarriendo.tablaArriendosEnCurso);
    }//GEN-LAST:event_formWindowOpened

    private void tablaArriendosEnCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArriendosEnCursoMouseClicked
        
    }//GEN-LAST:event_tablaArriendosEnCursoMouseClicked

    private void btArriendosTerm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArriendosTerm1ActionPerformed
     
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ir al Inicio Rapido?", "\tConfirmacion al Inicio Rapido",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            principal.lbNombreUusario.setText(lbNombreUsuarioArr.getText());
            
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
      
    }//GEN-LAST:event_btArriendosTerm1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        sqlarriendo.buscaArriendosEnCurso(); 
      tablaArriendosEnCurso.setModel(sqlarriendo.tablaArriendosEnCurso);
      tablaArriendosEnCurso.getTableHeader().setReorderingAllowed(false) ;
    }//GEN-LAST:event_formWindowActivated

    private void tablaArriendosEnCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArriendosEnCursoMousePressed
btInfoArriendo.setEnabled(true);
    }//GEN-LAST:event_tablaArriendosEnCursoMousePressed

    void consultaSalir()
    {
        
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir?", "\tCerrar",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
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
            java.util.logging.Logger.getLogger(menuArriendos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuArriendos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuArriendos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuArriendos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuArriendos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArriendosTerm;
    private javax.swing.JButton btArriendosTerm1;
    private javax.swing.JButton btFinalArr;
    private javax.swing.JButton btInfoArriendo;
    private javax.swing.JButton btNewArr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbNombreUsuarioArr;
    private javax.swing.JLabel lbNombreUsuarioArr1;
    private javax.swing.JTable tablaArriendosEnCurso;
    // End of variables declaration//GEN-END:variables
}