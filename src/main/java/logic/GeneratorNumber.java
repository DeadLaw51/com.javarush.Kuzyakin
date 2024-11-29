package logic;

import java.util.concurrent.ThreadLocalRandom;

public class GeneratorNumber {
    public static int randomNumber(int max){
        int rez = ThreadLocalRandom.current().nextInt(max + 1);
        return rez;
    }
}
