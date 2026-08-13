public class Main {
    static int test() {
        try {
            return 1;
        } finally {
            System.out.println("Finally executed");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}