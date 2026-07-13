public class slidingWindow {

    public static int slideWindow(int[] arr, int k){

        int max = 0;

        for(int i = 0; i< k; i++){
            max += arr[i];
        }

        int currentWindow = max;

        for(int j = k-1; j < k; j++){
            
        }


        return max;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,1,6,4};
        int k = 3;


        System.out.println("Max Sum is "+slideWindow(arr, k));
    }

}
