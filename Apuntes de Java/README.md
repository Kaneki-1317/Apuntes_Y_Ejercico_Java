# Dia 2 Java 
# 1. Operadores
## Operadores y estructuras de decisión
    Los operadores se utilizan para realizar operaciones en variales y valores, Son representado por simbolos escpeciales y se clasifica en los siguentes
## Operadores de asignación y aritméticos
### Operador de asignación
    El operador Java más sencillo es el operador de asignación. El operador es el simbolo igual (=), encargado de asignar un valor a una variable. 
**Ejemplo de Operador asignación**

    int valor = 123;
    boolean flag = true; 
    String = cadena; 
    cadena = "Hello";

### Operadores aritméticos
    Los operadores aritméticos en Java son los operadores matemáticos.
| Operador | Descripción |
|:-----------:|-------------|
| +  | Operador de Suma. Concatena cadenas para la suma de String |
| -  | Operador Resto |
| *  | Operador multiplicación |
| /  | Operador división |
| %  | Operador resto* |
| ++ | Operador de incremento: incrementa el valor de la variable en 1 |
| -- | Operador de decremento: decrementa el valor de la variable en 1 |

**Ejemplo de Operadores aritméticos**

    double v1 = 5;
    double v2 = 2; 
    double suma = v1 + v2;                  //7 
    double resta = v1 - v2;                 //3 
    double multiplicacion = v1 * v2;        //10 
    double division = v1/v2;                //2.5  
    double resto = v1%v2;                   //1

### Operadores de igualdad y relacionales
    Los operadores de igualdad y relacionales en Java son aquellos que permiten comparar el contenido de una variable con otra.
| Operador | Descripción |
|:-----------:|-------------|
| == | Igual |
| != | No igual a |
| >  | Mayor que |
| >= | Mayor o igual que |
| <  | Menor que |
| <= | Menor o igual que |

### Operadores condicionales
    Los operadores condicionales en Java son aquellos que evalúan dos expresiones booleanas.
| Operador | Descripción |
|:-----------:|-------------|
| && | AND |
| || | OR |

**Ejemplo de Operadores condicionales**

| Operador | Descripción | Ejemplo | Resultado | Explicación |
|-----------|--------------|----------|-------------|--------------|
| `&&` | AND lógico (Y) | `(5 > 3) && (8 > 6)` | `true` | Ambas expresiones son verdaderas, por lo tanto el resultado es `true`. |
| `&&` | AND lógico (Y) | `(5 > 10) && (8 > 6)` | `false` | La primera expresión es `false`, por lo tanto el resultado es `false` (no se evalúa la segunda). |
| *ll* | OR lógico (O) | (5 > 10) *ll* (8 > 6) | `true` | Una de las expresiones es `true`, por lo tanto el resultado es `true`. |
| *ll* | OR lógico (O) | (5 > 10) *ll* (2 > 6) | `false` | Ambas expresiones son `false`, por lo tanto el resultado es `false`. |


# 2. Estructuras de decisión
### if-else
    Las estructuras de decisión es una condición con el fin de tomar una decisión.

    Sntaxis Basica.

    if (condicion){
        // Bloque then;
    } else {
        // bloque else;
    }

**Ejemplo de if-else**

**Si es mayor de edad**

    int edad = 15;

    if (edad >= 18){
        System.out.println("Eres mayor de edad");
    } else {
        System.out.println("Eres menor de edad");
    }

    - VISUALIZACION DEL EJERCICIO
        
        Evidencio, un operador de asignación en edad, la estructura de decisión if-eslse que contiene un Operador de igualdad y relaciones.


### Switch
    La estructura switch en Java se utiliza para evaluar múltiples casos, Proporciona una forma más concisa de manejar múltiples opciones.

    La sintaxis Basica de switch es la siguente:

    switch (expresion) { 
        case valor1: 
            bloque1; 
            break; 
        case valor2: 
            bloque2; 
            break; 
        case valor3: 
            bloque3; 
            break;
        ... 
            default: 
                bloque_por_defecto; 
    }

**Ejemplo de switch**

    int diaSemana = 3;
    switch(diaSemana) {
        case 1:
            sout("Lunes");
            break;
        case 2:
            sout("Martes");
            break;
        case 1:
            sout("Miercoles");
            break;
        case 1:
            sout("Jueves");
            break;
        case 1:
            sout("Viernes");
            break;
        case 1:
            sout("Fin de semana");
            break;
    }


### Operador ternario

    El operador ternario es una forma abreviada de escribir una expresión condicional. 
    
    Tiene la siguiente sintaxis general:

    variable = (condición) ? valor_si_verdadero : valor_si_falso;

**Ejemplo de Operador ternario**

    int numero1 = 10;
    int numero2 = 20;

    int mayor = (numero1 > numero2) ? numero1 : numero2;

    sout("El numero mayor es: " + mayor);