package day5;

public class HollowRhombus {
    public static void main(){

        //Q no.8 Print hollow rhombus

        //    * * * *
        //   *     *
        //  *     *
        // * * * *

        int n =5; 

        for(int i=1; i<=n; i++){

            // print spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print("  ");
            }

            // print stars
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
