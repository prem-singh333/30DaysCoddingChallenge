package day3;

import java.util.*;

public class invertedLeftHalfPyramid {
    public static void main(String args[]){
        //Q no.4 Take an input from user and print inverted left half pyramid

        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *

        int n = 5;

        for(int i=1; i<=n; i++){

            //print spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            //print stars
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
