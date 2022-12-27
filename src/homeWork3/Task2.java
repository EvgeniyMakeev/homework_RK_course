package homeWork3;

/**
 2) Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task2 {
    public static void main(String[] args) {
        int amebs = 1;

        for (int i = 3; i <= 24; i++) {
            if (i % 3 == 0) {
               amebs *= 2;
                if (i == 3 || i == 24) {
                    System.out.println("Через " + i + " часа амёб будет " + amebs);
                } else if (i == 21) {
                    System.out.println("Через " + i + " час амёб будет " + amebs);
                } else {
                    System.out.println("Через " + i + " часов амёб будет " + amebs);
                }
            }
        }
    }
}
