/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bodega.Bodega;
import data.Producto;

/**
* En esta clase se realizaran todas las operaciones que se realizan en la bodega.
* @author nicolas_and.barona@uao.edu.co Nicolas Barona Cod.2215189 - 
* @date Febrero 22 2023
* @version 1.0
*/
public class OperacionesBodega {
    public void crearProductos() {
        /**
        * Creacion y apilado de productos, se crean entre 1 y 6 productos durante cada segundo de ejecucion 
        * del método cumpliendo con las caracteristicas de la clase Producto para posteriormente apilar cada uno de ellos 
        * y puedan ser procesados.
        * * @param nombre descripción. // De cada uno de los parámetros que recibe el método.
        * @return explicación del valor de retorno del método
        */

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
        }                 
    }
}
