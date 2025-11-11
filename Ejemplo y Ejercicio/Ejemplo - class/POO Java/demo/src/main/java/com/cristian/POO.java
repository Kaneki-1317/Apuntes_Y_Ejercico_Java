package com.cristian;
// CLASS
public class POO {
    //Auto 
    // Atributos (propiedades)
    public String marca;
    public String color;
    public int velocidad;

    // Métodos (acciones)
    void acelerar(){
        velocidad += 10;
        System.out.println("EL auto acelera. Velocidad: " + velocidad);
    }

    public void frenar(){
        velocidad -= 10;
        System.out.println("El aunto frena. velocidad: " + velocidad);
    }

}



