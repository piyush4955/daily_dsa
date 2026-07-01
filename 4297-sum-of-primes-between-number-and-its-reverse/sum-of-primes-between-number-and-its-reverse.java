class Solution {

    public static int reverse(int num){
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public int sumOfPrimesInRange(int n) {

        int end = reverse(n);
        int start = Math.min(n, end);
        end = Math.max(n, end);

        int sum = 0;

        for(int i = start; i <= end; i++){
            if(i < 2) continue;

            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) sum += i;
        }
        return sum;
    }
}