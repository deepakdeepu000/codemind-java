import java.util.Scanner;
class electricity
{
      public static void main(String[] args)
      {
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        float t = sc.nextInt();
        if (t>0 && t<199)
        {
           double k = (t*1.20)+100;
           System.out.format("%.2f",k);
        }
        else if (t>200 && t<=400)
        {
           if(t*1.50>400)
           {
               double q =(t*1.50)+(15*(t*1.50))/100;
               System.out.format("%.2f",q);
           }
           else
           {
               double q =(t*1.50)+100;
               System.out.format("%.2f",q);
           }
        }
        else if (t>400 && t<=600)
        {
            double r = (t*1.80)+(15*(t*1.80))/100;
            System.out.format("%.2f",r);
        }
        else
        {
            double s = (t*2.00)+(15*(t*2.00))/100;
            System.out.format("%.2f",s);
        }
      }
     
}