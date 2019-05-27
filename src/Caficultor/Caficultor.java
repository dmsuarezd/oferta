/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caficultor;
import java.sql.*;
import Conexion.conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


/**
 *
 * @author cadefihuilaltda
 */
public class Caficultor extends CaficultorApp.CaficultorPOA {
    private ORB orb;
conexion conectar = new conexion();

    @Override
    public boolean insertarCaficultor(int caf_identificacion, String caf_tipo_identificacion, String caf_nombres, String caf_apellidos, int caf_telefono, String caf_direccion, String caf_email, int caf_id_ubicacion, String caf_sexo, String caf_estado) {
        boolean resultado = false;
        try {
            String sentenciaSql = "insert into caficultor (caf_identificacion, caf_tipo_identificacion, caf_nombres, caf_apellidos, caf_telefono, caf_direccion, caf_email, caf_id_ubicacion, caf_sexo, caf_estado)"
                    + "values('"+ caf_identificacion +"','"+ caf_tipo_identificacion +"','"+ caf_nombres+"','"+ caf_apellidos +"','"+ caf_telefono +"','"+ caf_direccion +"','"+ caf_email +"','"+ caf_id_ubicacion +"','"+ caf_sexo +"','"+ caf_estado+"')";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            int valor = st.executeUpdate(sentenciaSql);
            if(valor > 0){
                resultado = true;
            }
            //Se cierran los recursos
            st.close();
            conectar.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar un nuevo caficultor " + e.getMessage());
        }
        return resultado;
    }
    
    
    @Override
    public boolean actualizarCaficultor(int caf_identificacion, String caf_tipo_identificacion, String caf_nombres, String caf_apellidos, int caf_telefono, String caf_direccion, int caf_ubicacion, String caf_email, String caf_sexo, String caf_estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarCaficultor(int caf_identificacion) {
        boolean resultado = false;
        try{
            String sentenciSql = "delete from caficultor where caf_identificacion = " + caf_identificacion;
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            int valor = st.executeUpdate(sentenciSql);
            if(valor > 0){
                resultado = true;
            }
            //Se cierran los recursos.
            st.close();
            conectar.conectar();
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Ocurrio un error en el catch: " + ex.getMessage());
        }
        return resultado;
        }
            

    public String listarCaficultor() {
        String lista = "";
        try{
            String sentenciSql = "Select * from caficultor";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            ResultSet rs = st.executeQuery(sentenciSql);
            while(rs.next()){
                lista += rs.getLong(2) + " - " 
                        + rs.getString(3)+ " - " 
                        + rs.getString(4)+ " - " 
                        + rs.getString(5)+ " - " 
                        + rs.getString(6)+ " - " 
                        + rs.getString(7) + "\n";
            }
            //Se cierran los recursos.
            rs.close();
            conectar.conex.close();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error en el catch: " + ex.getMessage());
        }
        return lista;

    }

    
    

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public ResultSet cargarTablaCaficultor() {
        ResultSet resultado = null;
        try {
            String query = "Select caf_identificacion, caf_tipo_identificacion, caf_nombres, caf_apellidos, caf_telefono, caf_direccion, caf_email, caf_id_ubicacion, caf_sexo, caf_estado from caficultor";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error: "+e.getMessage());
        }
        return resultado;
        
    }
    
    //Carga y SQL de Ciudad (Ubicacion)
    public ResultSet cargarComboCiudad() {
        ResultSet resultado = null;
        try {
            String query = "Select ubi_id_ubicacion, ubi_nombre, ubi_estado from ubicacion where ubi_estado ='A'";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar los datos del combobox Ubicacioó: "+e.getMessage());
        }
        return resultado;
    }
    
    //Carga y SQL de Sexo
    public ResultSet cargarComboSexo() {
        ResultSet resultado = null;
        try {
            String query = "Select car_nombre, car_codigo from caracteristica where car_caracteristica='sexo' and car_estado = 'A'";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error cargar los datos del combobox Sexo "+e.getMessage());
        }
        return resultado;
    }
    
    //Carga y SQL de Tipo de Idntificación
    
    public ResultSet cargarComboTipoIdentificacion() {
        ResultSet resultado = null;
        try {
            String query = "Select car_nombre, car_codigo from caracteristica where car_caracteristica='identificacion' and car_estado = 'A'";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error cargar los datos del combobox Sexo "+e.getMessage());
        }
        return resultado;
    }
    
    //Carga y SQL de Estado de Caficultor
    
    public ResultSet cargarComboEstado() {
        ResultSet resultado = null;
        try {
            String query = "select car_codigo, car_nombre from caracteristica where car_caracteristica = 'estado' and car_estado = 'A'";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error cargar los datos del combobox Sexo "+e.getMessage());
        }
        return resultado;
    }
    



}
    
