
package otros;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

public class dialogModificarCategoria extends javax.swing.JDialog {
Categoria categoriaclase = new Categoria();    
SQLCategoria sqlcategoria = new SQLCategoria();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);


    public dialogModificarCategoria(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        sqlcategoria.tablaTodasCateg.addColumn("CodInterno");
        sqlcategoria.tablaTodasCateg.addColumn("Rut");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btAddModifCateg = new javax.swing.JButton();
        txtCodcategM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombcategM = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescrpCategM = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btAddModifCateg1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Modificación de una Categoria");
        setMaximumSize(new java.awt.Dimension(436, 480));
        setMinimumSize(new java.awt.Dimension(436, 480));
        setPreferredSize(new java.awt.Dimension(436, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(222, 227, 238));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setOpaque(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonEditCategoria.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Modificar Registro");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("de una Categoria");

        btAddModifCateg.setBackground(new java.awt.Color(121, 132, 157));
        btAddModifCateg.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddModifCateg.setText("Agregar Cambios");
        btAddModifCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddModifCategActionPerformed(evt);
            }
        });

        txtCodcategM.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCodcategM.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombcategM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombcategMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombcategMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombcategMKeyTyped(evt);
            }
        });

        txtADescrpCategM.setColumns(20);
        txtADescrpCategM.setRows(5);
        txtADescrpCategM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtADescrpCategMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtADescrpCategMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtADescrpCategMKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtADescrpCategM);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        btAddModifCateg1.setBackground(new java.awt.Color(121, 132, 157));
        btAddModifCateg1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddModifCateg1.setText("Cerrar Ventana");
        btAddModifCateg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddModifCateg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombcategM, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodcategM, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btAddModifCateg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAddModifCateg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodcategM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombcategM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAddModifCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddModifCateg1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 440, 450);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCategoria.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-6, -16, 450, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddModifCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddModifCategActionPerformed
        
        if(validarCamposCateg())
        {System.out.print("Obteniendo información \n");
        
        //conversiones de String a int
        
            String id = txtCodcategM.getText();
            int idcat= Integer.parseInt(id);
            
        //ingreso de variables a la clase Cliente            
            
            //conversion a mayusculas
          String editNombCateg = txtNombcategM.getText();
          editNombCateg = editNombCateg.toUpperCase();
           
          String editDescripCateg = txtADescrpCategM.getText();
          editDescripCateg = editDescripCateg.toUpperCase();
            
            categoriaclase.setId_categoria(idcat);
            categoriaclase.setNombre_categoria(editNombCateg);
            categoriaclase.setDescripcion_categoria(editDescripCateg);
            
        //envia los datos a la clase y al metodo agregarCliente();            
            sqlcategoria.actualizarCateg(categoriaclase);
            JOptionPane.showMessageDialog(rootPane,"Se actualizo correctamente la información de la categoria","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
            this.dispose();
            
            
        }
        
        
        
    }//GEN-LAST:event_btAddModifCategActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String id = txtCodcategM.getText();
         
         ArrayList datos=new ArrayList();
         datos=sqlcategoria.buscarCategoriaSelecc(id);
         
         //lbCodCat.setText(datos.get(0).toString());
         txtNombcategM.setText(datos.get(1).toString());// aca obtengo los datos de arreglo
         txtADescrpCategM.setText(datos.get(2).toString());
    }//GEN-LAST:event_formWindowOpened

    private void txtNombcategMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombcategMKeyReleased
        String valor = txtNombcategM.getText();        
        if(valor.equals(""))        {
            txtNombcategM.setBackground(new Color (255,255,204));
        }
        else        {
            txtNombcategM.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtNombcategMKeyReleased

    private void txtADescrpCategMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescrpCategMKeyReleased
        String valor = txtADescrpCategM.getText();        
        if(valor.equals(""))        {
            txtADescrpCategM.setBackground(new Color (255,255,204));
        }
        else        {
            txtADescrpCategM.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtADescrpCategMKeyReleased

    private void btAddModifCateg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddModifCateg1ActionPerformed
         int mensaje= JOptionPane.showConfirmDialog(rootPane, " ¿Confirma Cancelar esta operación? \n Todos los cambios sin guardar se Perderan", "\tConfirmación",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.dispose();
            }
    }//GEN-LAST:event_btAddModifCateg1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtNombcategMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombcategMKeyPressed
InputMap map2 = txtNombcategM.getInputMap(txtNombcategM.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtNombcategMKeyPressed

    private void txtADescrpCategMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescrpCategMKeyTyped
   if(txtADescrpCategM.getText().length()== 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtADescrpCategMKeyTyped

    private void txtADescrpCategMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescrpCategMKeyPressed
InputMap map2 = txtADescrpCategM.getInputMap(txtADescrpCategM.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtADescrpCategMKeyPressed

    private void txtNombcategMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombcategMKeyTyped
   if(txtNombcategM.getText().length()== 40) {
            evt.consume();
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_txtNombcategMKeyTyped


public boolean validarCamposCateg()
    {
    boolean respuesta=true;
    String variable1 = "";
   
    if(txtNombcategM.getText().equals(""))
                {
                
                variable1=variable1+ "Error: Debe tener un Nombre\n";
                respuesta=false;
                txtNombcategM.requestFocus();
                }
    else if(txtADescrpCategM.getText().equals(""))
                {
                
                variable1=variable1+ "Error: Debe existir una Descripcion\n";
                respuesta=false;
                txtADescrpCategM.requestFocus();
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
            java.util.logging.Logger.getLogger(dialogModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogModificarCategoria dialog = new dialogModificarCategoria(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btAddModifCateg;
    private javax.swing.JButton btAddModifCateg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtADescrpCategM;
    public static javax.swing.JTextField txtCodcategM;
    private javax.swing.JTextField txtNombcategM;
    // End of variables declaration//GEN-END:variables
}
