import java.util.*;

class Happy {
    public static int happy(int n)
    {
        int k,a=0;
        while(n!=0)
        {
           k=n%10;
           n=n/10;
           a+=(k*k);
        }
        return a;
    }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=0;
	    while(n>=10)
	    {
	        m=happy(n);
	        n=m;
	    }
		if(m==1 || m==7)
		{
		    System.out.print("True");
		}
		else
		{
		    System.out.print("False");
		}

	}

}