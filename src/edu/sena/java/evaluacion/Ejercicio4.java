/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.sena.java.evaluacion;
import java.util.Scanner;

/**
 * @author ReaperSeven
 * 
 * Esta clase representa un programa orientado a objetos que realiza lo siguiente:
 *  1. Solicita N números e imprime cada componente.
 *  2. Arma con los números un vector o una matriz.
 *  3. Suma todos los números.
 *  4. Resta el total de la sumatoria con cada elemento e imprime los números obtenidos.
 */

public class Ejercicio4 {

    // Declaración de atributos.
    private Scanner lector; // Objeto Scanner para leer la entrada del usuario.
    private int cantNumeros; // Cantidad de números ingresados por el usuario.
    private int[] vector; // Arreglo para almacenar los números ingresados.
    private int[] restaVector; // Arreglo para almacenar los resultados de la resta de cada número.
    private int sumatoria; // Suma de los números ingresados.

    // Método constructor.
    public Ejercicio4() {
        lector = new Scanner(System.in); // Inicializa el Scanner para leer la entrada del usuario.
    }

    /**
     * Este método solicita al usuario la cantidad de números que ingresará e imprime cada uno.
     */
    public void solicitarNumeros() {
        System.out.print("¿Cuántos números desea ingresar?: ");
        cantNumeros = lector.nextInt(); // Lee la cantidad de números ingresados por el usuario.

        // Creación del vector donde se almacenarán los números.
        vector = new int[cantNumeros];

        // Implementación de for para almacenar los números ingresados por el usuario.
        for (int i = 0; i < cantNumeros; i++) {
            System.out.print("Ingrese un número: ");
            vector[i] = lector.nextInt(); // Lee y almacena cada número en el vector.
        }

        // Impresión de los números ingresados.
        System.out.print("Números ingresados: ");
        System.out.print("[");
        for (int i : vector) {
            System.out.print(i + " "); // Imprime cada número ingresado por el usuario.
        }
        System.out.print("]");
        System.out.print("\n---------");
    }

    /**
     * Este método suma todos los números ingresados por el usuario e imprime el resultado.
     */
    public void sumarNumeros() {
        // Inicialización de acumulador para almacenar la sumatoria.
        sumatoria = 0;

        // Implementación de for para recorrer el vector y sumar sus elementos.
        for (int i = 0; i < cantNumeros; i++) {
            sumatoria += vector[i]; // Suma cada número del vector.
        }

        // Impresión del resultado.
        System.out.print("\nLa suma de los elementos es de: " + sumatoria);
        System.out.print("\n---------");
    }

    /**
     * Este método resta la sumatoria a cada número del vector y almacena el resultado en restaVector.
     */
    public void restarNumeros() {
        restaVector = new int[cantNumeros]; // Inicializar el arreglo

        // Implementación de for para restar la sumatoria a cada número del vector.
        for (int i = 0; i < cantNumeros; i++) {
            restaVector[i] = vector[i] - sumatoria; // Resta la sumatoria de cada número del vector.
        }

        // Impresión de los resultados de la resta.
        System.out.print("\nResultados: ");
        System.out.print("[");
        for (int i : restaVector) {
            System.out.print(i + " "); // Imprime cada resultado de la resta.
        }
        System.out.print("]");
    }

    /**
     * Método principal que crea una instancia de la clase Ejercicio4, solicita números al usuario, realiza la suma y la resta, y muestra los resultados.
     */
    public static void main(String[] args) {
        Ejercicio4 se = new Ejercicio4(); // Crea una instancia de la clase Ejercicio4.
        se.solicitarNumeros(); // Solicita números al usuario.
        se.sumarNumeros(); // Realiza la suma de los números ingresados.
        se.restarNumeros(); // Realiza la resta de la suma a cada número y muestra los resultados.
    }
}
