class MatrixAdditionChecker {
  public static void main(String[] args) {
    // Example usage
    double[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    double[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    double[][] matrix3 = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};
    
    boolean result = isMatrixAddition(matrix1, matrix2, matrix3);
    System.out.println("Is matrix3 the result of matrix addition of matrix1 and matrix2? " + result);
  }
  
  public static boolean isMatrixAddition(double[][] matrix1, double[][] matrix2, double[][] matrix3) {
    if (!areMatricesSameSize(matrix1, matrix2)) {
      return false;
    }
    
    double[][] additionResult = addMatrices(matrix1, matrix2);
    
    return areMatricesEqual(additionResult, matrix3);
  }
  
  public static boolean areMatricesSameSize(double[][] matrix1, double[][] matrix2) {
    int rows1 = matrix1.length;
    int cols1 = matrix1[0].length;
    int rows2 = matrix2.length;
    int cols2 = matrix2[0].length;
    
    return rows1 == rows2 && cols1 == cols2;
  }
  
  public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
    int rows = matrix1.length;
    int cols = matrix1[0].length;
    double[][] result = new double[rows][cols];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    
    return result;
  }
  
  public static boolean areMatricesEqual(double[][] matrix1, double[][] matrix2) {
    int rows = matrix1.length;
    int cols = matrix1[0].length;
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix1[i][j] != matrix2[i][j]) {
          return false;
        }
      }
    }
    
    return true;
  }
}