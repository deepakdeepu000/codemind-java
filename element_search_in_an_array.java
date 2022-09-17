import java.util.Scanner;
class Sum_odd_uniq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f=0;
        n=sc.nextInt();
        int[] x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int ele:x)
        {
            if(ele==k)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}