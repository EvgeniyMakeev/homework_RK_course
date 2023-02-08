package interfaces.human.shoes;

public class SamsungShoes implements IShoes {

    public PradaPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Снимаю штаны Prada");
    }

    @Override
    public void putOff() {
        System.out.println("Одеваю штаны Prada");
    }
}