package homeWork1;

import java.util.Scanner;

/**
  Создайте число. Определите, является ли число трехзначным.
  Определите, является ли его последняя цифра семеркой. Определите, является ли число четным.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nString = String.valueOf(n);
        System.out.print(nString.length() == 3 ? "Число трёхзначное, " : "Число не трёхзначное, ");
        if (n % 2 == 0) {
            System.out.println("чётное и последняя цифра не 7.");
        } else {
            System.out.println(n % 10 == 7 ? "нечётное и последняя цифра 7." : "нечётное и последняя цифра не 7.");
        }
    }
}
