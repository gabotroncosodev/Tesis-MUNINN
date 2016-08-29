/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.awt.Event;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author Gabriel
 */
public class dialogNuevaCategoria extends javax.swing.JDialog {

SQLCategoria sqlcategoria = new SQLCategoria();
Categoria categoriaclase = new Categoria();
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);

    public dialogNuevaCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelarDialog = new javax.swing.JButton();
        btAddCategoria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombCateg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADescripCateg = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Nueva Categoria");
        setMaximumSize(new java.awt.Dimension(471, 430));
        setMinimumSize(new java.awt.Dimension(471, 430));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(471, 430));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btCancelarDialog.setBackground(new java.awt.Color(125, 150, 164));
        btCancelarDialog.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btCancelarDialog.setText("Cerrar Ventana");
        btCancelarDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarDialogActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelarDialog);
        btCancelarDialog.setBounds(30, 340, 420, 50);

        btAddCategoria.setBackground(new java.awt.Color(125, 150, 164));
        btAddCategoria.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoNuevo.png"))); // NOI18N
        btAddCategoria.setText("    Agregar Información");
        btAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btAddCategoria);
        btAddCategoria.setBounds(30, 269, 420, 60);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAddCategoria.png"))); // NOI18N
        jLabel3.setText("Nueva Categoria");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 11, 268, 100);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de Categoria ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 120, 124, 17);

        txtNombCateg.setBackground(new java.awt.Color(255, 255, 204));
        txtNombCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombCategKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombCategKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombCateg);
        txtNombCateg.setBounds(144, 117, 300, 30);

        txtADescripCateg.setBackground(new java.awt.Color(255, 255, 204));
        txtADescripCateg.setColumns(20);
        txtADescripCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtADescripCateg.setRows(5);
        txtADescripCateg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtADescripCategKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtADescripCategKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtADescripCateg);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(144, 151, 300, 110);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(61, 151, 65, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCategoria.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-160, -30, 660, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategoriaActionPerformed
    String nombcatg = txtNombCateg.getText();     
    String verificarExistC = sqlcategoria.existeCategoria(nombcatg); 
          
    if(verificarExistC.equals(""))
    {
        if(validarCateg())
        { 
            //conversion a mayuscula
            
            nombcatg = nombcatg.toUpperCase();
            
            String descripCateg = txtADescripCateg.getText();
            descripCateg = descripCateg.toUpperCase();
            
            categoriaclase.setNombre_categoria(nombcatg);
            categoriaclase.setDescripcion_categoria(descripCateg);  
            sqlcategoria.agregarCategoria(categoriaclase);
            
            int mensaje= JOptionPane.showConfirmDialog(rootPane, "Categoria Agregada con Exito \n ¿Desea agregar otra Categoria?", "\tConfirmación",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
                txtNombCateg.setText("");
            txtADescripCateg.setText("");
            
            }

        else{
            this.dispose();
            }
        }
    }
    else
    {   
        System.out.print("ERROR La Categoria ya esta registrada\n");
        JOptionPane.showMessageDialog(rootPane, "Atencion: La Categoria ya se encuentra Registrada","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
    }    
    }//GEN-LAST:event_btAddCategoriaActionPerformed

    private void txtNombCategKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCategKeyTyped
        if(txtNombCateg.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombCategKeyTyped

    private void txtADescripCategKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescripCategKeyTyped
        if(txtADescripCateg.getText().length()== 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtADescripCategKeyTyped

    private void btCancelarDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarDialogActionPerformed

        int consulta= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Cancelar esta operación? \n Todos los cambios sin guardar se Perderan", 
         "\tConfirmación",  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(consulta==JOptionPane.YES_NO_OPTION)
            {
            this.dispose();
            }

        else{
            if(txtNombCateg.getText().equals(""))
            {
                txtNombCateg.requestFocus();
                if(txtADescripCateg.getText().equals(""))
                {
                txtADescripCateg.requestFocus();
                }
            }
            }
    }//GEN-LAST:event_btCancelarDialogActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtNombCategKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombCategKeyPressed
InputMap map2 = txtNombCateg.getInputMap(txtNombCateg.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtNombCategKeyPressed

    private void txtADescripCategKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtADescripCategKeyPressed
InputMap map2 = txtNombCateg.getInputMap(txtNombCateg.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtADescripCategKeyPressed

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
            java.util.logging.Logger.getLogger(dialogNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNuevaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogNuevaCategoria dialog = new dialogNuevaCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btCancelarDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADescripCateg;
    private javax.swing.JTextField txtNombCateg;
    // End of variables declaration//GEN-END:variables
}
