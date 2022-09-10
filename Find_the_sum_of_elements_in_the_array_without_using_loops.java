import java.util.Scanner;
class add_elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,x[],c=0,i;
        a=sc.nextInt();
        x=new int[a];
        for(i=0;i<a;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int ele:x)
        {
            c+=ele;
        }
        System.out.print(c);
    }
    
}