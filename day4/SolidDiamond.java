package day4;

public class SolidDiamond {
    public static void main(String args[]){
        //Q no.6 Print solid diamond pattern

        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

        int n = 4;

        // upper half
        for(int i = 1; i <= n; i++){

            //print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            // 1st half part
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            // 2nd half part

            for(int j = 2; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower half
        for(int i = n-1; i >= 1; i--){

            //print spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

            // 1st half part
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            // 2nd half part

            for(int j = 2; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
