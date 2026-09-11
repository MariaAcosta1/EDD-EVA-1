
package eva1_7_arreglos_size;

public class EVA1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
        int[] original = new int[10];
        System.out.println(original);
        for(int i = 0; i < original.length; i++){ //Llenar con datos aleatorios
            original[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < original.length; i++){ //Imprimir
            System.out.print("[" + original[i] + "]");
        }
        System.out.println();
        //Cambiar el tamaño(no se puede)
        //Respaldo
        int[] copia = original; //copio la DIRECCIÓN del arreglo original
        original = new int[5];
        System.out.println(original);
        //Transferir la información 
        for(int i = 0; i < original.length; i++){ //Llenar con datos aleatorios
            original[i] = copia[i];
        }
        for(int i = 0; i < original.length; i++){ //Imprimir arreglo "modificado"
            System.out.print("[" + original[i] + "]");
}
    }
}
