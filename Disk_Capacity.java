import java.util.Scanner;
class Triangle
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        float s,area;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=512*2*a*b*c;
        System.out.print(d);
 }
}