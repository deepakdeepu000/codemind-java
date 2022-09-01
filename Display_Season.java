import java.util.Scanner;
class Triangle
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a>12)
        {
            System.out.print("-1");
        }
        else if(a>=4 && a<=6)
        {
            System.out.print("Summer");
        }
        else if(a>=7 && a<=10)
        {
            System.out.print("Rainy");
        }
        else if(a>=11 && a<=12 || a==1)
        {
            System.out.print("Winter");
        }
        else
        {
            System.out.print("Spring");
        }
        
    }
}
        
        