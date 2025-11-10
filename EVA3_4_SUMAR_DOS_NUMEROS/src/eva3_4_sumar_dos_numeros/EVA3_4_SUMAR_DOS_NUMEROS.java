/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_sumar_dos_numeros;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA3_4_SUMAR_DOS_NUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// TODO code application logic here
        Scanner capt = new Scanner (System.in);
        int opcion;
        do{
        aimprimirMenu();
        opcion=capt.nextInt();
        if(opcion==1){
            acalcularPotencia();
        }
        else if(opcion==2){
        acalcularSuma();
        }
        }while(opcion != 3);
    }
    public static void aimprimirMenu(){
    System.out.println("binevenido al sistema");
    System.out.println("1.calcular la potencia");
    System.out.println("2.sumar dos numeros");
    System.out.println("3.salir del sistema");
    System.out.println("selecciona una opcion");
    }
    public static void acalcularPotencia(){
    Scanner capt = new Scanner (System.in);
    int base,expo,resultado;
    System.out.println("*calcular potencia");
    System.out.println("capturar numero");
    base=capt.nextInt();
    
    System.out.println("capturar potencia");
    expo=capt.nextInt();
    //capt.nextLine();
    System.out.println(base+" elevado a "+expo+" = "+acalcularPot(base,expo));

    }
    public static int acalcularPot(int base, int expo){  
    int resu=1;
    for(int i=1; i<=expo; i++){
    resu=resu*base;
    }
    return resu;
    }
    public static void acalcularSuma(){
    Scanner capt = new Scanner (System.in);
    int num1,num2,resultado;
    System.out.println("*calcular Suma");
    System.out.println("primer numero");
    num1=capt.nextInt();
    System.out.println("segundo potencia");
    num2=capt.nextInt();
    System.out.println(num1+" + "+num2+" = "+acalcularSum(num1,num2));

    }
    public static int acalcularSum(int num1, int num2){  
    int resu;
    resu=num2+num1;
        return resu;
    }
}
