import java.util.*;
class Power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        int s=(int)Math.pow(n,k);
        System.out.print(s%m);
        
    }
}