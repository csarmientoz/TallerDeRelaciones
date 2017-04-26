package Punto6;

public class Dog extends Pet {

    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String sound() {
        return "wow wow";
    }

}
