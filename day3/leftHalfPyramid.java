package day3;

import java.util.*;
public class leftHalfPyramid {
    public static void main(String args[]){
        //Q no.3 Take an input from user and pring left half pyramid pattern

        //       *
        //     * *
        //   * * *
        // * * * *

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){

            //print spaces
            for(int j=1; j<= n-i; j++){
                System.out.print("  ");
            }

            //print stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
