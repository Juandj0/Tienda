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
    private int numeroDiscos;

    public int getNumeroDiscos() {
        return numeroDiscos;
    }

    public void setNumeroDiscos(int numeroDiscos) {
        this.numeroDiscos = numeroDiscos;
    }

    
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
      this.disco=new Disco[20];
      this.numeroDiscos=0;
    }
    public boolean agregarDisco(String nombre,String autor,String genero,String caratula){
       
        Disco disco= new Disco(nombre,autor,genero,caratula);
        if(numeroDiscos<20){
            this.disco[this.numeroDiscos]=disco;
            this.numeroDiscos++;
            
            
        }
        
      return false;
    }
    public boolean agregarCancionDisco(String nombreDisco,String nombre, int precio, int tamaño, int calidad){
        boolean resultado=false;
        
        for(int i=0;i<this.numeroDiscos;i++){
        if(this.disco[i].getNombre().equals(nombreDisco)){
            resultado= this.disco[i].agregarCancion( nombre,  precio, tamaño,  calidad);
            break;
            }
        } 
        return resultado;
        
    }
    
    public Cancion darInformacionCancion(String nombreDisco,String nombreCancion){
     Cancion cancion=null;
        for(int i=0;i<this.numeroDiscos;i++){
        if(this.disco[i].getNombre().equals(nombreDisco)){
            //equals compara strings
         cancion=this.disco[i].darInformacionCancion(nombreCancion);
         break;
        }
        }
            
        return cancion;
    }
    
    
}
