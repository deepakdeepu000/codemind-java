import java.util.*;
class N_and_Pow_of_2

{
    public static int powerdown(int n)
    {
        int p=(int)(Math.log(n)/Math.log(2));
        return (int)Math.pow(2,p);
    }
    public static int min(int n)
    {
        int left=powerdown(n);
        int right=left*2;
        
        return Math.min(n-left,right-n);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(min(n));
    }
}