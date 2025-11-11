package com.cris;
public class Factorial {
    public static int fact(int numero){
        System.out.println(numero + "x");
        if (numero <= 1) return 1;

            return numero * fact(-1);
    
    }

    public static int vueltos(int monto, int moneda){
        if ((monto - moneda) < moneda) {
            return 0;
        }
        return 1 + vueltos(monto - moneda, moneda);
    }
}
