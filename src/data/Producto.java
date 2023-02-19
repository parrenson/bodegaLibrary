/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author baron
 */
public class Producto {
    
    private String nombre_producto;
    private int cantidad;
    private double valor;
    private int tiempo_despacho;
    
    public Producto() {}
    
    public Producto(String nombre_producto, int cantidad, double valor, int tiempo_despacho) {
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.tiempo_despacho = tiempo_despacho;
    }

    /**
     * Get the value of tiempo_despacho
     *
     * @return the value of tiempo_despacho
     */
    public int getTiempo_despacho() {
        return tiempo_despacho;
    }

    /**
     * Set the value of tiempo_despacho
     *
     * @param tiempo_despacho new value of tiempo_despacho
     */
    public void setTiempo_despacho(int tiempo_despacho) {
        this.tiempo_despacho = tiempo_despacho;
    }


    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Get the value of nombre_producto
     *
     * @return the value of nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * Set the value of nombre_producto
     *
     * @param nombre_producto new value of nombre_producto
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    @Override
    public String toString() {
        return "Producto: " + "nombre producto: " + nombre_producto + ", cantidad: " + cantidad + ", valor: " + valor + ", tiempo despacho: " + tiempo_despacho+"\n" ;
    }
    
    
}
