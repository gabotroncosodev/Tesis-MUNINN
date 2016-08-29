
package clientes;

import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionBD;
import inicio.inicioRapido;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import inicio.inicioRapido;
import java.sql.SQLException;
import javax.swing.*;

public class menuClientes extends javax.swing.JFrame {
    
Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 
//  ,"Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);     
    
Cliente clienteclase = new Cliente();
SQLCliente sqlcliente = new SQLCliente();
    public menuClientes() {
        initComponents();
        System.out.print("Menu Principal de Clientes Iniciado \n");   
        setLocationRelativeTo(null);
        setResizable(false);
        
        sqlcliente.tablaTodosCli.addColumn("Cod Interno");
        sqlcliente.tablaTodosCli.addColumn("Rut");
        sqlcliente.tablaTodosCli.addColumn("Nombre");
        
        
    }
               

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscadorCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lb_cod = new javax.swing.JLabel();
        lbClientRut = new javax.swing.JLabel();
        lbClientNomb = new javax.swing.JLabel();
        lbClientFono = new javax.swing.JLabel();
        lbClientDir = new javax.swing.JLabel();
        lbClientComun = new javax.swing.JLabel();
        lbClientCiudad = new javax.swing.JLabel();
        lbClientEmail = new javax.swing.JLabel();
        btNewClien1 = new javax.swing.JButton();
        btNewClien = new javax.swing.JButton();
        btModifClien = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbNombreUsuarioCli = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");
        jPopupMenu1.add(jMenuItem1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Clientes");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagenes/miniLogo.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1005, 705));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
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

        jButton1.setBackground(new java.awt.Color(138, 136, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoInforme.png"))); // NOI18N
        jButton1.setText("Imprimir Todos los Clientes Registrados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(593, 540, 390, 60);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);

        jLabel1.setText("Buscador: Rut, Nombre o Apellido");

        txtBuscadorCli.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtBuscadorCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscadorCliMousePressed(evt);
            }
        });
        txtBuscadorCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorCliKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscadorCliKeyReleased(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaClientesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscadorCli))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscadorCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 11, 970, 209);

        jPanel3.setBackground(new java.awt.Color(237, 236, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion Completa del Cliente Seleccionado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 18))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Codigo");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Rut");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Fono");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Dirección");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Ciudad");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Comuna");

        lb_cod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lb_cod.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientRut.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientRut.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientNomb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientNomb.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientFono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientFono.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientDir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientDir.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientComun.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientComun.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientCiudad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientCiudad.setBorder(new javax.swing.border.MatteBorder(null));

        lbClientEmail.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbClientEmail.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbClientDir, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbClientRut, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbClientFono, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbClientNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbClientCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbClientComun, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientRut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientFono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientDir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientComun, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbClientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 238, 570, 296);

        btNewClien1.setBackground(new java.awt.Color(161, 158, 119));
        btNewClien1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btNewClien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ClientebotonInicio.png"))); // NOI18N
        btNewClien1.setText("Volver al Inicio Rapido");
        btNewClien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewClien1ActionPerformed(evt);
            }
        });
        getContentPane().add(btNewClien1);
        btNewClien1.setBounds(600, 620, 390, 50);

        btNewClien.setBackground(new java.awt.Color(138, 136, 102));
        btNewClien.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btNewClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoAddClienteMini.png"))); // NOI18N
        btNewClien.setText("Agregar Nuevo Cliente");
        btNewClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewClienActionPerformed(evt);
            }
        });
        getContentPane().add(btNewClien);
        btNewClien.setBounds(600, 250, 380, 60);

        btModifClien.setBackground(new java.awt.Color(138, 136, 102));
        btModifClien.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        btModifClien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoEditClienteMini.png"))); // NOI18N
        btModifClien.setText("Modificar Cliente Seleccionado");
        btModifClien.setEnabled(false);
        btModifClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifClienActionPerformed(evt);
            }
        });
        getContentPane().add(btModifClien);
        btModifClien.setBounds(10, 540, 570, 60);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel15.setText("Clientes");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(780, 390, 170, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoCliente.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(640, 370, 100, 110);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel12.setText("Usuario Logeado:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 630, 113, 20);

        lbNombreUsuarioCli.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        lbNombreUsuarioCli.setText("Nombre usuario");
        getContentPane().add(lbNombreUsuarioCli);
        lbNombreUsuarioCli.setBounds(160, 630, 180, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barraClientesUsuario.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 590, 1020, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoClientes.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1063, 677);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewClienActionPerformed
        
        System.out.print("Mostrar Nuevo Cliente... \n");  
        new dialogNuevoCliente(this, true).setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btNewClienActionPerformed

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

    private void txtBuscadorCliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorCliKeyPressed
        
    }//GEN-LAST:event_txtBuscadorCliKeyPressed

    private void txtBuscadorCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorCliKeyReleased
        String buscador = txtBuscadorCli.getText();
        sqlcliente.buscarCliente(buscador);
        tablaClientes.setModel(sqlcliente.tablaTodosCli);
    }//GEN-LAST:event_txtBuscadorCliKeyReleased

    private void btModifClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifClienActionPerformed
        dialogModificarCliente modifclient = new dialogModificarCliente(new javax.swing.JDialog(), true); //cambie la herencia de frame a jdialog
        System.out.print("Abriendo Modificar Información del Cliente "+lb_cod.getText());
        modifclient.lbCodigoClientMod.setText(lb_cod.getText());
        
        modifclient.setVisible(true);
        modifclient.setResizable(false);
        modifclient.setLocationRelativeTo(null);
        modifclient.pack();  
                
    }//GEN-LAST:event_btModifClienActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
tablaClientes.getTableHeader().setReorderingAllowed(false) ;
        txtBuscadorCli.requestFocus();
        sqlcliente.llenadotablaCliente(); 
        tablaClientes.setModel(sqlcliente.tablaTodosCli);
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        sqlcliente.llenadotablaCliente(); 
        tablaClientes.setModel(sqlcliente.tablaTodosCli);
    }//GEN-LAST:event_formWindowOpened

    private void txtBuscadorCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscadorCliMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorCliMousePressed

    private void btNewClien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewClien1ActionPerformed
       consultaSalir();
    }//GEN-LAST:event_btNewClien1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idCliente = lb_cod.getText();
        String nombreusuario = lbNombreUsuarioCli.getText();
        
        String report = new String("ReporteClientes");
                
        ReportesClientes reporte = new ReportesClientes();
        reporte.runReporte(idCliente, report, nombreusuario);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void tablaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMousePressed
        btModifClien.setEnabled(true);
        int row = tablaClientes.getSelectedRow(); 
         String id=tablaClientes.getValueAt(row, 0).toString();
         
         limpiarjlabels();
         
         ArrayList datos=new ArrayList();
         datos=sqlcliente.buscarClienteSelecc(id);
         
         lb_cod.setText(datos.get(0).toString());// aca obtengo los datos de arreglo
         lbClientRut.setText(datos.get(1).toString()+"-"+ datos.get(2));
         lbClientNomb.setText(datos.get(3) +" "+ datos.get(4));
         lbClientFono.setText(datos.get(5).toString());
         lbClientDir.setText(datos.get(6).toString());
         lbClientComun.setText(datos.get(7).toString());
         lbClientCiudad.setText(datos.get(8).toString());
         lbClientEmail.setText(datos.get(9).toString());
    }//GEN-LAST:event_tablaClientesMousePressed
    
void limpiarjlabels()
{
lb_cod.setText("");
lbClientRut.setText("");
lbClientNomb.setText("");
lbClientFono.setText("");
lbClientDir.setText("");
lbClientComun.setText("");
lbClientCiudad.setText("");
lbClientEmail.setText("");

}
    
    
    void consultaSalir()
    {
        
    int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea ir al Inicio Rapido?", "\tConfirmacion al Inicio Rapido",
    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);

     if(mensaje==JOptionPane.YES_NO_OPTION)
            {
            this.hide();
            inicioRapido principal = new inicioRapido();
            principal.pack();
            principal.setLocationRelativeTo(null);
            principal.setVisible(true);
            principal.lbNombreUusario.setText(lbNombreUsuarioCli.getText());
            }

        else{
            this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
            }
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
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuClientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btModifClien;
    private javax.swing.JButton btNewClien;
    private javax.swing.JButton btNewClien1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbClientCiudad;
    private javax.swing.JLabel lbClientComun;
    private javax.swing.JLabel lbClientDir;
    private javax.swing.JLabel lbClientEmail;
    private javax.swing.JLabel lbClientFono;
    private javax.swing.JLabel lbClientNomb;
    private javax.swing.JLabel lbClientRut;
    public static javax.swing.JLabel lbNombreUsuarioCli;
    private javax.swing.JLabel lb_cod;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscadorCli;
    // End of variables declaration//GEN-END:variables

}
