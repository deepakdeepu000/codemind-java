import java.util.*;
class Unique_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0,p=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        for (int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                p+=i;
            }
        }
        if(p==a && s==b)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}
