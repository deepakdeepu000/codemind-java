import java.util.*;
class fact
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return n;
        }
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            int n=sc.nextInt();
            System.out.println(fact(n));
        }
    }
}