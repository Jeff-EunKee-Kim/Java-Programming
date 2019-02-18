class Solution {
    public boolean isPalindrome(int x) {
//        String a = Integer.toString(x);
//        int mid = a.length()/2;
//        int left = 0;
//        int right = a.length();
//        boolean check = true;
//        while (left <= mid ){
//            if(a.charAt(left) != a.charAt(right)){
//                return false;
//            }
//                left++;
//                right--;
//        }
//        return true;
        if(x < 0 || x!=0 && x%10 == 0) return false;
        int rev = 0;
        while (x > rev){
            rev = rev * 10 + x %10;
            x /= 10;
        }
        return x == rev || x == rev/10;
    }
}