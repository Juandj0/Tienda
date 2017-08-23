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
public class Clase5 {
private int nit;
public String nombre;
//ALT+INSERT PARA GENERERAR CONSTRUCTOR,SETTERS Y GETTERS
//Reaclion asociacion unidireccional;
private Disco discos;
// Clase discos 

    public Disco getDiscos() {
        return discos;
    }

    public void setDiscos(Disco discos) {
        this.discos = discos;
    }

    public Clase5(int nit, Disco discos) {
        this.nit = nit;

    }
    

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    }

