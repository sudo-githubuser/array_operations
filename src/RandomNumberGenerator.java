import java.util.Random;

public class RandomNumberGenerator {
    public static int[] generateRandomNumbers(){
        int[] intArray = new int[80];
        Random random = new Random();

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = random.nextInt(1, 99);
        }

        // Extra step to force duplicates
        for(int i = 0; i < 5; i++){
            int index1 = random.nextInt(80);
            int index2 = random.nextInt(80);
            intArray[index2] = intArray[index1];
        }
        return intArray;
    }
}
