/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_modificar_arreglos;

/**
 *
 * @author Admin
 */
public class EVA3_6_MODIFICAR_ARREGLOS {

    public static void main(String[] args) {
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[20];

        // Llenamos los arreglos con números aleatorios
        llenarArreglo(arreglo1);
        llenarArreglo(arreglo2);

        // Mostramos su contenido
        System.out.println("Arreglo 1:");
        imprimirArreglo(arreglo1);

        System.out.println("Arreglo 2:");
        imprimirArreglo(arreglo2);

        // Modificamos los valores del arreglo 1 (ejemplo: multiplicarlos por 2)
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = arreglo1[i] * 2;
        }

        System.out.println("Arreglo 1 modificado:");
        imprimirArreglo(arreglo1);
    }

    // Llena un arreglo con números aleatorios del 0 al 99
    public static void llenarArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    // Imprime un arreglo en formato [valor][valor][valor]
    public static void imprimirArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println();
    }
}
