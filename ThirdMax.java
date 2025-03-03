import java.util.*;
class ThirdMax{
    public static void main(String[] args) {
        System.out.println("Third Maximum Number in 2D Array");
        int arr[][] = {{9, 9, 9}, {9, 9, 9}, {9, 9, 9}};
        int largest = arr[0][0];
        int secondLargest = 0;
        int thirdLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int current = arr[i][j];
                if (current > largest) {
                    thirdLargest = secondLargest;
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current < largest) {
                    thirdLargest = secondLargest;
                    secondLargest = current;
                } else if (current > thirdLargest && current < secondLargest) {
                    thirdLargest = current;
                }
            }
        }
        if (thirdLargest != largest && thirdLargest !=secondLargest) {
            System.out.println("Third Largest Number: " + thirdLargest);
        } else {
            System.out.println("There is no third maximum value.");
        }
    }
}
