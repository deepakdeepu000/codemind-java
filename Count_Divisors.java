import java.util.*;
class divisiors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int k=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                k++;
            }
        }
        System.out.print(k);
    }
}