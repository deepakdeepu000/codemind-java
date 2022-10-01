import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,k,s=0;
        int b=n,g;
        while(n!=0)
        {
            c+=1;
            k=n%10;
            s=s*10+k;
            n=n/10;
        }
        int sum=0;
        for(int i=1;i<c+1;i++)
        {
            g=s%10;
            sum=sum+(int)Math.pow(g,i);
            s=s/10;
        }
        if(b==sum)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}