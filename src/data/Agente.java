/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import bodega.Base;

/**
 *
 * @author dayan.lara
 */
public class Agente {
    private boolean estado;
    private int tiempo;
    private int tiempoTotal;
    private int cantidadProductos;
    private double promedio;
    private int tiempoMayor = 0;
    private int tiempoMenor = 0;
    
    public Agente() {}

    public Agente(boolean estado, int tiempo, int tiempoTotal, int cantidadProductos) {
        this.estado = estado;
        this.tiempo = tiempo;
        this.tiempoTotal = tiempoTotal;
        this.cantidadProductos = cantidadProductos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean getEstado() {
        return estado;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    public void calcularTiempoTotal() {
        tiempoTotal += tiempo;
    }
    public void calcularTotalProductos() {
        cantidadProductos += 1;
    }
    public void calcularTiempoMayor() {
        cantidadProductos += 1;
    }
    
    @Override
    public String toString() {
        return "Agente{" + "estado=" + estado + ", tiempo=" + tiempo + ", tiempoTotal=" + tiempoTotal + ", cantidadProductos=" + cantidadProductos + '}';
    }

    
}
