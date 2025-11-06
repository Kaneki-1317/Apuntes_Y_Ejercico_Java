package com.mayorga;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Random r = new Random();
        
        int[] numeros = new int[10000];

        for(int a=0; a < numeros.length; a++){
            numeros[a] = r.nextInt(100);
        }
        
        for(int a=0; a < 10; a++){
            int indice = r.nextInt(10000);
            System.out.println("oiga el indece es: "+ indice+" = " + numeros[indice]);
        }

    }
}