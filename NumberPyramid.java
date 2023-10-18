package pattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt(); 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            int a = 1;
            for(int k=1; k<=2*i-1; k++){
                System.out.print(" "+a);
                a++;
            }
            System.out.println();
        }
        in.close();
    }
}

/*
OUTPUPT  ->
Enter the number: 5
         1
       1 2 3
     1 2 3 4 5
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9

*/ 
