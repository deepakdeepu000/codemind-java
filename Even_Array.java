import java.util.Scanner;
class First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int i,count=0;
        for(i=0;i<n;i++)
        {
           x[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
           if(x[i]%2!=0)
           {
               count++;
           }
            
        }
        if(count==0)
            System.out.print("True");
        else
            System.out.print("False");
        
    }
}