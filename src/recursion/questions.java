package recursion;

public class questions {
    public static void main(String[] args) {
        questions q =  new questions();
        // var result1 = q.sum(12);
        // System.out.println(result1);

        var result2 = q.power(2, 1);
        System.out.println(result2);
    }

    // Question 1
    // public int sum(int n){
    //     if (n == 0 || n < 0){
    //         return 0;
    //     }
    //     return n%10 + sum(n/10);
    // }


    // Question 2
    public int power(int base,int exp){
        if(exp == 0){
            return 1;
        }
        else if(exp == 1){
            return base;
        }
        return base * power(base,exp-1);
    }
}
