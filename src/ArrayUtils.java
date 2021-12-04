import java.util.Arrays;
import java.util.Random;

 public final class ArrayUtils {

   private final int [] arr;

   public ArrayUtils () {
     this.arr = new int[0];
   }

   public ArrayUtils (int[] arr) {
     if (arr == null)
       this.arr = null;
     else {
       this.arr = new int[arr.length];
       System.arraycopy(arr,0,this.arr,0,arr.length);
     }
   }

   public ArrayUtils (ArrayUtils arrayUtils) {
     this.arr = arrayUtils.arr.clone();
   }

   public void printArray () {
     System.out.println(Arrays.toString(arr));
   }

    // task 1
    public void arrangeOddAndEven (){

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
    public void arrayInAscendingOrder (){
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
    public double average (){
      int sum = arr[0];
      for (int i = 1; i < arr.length; i++) {
        sum += arr[i];
      }
      return (double) sum / arr.length;
    }

  /* task 4. Create a method that receives two int arrays and
            returns an array of only the unique elements.*/
    public void arrayUnion ( int[] arr2){

      int m = arr[arr.length - 1];
      int n = arr2[arr2.length - 1];
      int ans = 0;

      if (m > n) {
        ans = m;
      } else {
        ans = n;
      }
      int[] newTable = new int[ans + 1];

      System.out.print(arr[0] + " ");
      int i1 = ++newTable[arr[0]];

      for (int i = 1; i < arr.length; i++) {
        if (arr[i] != arr[i - 1]) {
          System.out.print(arr[i] + " ");
          ++newTable[arr[i]];
        }
      }

      for (int j = 0; j < arr2.length; j++) {
        if (newTable[arr2[j]] == 0) {
          System.out.print(arr2[j] + " ");
          ++newTable[arr2[j]];
        }
      }

    }

    // task 5. Create a method that receives a sorted array and returns an array in random order.
    public void randomArrayShuffle ( ){
      for (int i = arr.length - 1; i > 0; i--) {
        int j = new Random().nextInt(i + 1);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

  /* task 6. Create a method that finds pairs of numbers whose sum is equal
            to a given value and return array with these values. */
    public int[] chkPair ( int x){
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
    public int mostFrequentValue (){

      int count1;
      int popular1;
      int count2 = 0;
      int popular2 = 0;

      for (int i = 0; i < arr.length; i++) {
        popular1 = arr[i];
        count1 = 0;

        for (int j = i + 1; j < arr.length; j++) {
          if (popular1 == arr[j]) {
            count1++;
          }
        }

        if (count1 > count2) {
          popular2 = popular1;
          count2 = count1;
        } else if (count1 == count2) {
          popular2 = Math.min(popular2, popular1);
        }
      }

      return popular2;
    }
}

