import java.util.Arrays;
import java.util.HashMap;

public class Util {
    private final int[] numberGenerator;

    public Util(){
        this.numberGenerator = RandomNumberGenerator.generateRandomNumbers();
    }

    public void sortByAscending(){
        Arrays.sort(numberGenerator);
        System.out.println(Arrays.toString(numberGenerator));

        // Sorting using streams
/*        int[] sortedArray = Arrays.stream(numberGenerator)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sortedArray));
 **/
    }

    public void sortByDescending(){
        Arrays.sort(numberGenerator);
        int[] sortedArray = new int[numberGenerator.length];

        for(int i = 0; i < numberGenerator.length; i++){
            sortedArray[i] = numberGenerator[numberGenerator.length - 1 - i];
        }
        System.out.println(Arrays.toString(sortedArray));
    }

    public void bubbleSortAscendingOrder(){

        for(int i = 0; i < numberGenerator.length; i++){
            for(int j = 0; j < numberGenerator.length - 1 - i; j++){
                if(numberGenerator[j] > numberGenerator[j + 1]){
                    int temp = numberGenerator[j];
                    numberGenerator[j] = numberGenerator[j + 1];
                    numberGenerator[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberGenerator));
    }

    public void bubbleSortDescendingOrder(){

        for(int i = 0; i < numberGenerator.length; i++){
            for(int j = 0; j < numberGenerator.length - 1 - i; j++){
                if(numberGenerator[j] < numberGenerator[j + 1]){
                    int temp = numberGenerator[j];
                    numberGenerator[j] = numberGenerator[j + 1];
                    numberGenerator[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numberGenerator));
    }

    public void duplicateNumbers(){
        int count = 0;
        Arrays.sort(numberGenerator);
        //System.out.println(Arrays.toString(numberGenerator));
        for(int i = 0; i < numberGenerator.length - 1; i++){
            if(numberGenerator[i] == numberGenerator[i + 1]){
                count++;

                // This loop skips ahead to avoid counting the same number multiple times
                // and keep moving 'i' until we find a new number
                while (i < numberGenerator.length - 1 && numberGenerator[i] == numberGenerator[i+1]){
                    i++;
                }
            }
        }
        System.out.println("Total number of duplicates are: " + count);
    }

    public void frequencyOfEachNumber(){

        HashMap<Integer, Integer> freqFinder = new HashMap<>();

        for(int num : numberGenerator){
            freqFinder.put(num, freqFinder.getOrDefault(num, 0) + 1);
        }

//        Arrays.sort(numberGenerator);
//        for(int i = 0; i < numberGenerator.length - 1; i++){
//            int count = 1;
//            while (i < numberGenerator.length - 1 && numberGenerator[i] == numberGenerator[i + 1]){
//                count++;
//                i++;
//            }
//            freqFinder.put(numberGenerator[i], count);
//        }
        System.out.println(freqFinder);
    }

    public void maximumNumber(){

        //Using streams
        //int max = Arrays.stream(numberGenerator).max().getAsInt();

        int max = numberGenerator[0];
        for(int num : numberGenerator){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum number is: " + max);
    }

    public void minimumNumber(){

        //Using streams
        //int min = Arrays.stream(numberGenerator).min().getAsInt();

        int min = numberGenerator[0];
        for(int num : numberGenerator){
            if(num < min){
                min = num;
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
