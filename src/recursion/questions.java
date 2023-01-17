package recursion;

public class questions {
    public static void main(String[] args) {
        questions q =  new questions();
        // var result1 = q.sum(12);
        // System.out.println(result1);

        // var result2 = q.power(2, 1);
        // System.out.println(result2);

        // var result3 = q.gcd(12,9);
        // System.out.println(result3);

        var result4 = q.decimalTobinary(24);
        System.out.println(result4);
    }

    // Question 1
    // public int sum(int n){
    //     if (n == 0 || n < 0){
    //         return 0;
    //     }
    //     return n%10 + sum(n/10);
    // }


    // Question 2
    // public int power(int base,int exp){
    //     if(exp == 0){
    //         return 1;
    //     }
    //     else if(exp == 1){
    //         return base;
    //     }
    //     else if(exp < 0){
    //         return -1;
    //     }

    //     return base * power(base,exp-1);
    // }
    

    // Question 3
    // public int gcd(int a,int b){
    //     if(b == 0){
    //         return a;
    //     }
    //     else if(a < 0 || b < 0){
    //         return -1;
    //     }
    //     return gcd(b,a%b);
    // }

    // Question 4
    public int decimalTobinary(int n){
        if (n == 0) {
            return 0;
        }
        return n%2 + 10*decimalTobinary(n/2);
    }
}
