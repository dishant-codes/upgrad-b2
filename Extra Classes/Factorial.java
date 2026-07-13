class Factorial{

    public int fact(int n){
        if (n <= 0) {
           return 1;
        }
         return n * fact(n-1);
    }
    public void main(String[] args){

        int a = 9;

        System.out.println("Factorial of 9 is "+fact(a));


    }
}