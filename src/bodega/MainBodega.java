/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import bodega.Bodega;
import data.Producto;

/**
 *
 * @author baron
 */
public class MainBodega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bodega<Producto> pilaProductos = new Bodega<>();
        
        // Generar entre 1 a 5 productos cada segundo
        int cantidadProductos = (int)(Math.random() * 5) + 1;
        for (int i = 0; i < cantidadProductos; i++) {   
            // Generar un producto aleatorio
            String nombre_producto = "Producto " + (pilaProductos.pilaProductos.size() + 1);
            int cantidad = (int) (Math.random() * 100) + 1;
            double valor = Math.random() * 100;
            int tiempo_despacho = (int) (Math.random() * 6) + 2; 
            // Añadir el producto a la bodega
            Producto objP = new Producto(nombre_producto, cantidad, valor, tiempo_despacho);
            pilaProductos.apilar(objP);
            System.out.println(pilaProductos.toString());
         }
         
        
    }
    
}