
package clientes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import conexion.ConexionBD;
import inicio.inicioRapido;
import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.Locale;
import javax.swing.*;


public class dialogNuevoCliente extends javax.swing.JDialog {

ConexionBD conexionbd = new ConexionBD();

Cliente clienteclase = new Cliente();
SQLCliente sqlcliente = new SQLCliente();

Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);   
    /**
     * Creates new form nuevoCliente
     */
    public dialogNuevoCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
        conexionbd.conectar();
        setLocationRelativeTo(null); 
        setResizable(false);
        
      InputMap map2 = txtAddClRut.getInputMap(txtAddClRut.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
    }   
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btAddCliente = new javax.swing.JButton();
        btCerrarAddCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAddClRut = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAddClDig = new javax.swing.JTextField();
        txtAddClDig1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddCliNomb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAddCliApp = new javax.swing.JTextField();
        txtAddCliDir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtComunClient = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddCliCiu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddCliFono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddCliEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Nuevo Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(724, 564));
        setName("Muninn");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btAddCliente.setBackground(new java.awt.Color(102, 100, 65));
        btAddCliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btAddCliente.setForeground(new java.awt.Color(255, 255, 255));
        btAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoGuardar.png"))); // NOI18N
        btAddCliente.setText("Agregar información del Cliente");
        btAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btAddCliente);
        btAddCliente.setBounds(30, 400, 630, 60);

        btCerrarAddCliente.setBackground(new java.awt.Color(102, 100, 65));
        btCerrarAddCliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btCerrarAddCliente.setForeground(new java.awt.Color(255, 255, 255));
        btCerrarAddCliente.setText("Cancelar");
        btCerrarAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarAddClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btCerrarAddCliente);
        btCerrarAddCliente.setBounds(30, 470, 630, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoAddCliente.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 100, 100);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Registro de Cliente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 40, 379, 44);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Rut Clientes");

        txtAddClRut.setBackground(new java.awt.Color(255, 255, 204));
        txtAddClRut.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddClRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddClRutKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddClRutKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddClRutKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("-");

        txtAddClDig.setBackground(new java.awt.Color(255, 255, 204));
        txtAddClDig.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddClDig.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddClDigKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddClDigKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddClDigKeyTyped(evt);
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

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre o Razon Social");

        txtAddCliNomb.setBackground(new java.awt.Color(255, 255, 204));
        txtAddCliNomb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliNomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliNombKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCliNombKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliNombKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Apellido");

        txtAddCliApp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliApp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliAppKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliAppKeyTyped(evt);
            }
        });

        txtAddCliDir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliDirKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliDirKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Direccion");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Comuna");

        txtComunClient.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtComunClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComunClientKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComunClientKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Ciudad");

        txtAddCliCiu.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliCiuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliCiuKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fono");

        txtAddCliFono.setBackground(new java.awt.Color(255, 255, 204));
        txtAddCliFono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliFono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliFonoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCliFonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliFonoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Correo Electronico");

        txtAddCliEmail.setBackground(new java.awt.Color(255, 255, 204));
        txtAddCliEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtAddCliEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddCliEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddCliEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddCliEmailKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)
                        .addComponent(txtAddClRut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddClDig, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddClDig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAddCliNomb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAddCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddCliFono, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddCliApp)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtComunClient, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAddCliCiu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddCliDir))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddClRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtAddClDig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddClDig1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddCliNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCliApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddCliDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtComunClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddCliCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddCliFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddCliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 130, 630, 260);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoClientes.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(-300, 0, 1050, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddClienteActionPerformed
if(validarCamposAddCl1())
{
    String rut = txtAddClRut.getText();    
    String digv = txtAddClDig.getText();
    String existerut = sqlcliente.existeRutRegistr(rut, digv);
    if(existerut.equals(""))
    {
        if(sqlcliente.validaRut(rut, digv))
        {
            if(validarCamposAddCl2())
            {
                int RutCl= Integer.parseInt(rut);
                String tfonocl = txtAddCliFono.getText();
                int telefno= Integer.parseInt(tfonocl);
                clienteclase.setRut_cliente(RutCl);
                clienteclase.setDigito_rut(txtAddClDig.getText().toUpperCase());
                clienteclase.setNombre_cliente(txtAddCliNomb.getText().toUpperCase());
                clienteclase.setApellido_cliente(txtAddCliApp.getText().toUpperCase());   
                clienteclase.setTelefono_cliente(telefno);
                clienteclase.setDireccion_cliente(txtAddCliDir.getText().toUpperCase());
                clienteclase.setComuna_cliente(txtComunClient.getText().toUpperCase());
                clienteclase.setCiudad_cliente(txtAddCliCiu.getText().toUpperCase());
                clienteclase.setEmail_cliente(txtAddCliEmail.getText().toUpperCase());
                
                sqlcliente.agregarCliente(clienteclase);
                
                int mensaje= JOptionPane.showConfirmDialog(rootPane, "Cliente agregado \n¿Quiere agregar otro Cliente??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    vaciarCamposAddCli();
                    
                    
                }
                else
                {
                    this.dispose();
                }
            }
        
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane, "El rut ingresado es invalido, por favor compruebe","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError); 
        }
    }
    else
        {
        JOptionPane.showMessageDialog(rootPane, "Atención: El Rut ya se encuentra Registrado","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta); 
        txtAddClRut.requestFocus();
        }
}
    }//GEN-LAST:event_btAddClienteActionPerformed

    private void txtAddClRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClRutKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        }
        if(txtAddClRut.getText().length()== 8) {
            evt.consume();
        }


if (evt.getKeyCode() == KeyEvent.VK_V && evt.getKeyCode() == KeyEvent.VK_CONTROL )
{
evt.consume(); 
}

        
    }//GEN-LAST:event_txtAddClRutKeyTyped

    private void txtAddClDigKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClDigKeyTyped
        if(txtAddClDig.getText().length()== 1) {
            evt.consume();
        }
        char caracter = evt.getKeyChar();

      // Verificar si la tecla pulsada no es un digito
      if(((caracter < '0') ||(caracter > '9')) &&(caracter != 'k')&&(caracter != 'K'))
      {
         evt.consume();  // ignorar el evento de teclado
      }
    }//GEN-LAST:event_txtAddClDigKeyTyped

    private void txtAddCliFonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliFonoKeyTyped
       char c = evt.getKeyChar();
        if (Character.isDigit(c) == false)
        {
            evt.consume();
        }
        if(txtAddCliFono.getText().length()== 9)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliFonoKeyTyped

    private void txtAddCliNombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliNombKeyTyped
        if(txtAddCliNomb.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliNombKeyTyped

    private void txtAddCliAppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliAppKeyTyped
        if(txtAddCliApp.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliAppKeyTyped

    private void txtComunClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComunClientKeyTyped
        if(txtComunClient.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtComunClientKeyTyped

    private void txtAddClDig1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClDig1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddClDig1KeyTyped

    private void txtAddCliDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliDirKeyTyped
        if(txtAddCliDir.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliDirKeyTyped

    private void txtAddCliEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliEmailKeyTyped
        if(txtAddCliEmail.getText().length()== 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliEmailKeyTyped

    private void txtAddClRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClRutKeyReleased
        String valor = txtAddClRut.getText();        
        if(valor.equals(""))        {
            txtAddClRut.setBackground(new Color (255,255,204));
        }
        else        {
            txtAddClRut.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtAddClRutKeyReleased

    private void txtAddClDigKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClDigKeyReleased
        String valor = txtAddClDig.getText();        
        if(valor.equals(""))        {
            txtAddClDig.setBackground(new Color (255,255,204));
        }
        else        {
            txtAddClDig.setBackground(new Color (255,255,255));
        }
        
    }//GEN-LAST:event_txtAddClDigKeyReleased

    private void txtAddCliNombKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliNombKeyReleased
        String valor = txtAddCliNomb.getText();        
        if(valor.equals(""))        {
            txtAddCliNomb.setBackground(new Color (255,255,204));
        }
        else        {
            txtAddCliNomb.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtAddCliNombKeyReleased

    private void txtAddCliFonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliFonoKeyReleased
        String valor = txtAddCliFono.getText();        
        if(valor.equals(""))        {
            txtAddCliFono.setBackground(new Color (255,255,204));
        }
        else        {
            txtAddCliFono.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtAddCliFonoKeyReleased

    private void txtAddCliEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliEmailKeyReleased
        String valor = txtAddCliEmail.getText();        
        if(valor.equals(""))        {
            txtAddCliEmail.setBackground(new Color (255,255,204));
        }
        else        {
            txtAddCliEmail.setBackground(new Color (255,255,255));
        }
    }//GEN-LAST:event_txtAddCliEmailKeyReleased

    private void btCerrarAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarAddClienteActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_btCerrarAddClienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         int mensaje= JOptionPane.showConfirmDialog(rootPane, "Atención: Todos los cambios no Guardados se perderan\n¿Confirma Cerrar esta ventana??", 
                        "\tCerrar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void txtAddCliCiuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliCiuKeyTyped
        if(txtAddCliCiu.getText().length()== 40) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAddCliCiuKeyTyped

    private void txtAddClRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClRutKeyPressed
InputMap map2 = txtAddClRut.getInputMap(txtAddClRut.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        
    }//GEN-LAST:event_txtAddClRutKeyPressed

    private void txtAddCliNombKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliNombKeyPressed
       InputMap map2 = txtAddClDig.getInputMap(txtAddClDig.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }//GEN-LAST:event_txtAddCliNombKeyPressed

    private void txtAddClDigKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddClDigKeyPressed
        InputMap map2 = txtAddClDig.getInputMap(txtAddClDig.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }//GEN-LAST:event_txtAddClDigKeyPressed

    private void txtAddCliAppKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliAppKeyPressed
      InputMap map2 = txtAddCliApp.getInputMap(txtAddCliApp.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }//GEN-LAST:event_txtAddCliAppKeyPressed

    private void txtAddCliDirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliDirKeyPressed
        InputMap map2 = txtAddCliDir.getInputMap(txtAddCliDir.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }//GEN-LAST:event_txtAddCliDirKeyPressed

    private void txtComunClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComunClientKeyPressed
InputMap map2 = txtAddCliDir.getInputMap(txtAddCliDir.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");        // TODO add your handling code here:
    }//GEN-LAST:event_txtComunClientKeyPressed

    private void txtAddCliCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliCiuKeyPressed
        InputMap map2 = txtAddCliDir.getInputMap(txtAddCliDir.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");   
    }//GEN-LAST:event_txtAddCliCiuKeyPressed

    private void txtAddCliFonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliFonoKeyPressed
        InputMap map2 = txtAddCliFono.getInputMap(txtAddCliFono.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");  
    }//GEN-LAST:event_txtAddCliFonoKeyPressed

    private void txtAddCliEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddCliEmailKeyPressed
       InputMap map2 = txtAddCliEmail.getInputMap(txtAddCliEmail.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");  
    }//GEN-LAST:event_txtAddCliEmailKeyPressed
 
   public boolean validarCamposAddCl1()
    {
    
    boolean respuesta=true;
    String variable1 = "";
    
    if(txtAddClRut.getText().equals(""))
                {
                variable1=variable1+ "Debe ingresar el Rut del Cliente\n";
                respuesta=false;
                txtAddClRut.requestFocus();
                }
    else if(txtAddClDig.getText().equals(""))
                {
                variable1=variable1+ "Debe ingresar el Digito verificador del Rut\n";
                respuesta=false;
                txtAddClDig.requestFocus();
                }
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    return respuesta;
    } 
    
    public boolean validarCamposAddCl2()
    {
    
    boolean respuesta=true;
    String variable1 = "";
    
    if(txtAddCliNomb.getText().equals(""))
                {
                variable1= variable1 + "- Debe ingresar el nombre o Razón Social del Cliente\n";
                txtAddCliNomb.requestFocus();
                respuesta=false;
                }

    else if(txtAddCliFono.getText().equals(""))
                {
                variable1= variable1 + "- Ingrese el numero telefonico\n";
                txtAddCliFono.requestFocus();

                respuesta=false;
                }
    else if(txtAddCliEmail.getText().equals(""))
                {
                variable1= variable1 + "- Ingrese un correo electronico\n";
                respuesta=false;
                txtAddCliEmail.requestFocus();
                }
     if(!respuesta)
    {
      JOptionPane.showMessageDialog(rootPane, variable1,  "Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }
    return respuesta;
    }


void vaciarCamposAddCli()
{
txtAddClRut.setText("");
txtAddClDig.setText("");
txtAddCliNomb.setText("");
txtAddCliApp.setText("");
txtAddCliFono.setText("");
txtAddCliDir.setText("");
txtAddCliCiu.setText("");
txtAddCliEmail.setText("");
txtComunClient.setText("");



txtAddClRut.setBackground(new Color (255,255,204));
txtAddClDig.setBackground(new Color (255,255,204));
txtAddCliNomb.setBackground(new Color (255,255,204));
txtAddCliFono.setBackground(new Color (255,255,204));
txtAddCliEmail.setBackground(new Color (255,255,204));
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
            java.util.logging.Logger.getLogger(dialogNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogNuevoCliente dialog = new dialogNuevoCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAddCliente;
    private javax.swing.JButton btCerrarAddCliente;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddClDig;
    private javax.swing.JTextField txtAddClDig1;
    public javax.swing.JTextField txtAddClRut;
    private javax.swing.JTextField txtAddCliApp;
    private javax.swing.JTextField txtAddCliCiu;
    private javax.swing.JTextField txtAddCliDir;
    private javax.swing.JTextField txtAddCliEmail;
    private javax.swing.JTextField txtAddCliFono;
    private javax.swing.JTextField txtAddCliNomb;
    private javax.swing.JTextField txtComunClient;
    // End of variables declaration//GEN-END:variables
}
