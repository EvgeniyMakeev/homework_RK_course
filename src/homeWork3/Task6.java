package homeWork3;

/**
 6) Напишите программу вывода всех четных чисел от 2 до 100 включительно.
 */

public class Task6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                count = count + i;
            }
        }
        System.out.println("Сумма всех четных чисел: " + count);
    }
}
