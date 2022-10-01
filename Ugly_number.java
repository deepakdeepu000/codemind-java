import java.util.*;
class Valid_num{
    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
	    public static void main(String args[])
	    {
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        int k=0;
	        if(n<0)
	        {
	            System.out.print("Not Ugly Number");
	        }
	        else
	        {
	            for(int i=1;i<=n;i++)
	            {
	                if(n%i==0)
	                {
	                    if(isPrime(i))
	                    {
	                        if(i!=2 && i!=3 && i!=5)
	                        {
	                            System.out.print("Not Ugly Number");
	                            k+=1;
	                            break;
	                        }
	                    }
	                }
	            }
	            if(k==0)
	            {
	                System.out.print("Ugly Number");
	            }
	        }
	  }
	

}
