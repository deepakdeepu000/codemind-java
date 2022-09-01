import java.util.Scanner;
class Handshakes
{
 public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        c=(a*(a-1))/2;
        System.out.print(c);
 }
}