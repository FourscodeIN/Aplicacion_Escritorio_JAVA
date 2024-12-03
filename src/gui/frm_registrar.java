package gui;

import modelo.entidad;

public class frm_registrar extends javax.swing.JInternalFrame {

    public frm_registrar() {
        initComponents();
    }
    entidad entidad=null;
    //Método simple para limpiar cajas de texto utilizadas.
    private void limpiar(){
        txt_user.setText("");
        txt_pass.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        txt_pass = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Registrar usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registrar usuario: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel2.setText("Contraseña: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, -1));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-añadir-usuario-masculino-32 (1).png"))); // NOI18N
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 40));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        //Utilizamos este botón para registar al empleado en nuestra base de datos.
        entidad = new entidad();
        entidad.insertar(txt_user.getText(), txt_pass.getText());
        limpiar();
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
