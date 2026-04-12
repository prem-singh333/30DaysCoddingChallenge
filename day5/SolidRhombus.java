package day5;

public class SolidRhombus {
    public static void main(){

        //Q no.8 Print solid rhombus pattern

        //       * * * *
        //     * * * *
        //   * * * *
        // * * * *

        int n = 4;

        for(int i = 1; i<=n; i++){

            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //print starts
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}