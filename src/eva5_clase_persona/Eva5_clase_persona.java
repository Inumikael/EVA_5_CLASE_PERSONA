/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva5_clase_persona;

/**
 *
 * @author invitado
 */
public class Eva5_clase_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona perso1 = new persona ();
        perso1.setNombre("Juan");
        perso1.setApellido("perez jolote");
        perso1.setEdad(50);
        
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
    }
    
}

class persona{
    //atributos --> estrado de objeto
    //No deben ser accesibles 
    
    private String nombre;
    private String apellido;
    private int edad;
            
    
    //Metodos que sean publicos son la interfaz 
    //si son para manipular los atributos hay un estandar
    // java 
    //metodos set ( estructura) y get (lectura)
    //leer nombre 
    public String getNombre(){
        return nombre; 
    }
    //escribe nombre:
    public void setNombre (String valor) {
        nombre = valor;
       
    }
    //apellido 
    public String getApellido(){
       return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
    }
       //edad 
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
}