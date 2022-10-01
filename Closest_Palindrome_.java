import java.util.Scanner;
class Closest_Palindrome
{
    public static boolean pal(int n)
    {
        int b=n;
        int k,f=0;
        while(n!=0)
        {
            k=n%10;
            f=f*10+k;
            n=n/10;
        }
        if(f==b)
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
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int k=0,d=0;
        for(int i=a+1;i<=a+1000;i++)
        {
            if(pal(i))
            {
                k=i;
                break;
            }
        }
        for(int i=a-1;i>=1;i--)
        {
            if(pal(i))
            {
                d=i;
                break;
            }
        }
        if(k-a==a-d)
        {
            System.out.print(d+" "+k);
        }
        if(k-a<a-d)
        {
            System.out.print(k);
        }
        if(k-a>a-d)
        {
            System.out.print(d);
        }
        
        
    }
}