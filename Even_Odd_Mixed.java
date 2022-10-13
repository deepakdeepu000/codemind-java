import java.util.*;
class Mixed
{
    public static void mixed(int n)
    {
        int k=n,a,e=0,o=0,c=0;
        while(n!=0)
        {
            a=n%10;
            if(n%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            n=n/10;
            c++;
        }
        if(c==e)
        {
            System.out.print("Even");
        }
        else if(c==o)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        mixed(a);
    }
}