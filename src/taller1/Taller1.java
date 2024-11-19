/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

/**
 *
 * @author johan
 */
import java.util.Scanner;
public class Taller1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//Ejercicio 1
         System.out.println("Hola, ya se imprimir frases");
         
//Ejercicio 2
         int numero = 600;
         System.out.println(numero);
         
//Ejercicio 3
         double numDecimal = 107.7;
         System.out.println(numDecimal);
         
        //Ejercicio 4
         int suma = 1234 + 532;
         System.out.println("La suma es: " + suma);
         
//Ejercicio 5
         int resta = 1234 - 532;
         System.out.println("La resta es: " + resta);
         
//Ejercicio 6
         int multiplicacion = 1234 * 532;
         System.out.println("La multiplicación es: " + multiplicacion);
         
//Ejercicio 7
         double division = 1234.0 / 532.0;
         System.out.println("La división es: " + division);
         
//Ejercicio 8
         for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            }
         
//Ejercicio 9
         for (int i = 1; i <= 9; i++) {
            System.out.println(i);
            }
         
//Ejercicio 10
         for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
            }
         
//Ejercicio 11
         for (int i = 5; i <= 10; i++) {
            System.out.println(i);
            }
         
//Ejercicio 12
         for (int i = 5; i <= 15; i++) {
            System.out.println(i);
            }
         
//Ejercicio 13
         for (int i = 5; i <= 15000; i++) {
            System.out.println(i);
            }
         
//Ejercicio 14
         for (int i = 0; i < 200; i++) {
            System.out.println("hola");
            }
         
//Ejercicio 15
         for (int i = 1; i <= 30; i++) {
            System.out.println(i * i);
            }
         
//Ejercicio 16
         long resultado = 1;//Usamos long por que el valor es muy grande
         for (int i = 1; i <= 20; i++) {
            resultado *= i;
            }
         System.out.println("El producto de los primeros 20 números es: " + resultado);
         
//Ejercicio 17
         int suma2 = 0;
         for (int i = 1; i <= 100; i++) {
            suma2 += i * i;
            }
         System.out.println("La suma de los cuadrados de los primeros 100 números es: " + suma2);
         
//Ejercicio 18
         Scanner scanner = new Scanner(System.in);
         System.out.print("Introduce un número entero: ");
         int numero2 = scanner.nextInt();
         int sumaa = 0;
         for (int i = numero2 + 1; i <= numero2 + 100; i++) {
            sumaa += i;
            }
         System.out.println("La suma de los 100 números siguientes es: " + sumaa);
         
//Ejercicio 19
         Scanner scanner2 = new Scanner(System.in);
         System.out.print("Introduce la cantidad en euros: ");
         double euros = scanner2.nextDouble();
         double dolares = euros * 1.06;  //  1 euro = 1.06 dólares
         System.out.println("La cantidad en dólares es: " + dolares);
         
//Ejercici 20 
         Scanner scanner3 = new Scanner(System.in);
         System.out.print("Introduce la altura del rectángulo: ");
         double altura = scanner3.nextDouble();
         System.out.print("Introduce la anchura del rectángulo: ");
         double ancho = scanner3.nextDouble();
         double area = altura * ancho;
         System.out.println("El área del rectángulo es: " + area);
         
//Ejercici 21 
         Scanner scanner4 = new Scanner(System.in);
         // Solicitar dos números al usuario
         System.out.print("Introduce el primer número: ");
         int num1 = scanner4.nextInt();
         System.out.print("Introduce el segundo número: ");
         int num2 = scanner4.nextInt();
         // Comparar los dos números e imprimir cuál es mayor y cuál es menor
         if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
         } else if (num1 < num2) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
         } else {
            System.out.println("Ambos números son iguales.");
            }
         
//Ejercicio 22
         Scanner scanner5 = new Scanner(System.in);
         // Solicitar un número entero al usuario
         System.out.print("Introduce un número entero: ");
         int num = scanner5.nextInt();
         // Imprimir los números impares menores que el número ingresado
         System.out.println("Los números impares menores que " + num + " son:");
         for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
         }
        
//Ejercicio 23
         Scanner scanner6 = new Scanner(System.in);
         // Solicitar los dos números
         System.out.print("Introduce el primer número: ");
         int a = scanner6.nextInt();
         System.out.print("Introduce el segundo número: ");
         int b = scanner6.nextInt();

        // Algoritmo de Euclides
         while (b != 0) {
            int temp = b;
            b = a % b; // El nuevo valor de b es el resto de a dividido entre b
            a = temp; // El valor de a se actualiza al valor de b anterior
         } 
         System.out.println("El GCD (Máximo Común Divisor) es: " + a);
        
//Ejercicio 24
         Scanner scanner7 = new Scanner(System.in);
         // Solicitar los coeficientes a, b, y c de la ecuación cuadrática
         System.out.print("Introduce el coeficiente a: ");
         double aa = scanner7.nextDouble();
         System.out.print("Introduce el coeficiente b: ");
         double bb = scanner7.nextDouble();
         System.out.print("Introduce el coeficiente c: ");
         double cc = scanner.nextDouble();
         // Calcular el discriminante
         double discriminante = b * b - 4 * a * cc;
         // Verificar si la ecuación tiene soluciones reales
         if (discriminante > 0) {
             // Dos soluciones reales diferentes
            double x1 = (-bb + Math.sqrt(discriminante)) / (2 * aa);
            double x2 = (-bb - Math.sqrt(discriminante)) / (2 * aa);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
         } else if (discriminante == 0) {
             // Una solución real
            double x = -bb / (2 * aa);
            System.out.println("La única solución es: x = " + x);
         } else {
             // No tiene soluciones reales
            System.out.println("La ecuación no tiene solución real.");
         }
         

//Ejercicio 26 
         Scanner scanner8 = new Scanner(System.in);
         // Solicitar tres números enteros
         System.out.print("Introduce el primer número: ");
         int numer1 = scanner8.nextInt();
         System.out.print("Introduce el segundo número: ");
         int numer2 = scanner8.nextInt();
         System.out.print("Introduce el tercer número: ");
         int numer3 = scanner8.nextInt();
         
         // Metodo Math.max y Math.min anidados para sacar el mayor y menor

         int mayor = Math.max(numer1, Math.max(numer2, numer3));
         int menor = Math.min(numer1, Math.min(numer2, numer3));
         // Imprimir el mayor y el menor
         System.out.println("El mayor es: " + mayor);
         System.out.println("El menor es: " + menor);
         
//Ejercicio 27
         Scanner scanner9 = new Scanner(System.in);
         double fahrenheit;
         // Se solicita al usuario que ingrese una temperatura en Fahrenheit o 999 para salir.
         do {
            System.out.print("Introduce la temperatura en Fahrenheit (999 para salir): ");
            fahrenheit = scanner9.nextDouble();
             // Si el valor ingresado no es 999, se realiza la conversión a Celsius.
            if (fahrenheit != 999) {
                //Formula de conversion
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("La temperatura en Celsius es: " + celsius);
            }
            // El ciclo se repite hasta que el usuario ingrese 999
         } while (fahrenheit != 999);
         
//Ejercicio 28      
         // Bucle for que recorre los números del 1 al 5
         for (int i = 1; i <= 3; i++) {
             // Sentencia switch para evaluar el valor de 'i'   
            switch (i) {
                case 1:
                    System.out.println("Caso 1");
                    break;// Salir del switch después de ejecutar este caso
                case 2:
                    System.out.println("Caso 2");
                    break;// Salir del switch después de ejecutar este caso
                case 3:
                    System.out.println("Caso 3");
                    break;// Salir del switch después de ejecutar este caso
                default:
                    System.out.println("Caso desconocido");
                    break;
            }
         }
         
        
           
//Ejercicio 30
         int limite = 100;  // Imprime los números primos hasta 100

         System.out.println("Números primos hasta " + limite + ":");

        // Bucle externo para recorrer todos los números hasta 'limite'
         for (int i = 2; i <= limite; i++) {
            boolean esPrimo = true;

            // Bucle interno para comprobar si 'i' tiene algún divisor distinto de 1 y sí mismo
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {  // Si 'i' es divisible por 'j', no es primo
                    esPrimo = false;
                    break;  // Sale del bucle interno
                }
            }

            // Si es primo, lo imprimimos
            if (esPrimo) {
                System.out.println(i);
            }
        }
    }

}

    
   //C:\Users\johan\OneDrive\Documents\NetBeansProjects\Taller1/.git directory git init C:\Users\johan\OneDrive\Documents\NetBeansProjects\Taller1
   
    

