public class PascalTriangle {
  public static void main(String[] args) {
    int n = 6;
    printPascal(n);
  }
  
  public static void printPascal(int n) {
    int[][] triangle = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          triangle[i][j] = 1; // Border cells are always 1
        } else {
          triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // Calculate using the two top adjacent cells
        }
        
        System.out.print(triangle[i][j] + " ");
      }
      
      System.out.println();
    }
  }
}

