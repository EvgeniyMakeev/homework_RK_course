package interfaces.human.shoes;

public class SonyShoes implements IShoes {
    private int price;

    public SonyShoes(int price) {
        this.price = price;
    }

    public SonyShoes() {
    }


    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}