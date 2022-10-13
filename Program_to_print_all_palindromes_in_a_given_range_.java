import java.util.*;
class pal_in_range
{
    public static boolean pal(int n)
    {
        int k=n,s=0,a;
        while(k!=0)
        {
            a=k%10;
            s=s*10+a;
            k=k/10;
        }
        if(s==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i<10)
            {
                System.out.print(i+" ");
            }
            else if (i==10)
            {
                continue;
            }
            else
            {
                if(pal(i))
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}