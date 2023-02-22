/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import data.Producto;
import java.util.LinkedList;
import modelo.OperacionesBodega;

/**
 *
 * @author baron
 */
public class Bodega<T extends Base> {
    public LinkedList<T> pilaProductos;
    
    public Bodega() {
        pilaProductos = new LinkedList<>();
    }
    
    public void apilar(T elemento){
        pilaProductos.addFirst(elemento);
    }
    
    public T desapilar() {
        return pilaProductos.removeFirst();
    }
    
    public boolean estoyvacio() {
        return pilaProductos.isEmpty();
    }

  
//     public static <T extends Base> String generarHtml(Bodega <T> bodega){
//   
////         Bodega<T> colaDuplicada=new Bodega<>();
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
//Bodega<Producto> miBodega = new Bodega<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for(T elemento : pilaProductos) {
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
