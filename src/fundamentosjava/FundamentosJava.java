/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosjava;

/**
 *
 * @author GIL PAMELA
 */
public class FundamentosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variables
        //Crae 3 variables, una para la edad,
        // otra para el nombre, y una última para 
        //su salario
        int edad;
        String nombre = "Pamela";
        double salario = 0;
        edad = 38;
        
        //mostrar por pantalla Soy <nombre> tengo <edad> y mi sueldo es de <sueldo>
        //Todo en una linea
        System.out.println("Soy " + nombre + ", tengo" + edad + "años y mi sueldo es u$" + salario);
        //Uno debajo del otro
        System.out.println("Me lamo:" + nombre);
        System.out.println("Y tengo" + edad);
        System.out.println("Mi salario es $" + salario);
        System.out.println("..........................");
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        
        edad = 38;
        if (edad >= 18) {
            System.out.println(" No esta en el rango de edad para salir al boliche");
        } else {
            System.out.println(" Es menor de 18");
        }
        //sout+ TAB
        System.out.println("BUCLE FOR");
        // El bucle FOR se utiliza cuando sabemos de antemano cuantas 
        // veces queremos que se ejecute un bloque de código
        /*
        for (inicialización; condición; actualización)
        BLOQUE DE CODIGO
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("Número: + i");
        }
        System.out.println(".........................");
        //Crear un bucle que inicie en 1 y me muestre hasta el número 5
        for (int i = 1; i <=5; i++) {
            System.out.println("Número: " + i);
        }
        //Estudiar estructura de un arreglo en JAVA , y como acceder a sus posiciones
        System.out.println("..............");
        int[] numeros = {1, 2, 3, 4, 5};
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(" Elemento" + j + ": " + numeros[j]);
        }
        System.out.println("................");
        System.out.println("BUCLE WHILE");
        /*
            EL BUCLE WHILE CUANDO NO SABEMOS DE ANTEMANO CUANTAS VECES
            DEBE EJECUTARSE EL BLOQUE DE CODIGO; DEPENDE DE UNA CONDICION PARA DETENERSE
        */
        int contador = 0;
        /* 
            while (contador <=5) {
            System.out.println("Número:" + contador);
            contador ++;
            }
        */
        
        //recorrer arreglo número con while
        while (contador < numeros.length) {
            System.out.println("Numero:" + contador + ":" + numeros[contador]);
            contador++;
        }
        
    }
    
}
   