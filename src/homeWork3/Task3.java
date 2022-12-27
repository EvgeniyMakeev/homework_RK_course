package homeWork3;

/**
 3) Вычислить: 1+2+4+8+...+256
 */

public class Task3 {
    public static void main(String[] args) {
        int cont = 1;
        int sum = 0;
        while (cont <= 256) {
            sum += cont;
            cont *= 2;
        }
        System.out.println(sum);
    }
}
