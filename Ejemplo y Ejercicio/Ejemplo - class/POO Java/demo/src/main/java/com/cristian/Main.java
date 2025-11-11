package com.cristian;

public class Main {
    public static void main(String[] args) {
        // Objeto
         POO miAuto = new POO(); // crear un objeto de tipo Auto

         miAuto.marca = "Mazda";
         miAuto.color = "rojo";
         miAuto.velocidad = 0;

         miAuto.acelerar();
         miAuto.frenar();
    }
}