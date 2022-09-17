import java.util.Scanner;
class Primes_greater_than_k
{
    public static boolean isprime(int n)
    {
        if (n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k;
        int c=0;
        float s=0;
        n=sc.nextInt();
        int[] x=new int[n];
        
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int ele:x)
        {
            if(isprime(ele))
            {
                s=s+ele;
                c++;
            }
        }
        System.out.printf("%.2f",s/c);
    }
    
}