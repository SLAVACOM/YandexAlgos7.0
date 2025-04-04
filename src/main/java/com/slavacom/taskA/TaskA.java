package com.slavacom.taskA;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long[] dp = new long[Math.max(3,n + 1)];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        System.out.println(dp[n]);
    }
}
