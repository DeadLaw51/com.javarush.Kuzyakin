package Animal.herbivore;

public class Mouse extends Herbivore{
    String name = "Mouse";
    private double weigth = 0.05;
    private int maxPopulation = 500;
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
