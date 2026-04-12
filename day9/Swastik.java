public class Swastik {
    public static void main(String args[]) {
        // Q no.12 Print swastik pattern

        // *   * * *
        // *   *
        // * * * * *
        //     *   *
        // * * *   *

        int n = 5;

        // check n is odd or even
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number!");
            return;
        }

        // if the N is odd number
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // print mid row and col
                if (i == n / 2 || j == n / 2 ||
                // print top right arm
                        (i == 0 && j > n / 2) ||

                        // print bottom arm
                        (i == n - 1 && j < n / 2) ||

                        // print top vertical arm
                        (j == 0 && i < n / 2) ||

                        // print bottom vertical arm
                        (j == n - 1 && i > n / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }
}
