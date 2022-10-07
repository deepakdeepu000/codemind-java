import java.util.*;
class pal
{
    public static int pali(int n)
    {
        int r,d=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d*10+r;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            if(b==pali(b))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}