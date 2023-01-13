package recursion;

public class questions {
    public static void main(String[] args) {
        questions q =  new questions();
        var result = q.sum(12);
        System.out.println(result);
    }

    public int sum(int n){
        if (n == 0 || n < 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
