import java.util.*;
class Battle
{
    public static boolean isPrime(int n)
    {
        if(n<2)
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
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=x+y;
        for(int i=1;i<=100;i++)
        {
            if(isPrime(c+i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}