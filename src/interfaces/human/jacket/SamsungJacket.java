package interfaces.human.jacket;

public class SamsungJacket implements IJacket {

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