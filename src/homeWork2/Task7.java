package homeWork2;

import java.util.Scanner;

/**
 * 7)
 * В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программист • 10 программистов • и т.д.
 */

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Сколько программистов?");
        Scanner scan = new Scanner(System.in);

        int numOfProgrammers = scan.nextInt();

        if (numOfProgrammers != 1) {
            System.out.println(numOfProgrammers + " программистов.");
        }
    }
}
