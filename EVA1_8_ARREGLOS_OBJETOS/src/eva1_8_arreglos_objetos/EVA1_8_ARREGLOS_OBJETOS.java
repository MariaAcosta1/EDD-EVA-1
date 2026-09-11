
package eva1_8_arreglos_objetos;

public class EVA1_8_ARREGLOS_OBJETOS {

    public static void main(String[] args) {
        Ejemplo[] arg = null;
        //System.out.println("Arreglo = " + arg);
        arg = new Ejemplo[2];
        System.out.println("Arreglo = " + arg);
        System.out.println("Arreglo[0] = " + arg[0]);
        System.out.println("Arreglo[1] = " + arg[1]);
        arg[0] = new Ejemplo();
        arg[1] = new Ejemplo();
        System.out.println("Arreglo[0] = " + arg[0]);
        System.out.println("Arreglo[1] = " + arg[1]);
        
        System.out.println("Arreglo[0] = " + arg[0].i);
        System.out.println("Arreglo[0] = " + arg[1].i);
    }
    
}
class Ejemplo{
    int i = 5;
}