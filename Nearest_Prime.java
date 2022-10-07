import java.util.*;
class Nearest_prime
{
    public static boolean isPrime(int n)
    {
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
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int temp=k,m=0,x=0;
            for(int j=k;j>=0;j--)
            {
                if(isPrime(j))
                {
                    m=j;
                    break;
                }
            }
           
            while(temp!=0)
            {
                if(isPrime(temp))
                {
                    x=temp;
                    break;
                }
                temp++;
            }
          
            if((k-m)<(x-k))
            {
                System.out.println(m);
            }
            else if((k-m)==(x-k))
            {
                System.out.println(m);
            }
            else
            {
                System.out.println(x);
            }
        }
    }
}