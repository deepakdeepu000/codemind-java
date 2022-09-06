import java.util.Scanner;
class carcost
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i;
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            float x1,x2,y1,y2;
            x1=sc.nextFloat();
            x2=sc.nextFloat();
            y1=sc.nextFloat();
            y2=sc.nextFloat();
            if ((y1/x1)<(y2/x2))
            {
                System.out.print(-1+"
");
            }
            else if((y1/x1)==(y2/x2))
            {
                System.out.print(0+"
");
            }
            else
            {
                System.out.print(1+"
");
            }
        }
    }
        
}   