package arrays;

public class interview {
    // static void missingNum(int[] arr){
    //     int sum1 = 0;
    //     int sum2 = 0;

    //     for(int i : arr){
    //         sum1 += i;
    //     }

    //     sum2 = 10*(10+1)/2;

    //     int diff = sum2 - sum1;
    //     System.out.println("The missing number is " + diff);

    // }


    // Two Sum
    // static int[] twoSum(int[] nums,int target){
    //     for (int i = 0; i < nums.length; i++) {
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 System.out.println("Solution found at index "+i+","+j);
    //                 return new int[] {i,j};
    //             } 
    //         }
    //     }
    //     throw new IllegalArgumentException("No Solution found");
    // }

    // Max Product
    static String maxProduct(int[] arr){
        int maxProduct = 0;
        String pairs = "";
        for(int i = 0;i < arr.length;i++){
            for(int j = i + 1;j < arr.length;j++){
                if (arr[i] * arr[j] > maxProduct) {
                    maxProduct = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,8,9,10};
        // missingNum(arr);
        int[] arr1 = {10,20,30,40};
        // twoSum(arr1, 9);
        String pairs = maxProduct(arr1);
        System.out.println(pairs);
        maxProduct(arr1);
    }
    
}
