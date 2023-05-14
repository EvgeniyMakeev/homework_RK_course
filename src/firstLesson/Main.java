package firstLesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int first = Integer.parseInt(strArr[0]);
        int second = Integer.parseInt(strArr[1]);
        System.out.println(first + second);
        scanner.close();
    }
}