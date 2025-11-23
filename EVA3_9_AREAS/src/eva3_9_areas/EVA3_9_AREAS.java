/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // TODO code application logic here
        Scanner capt = new Scanner (System.in);
        int opcion;
        do{
        Amenu();
        opcion=capt.nextInt();
            switch (opcion) {
                case 1:
                    Acirculo();
                    break;
                case 2:
                    Arectangulo();
                    break;
                case 3:
                    Atrapecio();
                    break;
                default:
                    break;
            }
        }while(opcion!=4);
    }
    public static void Amenu(){
    System.out.println("Que area decesas calcular");
    System.out.println("1.Circulo");
    System.out.println("2.Rectangulo");
    System.out.println("3.Trapecio");
    System.out.println("4.terminar ejecucion");
    System.out.println("selecciona una opcion");
    }
    public static void Acirculo(){
    Scanner capt = new Scanner (System.in);
    double radio;
    System.out.println("*Area de un Circulo");
    System.out.println("cual es el radio del circulo");
    radio=capt.nextInt();
    System.out.println("el area de un circulo con radio "+radio+" = "+Acalculararea(radio));

    }
    public static double Acalculararea(double radio){  
    double resu;
    resu=Math.PI*(radio*radio);
        return resu;
    }
    public static void Arectangulo(){
    Scanner capt = new Scanner (System.in);
    double base,altura;
    System.out.println("*Area de un Rectangulo");
    System.out.println("cual es la base del rectangulo");
    base=capt.nextInt();
    System.out.println("cual es la altura del rectangulo");
    altura=capt.nextInt();
    System.out.println("el area de un rectangulo con base "+base+" y altura "+altura+" = "+Acalculararea(base,altura));

    }
    public static double Acalculararea(double base, double altura){  
    double resu;
    resu=base*altura;
        return resu;
    }
    public static void Atrapecio(){
    Scanner capt = new Scanner (System.in);
    double baseM,basem,altura;
    System.out.println("*Area de un Trapecio");
    System.out.println("cual es la base mayor del trapecio");
    baseM=capt.nextInt();
    System.out.println("cual es la base menor del trapecio");
    basem=capt.nextInt();
    System.out.println("cual es la altura del trapecio");
    altura=capt.nextInt();
    System.out.println("el area de un trapecio con base mayor "+baseM+", base menor"+basem+" y altura "+altura+" = "+Acalculararea(baseM,basem,altura));

    }
    public static double Acalculararea(double baseM,double basem, double altura){  
    double resu;
    resu=((baseM*basem)/2)*altura;
        return resu;
    }
}