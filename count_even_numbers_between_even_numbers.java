import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            if(x[i-1]%2==0 && x[i+1]%2==0)
            {
                if(x[i]%2==0)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
        
    }
}