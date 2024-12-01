package Terrain;

import Animal.Animal;
import Plant.Plant;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Location {
    private List<Animal> animals;
    private List<Plant> plants;

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlant() {
        return plants;
    }

    public Location(){
        animals = new CopyOnWriteArrayList<>();
        plants = new CopyOnWriteArrayList<>();
    }

}
