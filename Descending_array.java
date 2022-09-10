import java.util.Scanner;
class Decending_array
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b[],i;
        b=new int[a];
        int k,c=0;
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<a-1;i++)
        {
            if(b[i]<b[i+1])
            {
               c++;
            }
        }
        if (c>0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
        
    }
}