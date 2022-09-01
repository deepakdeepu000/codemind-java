import java.util.Scanner;
class Circle
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a;
        float s,area;
        a=sc.nextInt();
 
        area=(float)3.14*(a*a);
        System.out.format("%.2f",area);
 }
}