package arrays;

import java.util.Arrays;

public class TwodArray {
    public int arr3[][] = null;

	public TwodArray(int numberOfRows,int numberOfColumns){
        this.arr3 = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = Integer.MIN_VALUE;
            }  
        }
    }

    // insert function
    public void insert(int row,int col,int val){
        try{
            if (arr3[row][col] == Integer.MIN_VALUE) {
                arr3[row][col] = val;
                System.out.println("Value inserted at the given index");
            }
            else{
                System.out.println("The cell is occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Index is invalid");
        }
    }

    // accessing elements of the array
    public void access(int rows,int cols){
        System.out.println("\nAccessing Row#"+rows+"cols#"+cols);
        try{
            System.out.println("Cell value is "+ arr3[rows][cols]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2-D Array");

        }
    }

    // Traversing 2-D Array
    public void traverse(){
        System.out.println("\nThe elements of array are");
        for(int k=0;k<arr3.length;k++){
            for(int h=0;h<arr3.length;h++){
                System.out.print(arr3[k][h]+" ");
            }
            System.out.println();
        }
    }

    // Searching in 2-D Array
    public void search(int value){
        for(int l=0;l<arr3.length;l++){
            for(int u=0;u<arr3.length;u++){
                if (arr3[l][u] == value) {
                    System.out.println(value+" found at index "+l+","+u);
                    return;
                }
            }
        }
        System.out.println(value+" not found in the array");
    }

    // Deleting array element 
    public void delete1(int n){
        for(int p=0;p<arr3.length;p++){
            for(int s=0;s<arr3.length;s++){
                if (arr3[p][s] == n) {
                    arr3[p][s] = Integer.MIN_VALUE;
                    return;
                }
            }
        }
        System.out.println(n+" not found in array , Please try with different element");
    }


    public static void main(String[] args) {
        // // Step 1: Declare
        // int[][] arr2;
        // // Step 2: Instantiate
        // arr2 = new int[2][2];
        // // Step 3: Initialize values
        // arr2[0][0] = 1;
        // arr2[0][1] = 2;
        // arr2[1][0] = 3;
        // arr2[1][1] = 4;

        // System.out.println(Arrays.deepToString(arr2));


        // // All together
        // String s_arr[][] = {{"a","b"},{"c","d"}};
        // System.out.println(Arrays.deepToString(s_arr));
    }
    
}
