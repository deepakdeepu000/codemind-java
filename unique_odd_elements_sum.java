import java.util.*;
class UQ_odd
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int[] y=new int[100];
        int s=0;
        for(int i=0;i<n;i++)
        {
            int m=0;
            for(int j=0;j<s;j++)
            {
                if(y[j]==x[i])
                {
                    m++;
                }
            }
            if(m==0)
            {
                y[s++]=x[i];
            }
        }
        int c=0,sum=0;
        for(int j=0;j<s;j++)
        {
           if(y[j]%2!=0)
           {
               sum+=y[j];
           }
        }
        System.out.print(sum);
        
        
    }
}