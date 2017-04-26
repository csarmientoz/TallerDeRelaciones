package Punto6;

public class Hamster extends Pet {

    private double weight;

    public Hamster(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String sound() {
        return " roeeeeer ";
    }
}
