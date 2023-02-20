import arrays.array;

import java.util.Arrays;

import arrays.TwodArray;

public class Main {
    public static void main(String[] args) {
        // array a = new array(5);
        // a.insert(0, 2);
        // a.insert(1, 3);
        // a.insert(2 ,4);
        // a.insert(4 ,1);

        // var element = a.arr2[0];  // -----> Time complexity o(1)
        // System.out.println(element);

        // a.traverse();

        // a.search(3);

        // a.delete(11);
        // System.out.println(a.arr2[3]);

        // Insertion in two dimentional array
        TwodArray t = new TwodArray(3,3);
        t.insert(0, 0, 10);
        t.insert(0 ,1 ,20);
        t.insert(0 ,2 ,30);
        t.insert(1 ,0 ,40);
        t.insert(1 ,1, 50);
        t.insert(1, 2, 60);
        // System.out.println(Arrays.deepToString(t.arr3));

        // t.access(0, 1);
        // t.traverse();
        // t.search(30);
        // t.search(80);
        // t.delete1(10);
        t.insert(0, 0, 10);
        t.traverse();
        // t.delete1(10);



    }
    
}
