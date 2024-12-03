package gui;

import javax.swing.JOptionPane;
import modelo.entidad;

public class frm_transaccion extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_transaccion
     */
    public frm_transaccion() {
        initComponents();
    }
    private entidad entidad=null;
    double saldo = 0;
    double saldo_final = 0;
    double saldo_s = 0;
    double saldo_finals = 0;
        //Método sencillo para resetear cajas de texto utilizadas.
        private void limpiar(){
        txt_saldo.setText("0");
        txt_cuenta.setText("");
        txt_other_cuenta.setText("");
        txt_cuenta.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_cuenta = new javax.swing.JTextField();
        cbo_tipo = new javax.swing.JComboBox<>();
        txt_saldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_retirar = new javax.swing.JButton();
        btn_depositar = new javax.swing.JButton();
        btn_transferir = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_other_cuenta = new javax.swing.JTextField();
        cbo_tipo2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Transacciones");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, -1));

        cbo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente", "Premium" }));
        jPanel1.add(cbo_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, -1));

        txt_saldo.setText("0");
        jPanel1.add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel5.setText("Número de cuenta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setText("Saldo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel8.setText("Datos de Transacción");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btn_retirar.setText("Retiro");
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 120, 30));

        btn_depositar.setText("Depositar");
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 120, 30));

        btn_transferir.setText("Transferir");
        btn_transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transferirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_transferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, 40));

        btn_consultar.setText("Consultar saldo");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 120, 30));

        jLabel9.setText("Número de cuenta a transferir: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(txt_other_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 130, -1));

        cbo_tipo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente", "Premium" }));
        jPanel1.add(cbo_tipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, -1));

        jLabel10.setText("Tipo de cuenta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel1.setText("Tipo de cuenta a transferir:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botón para retiro de saldo actualizando el campo en nuestra base de datos con las validaciones necesarias y relacionando los métodos de la clase entidad.
    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirarActionPerformed
        entidad = new entidad();
        if(txt_cuenta.getText() != "" && txt_saldo.getText() != ""){
            if(entidad.validar_cuenta(Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString())){
            saldo = entidad.getSaldo();
                if(saldo >0){
                    if(Integer.parseInt(txt_saldo.getText()) >0){
                    saldo_final = saldo - Double.parseDouble(txt_saldo.getText());
                    //saldo = saldo_final;
                    if(Integer.parseInt(txt_saldo.getText()) <= entidad.getSaldo()){
                            entidad.retirar_saldo(saldo_final, Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString());
                            //JOptionPane.showMessageDialog(null, "Se ha retirado el saldo.");
                            limpiar();
                            saldo = 0;
                            saldo_final = 0;   
                    }else{
                        JOptionPane.showMessageDialog(null, "Ha sobrepasado el saldo actual. No puede retirar esa cantidad.");
                    }   
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Cuenta sin saldo. Imposible retirar");
                }
            }  
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese los campos número de cuenta, saldo y tipo de cuenta para retirar.");
        }
    }//GEN-LAST:event_btn_retirarActionPerformed
    //Botón para deposito de saldo actualizando el campo en nuestra base de datos con las validaciones necesarias y relacionando los métodos de la clase entidad.
    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        entidad = new entidad();
        if(txt_cuenta.getText() != "" && txt_saldo.getText() != ""){
                 if(entidad.validar_cuenta(Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString())){
            saldo = entidad.getSaldo();
                saldo_final = saldo + Double.parseDouble(txt_saldo.getText());
              if(Integer.parseInt(txt_saldo.getText()) >0){
                if(Integer.parseInt(txt_saldo.getText()) <= 100000000){
                    entidad.depositar_saldo(saldo_final, Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString());
                    //JOptionPane.showMessageDialog(null, "Se ha depositado el saldo.");
                    limpiar();
                    saldo = 0;
                    saldo_final = 0;      
                }else{
                JOptionPane.showMessageDialog(null, "Imposible depositar más de 1.000.000 de saldo.");
            }
          }
        }   
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese los campos número de cuenta, saldo y tipo de cuentapara depositar.");
        }
    }//GEN-LAST:event_btn_depositarActionPerformed
    //Botón para consulta de saldo trayendo la información del campo de nuestra base de datos relacionando los métodos de la clase entidad.
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        entidad = new entidad();
        if(txt_cuenta.getText() != ""){
            if(entidad.validar_cuenta(Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString())){
                entidad.consultar_saldo(Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null, "Se ha mostrado su saldo en la caja de texto.");
                txt_saldo.setText(String.valueOf(entidad.getSaldo()));
                txt_cuenta.setText("");
                txt_other_cuenta.setText("");
                txt_cuenta.requestFocus();
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el campo número de cuenta y seleccione tipo de cuenta para consultar saldo.");
        }
    }//GEN-LAST:event_btn_consultarActionPerformed
    //Botón para transacciones de saldo actualizando el campo de diferentes cuentas en nuestra base de datos con las validaciones necesarias y relacionando los métodos de la clase entidad.
    private void btn_transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transferirActionPerformed
        entidad = new entidad();
        if(txt_cuenta.getText() != ""){
            if(entidad.validar_cuenta(Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString())){
                saldo = entidad.getSaldo();
                if(Integer.parseInt(txt_saldo.getText()) <= entidad.getSaldo()){
                    if(entidad.validar_cuenta(Integer.parseInt(txt_other_cuenta.getText()), cbo_tipo2.getSelectedItem().toString())){
                        saldo_s = entidad.getSaldo();
                        if(Integer.parseInt(txt_saldo.getText()) >0){
                            saldo_final = saldo - Double.parseDouble(txt_saldo.getText());
                            saldo_finals = saldo_s + Double.parseDouble(txt_saldo.getText());
                            if(Integer.parseInt(txt_saldo.getText()) <= 100000000){
                                entidad.transferir_saldo(saldo_finals, Integer.parseInt(txt_other_cuenta.getText()), cbo_tipo2.getSelectedItem().toString(),
                                        saldo_final, Integer.parseInt(txt_cuenta.getText()), cbo_tipo.getSelectedItem().toString());
                                JOptionPane.showMessageDialog(null, "Transferencia realizada con éxito.");
                                limpiar(); 
                                saldo = 0;
                                saldo_final = 0;  
                                saldo_s = 0;
                                saldo_finals = 0;
                            }else{
                                JOptionPane.showMessageDialog(null, "Imposible transferir más de 1.000.000 de saldo.");
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ha sobrepasado el saldo actual. No transferir esa cantidad.");
                }     
            }   
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el campo número de cuenta y seleccione tipo de cuenta para consultar saldo.");
        }
    }//GEN-LAST:event_btn_transferirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JButton btn_transferir;
    private javax.swing.JComboBox<String> cbo_tipo;
    private javax.swing.JComboBox<String> cbo_tipo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cuenta;
    private javax.swing.JTextField txt_other_cuenta;
    private javax.swing.JTextField txt_saldo;
    // End of variables declaration//GEN-END:variables
}
