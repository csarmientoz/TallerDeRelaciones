package Punto6;

import java.util.ArrayList;

public class Starter {

    private static ArrayList<Person> personas;

    public Starter() {
//    this.personas = new ArrayList<>();
    }

    public static void main(String[] args) {
        Starter.personas = new ArrayList<>();
        Vet Clinimascotas = new Vet();
        Starter.manageVet(Clinimascotas, "la mejor veterinaria");
//       Clinimascotas.showPets();

        System.out.println("Acontinuación se muestra un cliente asociado a la veterinaria Clinimascotas ");
                

//        System.out.println(Clinimascotas.getClass());
        Starter.readPets(Clinimascotas);
        System.out.println("Propietario : ");
        for (Person per : personas) {

            per.showPets();
        }
    }

    public static void readPets(Vet v) {
        v.showPets();
    }

    public static void manageVet(Vet v, String s) {
        Pet pet1 = new Dog("Lasi");
        pet1.setName("Lucy");
        pet1.setHaircolor("Pardo");
        pet1.setId("0012");
        pet1.sound();
        v.addPet(pet1);
        Person p1 = new Person("Cristian", "5244");
        personas.add(p1);
        p1.addPet(pet1);
        Pet pet2 = new Cat(true);
        pet2.setName("Misifu");
        pet2.setHaircolor("Negro");
        pet2.setId("00144");
        pet2.sound();
        v.addPet(pet2);
        p1.addPet(pet2);
        Pet pet3 = new Hamster(45.00);
        pet3.setName("Alvin");
        pet3.setHaircolor("Avellana");
        pet3.setId("44444");
        pet3.sound();
        v.addPet(pet3);
        p1.addPet(pet3);

    }
}
