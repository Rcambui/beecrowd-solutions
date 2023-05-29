package iniciante.java;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1541  {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A, B, C, X;

        while ((A = scan.nextInt()) != 0) {
            B = scan.nextInt();
            C = scan.nextInt();
            X = Math.sqrt((((A * B) / C) * 100.0));

            System.out.println((int)X);
        }

        scan.close();
    }

}
