public class fibonaci {
    public static void main(String[] args){

        for (int i = 0; i<=4 ; i++) {
            int ans = fib(i);
            System.out.println(ans);
        }


    }

    static int fib(int n){
        if(n<2){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
