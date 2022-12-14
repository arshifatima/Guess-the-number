package tuta.nota;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator{

    //fields
    private final Random random = new Random();

    //public methods
    private int maxNumber = 100;
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
