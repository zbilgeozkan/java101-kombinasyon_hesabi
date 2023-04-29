// Kombinasyon hesabı C(n,r) = n! / (r! * (n-r)!)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, result, n_f = 1, r_f = 1, diff_f = 1, diff;

        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) için n sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("C(n,r) için r sayısını giriniz: ");
        r = input.nextInt();

        diff = n - r;

        for (int i = 1; i <= n; i++) {
            n_f *= i;
        }
        for (int i = 1; i <= r; i++) {
            r_f *= i;
        }
        for (int i = 1; i <= diff; i++) {
            diff_f *= i;
        }
        result = n_f / (r_f * diff_f);

        System.out.println("C(" + n + "," + r + ")" + " " + "= " + result);
    }
}