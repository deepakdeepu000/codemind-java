import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a,b,x[],i;
        int c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int ele:x)
        {
            if(ele%b==0)
            {
                c+=1;
            }
        }
        System.out.print(c);
        
    }
}