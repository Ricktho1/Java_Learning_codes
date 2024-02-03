import java.util.*;

public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int q = sc.nextInt();
            String not = "";
            not = sc.next();
            int nplus = 0, nminus = 0;
            if (n == a) {
                System.out.println("YES");
            } else {
                for (int j = 0; j < q; j++) {
                    if (not.charAt(j) == '+') {
                        nplus++;
                    } else {
                        nminus++;
                    }
                }
                if (nplus < (n - a)) {
                    System.out.println("NO");
                } else {
                    if (nplus > nminus) {
                        System.out.println("YES");
                    }
                    if (nplus <= nminus) {
                        System.out.println("MAYBE");
                    }
                }
            }
        }
        sc.close();
    }
}
