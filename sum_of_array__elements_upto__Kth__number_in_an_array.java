import java.util.*;
class sum_upto_kth_element
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
        int k=sc.nextInt();
        int s=0;
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                s+=x[i];
            }
        }
        System.out.print(s);
    }
}