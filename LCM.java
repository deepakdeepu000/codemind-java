import java.util.*;
class LCM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k = (a>b)?a:b;
        while(true)
        {
            if(k%a==0 && k%b==0)
            {
                System.out.print(k);
                break;
            }
            k++;
        }
        
        
    }
}