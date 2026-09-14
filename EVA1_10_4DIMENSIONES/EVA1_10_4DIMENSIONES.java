
package eva1_10_4dimensiones;

public class EVA1_10_4DIMENSIONES {

    public static void main(String[] args) {
        int[][][][] arreglo = new int[2][2][2][2];//almacena 16 enteros
        for(int i = 0; i < arreglo.length; i++){ //1er dimension
            for(int j = 0; j < arreglo[i].length; j++){ //2da dimension 
                for(int k = 0; k < arreglo[i][j].length; k++){ //3ra dimension 
                    for(int l = 0; l < arreglo[i][j][k].length; l++){ //4ta dimension
                        arreglo[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
            }
        }
        for(int i = 0; i < arreglo.length; i++){ //1er dimension
            for(int j = 0; j < arreglo[i].length; j++){ //2da dimension 
                for(int k = 0; k < arreglo[i][j].length; k++){ //3ra dimension 
                    for(int l = 0; l < arreglo[i][j][k].length; l++){ //4ta dimension
                        arreglo[i][j][k][l] = (int)(Math.random() * 100);
                        System.out.print("[" + arreglo[i][j][k][l] + "]");
                    }
                }
            }
        }
    }
    
}
