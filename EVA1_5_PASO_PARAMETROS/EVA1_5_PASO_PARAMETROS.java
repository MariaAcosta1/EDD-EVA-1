
package eva1_5_paso_parametros;

public class EVA1_5_PASO_PARAMETROS {

    public static void main(String[] args) {
        //Paso por valor
        int i = 5;
        System.out.println("Valor de i = " + i);
        incrementar(i);
        System.out.println("Valor de i (despues de incrementar) = " + i);
        //Ahora paso por referencia
        Prueba prb = new Prueba();
        System.out.println("Valor de prueba.y = " + prb.y);
        incrementarObj(prb);
        System.out.println("Valor de prueba.y (despues de incrementar) = " + prb.y);
    }
    public static void incrementar(int valor){///PASO POR VALOR (RECIBO UNA COPIA)
        valor++;
    }
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
    }
}
class Prueba{
    int y = 5;
}
