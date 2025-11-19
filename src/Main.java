
public class Main {

    public static void main(String[] args){
        Util util = new Util();

        System.out.println("\n---------------------Array sorted by ascending order---------------------\n");
        util.sortByAscending();

        System.out.println("\n---------------------Array sorted by descending order---------------------\n");
        util.sortByDescending();

        System.out.println("\n---------------------Array sorted by ascending order using bubble sort---------------------\n");
        util.bubbleSortAscendingOrder();

        System.out.println("\n---------------------Array sorted by descending order using bubble sort---------------------\n");
        util.bubbleSortDescendingOrder();

        System.out.println("\n---------------------Duplicate numbers in array---------------------\n");
        util.duplicateNumbers();

        System.out.println("\n---------------------Frequency of each numbers in array---------------------\n");
        util.frequencyOfEachNumber();

        System.out.println("\n---------------------Maximum number in array---------------------\n");
        util.maximumNumber();

        System.out.println("\n---------------------Minimum number in array---------------------\n");
        util.minimumNumber();

    }
}
