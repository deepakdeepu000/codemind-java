import java.util.Scanner;
class convertion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        float F;
        a=sc.nextInt();
        b=sc.nextInt();
        F=(float)(a+b)/2;
        System.out.format("%.4f",F);
    }
}