package Miscellaneous;

public class CountNumberOfDigits1ToN {



    static int calculateDigits(int n){
        int sum=0;
        for (int i=1; i<=n;i*=10){
            sum+=(n-i+1);
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(calculateDigits(13));
    }
}
