package homeWork5;

import java.util.Scanner;

/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */

public class ATM {
    public static void main(String[] args) {
        ATM myATM = new ATM(2, 5, 2);
        System.out.println("Какую сумму вы хотите снять?");
        myATM.getMoney(new Scanner(System.in).nextInt());
    }
    private int twenty;
    private int fifty;
    private int hundred;

    public ATM(int hundred, int fifty, int twenty) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public boolean getMoney(int needMoney) {
        int totalTwenty = twenty * 20;
        int totalFifty = fifty * 50;
        int totalHundred = hundred * 100;
        int total = totalTwenty + totalFifty + totalHundred;

        if (needMoney % 10 != 0) {
            System.out.println("В банкомате недостаточно денег.");
            return false;
        } else if (needMoney <= total) {
            int takeHundred = needMoney <= totalHundred ? needMoney / 100 : hundred;
            int takeFifty = needMoney - (takeHundred * 100) <= totalFifty ? (needMoney - (takeHundred * 100)) / 50 : fifty;
            int takeTwenty = (needMoney - (takeHundred * 100) - (takeFifty * 50)) / 20;
            hundred -= takeHundred;
            fifty -= takeFifty;
            twenty -= takeTwenty;
            if (twenty >= 0 && ((takeHundred * 100) + (takeFifty * 50) + (takeTwenty * 20)) == needMoney) {
                System.out.println("Операция прошла успешно.\nВам выданы " + takeHundred + " купюр номиналом 100, " +
                        takeFifty + " купюр номиналом 50 и " + takeTwenty + " купюр номиналом 20.");
                return true;
            } else {
                System.out.println("В банкомате недостаточно денег.");
                return false;
            }
        } else {
            System.out.println("В банкомате недостаточно денег.");
            return false;
        }
    }
}
