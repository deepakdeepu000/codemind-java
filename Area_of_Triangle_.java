import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        float s,A;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        A=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",A);
    }
}