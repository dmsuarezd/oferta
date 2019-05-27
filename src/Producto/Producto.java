/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Conexion.conexion;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
