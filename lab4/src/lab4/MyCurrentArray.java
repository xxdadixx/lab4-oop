package lab4;

import java.util.Arrays;

public class MyCurrentArray extends MyClassicalArray {
    public MyCurrentArray() {
        super();
    }

    public void Sort() {
        // Sort the values in MyArray in ascending order
        Arrays.sort(this.MyArray);

        // Print the sorted values horizontally
        System.out.print("Sort results ascending = ");
        for (int i = 0; i < this.MyArray.length; i++) {
            System.out.print(this.MyArray[i]);
            if (i < this.MyArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public boolean Search(int find) {
        // Search for the given value in MyArray
        for (int i = 0; i < this.MyArray.length; i++) {
            if (this.MyArray[i] == find) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyCurrentArray arr = new MyCurrentArray();
        int find = 50;
        int max = arr.FindMax();
        int min = arr.FindMin();
        System.out.println("The Max value in an array = " + max);
        System.out.println("The Min value in an array = " + min);
        arr.Sort();
        System.out.print("Number search result " + find + " = ");
        System.out.println(arr.Search(find));
    }
}