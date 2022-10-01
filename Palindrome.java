import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        int k,n=0;
        while(a!=0)
        {
            k=a%10;
            n=n*10+k;
            a=a/10;
        }
        if(n==b)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}