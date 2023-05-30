class MergeRec {
  public static void main(String[] args) {
    int[] a = {1, 8, 3, 4};
    int[] b = {5, 2};
    mergeRec(a, b);
  }

  public static void mergeRec(int[] a, int[] b) {
    mergeRecHelper(a, b, 0, 0);
  }

  public static void mergeRecHelper(int[] a, int[] b, int indexA, int indexB) {
    if (indexA < a.length && indexB < b.length) {
      System.out.print(a[indexA]);
      System.out.print(b[indexB]);
      mergeRecHelper(a, b, indexA + 1, indexB + 1);
    } else if (indexA < a.length) {
      System.out.print(a[indexA]);
      mergeRecHelper(a, b, indexA + 1, indexB);
    } else if (indexB < b.length) {
      System.out.print(b[indexB]);
      mergeRecHelper(a, b, indexA, indexB + 1);
    }
  }
}
