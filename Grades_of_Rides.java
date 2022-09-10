import java.util.Scanner;
class grades
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>50 && b>60 && c>100)
        {
            System.out.print(10);
        }
        else if (a>50 && b>60 && c<100)
        {
            System.out.print(9);
        }
        else if (a<50 && b>=60 && c>100)
        {
            System.out.print(8);
        }
        else if (a>50 && b<60 && c>100)
        {
            System.out.print(7);
        }
        else if (a>50 || b>60 || c>100)
        {
            System.out.print(6);
        }
        else
        {
            System.out.print(5);
        }
    }
    
}