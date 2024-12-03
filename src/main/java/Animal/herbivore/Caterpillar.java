package Animal.herbivore;

public class Caterpillar extends Herbivore{
    String name = "Caterpillar";
    private double weigth = 0.01;
    private int maxPopulation = 1000;
    private int speed = 0;
    private double maxSatiety = 0;

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
