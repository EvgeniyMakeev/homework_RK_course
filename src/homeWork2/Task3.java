package homeWork2;

import java.util.Scanner;

/**
 * 3)
 * Дано целое число. Если оно является положительным,
 * то прибавить к нему 1. Если отрицательным, то вычесть из него 2.
 * Если нулевым, то заменить его на 10. Вывести полученное число.
 */

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введите любое число:");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num > 0) {
            num++;
            System.out.println(num);
        } else if (num < 0) {
            num = num - 2;
            System.out.println(num);
        } else {
            num = 10;
            System.out.println(num);
        }
    }
}
