
package eva1_1_scope;

public class EVA1_1_SCOPE {

    public static void main(String[] args) {
        int x = 100; //Existe dentro del bloque main()
        for (int i = 0; i < 10; i++){ //Existe solo dentro del for
            System.out.println("i = " + i);
            x++;
        }
        System.out.println("Valor final de la i = " + i); //Ya no existe    
        System.out.println("Valor final de la x = " + x); //Todavia existe
    }
    public static void OtraFuncion(){
        System.out.println("Valor de x " + x); //No existe
    } 
}
