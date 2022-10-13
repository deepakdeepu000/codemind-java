import java.util.*;
class prime_pal {
	public static boolean ispal(int n)
    {
        int c,s=0;
        int a=n;
        while(a!=0)
        {
            c=a%10;
            s=s*10+c;
            a=a/10;
        }
        if(s==n)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
            
        }
        return true;
    }

	public static void main(String[] args) {

		    
		   
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		            for(int i=n+1;i!=0;i++)
    		        {
    		            if(isPrime(i))
    		             {
    		                    if(ispal(i))
    		                    {
    		                        System.out.println(i);
    		                        break;
    		                    }
    		                    
    		                }
    		        }
		        
		        
	}

}
