package arrays;

public class questions {
    // static void largest(int arr[],int arr_size){
    //     int first,second,third;
    //     int i;
    //     first = Integer.MIN_VALUE;
    //     second = Integer.MIN_VALUE;
    //     third = Integer.MIN_VALUE;

    //     if(arr_size < 3){
    //         System.out.println("Invalid Array");
    //     }
        
    //     for(i = 0;i < arr.length;i++){
    //         if(arr[i] > first){
    //             third = second;
    //             second = first;
    //             first = arr[i];
    //         }
    //         else if(arr[i] > second){
    //             third = second;
    //             second = arr[i];
    //         }
    //         else if(arr[i] > third){
    //             third = arr[i];
    //         }
    //     }
    //     System.out.println("The three largest elements of the array are "+first+","+second+","+third);
    // }

    static void reverse_array(int arr[],int start,int end){
        int temp;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void print(int arr[],int arr_size){
        for(int i=0;i<arr_size;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        // int arr[] = { 12, 13, 1, 10, 34, 1 };
        // int n = arr.length;
        // largest(arr,n);
        int arr[] = {1,2,3,4,5,6,7};
        int s = arr.length;
        print(arr,s);
        reverse_array(arr, 0, 6);
        print(arr, s);
    }
    
}
