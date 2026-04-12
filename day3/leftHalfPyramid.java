package day3;

public class leftHalfPyramid {
    public static void main(String args[]){
        //Q no.4 Take an input from user and pring left half Pyramid pattern

        //       *
        //     * *
        //   * * *
        // * * * *

        int n = 5; 

        for(int i=1; i<=n; i++){

            //print spaces
            for(int j=1; j<=n-i; j++){
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
