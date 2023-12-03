package practik.repository;

import practik.models.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalCrudImpl implements AnimalCRUD {
    private final List<Animal> ANIMALS = new ArrayList<>();
    @Override
    public boolean create(Animal animal) {
        if (animal == null || ANIMALS.contains(animal)) {
            return false;
        }
      return ANIMALS.add(animal);
    }

    @Override
    public List<Animal> getAll() {
        return null;
    }

    @Override
    public Animal getById(long animalId) {
        return ANIMALS.stream()
                .filter(animal -> animal.getId() == animalId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Animal modifyAnimal(long animalId, String newName, int age) {
        Animal animal = getById(animalId);
        if (animal == null) {
            System.out.println("WARNING: Animal with id ");
        }
        return null;
    }


    @Override
    public Animal deleteById(long animalId) {
        return null;
    }
}
