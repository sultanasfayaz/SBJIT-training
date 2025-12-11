package Day2;

public class second_large_small_ele2 {
   public static void main(String[] arg) {

        int[] arr = {12, 5, 8, 20, 3, 15};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        int secondSmallest = largest;  
        int secondLargest = smallest;   
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > smallest && arr[i] < secondSmallest)
                secondSmallest = arr[i];
            if (arr[i] < largest && arr[i] > secondLargest)
                secondLargest = arr[i];
        }
        
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}


     