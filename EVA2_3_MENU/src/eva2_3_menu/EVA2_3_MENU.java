/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_menu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA2_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = captu.nextInt();

            switch (opcion) {
                case 1:
                    calcularPotencia();
                    break;
                case 2:
                    sumarNumeros();
                    break;
                case 3:
                    System.out.println("SALIENDO DEL SISTEMA...");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }

        } while (opcion != 3);
    }

    public static void imprimirMenu() {
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. CALCULAR UNA POTENCIA");
        System.out.println("2. SUMAR DOS NUMEROS");
        System.out.println("3. SALIR DEL SISTEMA");
        System.out.print("SELECCIONA UNA OPCION: ");
    }

    public static void calcularPotencia() {
        Scanner captu = new Scanner(System.in);
        int base, exp;
        System.out.println("CALCULO DE UNA POTENCIA");
        System.out.print("CAPTURA LA BASE: ");
        base = captu.nextInt();
        System.out.print("CAPTURA EL EXPONENTE: ");
        exp = captu.nextInt();

        System.out.println(base + " ELEVADO A " + exp + " = " + calcularPot(base, exp));
    }

    public static int calcularPot(int base, int expo) {
        int resu = 1;
        for (int i = 1; i <= expo; i++) {
            resu = resu * base;
        }
        return resu;
    }

    public static void sumarNumeros() {
        Scanner captu = new Scanner(System.in);
        int num1, num2;
        System.out.println("SUMA DE DOS NUMEROS");
        System.out.print("CAPTURA EL PRIMER NUMERO: ");
        num1 = captu.nextInt();
        System.out.print("CAPTURA EL SEGUNDO NUMERO: ");
        num2 = captu.nextInt();
        System.out.println("LA SUMA ES: " + (num1 + num2));
    }
}
