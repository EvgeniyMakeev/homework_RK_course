package interfaces.human.jacket;

public class SonyJacket implements IJacket {
    private int price;

    public SonyJacket(int price) {
        this.price = price;
    }

    public SonyJacket() {
    }


    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}