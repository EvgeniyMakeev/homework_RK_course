package interfaces.robot;

import interfaces.robot.hands.IHand;
import interfaces.robot.legs.ILeg;
import interfaces.robot.heads.IHead;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    private String name;

    public Robot(String name, IHead head, IHand hand, ILeg leg) {
        this.name = name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println("Я робот " + getName());
        head.speek();
        hand.upHand();
        leg.step();
        System.out.println();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }



}
