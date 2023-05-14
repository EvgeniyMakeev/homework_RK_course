package homeWork1;

import java.util.Scanner;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nString = String.valueOf(n);
        char[] nArr = nString.toCharArray();
        for (int i = nArr.length - 1 ; i >= 0 ; i--) {
            System.out.print(nArr[i]);
        }
    }
}
