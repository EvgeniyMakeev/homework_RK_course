package homeWork1;

import java.util.Scanner;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить,
 * можно ли его полностью закрыть круглой картонкой радиусом r.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) <= r * 2 ?
                "Отверстие полностью закроется." : "Отверстие не закроется.");
    }
}
