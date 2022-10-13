import java.util.*;
class REverse_pal
{
    public static int rev(int a)
    {
        int k=a,b,s=0;
        while(k!=0)
        {
            b=k%10;
            s=s*10+b;
            k=k/10;
        }
        return s;
    }
    public static boolean ispal(int n)
    {
        int k=n,b,s=0;
        while(k!=0)
        {
            b=k%10;
            s=s*10+b;
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
        int n=a+rev(a);
        while(a!=0)
        {
            
            if(ispal(n))
            {
                System.out.print(n);
                break;
            }
            else
            {
                n=n+rev(n);
            }
        }
        
    }
}