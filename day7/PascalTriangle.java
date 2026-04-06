package day7;

public class PascalTriangle{

    public static void main(String args[]){
        //Q no. 10 Print pascal triangle

        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1

        int n = 5;

        for(int i = 0; i < n; i++){

            int num = 1;

            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");

                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}