/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_paso_referencia;

/**
 *
 * @author Admin
 */
public class EVA3_5_PASO_REFERENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
        int valor[] = new int[1];//new --> objetos
        valor[0] = 5;//primitivos
        System.out.println(valor);
        System.out.println("Valor (antes)= " + valor[0]);
        incrementar(valor);
        System.out.println("Valor (despues)= " + valor[0]);
    }
    public static void incrementar(int [] val){
        System.out.println(val);
    for (int i = 0; i < val.length; i++){
    val[i] = val[i] + 1;
    //val[i]++;
    }
    }
    
}
