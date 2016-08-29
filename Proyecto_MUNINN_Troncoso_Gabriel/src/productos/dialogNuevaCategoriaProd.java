/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import otros.Categoria;
import otros.SQLCategoria;

/**
 *
 * @author Gabriel
 */
public class dialogNuevaCategoriaProd extends javax.swing.JDialog {

SQLCategoria sqlcategoria = new SQLCategoria();
Categoria categoriaclase = new Categoria();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 

    public dialogNuevaCategoriaProd(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombCateg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripCateg = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btAddCategoria = new javax.swing.JButton();
        btAddCategoria1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Nueva Categoria");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel5.setLayout(null);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAddCategoria.png"))); // NOI18N
        jLabel3.setText("Nueva Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1);
        jPanel1.setBounds(11, 12, 425, 124);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de Categoria");

        txtNombCateg.setBackground(new java.awt.Color(255, 255, 204));
        txtNombCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombCategKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombCategKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Descripción");

        txtADescripCateg.setBackground(new java.awt.Color(255, 255, 204));
        txtADescripCateg.setColumns(20);
        txtADescripCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtADescripCateg.setRows(5);
        txtADescripCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADescripCategKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtADescripCategKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtADescripCateg);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombCateg))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel3);
        jPanel3.setBounds(11, 147, 425, 149);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setOpaque(false);

        btAddCategoria.setBackground(new java.awt.Color(125, 150, 164));
        btAddCategoria.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btAddCategoria.setText("    Agregar Información de Categoria");
        btAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategoriaActionPerformed(evt);
            }
        });

        btAddCategoria1.setBackground(new java.awt.Color(125, 150, 164));
        btAddCategoria1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddCategoria1.setText("Cerrar Ventana");
        btAddCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategoria1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(btAddCategoria1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btAddCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAddCategoria1)
                .addGap(47, 47, 47))
        );

        jPanel5.add(jPanel4);
        jPanel4.setBounds(11, 302, 425, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCategoria.png"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 480, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategoriaActionPerformed
String nombcatg = txtNombCateg.getText();     
    String verifRut = sqlcategoria.existeCategoria(nombcatg); 
          
    if(verifRut.equals(""))
    {
        if(validarCateg())
        { 
            //conversion a mayuscula
            
            nombcatg = nombcatg.toUpperCase();
            
            String descripCateg = txtADescripCateg.getText();
            descripCateg = descripCateg.toUpperCase();
            
            categoriaclase.setNombre_categoria(nombcatg);
            categoriaclase.setDescripcion_categoria(descripCateg);  
            
            if(sqlcategoria.agregarCategoria(categoriaclase))
            {
                JOptionPane.showMessageDialog(rootPane, "La Categoria Fue agregada con exito",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
                this.dispose();
            }
            
            
            
        }
    }
    else
    {   
        System.out.print("ERROR La Categoria ya esta registrada\n");
        JOptionPane.showMessageDialog(rootPane, "La Categoria ya esta registrada",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
    }    
    }//GEN-LAST:event_btAddCategoriaActionPerformed

    private void txtNombCategKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCategKeyTyped
        if(txtNombCateg.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombCategKeyTyped

    private void txtADescripCategKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescripCategKeyTyped
        if(txtADescripCateg.getText().length()== 90) {
            evt.consume();
        }
    }//GEN-LAST:event_txtADescripCategKeyTyped

    private void txtNombCategKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCategKeyReleased
        String valor = txtNombCateg.getText();        
        if(valor.equals(""))        {
            txtNombCateg.setBackground(new Color (255,255,204));
        }
        else        {
            txtNombCateg.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNombCategKeyReleased

    private void txtADescripCategKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescripCategKeyReleased
        String valor = txtADescripCateg.getText();        
        if(valor.equals(""))        {
            txtADescripCateg.setBackground(new Color (255,255,204));
        }
        else        {
            txtADescripCateg.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtADescripCategKeyReleased

    private void btAddCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategoria1ActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cancelar??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_btAddCategoria1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

public boolean validarCateg()
    {
    
    boolean respuesta=true;
    String variable1 = "";
    
    if(txtNombCateg.getText().equals(""))
                {
                variable1= variable1 + "Debe ingresar el Nombre de la Categoria\n";
                txtNombCateg.requestFocus();
                respuesta=false;
                }
    else if(txtADescripCateg.getText().equals(""))
                {
                variable1= variable1 + "Debe ingresar la descripción de la Categoria\n";
                txtADescripCateg.requestFocus();
                respuesta=false;
                }
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    return respuesta;
    }        
    
    
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
            java.util.logging.Logger.getLogger(dialogNuevaCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogNuevaCategoriaProd dialog = new dialogNuevaCategoriaProd(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btAddCategoria;
    private javax.swing.JButton btAddCategoria1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADescripCateg;
    private javax.swing.JTextField txtNombCateg;
    // End of variables declaration//GEN-END:variables
}
