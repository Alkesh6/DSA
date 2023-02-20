package recursion;

public class exercises {
    public static void main(String[] args) {
        // exercises e = new exercises();
        // var result = e.power(2,2);
        // System.out.println(result);

        // var result1 = e.factorial(3);
        // System.out.println(result1);

        // int arr[] = {1,2,3,4,5};
        // int n = arr.length;
        // System.out.println(e.productofArray(arr,n));
        
        // var result3 = e.recursiveRange(6);
        // System.out.println(result3);

        // var result4 = e.fib(4);
        // System.out.println(result4);

    
    }

    // Write a function called power which accepts a base and an exponent. The function should return the power of the base to the exponent.
    // public int power(int base,int exponent) {
    //     if (exponent < 0) {
    //         return 0;
    //     }
    //     else if(exponent == 0){
    //         return 1;
    //     }
    //     return base*power(base, exponent-1);
    // }

    // Calculate factorial of a number using recursion
    // public int factorial(int n){
    //     if(n < 0){
    //         return 0;
    //     }
    //     else if(n == 0){
    //         return 1;
    //     }
    //     return n * factorial(n-1);
    // }

    // Return product of elements of array
    // public int productofArray(int A[], int N) 
    // { 
    //     if (N <= 0) 
    //         return 1; 
    //     return (productofArray(A, N - 1) * A[N - 1]); 
    // } 

    //Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function.
    // public int recursiveRange(int num){
    //     if (num < 0){
    //         return 0;
    //     }
    //     return num + recursiveRange(num - 1);
    // }

    // Fibonacci series
    // public int fib(int n){
    //     if(n == 0){
    //         return 0;
    //     }
    //     else if(n == 1 || n == 2){
    //         return 1;
    //     }
    //     return fib(n-1) + fib(n-1) + fib(n-2);
    // }

    
}

