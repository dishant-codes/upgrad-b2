package DSA;
public class slidingWindow {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;

        // Compute the sum of the first window of size k
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window one position at a time from k to end of array
        for(int i=k;i<arr.length;i++){

            // Subtract the element leaving the window and add the new element
            windowSum = windowSum - arr[i-k] + arr[i];

            // Track the maximum sum seen so far
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};

        System.out.println(maxSum(arr,3));
    }
}