package homeWork2;

import java.util.Scanner;

/**
 * 6) Даны 2 числа. Вывести большее из них.
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a > b ? a + " больше из чисел" : b + " большее из чисел");
    }
}
