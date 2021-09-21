/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolista;

/**
 *
 * @author 57305
 */
public class Futbolista {
    
    //atributos = datos = variables
    private int numeroCamiseta;
    private String nombre;
    private String apellido;
    private String posicion;
    private int edad;
    private String equipo;
    
    //metodo especial = fotocopiadora = inicia la clase 
    
     public Futbolista() {
    }
    
     public Futbolista(int numeroCamiseta, String nombre, String apellido, String posicion, int edad, String equipo) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
    }
     
     //Metodos de encapsulamiento get and set
     
     public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
     
    //metodos = acciones = funciones 

    

    

   
    
}
 