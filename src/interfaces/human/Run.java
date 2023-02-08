package interfaces.human;

import interfaces.human.jacket.SamsungJacket;
import interfaces.human.jacket.SonyJacket;
import interfaces.human.jacket.ToshibaJacket;
import interfaces.human.pants.SamsungPants;
import interfaces.human.pants.SonyPants;
import interfaces.human.pants.ToshibaPants;
import interfaces.human.shoes.SamsungShoes;
import interfaces.human.shoes.SonyShoes;
import interfaces.human.shoes.ToshibaShoes;

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

        Human humanBob = new Human("Боб", new SamsungPants(350), new ToshibaJacket(26), new SonyShoes(180));
        Human humanRon = new Human("Рон", new ToshibaPants(200), new SamsungJacket(105), new SamsungShoes(90));
        Human humanMax = new Human("Макс", new SonyPants(400), new SonyJacket(320), new ToshibaShoes(60));

        humanBob.action();
        humanRon.action();
        humanMax.action();

        if (humanBob.getPrice() > humanRon.getPrice() && humanBob.getPrice() > humanMax.getPrice()) {
            System.out.println("Я робот " + humanBob.getName() + " - самый дорогой робот!");
        } else if (humanRon.getPrice() > humanBob.getPrice() && humanRon.getPrice() > humanMax.getPrice()) {
            System.out.println("Я робот " + humanRon.getName() + " - самый дорогой робот!");
        } else {System.out.println("Я робот " + humanMax.getName() + " - самый дорогой робот!");}
    }
}
