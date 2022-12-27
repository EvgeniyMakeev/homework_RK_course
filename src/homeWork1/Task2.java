package homeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 */

public class Task2 {
    public static void main(String[] args) {
        int n = 6985;
        String nString = String.valueOf(n);
        char[] nArr = nString.toCharArray();
        for (int i = nArr.length - 1 ; i >= 0 ; i--) {
            System.out.print(nArr[i]);
        }
    }
}
