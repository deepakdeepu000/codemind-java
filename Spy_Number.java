import java.util.*;
class Spy_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,p=1,k=0;
        while(n!=0)
        {
            k=n%10;
            s+=k;
            p*=k;
            n=n/10;
        }
        if(s==p)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}