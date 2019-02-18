public class permutation {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int check(int number, int m) {
        int count = 0;
        while (number > 0) {
            if (m == number % 10) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static int numPermutation(int n) {
        int count = 0;
        int a = n;
        while (a > 0) {
            count++;
            a /= 10;
        }
        int answer = factorial(count);
        for (int i = 0; i < 10; i++) {
            if (check(n, i) > 0) {
                answer /= factorial(check(n, i));
            }
        }
        return answer;
    }
}
