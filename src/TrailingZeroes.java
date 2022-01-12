import java.math.BigInteger;
import java.util.Scanner;
import java.util.SplittableRandom;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int c=0;
        BigInteger f=BigInteger.ONE;
        for(int i=2;i<=n;i++){
            f=f.multiply(new BigInteger(String.valueOf(i)));
        }
        BigInteger temp=f;
        BigInteger p=BigInteger.TEN;
        BigInteger q=BigInteger.ZERO;
        while(f.mod(p)==q){
            f=f.divide(p);
            c++;
        }
        System.out.println("The factorial of the entered number is"+" "+temp);
        System.out.println("The number of trailing zeroes in the factorial is"+" "+c);
    }
}
