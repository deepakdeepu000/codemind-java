import java.util.*;
class Neon_Number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n*n;
        int s=0;
        while(k!=0)
        {
            int p=k%10;
            s+=p;
            k=k/10;
        }
        if(s==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        
    }
}