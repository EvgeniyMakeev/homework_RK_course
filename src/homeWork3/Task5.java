package homeWork3;

/**
 5) Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
 для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] inch = new int[20];
        double[] cm = new double[inch.length];
        for (int i = 0; i < inch.length; i++) {
            inch[i] = 1 + i;
            cm[i] = (1 + i) * 2.54;
            System.out.println(inch[i] + " дюймов = " + cm[i] + " сантиметров");
        }
    }
}
