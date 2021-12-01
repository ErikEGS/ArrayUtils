import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

  /* task1 Create a method that sorts the int array elements by odd and even number such
           that if first number is odd then second must be even number and so on for the next
           elements of the array.  */

  static void arrangeOddAndEven(int[] arr) {

    Arrays.sort(arr);

    int oddInd = 1;
    int evenInd = 0;
    while (true) {
      while (evenInd < arr.length && arr[evenInd] % 2 == 0) {
        evenInd += 2;
      }
      while (oddInd < arr.length && arr[oddInd] % 2 == 1) {
        oddInd += 2;
      }
      if (evenInd < arr.length && oddInd < arr.length) {
        int temp = arr[evenInd];
        arr[evenInd] = arr[oddInd];
        arr[oddInd] = temp;
      } else {
        break;
      }
    }
  }


  // task 2. Create a method that says Is the int array in ascending sequence.
  static void arrayInAscendingOrder(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  // task 3. Create a method that returns the arithmetic mean of given int array elements
  public static int average(int[] arr) {
    int x = arr[0];
    for (int i = 1; i < arr.length; i++) {
      x += arr[i];
    }
    return x / arr.length;
  }

  /* task 4. Create a method that receives two int arrays and
            returns an array of only the unique elements.*/
  static int[] arrayUnion(int[] a, int[] b) {

    int length = a.length + b.length;
    boolean bool;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          length--;
        }
      }
    }

    int[] newArray = new int[length];
    int k = 0;

    for (int i = 0; i < a.length; i++) {
      newArray[k] = a[i];
      k++;
    }

    for (int i = 0; i < b.length; i++) {
      bool = true;
      for (int j = 0; j < a.length; j++) {
        if (b[i] == a[j]) {
          bool = false;
          continue;
        }
      }
      if (bool) {
        newArray[k] = b[i];
        k++;
      }
    }
    return newArray;
  }

  // task 5. Create a method that receives a sorted array and returns an array in random order.

  static void randomArrayShuffle(int[] arr) {
    Random r = new Random();

    for (int i = arr.length - 1; i > 0; i--) {
      int j = r.nextInt(i + 1);
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

   /* task 6. Create a method that finds pairs of numbers whose sum is equal
             to a given value and return array with these values. */

  static int[] chkPair(int arr[], int x) {
    int[] twoValue = new int[2];
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = (i + 1); j < arr.length; j++) {
        if (arr[i] + arr[j] == x) {
          twoValue[0] = arr[i];
          twoValue[1] = arr[j];
        }
      }
    }
    return twoValue;
  }


 /* task 7. Create a method that finds and returns the most frequently
             occurring element in an array */

  static int mostFrequentValue(int[] arr) {
    Arrays.sort(arr);

    int maxCount = 1;
    int result = arr[0];
    int currCount = 1;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) {
        currCount++;
      } else {
        if (currCount > maxCount) {
          maxCount = currCount;
          result = arr[i - 1];
        }
        currCount = 1;
      }
    }
    if (currCount > maxCount) {
      maxCount = currCount;
      result = arr[arr.length - 1];
    }
    return result;
  }


}
