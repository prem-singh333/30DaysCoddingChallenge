package day8;

public class Zero_one_halfPyramid {
    public static void main(String args[]) {

        // Print Zero One Pattern pattern

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int n=5;

        //outer loop
        for(int i=1; i<=n; i++){

            //take a temprory variable
            int sum = 0;

            //inner loop
            for(int j=1; j<=i; j++){

                //add i and j
                sum = i+j;

                //check, the num was odd or even
                if(sum%2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+ " ");
                }
            }

            System.out.println();
        }
    }
}
