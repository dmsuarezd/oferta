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
public class ZoomCaracteristicas {
    
    private String car_codigo;
    private String car_nombre;

    public ZoomCaracteristicas(String car_codigo, String car_nombre){
        this.setCar_codigo(car_codigo);
        this.setCar_nombre(car_nombre);
    }   
    
    public String getCar_codigo() {
        return car_codigo;
    }

    public void setCar_codigo(String car_codigo) {
        this.car_codigo = car_codigo;
    }
    
    
    
    // public int toInt(){
      //  return ubi_id_ubicacion;
     //}

    public String getCar_nombre() {
        return car_nombre;
    }

    public void setCar_nombre(String car_nombre) {
        this.car_nombre = car_nombre;
    }
    
      
    public String toString(){
    return car_codigo + " - " +car_nombre;
    }
    
}
    

