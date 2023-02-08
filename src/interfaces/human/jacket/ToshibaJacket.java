package interfaces.human.jacket;

public class ToshibaJacket implements IJacket {
    private int price;

    public ToshibaJacket(int price) {
        this.price = price;
    }

    public ToshibaJacket() {
    }


    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднята вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}