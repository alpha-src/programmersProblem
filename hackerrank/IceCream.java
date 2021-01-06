package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IceCream {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        /* TIME LIMIT EXCEEDED
        int id[] = new int [2];

        Loop1 :
        for(int i=0; i < cost.length; i++) {
            for(int j=i+1; j < cost.length; j++) {
                if(cost[i] + cost[j] == money) {
                    id[0] = i+1;
                    id[1] =j+1;
                    break Loop1;
                }
            }
        }
        System.out.println(id[0]+" "+id[1]);
        */   

        for(int i=0; i < cost.length; i++) {
            
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
