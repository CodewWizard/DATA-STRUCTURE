package CODES.ARRAY;

public class PowOfXRaiseToN {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
        System.out.println(myPow(2, -2));
    }

    static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        long nn = n;
        double ans = 1.0;
        if(nn < 0){
            nn = -1 * nn;
        }

        while(nn > 0){
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn - 1;
            }
            else{
                x = x * x;
                nn = nn /  2;
            }
        }
        if(n < 0){
            ans = (double)(1.0) / (double)(ans);
        }
        return ans;
    }
}
