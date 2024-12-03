package modelo;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class entidad {
    //Variables a utilizar
    private String nombre;
    private String password;
    private String nom;
    private String tel;
    private int documento;
    private int cod_servicio;
    private String tipo_servicio;
    private int num_cuenta;
    private String tipo;
    private double saldo;
    //relacionado con la conexion
    private String sql="";
    private conexion cnn=null;
    private DefaultTableModel modelo = null;
    
    public entidad() {
        cnn=new conexion();
    }
    //Getters y setters que necesitaremos.
    public entidad(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public String getTipo() {
        return tipo;
    }
    //En este método registramos al empleado.
    public void insertar(String nom, String pass){
     
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="insert into empleados values(?,?);";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setString(1, nom);
            ps.setString(2, pass);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado un empleado en la BD.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
   //En este método registramos al cliente.
    public void registrar(int doc, String nom, String tel){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="insert into clientes values(?,?,?);";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, doc);
            ps.setString(2, nom);
            ps.setString(3, tel);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado un cliente en la BD.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    //En este método creamos la cuenta del cliente.
    public void registrar_cuenta(int id, int client_id, String cuenta, int num, double saldo){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="insert into cuentas values(?,?,?,?,?);";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, id);
            ps.setInt(2, client_id);
            ps.setString(3, cuenta);
            ps.setInt(4, num);
            ps.setDouble(5, saldo);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado una cuenta en la BD.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    //En este método solicitamos o registramos un servicio.
    public void registrar_serv(int cod, String tipo, int doc, double saldo){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="insert into servicios values(?,?,?,?);";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod);
            ps.setString(2, tipo);
            ps.setInt(3, doc);
            ps.setDouble(4, saldo);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ha registrado o solicitado un servicio.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
    //En este método actualizamos los datos del cliente.
    public void actualizar(int doc, String nom, String tel){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update clientes set nombre=?,telefono=? where documento=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setString(1, nom);
            ps.setString(2, tel);
            ps.setInt(3, doc);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el cliente en la BD.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
       //En este método actualizamos los datos de la cuenta.
        public void actualizar_cuenta(String cuenta, double saldo, int doct){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update cuentas set tipo_cuenta=?,saldo=? where cliente_id=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setString(1, cuenta);
            ps.setDouble(2, saldo);
            ps.setInt(3, doct);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha actualizado la cuenta en la BD.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método eliminamos un cliente según su numero de documento.
        public void eliminar(int cod){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="delete from clientes where documento=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método eliminamos una cuenta según su numero de cuenta.
        public void eliminar_cuenta(int cod){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="delete from cuentas where numero_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado la cuenta.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método actualizamos el servicio en caso de no pagarlo completamente.
        public void abono_servicio(int cod_s, int doc, double saldo){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update servicios set saldo=? where cod_servicio=? and cliente_id=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setDouble(1, saldo);
            ps.setInt(2, cod_s);
            ps.setInt(3, doc);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Has pagado el servicio.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
       //En este método eliminamos el servicio según su documento y código.
        public void pagar_servicio(int cod_s, int doc){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="delete from servicios where cod_servicio=? and cliente_id=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod_s);
            ps.setInt(2, doc);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Has pagado el servicio.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
       //En este método validamos que el cliente tenga un servicio.
        public boolean validar_cliente_serv(int doc){
        boolean encontro = false;
        try {
            cnn.getConectar(); // Conectarme a la base de datos
            sql = "select * from servicios where cliente_id=?;";
            //crear la sentencia
            PreparedStatement ps = (PreparedStatement) cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, doc);
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery();
            //Validar si hay un producto que exista
            if (rs.next()) {
                this.documento = rs.getInt("cliente_id");
                encontro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ese documento no tiene servicio.");
                encontro = false;
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        } catch (SQLException ex) {
        }
        return encontro;
    }
        //En este método validamos la existencia de un servicio según su código.
        public boolean validar_servicio(int cod){
        boolean encontro = false;
        try {
            cnn.getConectar(); // Conectarme a la base de datos
            sql = "select * from servicios where cod_servicio=?;";
            //crear la sentencia
            PreparedStatement ps = (PreparedStatement) cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod);
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery();
            //Validar si hay un producto que exista
            if (rs.next()) {
                this.cod_servicio = rs.getInt("cod_servicio");
                this.tipo_servicio = rs.getString("tipo_servicio");
                this.documento = rs.getInt("cliente_id");
                this.saldo = rs.getDouble("saldo");
                encontro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Código de servicio erroneo.");
                encontro = false;
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        } catch (SQLException ex) {
        }
        return encontro;
    }
    //En este método validamos el usuario de logueo.
    public boolean validar(String nom, String pass){
        boolean encontro = false;
        try {
            cnn.getConectar(); // Conectarme a la base de datos
            sql = "select * from empleados where usuario=? and password=?;";
            //crear la sentencia
            PreparedStatement ps = (PreparedStatement) cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setString(1, nom);
            ps.setString(2, pass);
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery();
            //Validar si hay un producto que exista
            if (rs.next()) {
                this.nombre = rs.getString("usuario");
                this.password = rs.getString("password");
                encontro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                encontro = false;
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        } catch (SQLException ex) {
        }
        return encontro;
    }
    //En este método validamos que exista una cuenta según su numero de cuenta.
        public boolean validar_cuenta(int num, String cuenta){
        boolean encontro = false;
        try {
            cnn.getConectar(); // Conectarme a la base de datos
            sql = "select * from cuentas where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps = (PreparedStatement) cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, num);
            ps.setString(2, cuenta);
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery();
            //Validar si hay un producto que exista
            if (rs.next()) {
                this.num_cuenta = rs.getInt("numero_cuenta");
                this.saldo = rs.getDouble("saldo");
                this.tipo = rs.getString("tipo_cuenta");
                encontro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Número de cuenta incorrecto.");
                encontro = false;
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        } catch (SQLException ex) {
        }
        return encontro;
    }
       //En este método validamos la existencia del cliente.
       public boolean validar_cliente(int doc){
        boolean encontro = false;
        try {
            cnn.getConectar(); // Conectarme a la base de datos
            sql = "select * from clientes where documento=?;";
            //crear la sentencia
            PreparedStatement ps = (PreparedStatement) cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, doc);
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery();
            //Validar si hay un producto que exista
            if (rs.next()) {
                this.documento = rs.getInt("documento");
                this.nom = rs.getString("nombre");
                this.tel = rs.getString("telefono");
                encontro = true;
            } else {
                JOptionPane.showMessageDialog(null, "Número de documento inexistente.");
                encontro = false;
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        } catch (SQLException ex) {
        }
        return encontro;
    }
       //En este método retiramos el saldo de la cuenta.
        public void retirar_saldo(double saldo, int num, String cuenta){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update cuentas set saldo=? where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setDouble(1, saldo);
            ps.setInt(2, num);
            ps.setString(3, cuenta);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha retirado el saldo.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método depositamos el saldo a la cuenta
        public void depositar_saldo(double saldo, int num, String cuenta){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update cuentas set saldo=? where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setDouble(1, saldo);
            ps.setInt(2, num);
            ps.setString(3, cuenta);
            //Ejecutar la sentencia SQL
            JOptionPane.showMessageDialog(null, "Se ha depositado el saldo.");
            ps.executeUpdate();
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método transferimos el saldo, modificando las dos cuentas según su número de cuenta.
        public void transferir_saldo(double saldo, int num, String cuenta, double saldo2, int num2, String cuenta2){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="update cuentas set saldo=? where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setDouble(1, saldo);
            ps.setInt(2, num);
            ps.setString(3, cuenta);
            ps.executeUpdate();
            //
            sql="update cuentas set saldo=? where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement rs=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setDouble(1, saldo2);
            ps.setInt(2, num2);
            ps.setString(3, cuenta2);
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Se ha depositado el saldo.");
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //Verificamos el saldo de la cuenta según su numero de cuenta y entregamos saldo.
        public void consultar_saldo(int cod, String cuenta){
        try{
            cnn.getConectar(); // Conectarme a la base de datos
            sql="select * from cuentas where numero_cuenta=? and tipo_cuenta=?;";
            //crear la sentencia
            PreparedStatement ps=(PreparedStatement)cnn.getConectar().prepareStatement(sql);
            //Asignar los parametros
            ps.setInt(1, cod);
            ps.setString(2, cuenta);
            //Crear una sentencia para traer los datos
            ResultSet rs=ps.executeQuery();
            //Validar si hay un producto que exista
            if(rs.next()){
                this.num_cuenta=rs.getInt("numero_cuenta");
                this.saldo=rs.getInt("saldo");
            }else{
                JOptionPane.showMessageDialog(null, "Número de cuenta inexistente.");
            }
            //Ejecutar la sentencia SQL
            ps.executeUpdate();
            cnn.getDesconectar();
        }catch(SQLException ex){
            //JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        }
       //En este método listamos los datos del servicio en la tabla.
        public void listar_serv(JTable tbl_servicios){
        //Crear array para los titulos de la tabla
            String[] titulos={"Documento", "Nombre", "Telefono", "Tipo de servicio", "Codigo de servicio", "Saldo"};
            //Crear un array para almacenar los registros de la base de datos
            String[] registros=new String[6];
            modelo = new DefaultTableModel(null, titulos);
            try{
            //sql = "select * from clientes;";
            sql = "SELECT clientes.documento, clientes.nombre, clientes.telefono, " +
                     "servicios.tipo_servicio, servicios.cod_servicio, servicios.saldo " +
                     "FROM clientes " +
                     "LEFT JOIN servicios ON clientes.documento = servicios.cliente_id;";
            //Crear la sentencia
            Statement ps = (Statement) cnn.getConectar().createStatement();
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("documento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("telefono");
                registros[3] = rs.getString("tipo_servicio");
                registros[4] = rs.getString("cod_servicio");
                registros[5] = rs.getString("saldo");
                modelo.addRow(registros);
            }
            tbl_servicios.setModel(modelo);
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
        //En este método listamos los datos del cliente en la tabla.
        public void listar(JTable tbl_clientes){
        //Crear array para los titulos de la tabla
            String[] titulos={"Documento", "Nombre", "Telefono", "Tipo de cuenta", "Numero de cuenta", "Saldo"};
            //Crear un array para almacenar los registros de la base de datos
            String[] registros=new String[6];
            modelo = new DefaultTableModel(null, titulos);
            try{
            //sql = "select * from clientes;";
            sql = "SELECT clientes.documento, clientes.nombre, clientes.telefono, " +
                     "cuentas.tipo_cuenta, cuentas.numero_cuenta, cuentas.saldo " +
                     "FROM clientes " +
                     "LEFT JOIN cuentas ON clientes.documento = cuentas.cliente_id;";
            //Crear la sentencia
            Statement ps = (Statement) cnn.getConectar().createStatement();
            //Crear una sentencia para traer los datos
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                registros[0] = rs.getString("documento");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("telefono");
                registros[3] = rs.getString("tipo_cuenta");
                registros[4] = rs.getString("numero_cuenta");
                registros[5] = rs.getString("saldo");
                modelo.addRow(registros);
            }
            tbl_clientes.setModel(modelo);
            cnn.getDesconectar();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }
}
