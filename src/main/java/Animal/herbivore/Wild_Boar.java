package Animal.herbivore;

public class Wild_Boar extends Herbivore{
    String name = "wild_Boar";
    private double weigth = 400;
    private int maxPopulation = 50;
    private int speed = 2;
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
