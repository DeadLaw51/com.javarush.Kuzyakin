package Animal;

import Animal.herbivore.*;
import Animal.predator.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Animal {
    protected int x;
    protected int y;

    protected double weigth;
    protected int speed;
    protected double maxSatiety;
    protected double actualsatiety;


    public void move(){

    }

    public void eat(Objects o){

    }

    public void chooseDirection(){

    }

    public Animal reproduce(){
        return null;
    }

    public void die(){

    }

    public void worker(){

    }


}

