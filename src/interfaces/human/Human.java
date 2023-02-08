package interfaces.human;

import interfaces.human.jacket.IJacket;
import interfaces.human.pants.IPants;
import interfaces.human.shoes.IShoes;

public class Human implements IHuman {
    private IPants head;
    private IJacket hand;
    private IShoes leg;

    private String name;

    public Human(String name, IPants head, IJacket hand, IShoes leg) {
        this.name = name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Human(){}

    public IPants getHead() {
        return head;
    }

    public void setHead(IPants head) {
        this.head = head;
    }

    public IJacket getHand() {
        return hand;
    }

    public void setHand(IJacket hand) {
        this.hand = hand;
    }

    public IShoes getLeg() {
        return leg;
    }

    public void setLeg(IShoes leg) {
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
