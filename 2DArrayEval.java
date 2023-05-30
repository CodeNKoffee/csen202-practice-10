class TwoDimensionalArrayEvaluation {
  public static void main(String[] args) {
    boolean[][] array = {
      {true, true, false},
      {false, true, true},
      {true, false}
    };
    
    boolean result = evaluateArray(array);
    System.out.println("Array evaluation result: " + result);
  }
  
  public static boolean evaluateArray(boolean[][] array) {
    boolean result = false;
    
    for (boolean[] row : array) {
      boolean rowValue = true;
      
      for (boolean element : row) {
        rowValue = rowValue && element; // Conjunction (AND) of row elements
      }
      
      result = result || rowValue; // Disjunction (OR) of row values
    }
    
    return result;
  }
}
