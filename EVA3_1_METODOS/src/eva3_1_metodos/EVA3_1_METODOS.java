/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Admin
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val1 = 5, val2 = 10;
        //1. si nesecito guardar el valor de retorno
        int resu =  sumarEnteros(val1, val2);//incocar el metodo
        System.out.println("Suma de 5 + 10 = " + resu);
        //2.No nesecito guardar el valor , un solo  uso
        System.out.println("Suma de 5 + 10= " + sumarEnteros(val1, val2));
        //3. solo nesecito ejecutar ejecutar el metodo
        sumarEnteros(val1, val2);
    }
    //METODO PARA SUMAR DOS NUMEROS ENTEROS
    //LAMAR A SUS METODOS USANDO VERBOS Y ESCRITURA camelCase
    //1. MODIFICADORES DE ACCESO: PUBLIC PROTECTED, PRIVATE, DEFAULT
    //2. static --> PARA USARS LOS METODOS DENTRO DE MAIN
    //3. VALOR DE RERORNO: CUALQUIER TIPO DE DATO
    //  VOID --> SI NO QUIEREN REGRESAR UN VALOR
    //4. NOMBRE DEL METODO: MISMAS REGLAS DE INDENTIFICADOSRES
    //5. LISTA DE PARAMETROS: PUEDEN SER CERO O N CANTIDAD
    //1     2      3         4              5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
}
