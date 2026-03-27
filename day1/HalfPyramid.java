package day1;

public class HalfPyramid {
    public static void main(String argd[]){
        //Q no.1 Print the half pyramid pattern

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
