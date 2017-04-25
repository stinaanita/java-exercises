import java.math.BigInteger;

public class TailRecursionInJava
{
    public static BigInteger sum(BigInteger i, BigInteger currentSum)
    {
        if (i.longValue() <= 0) return currentSum;
        else return sum(i.subtract(BigInteger.ONE), currentSum.add(i));
    }

    public static int fact(int n, int sum)
    {
        if (n <= 0) return sum;
        else return fact(n-1, n*sum);
    }

    public static void main(String[] args) {
        sum(BigInteger.valueOf(100000), BigInteger.ZERO);
        fact(100, 1)
    }

}
