
package eva1_9_matrices;

public class EVA1_9_MATRICES {

    public static void main(String[] args) {
        int[][] matriz = new int[5][3];
        System.out.println("Matriz = " + matriz);
        System.out.println("Matriz.length = " + matriz.length);
        System.out.println("Matriz = " + matriz[0]);
        System.out.println("Matriz[0].length = " + matriz[0].length);
        System.out.println("Matriz = " + matriz[1]);
        System.out.println("Matriz[1].length = " + matriz[1].length);
        //---------------------
        for(int i = 0; i < matriz.length; i++){//Primer dimension --> filas
            for(int j = 0; j < matriz[i].length; j++){ //Segunda dimension --> columnas
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int i = 0; i < matriz.length; i++){//Primer dimension --> filas
            for(int j = 0; j < matriz[i].length; j++){ //Segunda dimension --> columnas
                System.out.print("[" + matriz[i][j] + "]");
            }
        }
        System.out.println("");
    }
    
}
