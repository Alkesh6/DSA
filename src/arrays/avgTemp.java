package arrays;

import java.util.Scanner;

public class avgTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int numDays = sc.nextInt();
        int[] temps = new int[numDays];
        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.println("Enter day "+ (i+1) + "'s high temperture");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double avg = sum / numDays;
        int above = 0;
        for(int i = 0;i < temps.length; i++) {
            if (temps[i] > avg) {
                above++;
            }
        }

        System.out.println("The avg temperature is " + avg);
        System.out.println("The number of days above avg temperature are "+above);
        
    }
    
}
