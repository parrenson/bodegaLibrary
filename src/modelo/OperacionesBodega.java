/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bodega.Base;
import bodega.Bodega;
import data.Producto;

/**
 *
 * @author dlara
 */
public class OperacionesBodega<T extends Base> {
    
    
    
 public static <T extends Base> String generarHtml(Bodega <T> bodega){
     
         Bodega<T> colaDuplicada=new Bodega<>();

      String html ="";
      while(!colaDuplicada.estoyvacio()){
      T salidaProductos = colaDuplicada.desapilar();
      html += "<tr>" + salidaProductos.toString() + "</tr>"; 
      }
      return html;
      
  }
}
