public class BSTcount {
    public long howMany(int[] values) {
        // fill in code here
        

        return dp(values.length);
    }
    // public long recurse(int n){
    //     long sum = 0; 
    //     if (n == 0 || n ==1 ) return 1; 
    //     for (int i = 1; i<= n; i ++){
    //         long left = recurse(i-1);
    //         long right = recurse(n-i);
    //         sum += left * right;     
    //     }

    //     return sum;
    // }
    public long dp(int n){
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        a[2] = 2; 
        a[3] = 5; 
        for (int i = 4; i<= n; i++){
            for(int j = 1; j<=i; j++){
                a[i] += a[j-1] * a[i-j];
            }
        }
        return a[n];
    }
 }