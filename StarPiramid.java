package pattern;

import java.util.Scanner;

public class StarPiramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
         //int a = 1;
        for(int i=1; i<=n; i++){
             
             for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            
            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
                //a=a+2;
            }
             
            System.out.println();
        }
       
        in.close();
    }
}

/*

      * 
    * * * 
  * * * * * 
* * * * * * *

*/ 