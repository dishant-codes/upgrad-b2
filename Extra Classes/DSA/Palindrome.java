package DSA;

public class Palindrome {

    public static boolean isPalindrome(String str){
        
        int i = 0;

        int j = str.length() - 1;

        while (i < j) {
            
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }



            char left = Character.toLowerCase(str.charAt(i));
            char right = Character.toLowerCase(str.charAt(j));


            if (left != right) {
                return false;
            }


            i++;
            j--;

        }


        return true;
    }
    

    public static void main(String[] args) {
        
        String str = "Ma,d am";

        System.out.println(isPalindrome(str));

    }
}
