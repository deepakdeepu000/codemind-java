import java.util.*;
class Primes_in_Range
{
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<m;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
