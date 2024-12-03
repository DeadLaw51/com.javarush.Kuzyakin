package Animal.herbivore;

public class Rabbit extends Herbivore{
    String name = "Rabbit";
    private double weigth = 2;
    private int maxPopulation = 150;
    private int speed = 2;
    private double maxSatiety = 0.45;

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public int getMaxPopulation() {
        return maxPopulation;
    }

    public int getSpeed() {
        return speed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }
}
