import java.util.*;
class Abs_diff_prime
{
    public static int min(int n,int m)
    {
        if(n<m)
        {
            return n;
        }
        else
        {
            return m;
        }
    }
    public static boolean prime(int n)
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
        int temp=n,k=0,p=0;
        for(int i=n;i>=0;i--)
        {
            if(prime(i))
            {
                k=i;
                break;
            }
        }
        while(temp!=0)
        {
            if(prime(temp))
            {
                p=temp;
                break;
            }
            temp++;
        }
        System.out.print(min((n-k),(p-n)));
    }
}
