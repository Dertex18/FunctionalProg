package app;

import java.util.concurrent.ThreadLocalRandom;

public class RandonNumberGenerator {

    public static int generateRandomNumber(int min, int max){

        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
}
