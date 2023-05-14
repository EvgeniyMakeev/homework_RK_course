package homeWork1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nString = String.valueOf(n);
        String[] arr = nString.split("");
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < arr.length; i++) {
            if(set.contains(Integer.parseInt(arr[i]))) {
                System.out.println("Цифры не различны.");
                return;
            } else if(!set.contains(Integer.parseInt(arr[i])) && i < arr.length - 1) {
                set.add(Integer.parseInt(arr[i]));
            } else {
                System.out.println("Все цифры различны.");
            }
        }
    }
}
