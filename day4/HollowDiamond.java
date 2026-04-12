package day4;

public class HollowDiamond {
    public static void main(String args[]){
        //Q no.5 Print hollow Diamond pattern

        int n = 4;

        //upper half
        for(int i=1; i<=n; i++){
           
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //1st half part
            for(int j=1; j<=i; j++){
                if(j==1 || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            //2nd half part
            for(int j=2; j<=i; j++){
                if(j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        
        //Lower part
        for(int i=n-1; i>=1; i--){
           
            //print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //1st half part
            for(int j=1; j<=i; j++){
                if(j==1 || i==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            //2nd half part
            for(int j=2; j<=i; j++){
                if(j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }


    }
}
