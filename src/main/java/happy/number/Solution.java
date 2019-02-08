package happy.number;

public class Solution {
    public static boolean isHappy(int n) {
        int total = 0;
        total += (n % 10) * (n % 10);
        n /= 10;
        total += (n % 10) * (n % 10);
        n /= 10;
        total += (n % 10) * (n % 10);
        if(total < 10) {
            return total == 1;
        }
        return isHappy(total);
    }
}

//n = 19
//1^2 + 9^2 = 82
//8^2 + 2^2 = 68
//6^2 + 8^2 = 100
//1^2 + 0^2 + 0^2 = 1 -> true

//n = 7
//7^2 = 49
//4^2 + 9^2 = 97
//9^2 + 7^2 = 130
//1^2 + 3^2 + 0^2 = 1
