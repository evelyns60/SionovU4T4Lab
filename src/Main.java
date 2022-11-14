public class Main {
    public static void main(String[] args) {
   /*     for (int row = 1; row <= 10; row++)
        {
            for (int col = 1; col < 7; col++)
            {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }


        for (int row = 1; row <4; row++) {
            for (int col = 1; col < 7; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row < 7; row++) {
            for (int col = 1; col < 6; col++) {
                System.out.print(col * row + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 1; col < 4; col++) {
                System.out.println(row + " " + col);
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 1; col < 4; col++) {
                System.out.println(row + " " + col);
            }
        }


        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(col + " ");
            }
        }

    */
        int result = 0;
        int m = 0;
        while (m < 3) {
            int k = 0;
            while (k < 4) {
                result++;
                k++;
                System.out.print("k: " + k);
                System.out.println(", m: " + m);
            }
            m++;
        }
        System.out.println("result: " + result);
    }
}
