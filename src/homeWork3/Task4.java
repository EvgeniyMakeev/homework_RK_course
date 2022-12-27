package homeWork3;

import java.util.Scanner;

/**
 4) Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число A");
        int a = scan.nextInt();

        System.out.println("Введите число B");
        int b = scan.nextInt();

        int aMultiplyB = 0;

        for(int i = 1; i <= b; i++){
            aMultiplyB += a;
        }
        System.out.println("A * B = " + aMultiplyB);
    }
}
