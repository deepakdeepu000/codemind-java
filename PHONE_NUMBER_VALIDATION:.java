import java.util.*;
class Valid_num{
	    public static void main(String args[])
	    {
	        Scanner sc =new Scanner(System.in);
	        String s=sc.nextLine();
	        char[] x=s.toCharArray();
	        if(x[0]=='0')
	        {
	            System.out.print("Invalid");
	        }
	        else
	        {
	            if(x.length==10)
	            {
	                System.out.print("Valid");
	            }
	            else
	            {
	                System.out.print("Invalid");
	            }
	        }
	    }
	

}
