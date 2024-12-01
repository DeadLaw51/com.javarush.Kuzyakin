package logic;

import Terrain.Island;
import Terrain.Location;

public class Simulation {
    private void appearanceAnimal(){
        Island island = new Island();
        for(int y = 0; y < Island.getWidlt(); y++){
            for(int x = 0; x < Island.getHeight(); x++){
                Location location = island.getLocations(x,y);

            }
        }
    }
}
