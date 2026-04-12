package day2;

public class InvertedHalfPyramid {
    public static void main(String args[]){
        //Q no.2 Print inverted half pyramid

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        int n = 5;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
