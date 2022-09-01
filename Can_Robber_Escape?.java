import java.util.Scanner;
class Robber
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a,b[],c=0,i;
        a=sc.nextInt();
        b=new int[a];
        for(i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int ele:b)
        {
            if(ele%2!=0)
            {
                c+=1;
            }
            
        }
        if (c<=2)
        {
            System.out.print("YES");
            
        }
        else
        {
            System.out.print("NO");
        }
 }
}