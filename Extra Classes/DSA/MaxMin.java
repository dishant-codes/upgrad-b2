package DSA;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, -4, 5};
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        // System.out.println(min);
        for(int i = 0; i < arr.length; i++){
            
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Max Element is "+max);
        System.out.println("Min Element is "+min);
    }
}
