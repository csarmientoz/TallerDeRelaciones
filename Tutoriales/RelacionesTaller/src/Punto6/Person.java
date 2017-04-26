package Punto6;

import java.util.ArrayList;

public class Person {

    private String nombre;
    private String id;
    private ArrayList<Pet> pets;

    public Person(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.pets = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void addPet(Pet pet) {

        this.pets.add(pet);
    }

    public void showPets() {
        for (Pet pet : pets) {
            System.out.println(this.nombre + " " + this.id + " " + pet.getName() + " " + pet.getHaircolor() + " " + pet.getId());
        }
    }

}
