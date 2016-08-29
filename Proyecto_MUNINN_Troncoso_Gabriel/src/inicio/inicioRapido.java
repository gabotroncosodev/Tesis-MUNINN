
package inicio;

import arriendos.menuArriendos;
import clientes.menuClientes;
import conexion.ConexionBD;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import otros.menuEleccion;
import productos.menuProductos;

public class inicioRapido extends javax.swing.JFrame {
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);  

ConexionBD conexionbd = new ConexionBD();
private int x; //Posicion del mouse
private int y;//Posicion del mouse

    public inicioRapido() {
               
        initComponents();
        conexionbd.conectar();
        System.out.print("Menu Principal Iniciado\n");   
        setLocationRelativeTo(null);
        setResizable(false);
        btIrClientes.setToolTipText("Acceda a los Opciones de Clientes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbNombreUusario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btIrArriendos = new javax.swing.JButton();
        btIrClientes = new javax.swing.JButton();
        btIrProductos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btIrOtros = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Inicio Rapido");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMaximumSize(new java.awt.Dimension(998, 505));
        setMinimumSize(new java.awt.Dimension(998, 505));
        setName("inicioRapido");
        setPreferredSize(new java.awt.Dimension(998, 505));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(138, 136, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Cambiar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 430, 150, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Acerca de");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(860, 430, 120, 40);

        lbNombreUusario.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lbNombreUusario.setText("Nombre usuario");
        getContentPane().add(lbNombreUusario);
        lbNombreUusario.setBounds(90, 440, 120, 20);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setText("Usuario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 440, 60, 20);

        btIrArriendos.setBackground(new java.awt.Color(51, 51, 51));
        btIrArriendos.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btIrArriendos.setForeground(new java.awt.Color(255, 255, 255));
        btIrArriendos.setText("Arriendos");
        btIrArriendos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrArriendosActionPerformed(evt);
            }
        });
        getContentPane().add(btIrArriendos);
        btIrArriendos.setBounds(67, 41, 293, 51);

        btIrClientes.setBackground(new java.awt.Color(51, 51, 51));
        btIrClientes.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btIrClientes.setForeground(new java.awt.Color(255, 255, 255));
        btIrClientes.setText("Clientes");
        btIrClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btIrClientes);
        btIrClientes.setBounds(67, 98, 293, 51);

        btIrProductos.setBackground(new java.awt.Color(51, 51, 51));
        btIrProductos.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btIrProductos.setForeground(new java.awt.Color(255, 255, 255));
        btIrProductos.setText("Productos");
        btIrProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btIrProductos);
        btIrProductos.setBounds(67, 155, 293, 53);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tituloPrograma.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 320, 350, 92);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 10, 500, 418);

        btIrOtros.setBackground(new java.awt.Color(51, 51, 51));
        btIrOtros.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btIrOtros.setForeground(new java.awt.Color(255, 255, 255));
        btIrOtros.setText("Otros");
        btIrOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIrOtrosActionPerformed(evt);
            }
        });
        getContentPane().add(btIrOtros);
        btIrOtros.setBounds(67, 214, 293, 51);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoInicio.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1000, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIrProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrProductosActionPerformed
        System.out.print("Abriendo Menu Principal de Productos\n ");    
        menuProductos producto = new menuProductos();
        
        this.dispose();
        producto.setLocationRelativeTo(null);
        producto.setVisible(true);
        producto.lbNombreUsuarioProd.setText(lbNombreUusario.getText());
        
    }//GEN-LAST:event_btIrProductosActionPerformed

    private void btIrClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrClientesActionPerformed
        //Clientes
        System.out.print("Abriendo Menu Principal de Clientes\n");    
        menuClientes cliente = new menuClientes();
        cliente.setVisible(true);
        this.dispose();        
        cliente.lbNombreUsuarioCli.setText(lbNombreUusario.getText());
        
    }//GEN-LAST:event_btIrClientesActionPerformed

    private void btIrArriendosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrArriendosActionPerformed
        // Arriendos
        System.out.print("Abriendo Menu Principal de Arriendos\n");      
        menuArriendos valorarr = new menuArriendos();       
        
        valorarr.lbNombreUsuarioArr.setText(lbNombreUusario.getText());
        
        valorarr.setLocationRelativeTo(null);
        valorarr.setVisible(true);
        valorarr.show();
        this.dispose();       
        
    }//GEN-LAST:event_btIrArriendosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea salir? \n Se cerrara la Aplicación", "\tCerrar",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
        if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            System.exit(0);
            }
        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_formWindowClosing

    private void btIrOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIrOtrosActionPerformed
     //Otras opciones
        System.out.print("Abriendo Menu Principal de 'Otras Opciones'...\n");      
        menuEleccion otrosform = new menuEleccion();
        
        otrosform.lbNombreUsuarioOtros.setText(lbNombreUusario.getText());
        
        otrosform.setVisible(true);
        otrosform.show();
        this.dispose();
    }//GEN-LAST:event_btIrOtrosActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        x = evt.getX(); 
        y = evt.getY(); 
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();//1
   // System.out.println("Coordenadas: ("+ubicacion.x+","+ubicacion.y+")");//2
    setLocation(ubicacion.x - x, ubicacion.y - y);//3
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AcercaDe acercadedialog = new AcercaDe(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        
        acercadedialog.setVisible(true);
        acercadedialog.setResizable(false);
        acercadedialog.setLocationRelativeTo(null);
        acercadedialog.pack();     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Cambiar de usuario?", "\tCerrar",
        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
        if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            ventanaLogin principalLogin = new ventanaLogin();
            principalLogin.pack();
            principalLogin.setLocationRelativeTo(null);
            principalLogin.setVisible(true);
            
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioRapido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new inicioRapido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIrArriendos;
    private javax.swing.JButton btIrClientes;
    private javax.swing.JButton btIrOtros;
    private javax.swing.JButton btIrProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel lbNombreUusario;
    // End of variables declaration//GEN-END:variables
}
