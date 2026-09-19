
package eva1_12_primos;

public class EVA1_12_PRIMOS {

    public static void main(String[] args) {  
        int n = 1000;
        int[] arg1;
        arg1 = new int[n - 2];
        int[] arg2;
        int raiz = (int) Math.sqrt(n);
        arg2 = new int[raiz - 2];  

        for (int i = 0; i < arg1.length; i++) {
            arg1[i] = i + 2;
        }
        for (int i = 0; i < arg2.length; i++) {
            arg2[i] = i + 2;
        }
        System.out.println("Es numero primo? = " + esPrimo(n, arg1));
        System.out.println("Es numero primo? = " + esPrimo(n, arg2));
}
public static boolean esPrimo(int n, int[] arg) {
        for (int i = 0; i < arg.length; i++) {

            if (n % arg[i] == 0) {
                return false;
            }
        }
        return true;
    }
}