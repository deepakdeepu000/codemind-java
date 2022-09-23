import java.util.*;
class min_bt_a_and_b
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] y=new int[100];
        int s=0,max;
        for(int i=0;i<n;i++)
        {
            if(x[i]>=a && x[i]<=b)
            {
               y[s++]=x[i]; 
            }
        }
        if(s==0)
        {
            System.out.print(-1);
        }
        else
        {   
            max=y[0];
            for(int j=0;j<s;j++)
            {
                if(y[j]>max)
                {
                  max=y[j];
                }
            }
            System.out.print(max);
        }
        
        
    }
}