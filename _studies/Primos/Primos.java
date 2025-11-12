package _studies.Primos;

public class Primos {

    public static boolean isPrimo(int num) {

        for (int j = num - 1; j > 1; j--) {

            if (num % j == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        for (int i = 2; i < 1001; i++) {

            boolean primo = isPrimo(i);

            if (primo) {
                System.out.println(i);
            }
        }
    }
}
