import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    final int[] arr1 = new int[]{1, 22, 32, 95, 22, 8, 73, 4, 51, 61};
    final int[] arr2 = new int[]{5, 6, 15, 16, 20, 4, 61};

    // task 1
    ArrayUtils.arrangeOddAndEven(arr1);
    System.out.println("task.1 \n" + Arrays.toString(arr1));

    // task 2
    ArrayUtils.arrayInAscendingOrder(arr1);
    System.out.println("task.2 \n" + Arrays.toString(arr1));

    // task 3
    System.out.println("task.3 \n" + ArrayUtils.average(arr1));

    // task 4
    System.out.println("task.4 \n" + Arrays.toString(ArrayUtils.arrayUnion(arr1, arr2)));

    // task 5
    ArrayUtils.randomArrayShuffle(arr1);
    System.out.println("task.5 \n" + Arrays.toString(arr1));

    // task 6
    System.out.println("task.6 \n" + Arrays.toString(ArrayUtils.chkPair(arr1, 9)));

    // task 7
    System.out.println("task.7 \n" + ArrayUtils.mostFrequentValue(arr1));


    

  }
}
