
package eva1_4_objetos;

public class EVA1_4_OBJETOS {

    public static void main(String[] args) {
        Prueba prb = new Prueba();
        System.out.println(prb);
        //Eliminar prb:
        //Terminar el programa --> garbage collector (libera memoria automaticamente)
        //eliminar "directamente" el objeto: 
        prb = null;
    }
    
}
 class Prueba{

}