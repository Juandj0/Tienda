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
public class Disco {
    private String nombre;
    private String autor;
    private String genero;
    private String caratula;
    private Cancion[] cancion;
    private int numeroCanciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public Disco(String nombre, String autor, String genero, String caratula) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.caratula = caratula;
        this.cancion= new Cancion[15];
        this.numeroCanciones=0;
    }
    public boolean agregarCancion(String nombre, int precio, int tamaño, int calidad){
        Cancion cancion= new Cancion(nombre,precio,tamaño,calidad);
      if(this.numeroCanciones<15){
      this.cancion[this.numeroCanciones]=cancion;
      this.numeroCanciones++;
      return true;
      }  
        
    return false;
    }
    
    public Cancion darInformacionCancion(String nombreCancion){
        Cancion cancion=null;
        for(int i=0;i<this.numeroCanciones;i++){
        if(this.cancion[i].getNombre().equals(nombreCancion)){
            //equals compara strings
         cancion=this.cancion[i];
        }
        }
            
        return cancion;
    }
    
}
