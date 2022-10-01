import java.util.*;
class Adam
{
    public static void gcd(int n,int a)
    {
        int temp,b=0;
        if(n<a)
        {
            temp=n;
            n=a;
            a=temp;
        }
        b=n;
        while(n!=0)
        {
            if(n%b==0 && a%b==0)
            {
                System.out.print(b);
                break;
            }
            b-=1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        gcd(n,a);
    }
}