package homeWork2;

import java.util.Scanner;

/**
 * 4)
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */


public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите три числа:");
        Scanner scan = new Scanner(System.in);

        int count = 0;

        int num1 = scan.nextInt();
        if (num1 > 0) {
            count++;
        }
        int num2 = scan.nextInt();
        if (num2 > 0) {
            count++;
        }

        int num3 = scan.nextInt();
        if (num3 > 0) {
            count++;
        }

        System.out.println("Положительных чисел из них - " + count);
    }
}
