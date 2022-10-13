import java.util.*;
class Profile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=b;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n<a || m<a)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(m==n)
            {
                System.out.println("ACCEPTED");
                
            }
            else if(n==a && m==a)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}
