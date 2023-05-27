package Easy;

public class Nth_Fibonacci {
    public static void main(String[] args) {

        int result = getNthFib(7);
        System.out.println(result);
    }

    public static int getNthFib(int n){
        if(n == 1){
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return getNthFib(n -1) + getNthFib(n-2);
        }
    }
}
