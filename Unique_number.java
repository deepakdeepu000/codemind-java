import java.util.*;
class Unique_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0,n=0,t=0,c=0,m=0;
        int a=sc.nextInt();
        int[] x=new int[100];
        int k=a;
        while(k!=0)
        {
            m=k%10;
            k=k/10;
            n+=1;
            x[s++]=m;
        }
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(x[j]==x[i])
                {
                    c+=1;
                }
            }
            if(c==1)
            {
                t+=1;
            }
            c=0;
        }
        if(n==t)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
        
    }
}
