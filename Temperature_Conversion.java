import java.util.Scanner;
class convertion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        float F;
        a=sc.nextInt();
        F=((a*9)/5)+32;
        System.out.format("%.2f",F);
    }
}