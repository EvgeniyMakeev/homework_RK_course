package interfaces.human.shoes;

public class ToshibaShoes implements IShoes {
    private int price;

    public ToshibaShoes(int price) {
        this.price = price;
    }

    public ToshibaShoes() {
    }


    @Override
    public void step() {
        System.out.println("Нога Toshiba делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}