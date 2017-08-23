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
public class Tienda {
    private String nombre;
    private Disco[] disco;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Disco[] getDisco() {
        return disco;
    }

    public void setDisco(Disco[] disco) {
        this.disco = disco;
    }

    public Tienda(String nombre) {
        this.nombre = nombre;
      
    }
    
    
}
