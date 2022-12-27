package homeWork1;

/**
 * Имеется 1026606 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 * по аналогии с примером выше.
 */

public class Task1 {
    public static void main(String[] args) {
        long s = 1026606;
        long sec = s % 60;
        long m = (s-sec) / 60;
        long min = m % 60;
        long h = (m-min) / 60;
        long hour = h % 60;
        long d = (h-hour) / 24;
        long days = d % 7;
        long w = (d-days) / 7;
        System.out.println("A) " + m + " минут " + sec + " секунд.");
        System.out.println("B) " + h + " часов " + min + " минут " + sec + " секунд.");
        System.out.println("С) " + d + " дней " + hour + " часов " + min + " минут " + sec + " секунд.");
        System.out.println("D) " + w + " недель " + days + " дней " + hour + " часов " + min + " минут " + sec + " секунд.");
    }
}
