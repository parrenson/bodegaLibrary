/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bodega.Bodega;
import data.Producto;

/**
 *
 * @author dlara
 */
public class OperacionesBodega {
    
    Bodega<Producto> pilaProductos;
    
 public String generarHtml(){
      
      Producto salidaProductos = null;
      String html ="";
      while(!pilaProductos.estoyvacio()){
      salidaProductos = pilaProductos.desapilar();
      html += "<tr>" + salidaProductos.toString() + "</tr>"; 
      }
      return html;
  }
}
