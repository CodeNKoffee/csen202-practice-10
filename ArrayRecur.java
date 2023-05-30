// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ArrayRecur {
    public static void main(String[] args) {
        int [] arr = {10, 20, 40, 80, 160};
        recur(0, arr);
    }
    
    public static void recur(int index, int [] a) {
        if (index > a.length - 1) {
            System.out.println("Traversal Complete");
        }
        else {
            System.out.println(a[index]);
            recur(index + 1, a);
        }
    }
}