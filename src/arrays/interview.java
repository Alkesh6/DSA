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
    // static String maxProduct(int[] arr){
    //     int maxProduct = 0;
    //     String pairs = "";
    //     for(int i = 0;i < arr.length;i++){
    //         for(int j = i + 1;j < arr.length;j++){
    //             if (arr[i] * arr[j] > maxProduct) {
    //                 maxProduct = arr[i] * arr[j];
    //                 pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
    //             }
    //         }
    //     }
    //     return pairs;
    // }

    //IsUnique
    // static void isUnique(int[] arr,int ele){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] == ele){
    //             System.out.println(ele + " is not unique and is present at index " + i);
    //             return;
    //         }
    //         else{
    //             System.out.println(ele + " is not present in the array");
    //             return;
    //         }
    //     }
    // }


    // With return type boolean
    // static boolean isUnique(int[] arr,int ele){
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] == ele){
    //             System.out.println(ele + " is not unique and is present at index " + i);
    //             return false;
    //         }
    //     }
    //     System.out.println(ele + " is not present in the array");
    //     return true;
    // }

    //Permutation
    static boolean permutation(int[] arr3,int[] arr4){
        for(int k=0;k<arr3.length;k++){
            for(int j = arr4.length-1;j >= 0;j--){
                if(arr3[k] == arr4[j]) {
                    System.out.println("element equal at index "+k+" "+j);
                    // return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,8,9,10};
        // missingNum(arr);
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {40,30,90,10};
        // twoSum(arr1, 9);
        // String pairs = maxProduct(arr1);
        // System.out.println(pairs);
        // maxProduct(arr1);
        // isUnique(arr1, 10);
        permutation(arr1, arr2);
    }
}
