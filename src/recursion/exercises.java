package recursion;

public class exercises {
    public static void main(String[] args) {
        exercises e = new exercises();
        // var result = e.power(2,2);
        // System.out.println(result);

        // var result1 = e.factorial(3);
        // System.out.println(result1);

        int []arr = {1,2,3,4,5};
        int n = arr.length;
        var result2 = e.productofArray(arr,n);
        System.out.println(result2);
        
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
    public int productofArray(int []arr,int N){
        if (N == 0) {
            return arr[N];
        }
        else{
        return arr[N] * productofArray(arr,N-1);
        }
    }
}
