import java.util.*;

public class ArrayResizer {
  public static void main(String[] args) {
    int[][] testArray = {{2, 1, 0},
                         {1, 3, 2},
                         {0, 0, 0},
                         {4, 5, 6}
                        };

    System.out.println(isNonZeroRow(testArray, 0)); // false
    System.out.println(isNonZeroRow(testArray, 1)); // true
    System.out.println(isNonZeroRow(testArray, 2)); // false
    System.out.println(isNonZeroRow(testArray, 3)); // true

    System.out.println(numNonZeroRows(testArray)); // 2

    System.out.println(Arrays.deepToString(resize(testArray)));
  } // end main method

  public static boolean isNonZeroRow(int[][] arr, int r) {
    // loop through each element in the row
    // go column by column, and grab each element one at a time
    for (int c = 0; c < arr[r].length; c++) {
      // is the element in the row zero?
      if (arr[r][c] == 0) {
        return false;
      }
    }

    return true;
  } // end isNonZeroRow method

  public static int[][] resize(int[][] arr) {

    int[][] result = new int[numNonZeroRows(arr)][arr[0].length];

    int index = 0;

    // check to see if each row is a non-zero row
    for (int i = 0; i < arr.length; i++) {
      // if it is a non-zero row...
      if (isNonZeroRow(arr, i)) {
        // store the array in the result array
        result[index] = arr[i];
        // increment index so we store the next non-zero array in the next row
        index++;
      }
    }

    return result;
  } // end resize method

  public static int numNonZeroRows(int[][] arr) {
    // keep track of how many non-zero rows there are
    int count = 0;

    for (int[] row : arr) {
      // keep track of how many non-zero values exist in each row
      int subcount = 0;
      for (int col : row) {
        if (col == 0) {
          subcount++;
        }
      }
      if (subcount > 0) {
        count++;
      }
    }
    return count;
  } 

}
