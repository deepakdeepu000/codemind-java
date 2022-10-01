import java.util.*;
class Adam
{
    public static int rev(int n)
    {
        int k,s=0;
        while(n!=0)
        {
            k=n%10;
            s=s*10+k;
            n=n/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k,f=0;
        k=n*n;
        f=rev(n);
        int pow=f*f;
        if(k==rev(pow))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}