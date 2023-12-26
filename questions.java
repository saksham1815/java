
// import java.util.*;

// public class questions {
//     static int sumofsquares(int[] nums) {
//         int ans = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums.length % (i + 1) == 0)
//                 ans += (nums[i] * nums[i]);
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n = sc.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.println(sumofsquares(a));
//     }}

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str);
    }

    public static void print(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
