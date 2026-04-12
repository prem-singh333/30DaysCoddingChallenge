package day3;

public class invertedLeftHalfPyramid {
    public static void main(String args[]){
        //Q no.3 Take an input from user and print inverted left half pyramid

        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *

        int n =5;

        for(int i=1; i<=n; i++){

            //print spaces
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }

            //print spaces
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
