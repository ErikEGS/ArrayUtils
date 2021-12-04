import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[] arr1 = new int[]{1, 2, 4, 6, 5, 8, 9, 7, 4, 1, 1, 1};
    int[] arr2 = new int[]{5, 6, 15, 16, 20, 4, 61};
    ArrayUtils arrayUtils = new ArrayUtils(arr1);

    // task 1
    arrayUtils.arrangeOddAndEven();
    System.out.println("task.1 ");
    arrayUtils.printArray();
    // task 2
    arrayUtils.arrayInAscendingOrder();
    System.out.println("task.2 ");
    arrayUtils.printArray();
    // task 3
    System.out.println("task.3 \n" + arrayUtils.average());
    // task 4
    System.out.println("task.4 ");
    arrayUtils.arrayUnion(arr2);
    System.out.println();
    // task 5
    System.out.println("task.5");
    arrayUtils.randomArrayShuffle();
    arrayUtils.printArray();
    // task 6
    System.out.println("task.6 \n" + Arrays.toString(arrayUtils.chkPair(9)));
    // task 7
    System.out.println("task.7 \n" + arrayUtils.mostFrequentValue());


  }
}
