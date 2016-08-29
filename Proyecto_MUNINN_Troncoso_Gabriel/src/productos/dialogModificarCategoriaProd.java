/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import otros.Categoria;
import otros.Proveedor;
import otros.SQLCategoria;

/**
 *
 * @author Gabriel
 */
public class dialogModificarCategoriaProd extends javax.swing.JDialog {

SQLCategoria sqlcategoria = new SQLCategoria();
Categoria categoriaclase = new Categoria();
SQLProducto sqlproducto= new SQLProducto();
Producto productoclase = new Producto();
Proveedor proveedorclase = new Proveedor();
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 

    public dialogModificarCategoriaProd(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistCategoriasRegist = new javax.swing.JList();
        txtNombreCategSelect = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btAddCateg = new javax.swing.JButton();
        btActualizarCategoria = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbNombrCategM = new javax.swing.JLabel();
        btAddCateg1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbCodProdCateg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Actualizacion de Categoria relacionada");
        setMinimumSize(new java.awt.Dimension(465, 360));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(226, 223, 197));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Categorias Registradas");

        jlistCategoriasRegist.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jlistCategoriasRegist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistCategoriasRegistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlistCategoriasRegist);

        txtNombreCategSelect.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombreCategSelect.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreCategSelect.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Categoria Seleccionada");

        btAddCateg.setBackground(new java.awt.Color(51, 51, 51));
        btAddCateg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btAddCateg.setForeground(new java.awt.Color(204, 204, 204));
        btAddCateg.setText("Añadir Categoria");
        btAddCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCategActionPerformed(evt);
            }
        });

        btActualizarCategoria.setBackground(new java.awt.Color(51, 51, 51));
        btActualizarCategoria.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btActualizarCategoria.setForeground(new java.awt.Color(204, 204, 204));
        btActualizarCategoria.setText("Actualizar Categoria");
        btActualizarCategoria.setEnabled(false);
        btActualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria Registrada Actualmente:");

        lbNombrCategM.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbNombrCategM.setForeground(new java.awt.Color(255, 255, 255));
        lbNombrCategM.setText("Nombre de la Categoria");

        btAddCateg1.setBackground(new java.awt.Color(51, 51, 51));
        btAddCateg1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btAddCateg1.setForeground(new java.awt.Color(204, 204, 204));
        btAddCateg1.setText("Cerrar Ventana");
        btAddCateg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCateg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreCategSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(btActualizarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNombrCategM)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btAddCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddCateg1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombrCategM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreCategSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btActualizarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddCateg1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 60, 436, 258);

        jPanel3.setBackground(new java.awt.Color(226, 223, 197));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo del Producto: ");

        lbCodProdCateg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbCodProdCateg.setForeground(new java.awt.Color(255, 255, 255));
        lbCodProdCateg.setText("idprod");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCodProdCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbCodProdCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 11, 436, 43);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoModifProd.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 460, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCategActionPerformed
        dialogNuevaCategoriaProd nuevcateg = new dialogNuevaCategoriaProd(new javax.swing.JDialog(), true); 
        nuevcateg.setVisible(true);
        nuevcateg.setResizable(false);
        nuevcateg.setLocationRelativeTo(null);
        nuevcateg.pack();
        txtNombreCategSelect.setText("");
    }//GEN-LAST:event_btAddCategActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    sqlproducto.buscarCategorias();
    jlistCategoriasRegist.setModel(sqlproducto.listaCategorias); 
    
    if(!txtNombreCategSelect.getText().equals(""))
    {
        btActualizarCategoria.setEnabled(true);
    }
    else
    {btActualizarCategoria.setEnabled(false);
    }
    }//GEN-LAST:event_formWindowActivated

    private void jlistCategoriasRegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistCategoriasRegistMouseClicked
        btActualizarCategoria.setEnabled(true);
        String nomCategoria =jlistCategoriasRegist.getSelectedValue().toString();
        txtNombreCategSelect.setText(nomCategoria);
    }//GEN-LAST:event_jlistCategoriasRegistMouseClicked

    private void btActualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarCategoriaActionPerformed
        if (VerificarCampos())
        {
            String nombreCateg =jlistCategoriasRegist.getSelectedValue().toString();
            int idcateg = sqlproducto.getIdCategoria(nombreCateg); 
                          
            String codprod = lbCodProdCateg.getText();   
            int idprod= Integer.parseInt(codprod);
            
            String mismacategoria = sqlproducto.mismacategoriaReg(idcateg, idprod);
            
            
            if(mismacategoria.equals(""))
            {
                
                categoriaclase.setId_categoria(idcateg);
                productoclase.setId_Producto(idprod);                
                sqlproducto.agregarProveedorAProd(categoriaclase, productoclase);
                this.dispose();
            }
            else
            {
                 JOptionPane.showMessageDialog(rootPane, "El producto ya tiene agregado el categoria Seleccionado",  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            }
        } 
    }//GEN-LAST:event_btActualizarCategoriaActionPerformed

    private void btAddCateg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCateg1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btAddCateg1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
  
    
public boolean VerificarCampos()
{
    boolean respuesta=true;
    String variable1 = "";
   
    if (jlistCategoriasRegist.getSelectedIndex()==-1)
        {
            variable1=variable1+"Debe Seleccionar una Categoria de la lista\n";
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
            java.util.logging.Logger.getLogger(dialogModificarCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCategoriaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogModificarCategoriaProd dialog = new dialogModificarCategoriaProd(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btActualizarCategoria;
    private javax.swing.JButton btAddCateg;
    private javax.swing.JButton btAddCateg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlistCategoriasRegist;
    public static javax.swing.JLabel lbCodProdCateg;
    public static javax.swing.JLabel lbNombrCategM;
    private javax.swing.JTextField txtNombreCategSelect;
    // End of variables declaration//GEN-END:variables
}
