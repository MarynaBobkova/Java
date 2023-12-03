package practik.repository;

import practik.models.Animal;

import java.util.List;

public interface AnimalCRUD {

    // crud

    boolean create(Animal animal);

    List<Animal> getAll();
    Animal getById(long animalId);
    Animal modifyAnimal(long animalId, String newName, int age);
    Animal deleteById(long animalId);


}
