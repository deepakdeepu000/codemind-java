import java.util.*;
class Valid_perfect_square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int k=sc.nextInt(),l=0;
            
            if(Math.pow((int)Math.sqrt(k),2)==k)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}