package Animal.herbivore;

public class Deer extends Herbivore{
    String name = "Deer";
    private double weigth = 300;
    private int maxPopulation = 20;
    private int speed = 4;
    private double maxSatiety = 50;

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
