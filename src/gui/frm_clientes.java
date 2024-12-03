package gui;

import java.util.Random;
import javax.swing.JOptionPane;
import modelo.*;

public class frm_clientes extends javax.swing.JInternalFrame {


    public frm_clientes() {
        initComponents();
    }
    private entidad entidad=null;
    //Métodos simples para limpiar cajas de texto utilizadas.
    private void limpiar(){
        txt_doc.setText("");
        txt_nom.setText("");
        txt_tel.setText("");
        txt_doc.requestFocus();
    }
        private void limpiar2(){
        txt_doct.setText("");
        txt_saldo.setText("0");
        txt_doct.requestFocus();
    }
    //Invocamos la instancia aleatorio, para generar números de cuenta y/o códigos.
    Random aleatorio = new Random(System.currentTimeMillis());
    int gn = 2, inc = 0;
    int aletorio;
    int numero_cuenta;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        cbo_cuenta = new javax.swing.JComboBox<>();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_cuenta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_doct = new javax.swing.JTextField();
        btn_actualizarC = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_eliminarCU = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_numcuenta = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Gestión de clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Registro de cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel2.setText("Número documento: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setText("Nombre cliente: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setText("Telefono: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setText("Tipo de cuenta: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));
        jPanel1.add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));
        jPanel1.add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, -1));
        jPanel1.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, -1));

        cbo_cuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente", "Premium" }));
        cbo_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_cuentaActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 140, -1));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-usuario-masculino-32 (1).png"))); // NOI18N
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 60));

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-actualizar-32.png"))); // NOI18N
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Registro de cuenta");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 30, -1));

        jLabel7.setText("Saldo: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        txt_saldo.setText("0");
        jPanel1.add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 80, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 730, -1));

        btn_cuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-accede-redondeado-derecho-32.png"))); // NOI18N
        btn_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuentaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 70, 60));

        jLabel8.setText("Documento titular:  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));
        jPanel1.add(txt_doct, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 140, -1));

        btn_actualizarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cms-32.png"))); // NOI18N
        btn_actualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarCActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 70, 60));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-32.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 60));

        btn_eliminarCU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-32 (1).png"))); // NOI18N
        btn_eliminarCU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCUActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminarCU, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 70, 60));

        jLabel9.setText("Numero de cuenta(detele):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));
        jPanel1.add(txt_numcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 740, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_cuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_cuentaActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        //Utilizamos este botón para registrar un cliente en nuestra base de datos.
        if(txt_doc.getText() != "" && txt_nom.getText() != "" && txt_tel.getText() != ""){
            entidad = new entidad();
            entidad.registrar(Integer.parseInt(txt_doc.getText()), txt_nom.getText(), txt_tel.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos de cliente para continuar.");
        }
        limpiar();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        //Utilizamos este botón para actualizar los datos de un cliente en nuestra base de datos.
        entidad = new entidad();
        entidad.actualizar(Integer.parseInt(txt_doc.getText()), txt_nom.getText(), txt_tel.getText());
        limpiar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuentaActionPerformed
        //Utilizamos este botón para crear una cuenta para un cliente en nuestra base de datos.
        if(txt_doct.getText() != "" && txt_saldo.getText() != ""){
            aletorio = aleatorio.nextInt(10000);
            numero_cuenta = gn * aletorio;
            entidad = new entidad();
            entidad.registrar_cuenta(inc, Integer.parseInt(txt_doct.getText()), cbo_cuenta.getSelectedItem().toString(), numero_cuenta, Double.parseDouble(txt_saldo.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos de la cuenta para continuar.");
        }
        limpiar2();
    }//GEN-LAST:event_btn_cuentaActionPerformed

    private void btn_actualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarCActionPerformed
        //Utilizamos este botón para actualizar los datos de la cuenta de un cliente en nuestra base de datos.
        if(txt_saldo.getText() != ""){
            entidad = new entidad();
            entidad.actualizar_cuenta(cbo_cuenta.getSelectedItem().toString(), Double.parseDouble(txt_saldo.getText()), Integer.parseInt(txt_doct.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el saldo para actualizar.");
        }
        limpiar2();
    }//GEN-LAST:event_btn_actualizarCActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        //Utilizamos este botón para eliminar un cliente de nuestra base de datos.
        if(txt_doc.getText() != ""){
            entidad = new entidad();
            entidad.eliminar(Integer.parseInt(txt_doc.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el docuemento del cliente para eliminar un cliente.");
        }
        txt_doc.setText("");
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_eliminarCUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCUActionPerformed
        //Utilizamos este botón para eliminar un cliente de nuestra base de datos.
        if(txt_numcuenta.getText() != ""){
            entidad = new entidad();
            entidad.eliminar_cuenta(Integer.parseInt(txt_numcuenta.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el numero de cuenta del cliente para eliminar una cuenta.");
        }
        txt_numcuenta.setText("");
    }//GEN-LAST:event_btn_eliminarCUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_actualizarC;
    private javax.swing.JButton btn_cuenta;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarCU;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cbo_cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_doct;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_numcuenta;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
