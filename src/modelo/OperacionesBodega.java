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

//    public static String generarHtml(Bodega<Producto> bodega) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
// String html = hacerHtmlpila(miBodega);   
    
    
 public static <T extends Base> String generarHtml(Bodega <T> bodega){
         
//Bodega<T> duplicarBodega=new Bodega<>();
Bodega<T> bodegaTemporal = duplicarBodega(bodega);

      String html ="";
      html += "<tr><th>nombre de producto</th> <th>Cantidad</th> <th>Valor</th> <th>Tiempo de despacho</th></tr>";
      while(!bodegaTemporal.estoyvacio()){
      T salidaProductos = bodegaTemporal.desapilar();
      
      String[] arreglo = salidaProductos.toString().split(",");
      
      html += "<tr>" + "<td>" +arreglo[0]+ 
              "</td>"+ "<td>" +arreglo[1]+ 
              "</td>" + "<td>" +arreglo[2]+ 
              "</td>" + "<td>" +arreglo[3]+ "</td>" + "</tr>"; 
      }
      return html;
      
  }
 
 
   public String hacerHtmlpila() {
       
//creamos el metodo, dentro del metodo creamos la instacia de bodega pero no está haciendo nada.   
//Bodega<T> bodega = new Bodega<>();
////Bodega<T> bodega = generarHtml(Bodega<T>);

String html = "<HTML><Table border=1 width=100%>";
//html += OperacionesBodega.generarHtml(Bodega < T >) + "</Table></HTML>";
return html;
}

   
public String hacerHtmlpila1(Bodega <Producto> bodega) {
       

String html = "<HTML><Table border=1 width=100%> \n" ;
html += OperacionesBodega.generarHtml(bodega) + "\n</Table></HTML>";
return html;
}   
 
 
// public static <T extends Base> String generarHtml(Bodega <T> bodega){
//     
//         Bodega<T> colaDuplicada=new Bodega<>();
//Bodega<T> bodegaTemporal = duplicarBodega(bodega);
//
//      String html ="";
//      while(!bodegaTemporal.estoyvacio()){
//      T salidaProductos = bodegaTemporal.desapilar();
//      html += "<tr>" + salidaProductos.toString() + "</tr>"; 
//      }
//      return html;
//      
//  }
 
 
  public static <T extends Base> Bodega<T> duplicarBodega (Bodega<T> bodegaOriginal){
  
      Bodega<T> bodegaAux = new Bodega<>();
      Bodega<T> bodegaDuplicada = new Bodega<>();
     
      while (!bodegaOriginal.estoyvacio()){
      
      T elemento=bodegaOriginal.desapilar();
      bodegaAux.apilar(elemento);
      
      }
      while (!bodegaAux.estoyvacio()){
      T elemento=bodegaAux.desapilar();
      T elementoCopiado = (T) elemento.copy();
      bodegaOriginal.apilar(elemento);
      bodegaDuplicada.apilar(elementoCopiado);
      }
      return bodegaDuplicada;
  }
 
}
