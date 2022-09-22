import java.util.Scanner;
class Value_same_As_Count
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] x=new int[n];
	    int i,l=0,j;
	    for(i=0;i<n;i++)
	    {
	        x[i]=sc.nextInt();
	    }
	    int[] k=new int[100];
	    int s=0;
	    for(i=0;i<n;i++)
	    {
	        int c=0;
	        for( j=0;j<s;j++)
	        {
    	        if(k[j]==x[i])
    	        {
    	            c++;
    	        }
	        
    	    }
    	    if (c==0)
    	    {
    	        k[s++]=x[i];
    	    }
	    }
	    int h=0;
	    int t=sc.nextInt();
	    for(j=0;j<s;j++)
	    {
	        int m=0;
	        for(i=0;i<n;i++)
	        {
	            if(k[j]==x[i])
	            {
	                m++;
	            }
	        }
	        if(m==t)
	        {
	            System.out.print(k[j]+" ");
	            h++;
	        }
	    }
	    if(h==0)
	    {
	        System.out.print(-1);
	    }
	}
}