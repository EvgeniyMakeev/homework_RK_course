package interfaces.robot;

import interfaces.robot.hands.SamsungHand;
import interfaces.robot.hands.SonyHand;
import interfaces.robot.hands.ToshibaHand;
import interfaces.robot.heads.SamsungHead;
import interfaces.robot.heads.SonyHead;
import interfaces.robot.heads.ToshibaHead;
import interfaces.robot.legs.SamsungLeg;
import interfaces.robot.legs.SonyLeg;
import interfaces.robot.legs.ToshibaLeg;

/*
Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.
*/

public class Run {
    public static void main(String[] args) {

        Robot robotBob = new Robot("Боб", new SamsungHead(350), new ToshibaHand(26), new SonyLeg(180));
        Robot robotRon = new Robot("Рон", new ToshibaHead(200), new SamsungHand(105), new SamsungLeg(90));
        Robot robotMax = new Robot("Макс", new SonyHead(400), new SonyHand(320), new ToshibaLeg(60));

        robotBob.action();
        robotRon.action();
        robotMax.action();

        if (robotBob.getPrice() > robotRon.getPrice() && robotBob.getPrice() > robotMax.getPrice()) {
            System.out.println("Я робот " + robotBob.getName() + " - самый дорогой робот!");
        } else if (robotRon.getPrice() > robotBob.getPrice() && robotRon.getPrice() > robotMax.getPrice()) {
            System.out.println("Я робот " + robotRon.getName() + " - самый дорогой робот!");
        } else {System.out.println("Я робот " + robotMax.getName() + " - самый дорогой робот!");}
    }
}
