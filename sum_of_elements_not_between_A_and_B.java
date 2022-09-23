import java.util.*;
class Sum_of_elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int k=0,i;
        for(i=0;i<n;i++)
        {
           x[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]<a || x[i]>b)
            {
                 k+=x[i];
            }
        }
        System.out.print(k);
    }
}
