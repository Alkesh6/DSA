package arrays;

public class array {
    // 1-D Array Insertion
    public int arr2[] = null;
    public array(int size) {
        arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int loc,int value){
        try {
            if (arr2[loc] == Integer.MIN_VALUE) {
                arr2[loc] = value;
                System.out.println("Value has been inserted");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Value has not been inserted, Invalid access to array");
        }
    }
    // insert function will take o(1) time complexity

    // Array traversal
    public void traverse(){
        for(int j = 0 ; j < arr2.length ; j++){
            System.out.println(arr2[j] + " ");
        }
    }
    // time complexity for traverse function is O(n)
    // space complexity is O(1)

    // Searching an element in an array
    // linear search
    public void search(int ele){
        for(int k = 0;k < arr2.length;k++){
            if (arr2[k] == ele) {
                System.out.println(ele + " is found at index "+k);
                return;
            }
        }
        System.out.println(ele + " is not found!!");
    }

    // Time complexity is o(n)

    // delete an element from the array
    public void delete(int key){
        try{
            key = Integer.MIN_VALUE;
            System.out.println("The desired value has been deleted");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The desired element is not in range of the array");
        }
    }
    // Time and space complexity of delete function is o(1)
}
