    📁Apuntes_Y_Ejercicio_Java
    ┣ 📁 Apuentes de Java
    ┃  ┗  NotaJava.md
    ┣ 📁 Ejemplo y Ejercicio
    ┃  ┣ 📁 Ejemplo - class
    ┃  ┗ 📁  Ejercicios
    ┗ README.md

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

# Día 3 Java 
# 1. Estructuras repetitivas
    Las estructuras repetitivas o bucles permiten ejecutar un bloque de código varias veces mientras se cumpla una condición. 
    En Java existen tres tipos principales de bucles: while, do-while y for.

### 1.1 While
    El bucle while ejecuta un bloque de código mientras una condición sea verdadera. 
    Primero evalúa la condición y, si esta es true, ejecuta el bloque.

    Sintaxis básica:

    while (condición) {
        // Código a ejecutar mientras la condición sea verdadera
    }

**Ejemplo de while**

    int contador = 1;

    while (contador <= 5) {
        System.out.println("Contador: " + contador);
        contador++;
    }

    - VISUALIZACIÓN DEL EJERCICIO

        El ciclo imprime los números del 1 al 5. 
        La variable contador se incrementa en cada iteración hasta que la condición contador <= 5 deja de cumplirse.

---

### 1.2 Do-while
    El bucle do-while es similar al while, pero garantiza que el bloque de código se ejecute al menos una vez, 
    ya que la condición se evalúa después del bloque.

    Sintaxis básica:

    do {
        // Código a ejecutar
    } while (condición);

**Ejemplo de do-while**

    int numero = 1;

    do {
        System.out.println("Número: " + numero);
        numero++;
    } while (numero <= 5);

    - VISUALIZACIÓN DEL EJERCICIO

        Aunque la condición se evalúa al final, el bloque se ejecutará al menos una vez. 
        En este caso imprime los números del 1 al 5.

---

### 1.3 For
    El bucle for se utiliza cuando se conoce de antemano el número de veces que se desea repetir una acción. 
    Es el bucle más utilizado para recorrer rangos o colecciones.

    Sintaxis básica:

    for (inicialización; condición; incremento) {
        // Código a ejecutar
    }

**Ejemplo de for**

    for (int i = 1; i <= 5; i++) {
        System.out.println("El valor de i es: " + i);
    }

    - VISUALIZACIÓN DEL EJERCICIO

        int i = 1 inicializa la variable del contador.
        i <= 5 es la condición que se evalúa antes de cada iteración.
        i++ incrementa el valor de i en 1 en cada repetición.
        El resultado muestra los números del 1 al 5.

---

# 2. Sentencias de ramificación
## Sentencias de ramificación
    Las sentencias de ramificación permiten controlar el flujo de ejecución dentro de los bucles.
    Sirven para interrumpir o saltar iteraciones dependiendo de una condición.

### 2.1 Break
    La sentencia break se utiliza para salir inmediatamente de un bucle (for, while o do-while) 
    o de una estructura switch.

**Ejemplo de break**

    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            break; // Se interrumpe el bucle cuando i vale 3
        }
        System.out.println("Valor de i: " + i);
    }

    - VISUALIZACIÓN DEL EJERCICIO

        El bucle imprime los números del 1 al 2.
        Cuando i llega a 3, la instrucción break detiene completamente la ejecución del bucle.

---

### 2.2 Continue
    La sentencia continue se utiliza para saltar una iteración específica del bucle y continuar con la siguiente.

**Ejemplo de continue**

    for (int i = 1; i <= 5; i++) {
        if (i == 2) {
            continue; // Salta la iteración cuando i vale 2
        }
        System.out.println("Valor de i: " + i);
    }

    - VISUALIZACIÓN DEL EJERCICIO

        El bucle imprime los números del 1 al 2, excepto el 2.
        Cuando i es igual a 2, la instrucción continue hace que se salte esa vuelta, pero el bucle continúa normalmente.

---

### Ejemplo combinado de break y continue

    for (int i = 1; i <= 10; i++) {
        if (i == 4) {
            continue; // Salta el número 4
        }
        if (i == 8) {
            break; // Detiene el bucle cuando i vale 8
        }
        System.out.println("Número: " + i);
    }

**Salida esperada**

    Número: 1
    Número: 2
    Número: 3
    Número: 5
    Número: 6
    Número: 7

    - VISUALIZACIÓN DEL EJERCICIO

        El programa imprime los números del 1 al 10.
        Se salta el 4 gracias al continue y se detiene completamente cuando llega al 8 por el break.
