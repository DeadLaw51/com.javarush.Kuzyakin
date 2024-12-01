package Terrain;

public class Island {
    private static final int WIDLT = 20;
    private static final int HEIGHT = 100;

    private Location[][] locations;

    public Island(){
        locations= new Location[WIDLT][HEIGHT];
        for (int y = 0; y < locations.length; y++) {
            for (int x = 0; x < locations[y].length; x++) {
                locations[y][x] = new Location();
            }
        }
    }

    public static Location getLocation(int x, int y) {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public static int getWidlt(){
        return WIDLT;
    }

    public static int getHeight(){
        return HEIGHT;
    }


}
