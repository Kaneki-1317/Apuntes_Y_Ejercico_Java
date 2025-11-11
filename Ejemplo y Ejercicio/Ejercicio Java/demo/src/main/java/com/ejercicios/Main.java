package com.ejercicios;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4_While();
        ejercicio5_Do_while();
        ejercicio6_for();
        ejercicio7_break_continue();
        Par_o_Impar();
        Mayor_o_Menor();
        ParesDel1Al20();
        cuentaRegresiva();*/
    }

/*  public static void ejercicio1() {
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Tienes " + edad + " Eres mayor de edad");
        } else {
            System.out.println("Tienes " + edad + " Eres menor de edad");
        }
    }

    public static void ejercicio2() {
        int dia = 10;

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día inválido"); break;
        }
    }

    public static void ejercicio3(){
        int a = 45;
        int b = 12;

        int mayor = (a > b) ? a : b;
        System.out.println("El numero mayor es: " + mayor);
    }

    public static void ejercicio4_While() {
        int contador = 10;

        while (contador <= 20) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }

    public static void ejercicio5_Do_while() {
        int numero = 1;
        int suma = 0;

        do {
            suma += numero;
            numero++;
        } while (numero <= 100);

        System.out.println("La suma es: " + suma);
    }

    public static void ejercicio6_for() {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero positivo: ");
        int numero = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void ejercicio7_break_continue() {
        for (int i = 1; i <= 10; i++){
            if (i == 4){
                continue;
            }
            if (i == 8){
                break;
            }
            System.out.println("Numero: " + i);        
        }
    }

    public static void Par_o_Impar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else if (numero < 0 ) {
            System.out.println("El numero es invalido");            
        } else {
            System.out.println("El numero " + numero + " es impar");  
        }
    }

    public static void Mayor_o_Menor() {
        Scanner input = new Scanner(System.in);

        System.out.println("ingresa el numero 1: ");
        int numero1 = input.nextInt();

        System.out.println("ingresa el numero 2: ");
        int numero2 = input.nextInt();

        int mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: " + mayor);
    }

    public static void ParesDel1Al20() {
        for(int i = 1; i <= 20; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void cuentaRegresiva(){

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        System.out.println("Se ha terminado el tiempo!!!! BOOMMMMM");
    }*/

   /* public static void MostrarMenu(){
        System.out.println("======= Menu =======");
        System.out.println(" 1. lista ");
        System.out.println(" 2. ver ");
        System.out.println(" 3.Salir ");
        System.out.println("Selecione una opción");

        Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();

        if( opcion == 1 ){
            System.out.println("Haz elegido la opción 1");
        } else if ( opcion == 2){
            System.out.println("Haz elegido la opción 2");
        } else if ( opcion == 3){
            System.out.println("Saliendo del menu");
            return;
        } else {
            System.out.println("La opcion es incorrecta");
        }
    }*/

    

}
