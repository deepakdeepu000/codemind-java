import java.util.*;
class Strong_Number
{
    public static int fact(int n)
    {
        if (n==0)
        {
            return 1;
        }
        return (n*fact(n-1));
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=n,s=0,p=0;
       while(k!=0)
       {
           p=k%10;
           s+=fact(p);
           k=k/10;
       }
       if(n==s)
       {
           System.out.print("The number "+n+" is a strong number");
       }
       else
       {
           System.out.print("The number "+n+" is not a strong number");
       }
       
      }
}