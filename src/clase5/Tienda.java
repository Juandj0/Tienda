/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Estudiante
 */
public class Tienda {
    private int nit;
public String nombre;
//ALT+INSERT PARA GENERERAR CONSTRUCTOR,SETTERS Y GETTERS
//Reaclion asociacion unidireccional;
private Disco discos;
// Clase discos 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Disco getDiscos() {
        return discos;
    }

    public void setDiscos(Disco discos) {
        this.discos = discos;
    }

    public Tienda(int nit) {
        this.nit = nit;
    }

}
