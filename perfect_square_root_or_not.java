import java.util.*;
class Perfect_square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k = (int)Math.sqrt(n);
        if((k*k)==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}
