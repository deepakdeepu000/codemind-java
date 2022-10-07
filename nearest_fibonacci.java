import java.util.*;
class Nearest_Fib

{
    public static boolean fib(int n)
    {
        int k=0,p=1;
        int s=k+p;
        while(s<n)
        {
            s=k+p;
            k=p;
            p=s;
        }
        if(s==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,k=0,q=0;
        for(int i=n;i>=0;i--)
        {
            if(fib(i))
            {
                k=i;
                break;
            }
        }
        while(temp!=0)
        {
            if(fib(temp))
            {
                q=temp;
                break;
            }
            temp++;
        }
        if((n-k)<(q-n))
        {
            System.out.print(k);
        }
        else if((n-k)==(q-n))
        {
            System.out.print(k+" "+q);
        }
        else
        {
            System.out.print(q);
        }
    }
}