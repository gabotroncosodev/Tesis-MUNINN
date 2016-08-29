
package clientes;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;

public class dialogModificarCliente extends javax.swing.JDialog {
 
SQLCliente sqlcliente =new SQLCliente();    
Cliente clienteclase = new Cliente();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);  


    public dialogModificarCliente(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
        //setResizable(false);
        
        
        sqlcliente.tablaTodosCli.addColumn("CodInterno");
        sqlcliente.tablaTodosCli.addColumn("Rut");
        sqlcliente.tablaTodosCli.addColumn("Nombre");
        sqlcliente.tablaTodosCli.addColumn("Apellido");
    }

    dialogModificarCliente() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btModificarCliente1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbCodigoClientMod = new javax.swing.JLabel();
        btModificarCliente = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtModifRutClien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModifDigClien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModifClientNomb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModifClientApell = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModifClientFono = new javax.swing.JTextField();
        txtAddClDig1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtModifClientDir = new javax.swing.JTextField();
        txtModifClientCom = new javax.swing.JTextField();
        txtModifClientCiu = new javax.swing.JTextField();
        txtModifClientMail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Modificar Registro de un Cliente");
        setMaximumSize(new java.awt.Dimension(690, 680));
        setMinimumSize(new java.awt.Dimension(690, 680));
        setName("Modificar Registro de un Cliente");
        setPreferredSize(new java.awt.Dimension(690, 680));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btModificarCliente1.setBackground(new java.awt.Color(92, 96, 67));
        btModificarCliente1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btModificarCliente1.setText("Cancelar");
        btModificarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarCliente1ActionPerformed(evt);
            }
        });
        getContentPane().add(btModificarCliente1);
        btModificarCliente1.setBounds(20, 560, 630, 50);

        jLabel1.setBackground(new java.awt.Color(194, 198, 174));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoEditCliente.png"))); // NOI18N
        jLabel1.setText("Modificar Registro de un Cliente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 452, 100);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo del Cliente");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 50, 153, 26);

        lbCodigoClientMod.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lbCodigoClientMod.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoClientMod.setText("1");
        getContentPane().add(lbCodigoClientMod);
        lbCodigoClientMod.setBounds(90, 80, 10, 26);

        btModificarCliente.setBackground(new java.awt.Color(92, 96, 67));
        btModificarCliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoGuardar.png"))); // NOI18N
        btModificarCliente.setText("Actualizar información del Cliente");
        btModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btModificarCliente);
        btModificarCliente.setBounds(20, 500, 630, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Rut Cliente");

        txtModifRutClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifRutClien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifRutClienKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifRutClienKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifRutClienKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("-");

        txtModifDigClien.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifDigClien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifDigClienKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifDigClienKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifDigClienKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Nombre o Razon Social");

        txtModifClientNomb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientNombKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifClientNombKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientNombKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Apellido");

        txtModifClientApell.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientApell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientApellKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifClientApellKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientApellKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Telefono");

        txtModifClientFono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientFono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientFonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifClientFonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientFonoKeyTyped(evt);
            }
        });

        txtAddClDig1.setBackground(new java.awt.Color(255, 255, 204));
        txtAddClDig1.setEditable(false);
        txtAddClDig1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtAddClDig1.setText("* Campos Obligatorios");
        txtAddClDig1.setBorder(null);
        txtAddClDig1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddClDig1KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Dirección");

        txtModifClientDir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientDirKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientDirKeyTyped(evt);
            }
        });

        txtModifClientCom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientComKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientComKeyTyped(evt);
            }
        });

        txtModifClientCiu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientCiuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientCiuKeyTyped(evt);
            }
        });

        txtModifClientMail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtModifClientMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtModifClientMailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModifClientMailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModifClientMailKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel12.setText("Comuna");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Ciudad");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setText("Correo Electronico");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtModifRutClien, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModifDigClien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(txtAddClDig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtModifClientNomb)
                    .addComponent(txtModifClientDir)
                    .addComponent(txtModifClientApell, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtModifClientFono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtModifClientCom)
                    .addComponent(txtModifClientCiu)
                    .addComponent(txtModifClientMail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtModifRutClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtModifDigClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAddClDig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtModifClientNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtModifClientApell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtModifClientFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtModifClientDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifClientCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifClientCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModifClientMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 160, 630, 320);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoClientes.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -60, 1050, 790);

        getAccessibleContext().setAccessibleDescription("Modificar Registro de un Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarClienteActionPerformed
if(validarCamposActCl1())
{
        if(validarCamposActCl2())
        {
        String rut = txtModifRutClien.getText();    
        String digv = txtModifDigClien.getText();
            if(sqlcliente.validaRut(rut, digv))
            {
                
            int RutCl= Integer.parseInt(rut);
            
            String idclient = lbCodigoClientMod.getText();
            int idcliente= Integer.parseInt(idclient);
                    
            String tfonocl = txtModifClientFono.getText();
            int telefno= Integer.parseInt(tfonocl);
            
            clienteclase.setId_cliente(idcliente);
            clienteclase.setRut_cliente(RutCl);
            clienteclase.setDigito_rut(digv.toUpperCase());
            clienteclase.setNombre_cliente(txtModifClientNomb.getText().toUpperCase());
            clienteclase.setApellido_cliente(txtModifClientApell.getText().toUpperCase());   
            clienteclase.setTelefono_cliente(telefno);
            clienteclase.setDireccion_cliente(txtModifClientDir.getText().toUpperCase());
            clienteclase.setComuna_cliente(txtModifClientCom.getText().toUpperCase());
            clienteclase.setCiudad_cliente(txtModifClientCiu.getText().toUpperCase());
            clienteclase.setEmail_cliente(txtModifClientMail.getText().toUpperCase());
            
            sqlcliente.actualizarCliente(clienteclase);
            this.dispose();

            }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "Atención, el Rut escrito es invalido","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError); 
            txtModifRutClien.requestFocus();
            txtModifRutClien.setBackground(new Color (255,255,204));
            txtModifDigClien.setBackground(new Color (255,255,204));
            }
      
}
}       
    }//GEN-LAST:event_btModificarClienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String id = lbCodigoClientMod.getText();
        
        ArrayList datos=new ArrayList();
        datos=sqlcliente.buscarClienteSelecc(id);
         
         txtModifRutClien.setText(datos.get(1).toString());
         txtModifDigClien.setText(datos.get(2).toString());
         txtModifClientNomb.setText(datos.get(3).toString());
         txtModifClientApell.setText(datos.get(4).toString());
         txtModifClientFono.setText(datos.get(5).toString());
         txtModifClientDir.setText(datos.get(6).toString());
         txtModifClientCom.setText(datos.get(7).toString());
         txtModifClientCiu.setText(datos.get(8).toString());
         txtModifClientMail.setText(datos.get(9).toString());
         
    }//GEN-LAST:event_formWindowOpened

    private void txtModifRutClienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifRutClienKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false)
        {
            evt.consume();
        }
        if(txtModifRutClien.getText().length()== 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifRutClienKeyTyped

    private void txtModifDigClienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifDigClienKeyTyped
        if(txtModifDigClien.getText().length()== 1) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||(caracter > '9')) &&(caracter != 'k')&&(caracter != 'K'))
      {
         evt.consume();  // ignorar el evento de teclado
      }
        
    }//GEN-LAST:event_txtModifDigClienKeyTyped

    private void txtModifClientNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientNombKeyTyped
        if(txtModifClientNomb.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientNombKeyTyped

    private void txtModifClientApellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientApellKeyTyped
        if(txtModifClientApell.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientApellKeyTyped

    private void txtModifClientFonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientFonoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false)
        {
            evt.consume();
        }
        if(txtModifClientFono.getText().length()== 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientFonoKeyTyped

    private void txtModifClientDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientDirKeyTyped
        if(txtModifClientDir.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientDirKeyTyped

    private void txtModifClientComKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientComKeyTyped
        if(txtModifClientCom.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientComKeyTyped

    private void txtModifClientCiuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientCiuKeyTyped
        if(txtModifClientCiu.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientCiuKeyTyped

    private void txtModifClientMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientMailKeyTyped
        if(txtModifClientMail.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtModifClientMailKeyTyped

    private void txtModifRutClienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifRutClienKeyReleased
        String valor =  txtModifRutClien.getText();        
        if(valor.equals(""))        {
             txtModifRutClien.setBackground(new Color (255,255,204));
             btModificarCliente.setEnabled(false);
        }
        else        {
             txtModifRutClien.setBackground(new Color (255,255,255));
             btModificarCliente.setEnabled(true);
        }
    }//GEN-LAST:event_txtModifRutClienKeyReleased

    private void txtModifDigClienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifDigClienKeyReleased
        String valor =  txtModifDigClien.getText();        
        if(valor.equals(""))        {
             txtModifDigClien.setBackground(new Color (255,255,204));
             btModificarCliente.setEnabled(false);
        }
        else        {
             txtModifDigClien.setBackground(new Color (255,255,255));
             btModificarCliente.setEnabled(true);
        }
    }//GEN-LAST:event_txtModifDigClienKeyReleased

    private void txtModifClientNombKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientNombKeyReleased
        String valor =  txtModifClientNomb.getText();        
        if(valor.equals(""))        {
             txtModifClientNomb.setBackground(new Color (255,255,204));
        }
        else        {
             txtModifClientNomb.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtModifClientNombKeyReleased

    private void txtModifClientApellKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientApellKeyReleased

    }//GEN-LAST:event_txtModifClientApellKeyReleased

    private void txtModifClientFonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientFonoKeyReleased
        String valor =  txtModifClientFono.getText();        
        if(valor.equals(""))        {
             txtModifClientFono.setBackground(new Color (255,255,204));
        }
        else        {
             txtModifClientFono.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtModifClientFonoKeyReleased

    private void txtModifClientMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientMailKeyReleased
    String valor =  txtModifClientMail.getText();        
        if(valor.equals(""))        {
             txtModifClientMail.setBackground(new Color (255,255,204));
        }
        else        {
             txtModifClientMail.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtModifClientMailKeyReleased

    private void txtAddClDig1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClDig1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddClDig1KeyTyped

    private void btModificarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarCliente1ActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, " ¿Confirma Cancelar esta operación? \n Todos los cambios sin guardar se Perderan", "\tConfirmación",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.dispose();
            }
    }//GEN-LAST:event_btModificarCliente1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtModifRutClienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifRutClienKeyPressed
        InputMap map2 = txtModifRutClien.getInputMap(txtModifRutClien.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtModifRutClienKeyPressed

    private void txtModifDigClienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifDigClienKeyPressed
        InputMap map2 = txtModifDigClien.getInputMap(txtModifDigClien.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtModifDigClienKeyPressed

    private void txtModifClientNombKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientNombKeyPressed
   InputMap map2 = txtModifClientNomb.getInputMap(txtModifClientNomb.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtModifClientNombKeyPressed

    private void txtModifClientApellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientApellKeyPressed
        // TODO add your handling code here:
        InputMap map2 = txtModifClientApell.getInputMap(txtModifClientApell.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null"); 
    }//GEN-LAST:event_txtModifClientApellKeyPressed

    private void txtModifClientFonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientFonoKeyPressed
InputMap map2 = txtModifClientFono.getInputMap(txtModifClientFono.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModifClientFonoKeyPressed

    private void txtModifClientDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientDirKeyPressed
InputMap map2 = txtModifClientDir.getInputMap(txtModifClientDir.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModifClientDirKeyPressed

    private void txtModifClientComKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientComKeyPressed
InputMap map2 = txtModifClientCom.getInputMap(txtModifClientCom.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModifClientComKeyPressed

    private void txtModifClientCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientCiuKeyPressed
InputMap map2 = txtModifClientCiu.getInputMap(txtModifClientCiu.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModifClientCiuKeyPressed

    private void txtModifClientMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModifClientMailKeyPressed
InputMap map2 = txtModifClientMail.getInputMap(txtModifClientMail.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");         // TODO add your handling code here:
    }//GEN-LAST:event_txtModifClientMailKeyPressed

    
public boolean validarCamposActCl1()
    {
    
    boolean respuesta=true;
    String variable1 = "";
    
    if(txtModifRutClien.getText().equals(""))
                {
                txtModifRutClien.getText();
                variable1=variable1+ "Debe ingresar el Rut del Cliente\n";
                txtModifDigClien.requestFocus();
                txtModifDigClien.setBackground(new Color (255,255,204));
                respuesta=false;
                }    
    else if(txtModifDigClien.getText().equals(""))
                {
                variable1=variable1+ "Debe ingresar el Digito verificador del Rut\n";
                respuesta=false;
                txtModifDigClien.requestFocus();
                }
    else if(txtModifClientNomb.getText().equals(""))
                {
                variable1= variable1 + "Debe ingresar el nombre o Razón Social del Cliente\n";
                txtModifClientNomb.requestFocus();
                respuesta=false;
                }

    else if(txtModifClientFono.getText().equals(""))
                {
                variable1= variable1 + "Ingrese el numero telefonico\n";
                txtModifClientFono.requestFocus();

                respuesta=false;
                }
    else if(txtModifClientMail.getText().equals(""))
                {
                variable1= variable1 + "Ingrese un Correo Electronico\n";
                txtModifClientMail.requestFocus();

                respuesta=false;
                }
    
    
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta); 
        }
    return respuesta;
    }

public boolean validarCamposActCl2()
    {
    
    boolean respuesta=true;
    String variable1 = "";
    
    
    if(txtModifClientNomb.getText().equals(""))
                {
                variable1= variable1 + "Debe ingresar el nombre o Razón Social del Cliente\n";
                txtModifClientNomb.requestFocus();
                respuesta=false;
                }

    else if(txtModifClientFono.getText().equals(""))
                {
                variable1= variable1 + "Ingrese el numero telefonico\n";
                txtModifClientFono.requestFocus();

                respuesta=false;
                }
    else if(txtModifClientMail.getText().equals(""))
                {
                variable1= variable1 + "Ingrese un Correo Electronico\n";
                txtModifClientMail.requestFocus();

                respuesta=false;
                }
    
    
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta); 
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
            java.util.logging.Logger.getLogger(dialogModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogModificarCliente dialog = new dialogModificarCliente(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btModificarCliente;
    private javax.swing.JButton btModificarCliente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel lbCodigoClientMod;
    private javax.swing.JTextField txtAddClDig1;
    private javax.swing.JTextField txtModifClientApell;
    private javax.swing.JTextField txtModifClientCiu;
    private javax.swing.JTextField txtModifClientCom;
    private javax.swing.JTextField txtModifClientDir;
    private javax.swing.JTextField txtModifClientFono;
    private javax.swing.JTextField txtModifClientMail;
    private javax.swing.JTextField txtModifClientNomb;
    private javax.swing.JTextField txtModifDigClien;
    private javax.swing.JTextField txtModifRutClien;
    // End of variables declaration//GEN-END:variables
}
