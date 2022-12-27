package homeWork2;

import java.util.Scanner;

/**
 * 5)
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Введите три числа:");
        Scanner scan = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;

        int numEnterA = scan.nextInt();

        if (numEnterA >= 0) {
            countPositive++;
        } else countNegative++;

        int numEnterB = scan.nextInt();

        if (numEnterB >= 0) {
            countPositive++;
        } else countNegative++;

        int numEnterC = scan.nextInt();

        if (numEnterC >= 0) {
            countPositive++;
        } else countNegative++;

        System.out.println("В ввели " + countPositive + " положительных чисел и " + countNegative + " отрицательных.");
    }
}
