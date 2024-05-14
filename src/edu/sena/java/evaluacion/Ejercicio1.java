/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.sena.java.evaluacion;
import java.util.Scanner;

/**
 * @author ReaperSeven.
 * 
 * Esta clase representa un programa orientado a objetos que realiza lo siguiente:
 *  1. Solicita dos vectores de igual tamaño al usuario.
 *  2. Organiza de menor a mayor el primer vector y de mayor a menor el segundo vector.
 */

public class Ejercicio1 {
    // Declaración de atributos.
    private Scanner lector;
    private int[] vector1;
    private int[] vector2;
    private int longitudVectores;
    
    // Método constructor.
    public Ejercicio1(){
        lector = new Scanner(System.in);
    }
    
    /**
     * Este método solicita al usuario el tamaño de los vectores y los datos para ambos vectores.
     */
    public void crear(){
        // Pedir al usuario el tamaño de ambos vectores.
        System.out.print("Ingrese el tamaño de los vectores: ");
        longitudVectores = lector.nextInt();
        
        // Crear los vectores.
        vector1 = new int[longitudVectores];
        vector2 = new int[longitudVectores];
        
        // Petición de datos para vector 1.
        for(int i = 0; i < longitudVectores; i++){
            System.out.print("Ingrese datos para el vector 1: ");
            vector1[i] = lector.nextInt();
        }
        
        // Petición de datos para vector 2.
        for(int i = 0; i < longitudVectores; i++){
            System.out.print("Ingrese datos para el vector 2: ");
            vector2[i] = lector.nextInt();
        }
    }
    
    /**
     * Este método organiza los elementos del primer vector de menor a mayor y del segundo vector de mayor a menor.
     */
    public void organizar(){
        // Implementación del algoritmo de ordenación burbuja para organizar los elementos de vector1 de menor a mayor.
        for(int i = 0; i < longitudVectores - 1; i++) { 
            for(int j = 0; j < longitudVectores - i - 1; j++) {
                if(vector1[j] > vector1[j+1]) {
                    int temp = vector1[j];
                    vector1[j] = vector1[j+1];
                    vector1[j+1] = temp;
                }
            }
        }
        
        // Impresión de vector1 después de ordenarlo.
        System.out.println("Vector 1 ordenado de menor a mayor:");
        for(int i : vector1){
            System.out.print(i + " ");
        }
        
        // Implementación del algoritmo de ordenación burbuja para organizar los elementos de vector2 de mayor a menor.
        for(int i = 0; i < longitudVectores - 1; i++) {
            for(int j = 0; j < longitudVectores - i - 1; j++) {
                if(vector2[j] < vector2[j+1]) {
                    int temp = vector2[j];
                    vector2[j] = vector2[j+1];
                    vector2[j+1] = temp;
                }
            }
        }
        
        // Impresión de vector2 después de ordenarlo.
        System.out.println("Vector 2 ordenado de mayor a menor:");
        for(int i : vector2){
            System.out.print(i + " ");
        }
    }
            
    /**
     * Método principal que instancia la clase Ejercicio1.
     */
    public static void main(String[] args) {
        Ejercicio1 pe = new Ejercicio1();
        pe.crear();
        pe.organizar();
    }
}