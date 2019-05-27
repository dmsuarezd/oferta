/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caficultor;

/**
 *
 * @author cadefihuilaltda
 */

public class ZoomCiudad {
   /** private int ubi_id_ubicacion;
    private String ubi_nombre;

    public ZoomCiudad(int ubi_id_ubicacion, String ubi_nombre){
        this.setId (ubi_id_ubicacion);
        this.setNombre(ubi_nombre);
    }   
    
    public int getId() {
        return ubi_id_ubicacion;
    }

    public void setId(int ubi_id_ubicacion) {
        this.ubi_id_ubicacion = ubi_id_ubicacion;
    }

    public String getNombre() {
        return ubi_nombre;
    }

    public void setNombre(String nombre) {
        this.ubi_nombre = ubi_nombre;
    }
    
    public String toString(){
        return ubi_nombre;
    }
    */
    
    
    private int ubi_id_ubicacion;
    private String ubi_nombre;

    public ZoomCiudad(int ubi_id_ubicacion, String ubi_nombre){
        this.setUbi_id_ubicacion(ubi_id_ubicacion);
        this.setUbi_nombre(ubi_nombre);
    }   
    
    public int getUbi_id_ubicacion() {
        return ubi_id_ubicacion;
    }

    public void setUbi_id_ubicacion(int ubi_id_ubicacion) {
        this.ubi_id_ubicacion = ubi_id_ubicacion;
    }
    
    // public int toInt(){
      //  return ubi_id_ubicacion;
     //}

    public String getUbi_nombre() {
        return ubi_nombre;
    }

    public void setUbi_nombre(String ubi_nombre) {
        this.ubi_nombre = ubi_nombre;
    }
    
      
    public String toString(){
    return ubi_id_ubicacion + " - " + ubi_nombre;
    }
    
}