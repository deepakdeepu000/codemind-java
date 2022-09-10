import java.util.Scanner;
class Palindrome
{
    public static int pal(int n)
    {
        int r,d=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            d=d*10+r;
        }
        return d;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b[],i;
        b=new int[a];
        int k,n=0;
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int ele:b)
        {
            if(ele==pal(ele))
            {
            c++;
            }
        }
        System.out.print(c);
        
    }
}