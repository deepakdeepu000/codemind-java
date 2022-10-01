import java.util.*;
class Automoraphic{
public static int rev(int n)
{
    int a=0,t=0;
    while(n!=0)
    {
        a=n%10;
        t=t*10+a;
        n=n/10;
    }
    return t;
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,a=0;
        //System.out.println(n);
        int k=(int)Math.pow(n,2);
        //System.out.println(k);
        int s=(int)Math.log10(n)+1;
        //System.out.println(s);
        int m=(int)Math.log10(k)+1;
        //System.out.println(m);
        for(int i=0;i<m/2;i++)
        {
            a=k%10;
            t=t*10+a;
            k=k/10;
        }
        if(n==rev(t))
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
        
        
    }
    
}