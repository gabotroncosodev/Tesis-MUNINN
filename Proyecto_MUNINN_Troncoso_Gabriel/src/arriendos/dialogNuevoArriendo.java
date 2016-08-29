/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arriendos;

import clientes.Cliente;
import com.mysql.jdbc.PreparedStatement;
import conexion.ConexionBD;
import inicio.ModeloTablaDTM;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Gabriel
 */



public class dialogNuevoArriendo extends javax.swing.JDialog {
    
Arriendo arriendo = new Arriendo();


Icon iconoAlerta  =  new ImageIcon("C:/Sistema Muninn/Imagenes/alertaIcono.png");
Icon iconoBueno  =  new ImageIcon("C:/Sistema Muninn/Imagenes/aceptadoIcono.png");
Icon iconoError  =  new ImageIcon("C:/Sistema Muninn/Imagenes//errorIcono.png");
Icon iconoInfo  =  new ImageIcon("C:/Sistema Muninn/Imagenes/infoIcono.png"); 


SQLArriendo sqlarriendo = new SQLArriendo();
Arriendo arriendoclase = new Arriendo();
ConexionBD conexionbd = new ConexionBD();
Cliente clienteclase = new Cliente();


    /**
     * 
     * Creates new form JDnuevoArriendo
     */
    public dialogNuevoArriendo( javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel4 = new javax.swing.JPanel();
        btGenerarArriendo1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductosArr = new javax.swing.JTable();
        btAddProductoArriendo = new javax.swing.JButton();
        btEliminarProduLista = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtTotalGarantia = new javax.swing.JTextField();
        btGenerarArriendo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jdchFechaActual = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbHoraArriendo = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbRutCliente = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        lbCodCliente = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbUsuarioCuenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MUNINN - Formulario Nuevo Arriendo");
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

        jPanel4.setBackground(new java.awt.Color(219, 228, 235));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        btGenerarArriendo1.setBackground(new java.awt.Color(65, 85, 128));
        btGenerarArriendo1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btGenerarArriendo1.setForeground(new java.awt.Color(255, 255, 255));
        btGenerarArriendo1.setText("Cancelar");
        btGenerarArriendo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarArriendo1ActionPerformed(evt);
            }
        });
        jPanel4.add(btGenerarArriendo1);
        btGenerarArriendo1.setBounds(20, 466, 310, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoGuardar.png"))); // NOI18N
        jLabel4.setText("Creación de un Nuevo Arriendo");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(50, 20, 540, 50);

        jPanel3.setBackground(new java.awt.Color(194, 214, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel3.setOpaque(false);

        tablaProductosArr.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tablaProductosArr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Nombre", "Cantidad", "Garantia", "Valor Arriendo Diario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductosArr.setSelectionBackground(new java.awt.Color(38, 87, 163));
        tablaProductosArr.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaProductosArr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosArrMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProductosArr);
        tablaProductosArr.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaProductosArr.getColumnModel().getColumn(1).setPreferredWidth(35);

        btAddProductoArriendo.setBackground(new java.awt.Color(65, 85, 128));
        btAddProductoArriendo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btAddProductoArriendo.setForeground(new java.awt.Color(255, 255, 255));
        btAddProductoArriendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoProducto2.png"))); // NOI18N
        btAddProductoArriendo.setText("Agregar Producto");
        btAddProductoArriendo.setEnabled(false);
        btAddProductoArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductoArriendoActionPerformed(evt);
            }
        });

        btEliminarProduLista.setBackground(new java.awt.Color(65, 85, 128));
        btEliminarProduLista.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btEliminarProduLista.setForeground(new java.awt.Color(255, 255, 255));
        btEliminarProduLista.setText("Eliminar producto seleccionado");
        btEliminarProduLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarProduListaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(194, 214, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Valor Fijo a Pagar por Concepto de Garantia:");

        txtTotalGarantia.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTotalGarantia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTotalGarantia.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTotalGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEliminarProduLista, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(btAddProductoArriendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btAddProductoArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEliminarProduLista, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel3);
        jPanel3.setBounds(11, 191, 1030, 265);

        btGenerarArriendo.setBackground(new java.awt.Color(65, 85, 128));
        btGenerarArriendo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btGenerarArriendo.setForeground(new java.awt.Color(255, 255, 255));
        btGenerarArriendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MINIiconoArriendos.png"))); // NOI18N
        btGenerarArriendo.setText("Generar Arriendo");
        btGenerarArriendo.setEnabled(false);
        btGenerarArriendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarArriendoActionPerformed(evt);
            }
        });
        jPanel4.add(btGenerarArriendo);
        btGenerarArriendo.setBounds(341, 462, 700, 50);

        jPanel5.setBackground(new java.awt.Color(194, 214, 230));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel5.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Arriendo");

        jdchFechaActual.setBackground(new java.awt.Color(65, 85, 128));
        jdchFechaActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdchFechaActualKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora Arriendo");

        cbHoraArriendo.setBackground(new java.awt.Color(32, 82, 144));
        cbHoraArriendo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbHoraArriendo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una Hora", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00" }));
        cbHoraArriendo.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdchFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(cbHoraArriendo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdchFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbHoraArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(690, 95, 357, 85);

        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel6.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo del Cliente");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rut");

        lbRutCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbRutCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbRutCliente.setBorder(new javax.swing.border.MatteBorder(null));

        lbNombreCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreCliente.setBorder(new javax.swing.border.MatteBorder(null));

        lbCodCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbCodCliente.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRutCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                            .addComponent(lbNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbRutCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel6);
        jPanel6.setBounds(11, 95, 661, 87);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(890, 10, 46, 17);

        lbUsuarioCuenta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbUsuarioCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuarioCuenta.setText("admin");
        jPanel4.add(lbUsuarioCuenta);
        lbUsuarioCuenta.setBounds(950, 10, 90, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoArriendos3.png"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 1100, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddProductoArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductoArriendoActionPerformed

        dialogAgregarProdArr addprodA = new dialogAgregarProdArr(new javax.swing.JDialog(), true); 
        addprodA.setVisible(true);
        addprodA.setResizable(false);
        addprodA.setLocationRelativeTo(null);
        addprodA.pack();
                            }//GEN-LAST:event_btAddProductoArriendoActionPerformed

    private void btEliminarProduListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarProduListaActionPerformed
        int rows = tablaProductosArr.getRowCount();
        
        if(rows > 0)
        {
            if(tablaProductosArr.getSelectedRows().length > 0)
            {
                int mensaje= JOptionPane.showConfirmDialog(rootPane, "¿Confirma Eliminar Producto "
                        + "Seleccionado?\n Nota: Se puede agregar denuevo","\tConfirmacion", 
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                    if(mensaje==JOptionPane.YES_NO_OPTION)
                    {
                        
                        int filaseleccionada=tablaProductosArr.getSelectedRow();                        
                        String valor1=tablaProductosArr.getValueAt(filaseleccionada, 0).toString();//idproducto 
                        String valor2=tablaProductosArr.getValueAt(filaseleccionada, 2).toString();//cantidadingresada                         
                        int cantidadActualBodega = sqlarriendo.obtenerCantidadActual(valor1);
                        int cantidadAActualizar = Integer.parseInt(valor2);                        
                        int NumeroAActualizar = cantidadActualBodega+cantidadAActualizar;
                        sqlarriendo.actualizarcantidad(NumeroAActualizar,valor1);                        
                        dialogAgregarProdArr addprodA = new dialogAgregarProdArr(new javax.swing.JDialog(), true);
                        addprodA.tablaProductoIngr.removeRow(tablaProductosArr.getSelectedRow()); 
                       
                    }
            }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "No ah seleccionado ningun producto","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
            }
        }
        else
        {
         JOptionPane.showMessageDialog(rootPane, "No hay productos en la tabla","Notificación", JOptionPane.PLAIN_MESSAGE, iconoAlerta);
        }

       
    }//GEN-LAST:event_btEliminarProduListaActionPerformed

    private void btGenerarArriendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarArriendoActionPerformed
if(VerificarCamposArriendoNuevo()) 
{
        int añoarr = jdchFechaActual.getCalendar().get(Calendar.YEAR);
        String añoarrStr= String.valueOf(añoarr);        
        int mesarr = jdchFechaActual.getCalendar().get(Calendar.MONTH)+1;
        String mesarrStr= String.valueOf(mesarr);        
        int diaarr = jdchFechaActual.getCalendar().get(Calendar.DATE);
        String diaarrStr= String.valueOf(diaarr);        
        Object horaarr = cbHoraArriendo.getSelectedItem();
        String horaarriendo = String.valueOf(horaarr);
        
        String CodCliente = lbCodCliente.getText();
        int CodCl= Integer.parseInt(CodCliente);
        
        ///////
        clienteclase.setId_cliente(CodCl);
        String horaarrcompl = añoarrStr+"-"+mesarrStr+"-"+diaarrStr+" "+horaarriendo+":00";
        arriendoclase.setFecha_inicio_arriendo(horaarrcompl);
        int totalFilas= tablaProductosArr.getRowCount();
        arriendoclase.setCantidad_productos_inicio_xproducto(totalFilas);
        String cuentauser = lbUsuarioCuenta.getText();
        arriendoclase.setCuenta_usuario_arriendo_inicio(cuentauser);
        String garanttotal = txtTotalGarantia.getText();
        arriendoclase.setGarantia_total_productos_inicio(garanttotal);
        
        
        sqlarriendo.ingresoArriendoNuevo(clienteclase, arriendoclase);
        
        String idArrUltim = sqlarriendo.obtenerIDultimoArriendo();
        
        ingresarproductosTabla(idArrUltim);
        
}
    }//GEN-LAST:event_btGenerarArriendoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String clienteselecc = lbCodCliente.getText();
        
        if(clienteselecc.equals(""))
        {
        btGenerarArriendo.setEnabled(false);
        btAddProductoArriendo.setEnabled(false);
        btEliminarProduLista.setEnabled(false);
        btAddProductoArriendo.setEnabled(false);
        }
        else
        {
        btGenerarArriendo.setEnabled(true);
        btAddProductoArriendo.setEnabled(true);
        cbHoraArriendo.setEnabled(true);
        }
        
        //Total Garantia
        double sumatoriaGarantia;        
        int sumatoriaGarantia1=0;
        int totalRow= tablaProductosArr.getRowCount();
        totalRow-=1; 
        for(int i=0;i<=(totalRow);i++){
        sumatoriaGarantia= Double.parseDouble(String.valueOf(tablaProductosArr.getValueAt(i,3)));
        sumatoriaGarantia1+=sumatoriaGarantia;
        } 
        txtTotalGarantia.setText(String.valueOf(sumatoriaGarantia1));
        
        

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void tablaProductosArrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosArrMouseClicked
        btEliminarProduLista.setEnabled(true);
    }//GEN-LAST:event_tablaProductosArrMouseClicked

    private void btGenerarArriendo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarArriendo1ActionPerformed
        int mensaje= JOptionPane.showConfirmDialog(rootPane, "Se perderan los cambios no guardados "
                + "\n¿Confirma cancelar el ingreso de un nuevo arriendo?", 
                        "\tConfirmacion", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    String idArrUltim = sqlarriendo.obtenerIDultimoArriendo();
                    actualizarCantidadProd(idArrUltim);
                    this.dispose();
                }
                
    }//GEN-LAST:event_btGenerarArriendo1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
          int mensaje= JOptionPane.showConfirmDialog(rootPane, "Se perderan los cambios no guardados "
                + "\n¿Confirma cancelar el ingreso de un nuevo arriendo?", 
                        "\tConfirmacion", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,iconoAlerta);
                if(mensaje==JOptionPane.YES_NO_OPTION)
                {
                    String idArrUltim = sqlarriendo.obtenerIDultimoArriendo();
                    actualizarCantidadProd(idArrUltim);
                    this.dispose();
                }
    }//GEN-LAST:event_formWindowClosing

    private void jdchFechaActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdchFechaActualKeyPressed
        InputMap map2 =  jdchFechaActual.getInputMap( jdchFechaActual.WHEN_FOCUSED);
      map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }//GEN-LAST:event_jdchFechaActualKeyPressed

    
public void ingresarproductosTabla(String idArrUltim)
{
conexionbd.conectar();
for (int ii = 0; ii < tablaProductosArr.getRowCount(); ii++) 
         {
    PreparedStatement ps = null; 
    String SQL1 = "INSERT INTO detalle_arriendo(id_Arriendo, id_Producto, CantidadInicioArrP, "
            + "GarantiaInicioArrP, TotalProdArrInicio)  VALUES ('"+idArrUltim+"', "
            + "'"+tablaProductosArr.getValueAt(ii, 0)+"','"+tablaProductosArr.getValueAt(ii, 2)+"',"
            + "'"+tablaProductosArr.getValueAt(ii, 3)+"','"+tablaProductosArr.getValueAt(ii, 4)+"')";
    try {
        ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(SQL1);
        ps.executeUpdate();
        System.out.print("Ejecutando consulta...\n");
        
        this.dispose();
        
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+" 132446","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+" 133426","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
         }

    String nombrereporte = "ReporteArriendoNuevo";
    String parametroid = "IdArriendo";
    JOptionPane.showMessageDialog(rootPane," El Arriendo N°"+idArrUltim+" ha sido creado correctamente \n Se Creara un Reporte","Notificación", JOptionPane.PLAIN_MESSAGE, iconoBueno);
    ReportesArriendo reporte = new ReportesArriendo();
    reporte.runReporte(idArrUltim, nombrereporte, parametroid); 

}

public void actualizarCantidadProd(String idArrUltim)
{
conexionbd.conectar();
for (int ii = 0; ii < tablaProductosArr.getRowCount(); ii++) 
         {
           String valor1=tablaProductosArr.getValueAt(ii, 0).toString();//idproducto 
           String valor2=tablaProductosArr.getValueAt(ii, 2).toString();//cantidadingresada  
           
           int cantidadactual=sqlarriendo.ObtenerCantidadactual(valor1);           
           System.out.print("Cantidad obtenida actual: "+cantidadactual+"\n");
           
           int cantidingr = Integer.parseInt(valor2); //conversion de valor en la tabla
           
           int valorActualiz = cantidadactual+cantidingr;
           
            System.out.print("Numero al que se actualizará: "+valorActualiz+"\n");
           
           PreparedStatement ps = null; 
            String SQL1 = "UPDATE producto, detalle_arriendo SET  CantidadBodega =  '"+valorActualiz+"' "
            + "WHERE id_producto="+valor1+" AND id_arriendo="+idArrUltim+" AND "
            + "producto.idproducto=detalle_arriendo.id_producto";
            
            System.out.print("********************\n");
    System.out.print("Actualizando cantidad de producto restando a los ingresados: "+SQL1+"\n");
    System.out.print("********************\n");
    
    try {
        ps = (PreparedStatement) conexionbd.getconexion().prepareStatement(SQL1);
        ps.executeUpdate();
        System.out.print("Ejecutando consulta...\n");
        
        
        this.dispose();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+" 13A26","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e.getMessage()+" 13E26","Notificación", JOptionPane.PLAIN_MESSAGE, iconoError);
            e.printStackTrace();
            }
         }
}




public boolean VerificarCamposArriendoNuevo()
{
    boolean respuesta=true;
    
    String variable1 = "";
     if(jdchFechaActual.getDate() == null)
                {                
                variable1=variable1+ "Ingrese una Fecha \n";
                respuesta=false;
                jdchFechaActual.requestFocus();
                }
    else if(cbHoraArriendo.getSelectedItem().equals("Seleccione una Hora"))
                {
                variable1=variable1+ "Seleccione una Hora \n";
                respuesta=false;
                cbHoraArriendo.requestFocus();
                }
     else if(txtTotalGarantia.getText().equals("0"))
                {
                variable1=variable1+ "No ah ingresado Producto(s)\n";
                respuesta=false;
                txtTotalGarantia.requestFocus();
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
            java.util.logging.Logger.getLogger(dialogNuevoArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogNuevoArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                dialogNuevoArriendo dialog = new dialogNuevoArriendo(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btAddProductoArriendo;
    private javax.swing.JButton btEliminarProduLista;
    private javax.swing.JButton btGenerarArriendo;
    private javax.swing.JButton btGenerarArriendo1;
    private javax.swing.JComboBox cbHoraArriendo;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jdchFechaActual;
    public static javax.swing.JLabel lbCodCliente;
    public static javax.swing.JLabel lbNombreCliente;
    public static javax.swing.JLabel lbRutCliente;
    public static javax.swing.JLabel lbUsuarioCuenta;
    public static javax.swing.JTable tablaProductosArr;
    private javax.swing.JTextField txtTotalGarantia;
    // End of variables declaration//GEN-END:variables

}