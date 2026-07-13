package DSA;

public class Kadane {

    public static int maxSubArray(int[] nums){

        // Initialize max with the first element to support arrays with all negative values
        int max = nums[0];
        // current stores the maximum sum of a subarray ending at the current index
        int current = 0;

        for(int num : nums){
            // Add the current number to the running sum
            current += num;
            // Update max if the current running sum is larger
            max = Math.max(max,current);
            // If the running sum becomes negative, reset it to 0
            // because starting a new subarray after this point is better
            if(current<0)
                current=0;
        }

        return max;
    }

    public static void main(String[] args) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}