package Animal;

import Animal.herbivore.*;
import Animal.predator.*;
import Interface.MoveDir;
import Terrain.Island;
import logic.GeneratorNumber;

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
    protected double actualSatiety;
    protected int maxPopulation;
    protected String name;
    private Object Island;


    public void move(){
        for (int i = 0; i < getSpeed() ; i++) {
            List<MoveDir> moveDiric = moveCal();
            if(moveDiric.isEmpty()){
                return;
            }
            int rand = GeneratorNumber.randomNumber(moveDiric.size() - 1);
            switch (moveDiric.get(rand)){
                case LEFT :
                    moveLift();
                    break;
                case UP :
                    moveUp();
                    break;
                case DOWN :
                    moveDown();
                    break;
                case RIGHT :
                    moveRight();
                    break;
            }
         }

    }

    private void moveRight() {
        x++;
    }

    private void moveDown() {
        y++;
    }

    private void moveUp() {
        y--;
    }

    private void moveLift() {
        x--;
    }

    private List<MoveDir> moveCal(){
        List<MoveDir> dirMove = new ArrayList<>();
        if(x != 0){
            dirMove.add(MoveDir.LEFT);
        }
        if(y != 0){
            dirMove.add(MoveDir.UP);
        }
        if(x != Terrain.Island.getWidlt() - 1){
            dirMove.add(MoveDir.RIGHT);
        }
        if(y != Terrain.Island.getHeight() - 1){
            dirMove.add(MoveDir.DOWN);
        }
        return dirMove;
    } 

    public int getSpeed(){
        return speed;
    }

    public void eat(Objects o){

    }

    public void chooseDirection(){

    }

    public void reproduce(){

    }

    public void die(){

    }

    public void worker(){

    }


}

