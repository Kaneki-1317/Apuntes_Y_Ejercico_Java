package com.cris;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;


public class Ahorcado {
    String palabraSecreta, palabraTablero; 
    String[] palabras;
    int intentos;
    int errores;

    public Ahorcado(){
        palabras = new String[] { 
            "programacion",
            "java",
            "computadora",
            "teclado",
            "internet",
            "variable",
            "funcion",
            "objeto",
            "clase",
            "constructor",
            "compilador",
            "algoritmo",
            "desarrollador",
            "interfaz",
            "depuracion" 
        };
        palabraTablero = "";
        errores = 0;
        intentos = 10;
    }

    public void iniciar(){

        var r = new Random();
        palabraSecreta = palabras[r.nextInt(palabras.length - 1)];

        var flag = "_ ";
        for (int a = 0; a < palabraSecreta.length(); a++){
            palabraTablero += flag;
        }
    }

    public void ejecutar(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje());
            var letra = input.next();
            var temporal = "";
            if (palabraSecreta.contains(letra)) {
                var letras = palabraTablero.replace(" ", "").toCharArray();
                for (int i = 0; i < palabraSecreta.length(); i++ ){
                    if ( String.valueOf(palabraSecreta.charAt(i)).equals(letra)) {
                       
                        letras[i] = letra.charAt(0);
                    }
                }
                for (char c : letras){
                    temporal += String.valueOf(c) + " ";
                }
                palabraTablero = temporal;

                if (palabraTablero.replace(" ", "").equals(palabraSecreta)) {
                    System.out.println("Haz ganado");
                    System.out.println("La palabra era: " + palabraSecreta);
                    break;
                }
                
            } else {
                errores++;
                intentos--;
                System.out.println("Ahhh Erroorrrr");
                System.out.println("Ta'maaaaaaaaal");
            } 

            if (errores >= 10) {
                System.out.println("Haz perdido");
                System.out.println("La palabra era: " + palabraSecreta);
                break;
            }
        } 

        

    }

    public String mensaje(){
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("*** AHORCADO ***");
        strBuild.append("\nIntentos restantes " + intentos);
        strBuild.append("\nErrores " + errores);
        strBuild.append("\n" + palabraTablero);
        return strBuild.toString();
    }
}

