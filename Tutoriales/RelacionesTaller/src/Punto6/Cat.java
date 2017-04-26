package Punto6;

public class Cat extends Pet {

    private boolean isHunter;

    public Cat(boolean isHunter) {
        this.isHunter = isHunter;
    }

    public boolean getIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }

    @Override
    public String sound() {
        return "miauuuuu";
    }

}
