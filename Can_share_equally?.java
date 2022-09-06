import java.util.Scanner;
class electricity
{
      public static void main(String[] args)
      {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a%2==0 && (a>0 || b%2==0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
      }
}