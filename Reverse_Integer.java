import java.util.*;
class Reverse
{
    public static int rev(int n)
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
        int n=sc.nextInt();
        if(n<0)
        {
            int k=rev(Math.abs(n));
            System.out.print(k*-1);
        }
        else
        {
            System.out.print(rev(n));
        }
    }
}