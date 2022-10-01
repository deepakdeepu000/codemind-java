import java.util.*;
class Largest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0,k;
        while(n!=0)
        {
            k=n%10;
            if(max<k)
            {
                max=k;
            }
            n=n/10;
            
        }
        System.out.print(max);
    }
}