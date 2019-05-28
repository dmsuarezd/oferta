/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Conexion.conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

/**
 *
 * @author cadefihuilaltda
 */
public class Producto extends ProductoApp.ProductoPOA {
    
    //public class Ciudad extends CiudadApp.CiudadPOA{
   
    private ORB orb;
conexion conectar = new conexion();

    @Override
    public boolean insertarProducto(int pro_id_producto, String pro_nombre, String pro_estado) {
        boolean resultado = false;
        try {
            String sentenciaSql = "insert into producto (pro_id_producto, pro_nombre, pro_estado)"
                    + "values('"+ pro_id_producto +"','"+ pro_nombre +"','"+ pro_estado+"')";
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
            JOptionPane.showMessageDialog(null, "Ocurrio un error al insertar un producto: " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean actualizarProducto(int pro_id_producto, String pro_nombre, String pro_estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(int pro_id_producto) {
         boolean resultado = false;
        try{
            String sentenciSql = "delete from producto where pro_id_producto = " + pro_id_producto;
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
        JOptionPane.showMessageDialog(null, "Ocurrio un error al eliminar un Producto debido a: " + ex.getMessage());
        }
        return resultado;
        }
    public String listarProducto() {
        String lista = "";
        try{
            String sentenciSql = "Select * from producto";
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
            JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar el listado de Productos debido a : " + ex.getMessage());
        }
        return lista;

    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet cargarTablaProducto() {
        ResultSet resultado = null;
        try {
            String query = "Select pro_id_producto, pro_nombre, pro_estado from producto";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al cargar la tabla de Ubicaciones: "+e.getMessage());
        }
        return resultado;
        
    }
    //Carga y SQL de Estado de Producto
    
    public ResultSet cargarComboEstado() {
        ResultSet resultado = null;
        try {
            String query = "select car_codigo, car_nombre from caracteristica where car_caracteristica = 'estado' and car_estado = 'A'";
            conectar.conectar();
            Statement st = conectar.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error cargar los datos del combobox estado "+e.getMessage());
        }
        return resultado;
    }
}
