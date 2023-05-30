class PatternSequence {
  public static void main(String[] args) {
    int[][] array1 = {{1}};
    System.out.println("isPatternSequence: " + isPatternSequence(array1));

    int[][] array2 = {{1}, {2, 2}};
    System.out.println("isPatternSequence: " + isPatternSequence(array2));

    int[][] array3 = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
    System.out.println("isPatternSequence: " + isPatternSequence(array3));

    int[][] array4 = {{1}, {2, 2}, {3, 3, 3, 3}};
    System.out.println("isPatternSequence: " + isPatternSequence(array4));

    int[][] array5 = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 3, 4}};
    System.out.println("isPatternSequence: " + isPatternSequence(array5));
  }

  public static boolean isPatternSequence(int[][] array) {
    int k = 1; // Start with k = 1

    for (int[] row : array) {
      int count = row.length;
      
      for (int element : row) {
        if (element != k) {
            return false; // Check if each element in the row is equal to k
        }
      }
      
      if (count != k) {
        return false; // Check if the count of elements in the row is equal to k
      }

      k++; // Increment k for the next row
    }

    return true;
  }
}
