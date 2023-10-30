
package tinkoff1;

import java.util.Arrays;
import java.util.Scanner;

public class Tinkoff1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] revolversAndDollars = new int[2];
        
        for (int i = 0; i < 2; i++) {
            revolversAndDollars[i] = scanner.nextInt();
        }
        int r = revolversAndDollars[0];
        int d = revolversAndDollars[1];
        
        int[] revolvers = new int[r];
        
        for (int i = 0; i < r; i++) {
        revolvers[i] = scanner.nextInt();
        }
        
        Arrays.sort(revolvers);
        
        if(revolvers[0] > d ) {
            System.out.println(0);
        } else {
            int maxPrice = 0;
            for (int i = r - 1; i >= 0; i--) {
                if (revolvers[i] <= d) {
                maxPrice = revolvers[i];
                break;
                }
            }
            System.out.println(maxPrice);
        }
    }
}
