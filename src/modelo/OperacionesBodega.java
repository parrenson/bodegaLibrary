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
public class OperacionesBodega<T> {
 
    public static <T extends Base> String generarHtml(Bodega <T> bodega){
        Bodega<T> bodegaTemporal = duplicarBodega(bodega);

        String html ="";
        while(!bodegaTemporal.estoyvacio()){
            T e = bodegaTemporal.desapilar();
            html += "<tr>" + e.toString() + "</tr>";
        }
        return html;    
    }
    public static <T extends Base> Bodega<T> duplicarBodega (Bodega<T> bodegaOriginal){
        Bodega<T> bodegaDuplicada = new Bodega<>();
        while (!bodegaOriginal.estoyvacio()){
            T elemento=bodegaOriginal.desapilar();
            bodegaDuplicada.apilar(elemento);
        }
        return bodegaDuplicada;
    }
 
}
