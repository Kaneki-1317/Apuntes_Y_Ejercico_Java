package com.cristian;

public class Main {
    public static float ayNoJuanJo = 0.5f;
    public static final int DIAS_DE_LA_SEMANA = 7;
    public static void main(String[] args) {
        /*int numero = 100;
        long otroNumero = 10L;
        boolean bandera = true;
        float decimal = 0.5f;
        double decimalPro = 0.5;
        char caracter = 'A';
        String saludo = "hello world!";

        System.out.println("Hello world!");// No  es primitivo
        System.out.println("1");
        System.out.println("10000000L");
        System.out.println(true);
        System.out.println(0.4f);
        System.out.println(0.4);
        System.out.println('A');

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(numeros[5]);
        System.out.println(numeros[6]);
        System.out.println(numeros[7]);
        System.out.println(numeros[8]);
        System.out.println(numeros[9]);
        System.out.println(saludo); //NO es primitivo es de referencia */

        /*int dia = 4;
        actividades(dia);
        actividades(++dia);
        actividades(dia++);
        actividades(dia);*/

        System.out.println(1+2);
        System.out.println(1-2);
        System.out.println(1*2);
        System.out.println(1/2);
        System.out.println(10%2);
        actividades(2);

        System.out.println(Math.pow(2, 5));

        var resultado = circunferencia(30);
        System.out.println(resultado);
    }

    public static double circunferencia(int diametro){
        System.out.println("Circunferencia:");
        return 2 * Math.PI * diametro;
    }

    public static void actividades(int dia){
        String[] cosasPorhacer = {"Ir a la iglesia", "Venir a campus", "venira acampus",
            "venir a campus", "no venir a campus", "Ser feliz" };
        System.out.println("Que nos toca hacer HOY!");
        if (dia >= DIAS_DE_LA_SEMANA) {
            System.out.println("bye");
        } else {
            System.out.println(cosasPorhacer[dia]);
            System.out.println(dia);
        }
    }
}