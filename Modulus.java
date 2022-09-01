import java.util.Scanner;
class Triangle
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=(int)(a%b);
        System.out.format("%d",c);
 }
}