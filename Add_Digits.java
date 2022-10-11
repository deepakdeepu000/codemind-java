import java.util.Scanner;
class ADD_digi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k,c=0;
        while(a>9)
        {
            while(a!=0)
            {
                k=a%10;
                a=a/10;
                c+=k;
            }
            a=c;
            c=0;
        }
        System.out.print(a);
    }
}