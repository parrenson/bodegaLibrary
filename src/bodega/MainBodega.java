/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodega;

import bodega.Bodega;
import data.Producto;
import modelo.OperacionesBodega;

/**
 *
 * @author baron
 */
public class MainBodega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Bodega <Producto> bodega2=new Bodega<>();
        
        bodega2.apilar(new Producto("pan con gaseosa", 10, 20, 30));
        bodega2.apilar(new Producto("Pan con leche", 40, 20, 20));
        bodega2.apilar(new Producto("Pan con Cafe", 5, 220, 230));
        bodega2.apilar(new Producto("Pan con milo", 100, 2202, 2304));
        
        OperacionesBodega<bodega.Base> a = new OperacionesBodega<>();
        String resultado = a.hacerHtmlpila1(bodega2);
//        System.out.println("chatgpt " + resultado);
//resultado =  OperacionesBodega.generarHtml(bodega2);
        System.out.println(resultado);
//        System.out.println("chatgpt " + bodega2.toString());
    }
    
}
