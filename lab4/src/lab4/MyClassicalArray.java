package lab4;
import java.util.Random;

public class MyClassicalArray {
	protected int[] MyArray;

    public MyClassicalArray() {
      // Initialize MyArray with 10 random values from 1 to 99
      this.MyArray = new int[10];
      Random rand = new Random();
      for (int i = 0; i < 10; i++) {
        this.MyArray[i] = rand.nextInt(99) + 1;
      }
    }

    public int FindMax() {
      // Find the largest value in MyArray
      int max = this.MyArray[0];
      for (int i = 1; i < this.MyArray.length; i++) {
        if (this.MyArray[i] > max) {
          max = this.MyArray[i];
        }
      }
      return max;
    }

    public int FindMin() {
      // Find the smallest value in MyArray
      int min = this.MyArray[0];
      for (int i = 1; i < this.MyArray.length; i++) {
        if (this.MyArray[i] < min) {
          min = this.MyArray[i];
        }
      }
      return min;
    }

    public static void main(String[] args) {
        MyClassicalArray arr = new MyClassicalArray();
        int max = arr.FindMax();
        int min = arr.FindMin();
        System.out.println("The Max value in an array = " + max);
        System.out.println("The Min value in an array = " + min);
    }
}