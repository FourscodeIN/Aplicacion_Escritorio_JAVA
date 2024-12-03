package gui;

import modelo.entidad;
import java.util.Random;
import javax.swing.JOptionPane;

public class frm_servicio extends javax.swing.JInternalFrame {

    public frm_servicio() {
        initComponents();
    }
    //Utilizamos la función aleatorio para generar un código de servicio.
    entidad entidad = null;
    Random aleatorio = new Random(System.currentTimeMillis());
    int gn = 3;
    int aletorio;
    int codigo_servicio;
    double saldo = 0;
    double abono = 0;
        //Método sencillo para resetear cajas de texto.
        private void limpiar(){
        txt_saldo.setText("0");
        txt_doc.setText("");
        txt_doct.setText("");
        txt_valor.setText("0");
        txt_cod.setText("");
        txt_doc.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_doc = new javax.swing.JTextField();
        cbo_servicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JTextField();
        btn_solicitar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        btn_pagar = new javax.swing.JButton();
        txt_doct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Gestión de servicios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Solicitud de servicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setText("Pagos de servicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel3.setText("Documento: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setText("Servicio: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel1.add(txt_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, -1));

        cbo_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "CDT", "Crédito hipotecario", "Crédito libre inversión" }));
        jPanel1.add(cbo_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 140, -1));

        jLabel5.setText("Saldo: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txt_saldo.setText("0");
        jPanel1.add(txt_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        btn_solicitar.setText("Solicitar servicio");
        btn_solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicitarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_solicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, 30));

        jLabel6.setText("Valor a pagar: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel7.setText("Código servicio: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));
        jPanel1.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, -1));

        txt_valor.setText("0");
        jPanel1.add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 140, -1));

        btn_pagar.setText("Pagar Servicio");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, 30));
        jPanel1.add(txt_doct, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, -1));

        jLabel9.setText("Documento titular: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botón para solicitar un servicio y guardarlo en nuestra base de datos.
    private void btn_solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicitarActionPerformed
        entidad = new entidad();
        if(entidad.validar_cliente(Integer.parseInt(txt_doc.getText()))){
            aletorio = aleatorio.nextInt(10000);
            codigo_servicio = gn * aletorio;
            if(Integer.parseInt(txt_saldo.getText())>0){
                entidad.registrar_serv(codigo_servicio, cbo_servicio.getSelectedItem().toString(), Integer.parseInt(txt_doc.getText()), 
                Integer.parseInt(txt_saldo.getText()));   
                limpiar();   
            }else{
                JOptionPane.showMessageDialog(null, "No puede solicitar un servicio con valor a 0.");
            }
        }
    }//GEN-LAST:event_btn_solicitarActionPerformed
    //Botón donde eliminamos un servicio si el valor es identico, si quiere abonar un pago simplemente valida en la base de datos y actualiza el campo.
    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        entidad = new entidad();
        if(entidad.validar_cliente_serv(Integer.parseInt(txt_doct.getText()))){
            if(entidad.validar_servicio(Integer.parseInt(txt_cod.getText()))){
                saldo = entidad.getSaldo();
                if(Integer.parseInt(txt_valor.getText()) == entidad.getSaldo()){
                    if(Integer.parseInt(txt_valor.getText()) >0){
                        entidad.pagar_servicio(Integer.parseInt(txt_cod.getText()), Integer.parseInt(txt_doct.getText()));
                        limpiar();   
                    }else{
                    JOptionPane.showMessageDialog(null, "No puede pagar un servicio con valor 0.");
                    }
                }else{
                    abono = saldo - Integer.parseInt(txt_valor.getText());
                    if(abono >0){
                        entidad.abono_servicio(Integer.parseInt(txt_cod.getText()), Integer.parseInt(txt_doct.getText()), abono); 
                        saldo = 0;
                        abono = 0;
                        limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "No puede pagar más cantidad de lo que debe.");
                    }
                }  
            }
        }
    }//GEN-LAST:event_btn_pagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pagar;
    private javax.swing.JButton btn_solicitar;
    private javax.swing.JComboBox<String> cbo_servicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_doc;
    private javax.swing.JTextField txt_doct;
    private javax.swing.JTextField txt_saldo;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
