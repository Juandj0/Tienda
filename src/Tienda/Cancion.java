/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String nombre;
    private int precio;
    private int tamaño;
    private int calidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public Cancion(String nombre, int precio, int tamaño, int calidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
        this.calidad = calidad;
    }
    
    
}
