package interfaces.human.pants;

public class PradaPants implements IPants {

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