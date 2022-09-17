import java.util.Scanner;
class Sum_odd_uniq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int ele:x)
        {
            if(ele==k)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}