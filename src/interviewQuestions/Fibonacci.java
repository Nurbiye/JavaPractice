package interviewQuestions;

public class Fibonacci {

    //0 1 1 2 3 5 8 13 21 ....
                           //how many series of number from fibonacci
    public static void fib(int num ){

        int a=0;
        int b =0;
        System.out.print(a);

        for (int i = 1; i < num; i++) {
            System.out.println(" "+b);
            int next = a+b;
            a = b;
            b = next;

        }
    }



    //recursion is just a method that being called inside of itself ---making function(method) call itself
    public static int fibonacci(int n ){
        if (n == 0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1) +fibonacci(n-2);
    }


        public static int Fib1(int num) {
            if (num < 2) {
                return num;
            } else {
                return Fib1(num - 1) + Fib1(num - 2);
            }
        }







}
