/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author dayan.lara
 */
public class Agente {
     private String nombre;
    private boolean libre;
    private long tiempo;
    private long tiempoTotal;
    
    public Agente(String nombre) {
        this.nombre = nombre;
        this.libre = true;
        this.tiempo = 0;
        this.tiempoTotal = 0;
    }

    public Agente() {
    }

    
    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public boolean isLibre() {
        return libre;
    }
    
    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
    public long getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
    
    public long getTiempoTotal() {
        return tiempoTotal;
    }
    
    public void setTiempoTotal(long tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    @Override
    public String toString() {
        return "Agente{" + "nombre=" + nombre + ", libre=" + libre + ", tiempo=" + tiempo + ", tiempoTotal=" + tiempoTotal + '}';
    }
    
    
}
