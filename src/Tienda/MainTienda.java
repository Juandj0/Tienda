/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class MainTienda {
        public static void main(String[] args) {
        // TODO code application logic here
        Tienda t=new Tienda("Pina records");
        Scanner lector= new Scanner(System.in);
        int opcion=0;
        int continuar=0;
        
          while(continuar==0){ 
              System.out.println("Menu");
          System.out.println("1.Agregar Discos");
          System.out.println("2.Agregar Cancion");
          System.out.println("3.Ver informacion Cancion");
          opcion=lector.nextInt();//Opcion igual al numero que creo el usario
          switch(opcion){
              case 1:
                   System.out.println("Nombre disco");
                  String nombre=lector.next(); // solo string
                   System.out.println("autor del disco");
               String autor=lector.next();
                   System.out.println("genero disco");
                  String genero=lector.next();
                   System.out.println("caratula disco");
                  String caratula=lector.next();
                  t.agregarDisco(nombre,autor,genero,caratula);
              case 2:
                  System.out.println("Lista de discos ");
                    for(int i=0; i<t.getNumeroDiscos(); i++){
                      System.out.println((i+1)+t.getDisco()[i].getNombre());
                       
              }
            
                  
                  
                  
                  
                  
          
          
          
          }
          
          
          
          }
          
          
          
         
          
          
          
       
        
        
    }
    
    
}
