package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;

public class frm_principal extends javax.swing.JFrame {

    public frm_principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    entidad entidad = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        lbl_user = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menu_general = new javax.swing.JMenu();
        menu_reg = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menu_gestionC = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        listado_menu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menu_transa = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menu_servicios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        informe_menu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_salida = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menu_volver = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MDI NovaBank");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lbl_user.setBackground(new java.awt.Color(204, 204, 204));
        lbl_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(204, 204, 204));
        lbl_user.setText("jLabel1");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_user))
        );
        Escritorio.setLayer(lbl_user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menu_general.setText("General");

        menu_reg.setText("Registrar empleados");
        menu_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_regActionPerformed(evt);
            }
        });
        menu_general.add(menu_reg);
        menu_general.add(jSeparator6);

        menu_gestionC.setText("Gestión de clientes");
        menu_gestionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestionCActionPerformed(evt);
            }
        });
        menu_general.add(menu_gestionC);
        menu_general.add(jSeparator1);

        listado_menu.setText("Listado clientes");
        listado_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado_menuActionPerformed(evt);
            }
        });
        menu_general.add(listado_menu);
        menu_general.add(jSeparator2);

        menu_transa.setText("Transacciones");
        menu_transa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_transaActionPerformed(evt);
            }
        });
        menu_general.add(menu_transa);
        menu_general.add(jSeparator4);

        menu_servicios.setText("Servicios");
        menu_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_serviciosActionPerformed(evt);
            }
        });
        menu_general.add(menu_servicios);
        menu_general.add(jSeparator5);

        informe_menu.setText("Informe");
        informe_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informe_menuActionPerformed(evt);
            }
        });
        menu_general.add(informe_menu);

        jMenuBar2.add(menu_general);

        jMenu2.setText("Salida");

        menu_salida.setText("Cerrar aplicación");
        menu_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salidaActionPerformed(evt);
            }
        });
        jMenu2.add(menu_salida);
        jMenu2.add(jSeparator3);

        menu_volver.setText("Cerrar sesión");
        menu_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_volverActionPerformed(evt);
            }
        });
        jMenu2.add(menu_volver);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botón de menú para el formulario de gestión de clientes.
    private void menu_gestionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestionCActionPerformed
        frm_clientes clientes=new frm_clientes();
        Escritorio.add(clientes);
        clientes.show();
    }//GEN-LAST:event_menu_gestionCActionPerformed

    //Botón de menú para el formulario de tabla de clientes.
    private void listado_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado_menuActionPerformed
        frm_listado listado=new frm_listado();
        Escritorio.add(listado);
        listado.show();
    }//GEN-LAST:event_listado_menuActionPerformed
    //Botón de menú para el formulario de transacciones.
    private void menu_transaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_transaActionPerformed
        frm_transaccion trans=new frm_transaccion();
        Escritorio.add(trans);
        trans.show();
    }//GEN-LAST:event_menu_transaActionPerformed
    //Cerramos aplicación.
    private void menu_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_salidaActionPerformed
    //Generamos clase 'Variables' y variable global.
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        entidad=new entidad();
        lbl_user.setText("Está utilizando el usuario: " + Variables.variableGlobal);
    }//GEN-LAST:event_formWindowActivated
    //Cierre de sesión muestra formulario de logueo.
    private void menu_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_volverActionPerformed
        frm_logueo logueo = new frm_logueo();
        logueo.setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Has cerrado sesión.");
    }//GEN-LAST:event_menu_volverActionPerformed
    //Botón de menú para el formulario de servicios.
    private void menu_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_serviciosActionPerformed
        frm_servicio serv=new frm_servicio();
        Escritorio.add(serv);
        serv.show();
    }//GEN-LAST:event_menu_serviciosActionPerformed
    //Botón de menú para el formulario de tabla de informes.
    private void informe_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informe_menuActionPerformed
        frm_informe inf=new frm_informe();
        Escritorio.add(inf);
        inf.show();
    }//GEN-LAST:event_informe_menuActionPerformed
    //Botón de menú para el formulario de registro de usuarios logueo.
    private void menu_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_regActionPerformed
        frm_registrar reg=new frm_registrar();
        Escritorio.add(reg);
        reg.show();
    }//GEN-LAST:event_menu_regActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem informe_menu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JMenuItem listado_menu;
    private javax.swing.JMenu menu_general;
    private javax.swing.JMenuItem menu_gestionC;
    private javax.swing.JMenuItem menu_reg;
    private javax.swing.JMenuItem menu_salida;
    private javax.swing.JMenuItem menu_servicios;
    private javax.swing.JMenuItem menu_transa;
    private javax.swing.JMenuItem menu_volver;
    // End of variables declaration//GEN-END:variables
}
