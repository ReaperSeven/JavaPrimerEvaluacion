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
 * 1. Solicita una matriz NxN.
 * 2. Imprime los elementos de las cuatro imprimirEsquinas.
 * 3. Halla la sumatoria de la fila central.
 * 4. Halla el valor mayor de la matriz.
 * 5. Reemplaza por 0 todos los elementos de la matriz si uno de estos es 0.
 */
public class Ejercicio2 {
    // Declaración de atributos.
    private Scanner lector; // Objeto Scanner para leer entrada del usuario.
    private int filas; // Número de filas de la matriz.
    private int columnas; // Número de columnas de la matriz.
    private int[][] matriz; // La matriz de enteros.

    // Método constructor
    public Ejercicio2() {
        lector = new Scanner(System.in); // Inicializa el Scanner para entrada del usuario.
    }

    /**
     * Este método solicita al usuario las dimensiones de la matriz y los elementos que contendrá.
     */
    public void crearMatriz() {
        // Pedir al usuario que ingrese las dimensiones de la matriz.
        System.out.print("Ingrese el número de FILAS: ");
        filas = lector.nextInt(); // Lee el número de filas.
        System.out.print("Ingrese el número de COLUMNAS: ");
        columnas = lector.nextInt(); // Lee el número de columnas.

        // Asignar las dimensiones a la matriz.
        matriz = new int[filas][columnas];

        // Pedir al usuario que ingrese los elementos de la matriz.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese un elemento para la matriz: ");
                matriz[i][j] = lector.nextInt(); // Lee el elemento y lo asigna a la matriz.
            }
        }

        // Imprimir la matriz resultante.
        System.out.println("----MATRIZ----");
        for (int i = 0; i < filas; i++) {
            System.out.println();
            for (int j = 0; j < columnas; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
        }
        System.out.println();
    }

    /**
     * Este método imprime los elementos de las cuatro esquinas de la matriz.
     */
    public void imprimirEsquinas() {
        System.out.println("----ESQUINAS----");
        // Imprimir el elemento en la esquina superior izquierda.
        System.out.print("|" + matriz[0][0] + "|");
        // Imprimir el elemento en la esquina superior derecha.
        System.out.println("|" + matriz[0][columnas - 1] + "|");
        // Imprimir el elemento en la esquina inferior izquierda.
        System.out.print("|" + matriz[filas - 1][0] + "|");
        // Imprimir el elemento en la esquina inferior derecha.
        System.out.println("|" + matriz[filas - 1][columnas - 1] + "|");
        System.out.println("----------------");
    }

    /**
     * Este método calcula la suma de los elementos de la fila central de la matriz.
     */
    public void sumarFilaCentral() {
        // Calcular la posición de la fila central.
        int filaCentral = (filas / 2) - 1;
        // Declaración de un acumulador para la suma.
        int acumulador = 0;
        // Sumar los elementos de la fila central.
        for (int i = 0; i < matriz[filaCentral].length; i++) {
            acumulador += matriz[filaCentral][i];
        }
        // Imprimir la suma de la fila central.
        System.out.println("La suma de la fila central es: " + acumulador);
    }

    /**
     * Este método encuentra el valor máximo en la matriz.
     */
    public void valorMayor() {
        // Inicializar con el primer elemento de la matriz.
        int elementoMayor = matriz[0][0];
        // Encontrar el elemento mayor en la matriz.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > elementoMayor) {
                    elementoMayor = matriz[i][j];
                }
            }
        }
        // Imprimir el elemento mayor.
        System.out.println("El elemento mayor de la matriz es: " + elementoMayor);
    }

    /**
     * Este método busca si existe algún elemento igual a cero en la matriz.
     */
    public void buscarCero() {
        System.out.println("----BUSCAR CERO---");
        // Variable para determinar si se encontró un 0.
        boolean encontrado = false;
        // Buscar un cero en la matriz.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 0) {
                    encontrado = true;
                    System.out.println("Se encontró un 0 en la posición matriz[" + i + "][" + j + "]");
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        // Si se encontró un 0, cambiar todos los elementos de la matriz a 0.
        if (encontrado) {
            for (int f = 0; f < filas; f++) {
                System.out.println();
                for (int c = 0; c < columnas; c++) {
                    matriz[f][c] = 0;
                    System.out.print("|" + matriz[f][c] + "|");
                }
            }
        }
    }

    /**
     * Método principal que instancia un objeto Ejercicio2 y llama a los métodos para operar con la matriz.
     */
    public static void main(String[] args) {
        Ejercicio2 se = new Ejercicio2();
        se.crearMatriz();
        se.imprimirEsquinas();
        se.sumarFilaCentral();
        se.valorMayor();
        se.buscarCero();
    }
}