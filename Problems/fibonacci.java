//Return f(n) in a fibonacci sequence

public class fibonacci {
    public static long recurse(int n){
        if (n == 1 || n== 2) return 1;
        return recurse(n-1) + recurse(n-2);
    }
    public static long recurse_dp(int n){
        long [] a = new long[n];
        a[0] =1;
        a[1] = 1;
        for(int k = 2; k<n; k++){
            a[k] = a[k-1] + a[k-2];
        }
        return a[n-1];
    }
}
