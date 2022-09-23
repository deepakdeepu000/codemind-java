import java.util.*;
class Super_elements
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[]x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int[] y=new int[100];
        int s=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<s;j++)
            {
                if(y[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                y[s++]=x[i];
            }
        }
        float sum=0,f=0,k=0;
        for(int j=0;j<s;j++)
        {
            int m=0;
            for(int i=0;i<n;i++)
            {
               if(y[j]==x[i])
               {
                   m++;
               }
            }
            if(y[j]==m)
            {
                sum+=y[j];
                f++;
                k=1;
            }
        }
        if(k==1)
        {
            float avg=sum/f;
            System.out.printf("%.2f",avg);
        }
        else
        {
            System.out.print(-1);
        }
    }
}