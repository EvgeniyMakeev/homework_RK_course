package homeWork3;

/**
 1) Начав тренировки, спортсмен в первый день пробежал 10 км.
 Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 Какой суммарный путь пробежит спортсмен за 7 дней?
*/

public class Task1 {
    public static void main(String[] args) {
        int start = 10;
        double after = start;
        double sum = start;
        for (int i = 1; i <= 7; i++) {
            after = after + (after * 0.1);
            sum += after;
        }
        System.out.println("За 7 дней спортсмен пробежит " + sum + " км");
    }
}
