import java.util.Scanner;

class Q43{

    void add(int a[][], int b[][], int r, int c) {
        int sum[][] = new int[r][c];

        System.out.println("\nMatrix Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    void multiply(int a[][], int b[][], int r1, int c1, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("\nMultiplication not possible! (c1 != r2)");
            return;
        }

        int product[][] = new int[r1][c2];

        System.out.println("\nMatrix Multiplication:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        Q43 obj = new Q43();

        if (r1 == r2 && c1 == c2) {
            obj.add(a, b, r1, c1);
        } else {
            System.out.println("\nAddition not possible (Matrix dimensions not equal)");
        }

        obj.multiply(a, b, r1, c1, r2,c2);
}
}
