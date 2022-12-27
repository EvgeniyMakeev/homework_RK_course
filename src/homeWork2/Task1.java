package homeWork2;

import java.util.Scanner;

/**
 * 1)
 * В переменную записываем число.
 * Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
 * Например, "это однозначное положительное число".
 * Достаточно будет определить, является ли число однозначным, двухзначным или трехзначным и более.
 */

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int number = scan.nextInt();

        String plusOrMinus = (number >= 0 ? "Это положительное" : "Это отрицательное");
        System.out.print(plusOrMinus);

        if(number >= -9 && number <= 9) {
            System.out.println(" однозначное число.");
        } else if ((number >= -99 && number <= -10) || (number >= 10 && number <= 99)) {
            System.out.println(" двухзначное число.");
        } else if ((number >= -999 && number <= -100) || (number >= 100 && number <= 999)) {
            System.out.println(" трёхзначное число.");
        } else {
            System.out.println("и больше чем трёхзначное число.");
        }
    }
}
