import java.util.*;
class Weird
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
		    int k=sc.nextInt();
		    int[] x=new int[k];
		    int one=0,o=0,p=0;
		    
		    for(int i=0;i<k;i++)
		    {
		        x[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<k;i++)
		    {
		        if((x[i]&1)!=0)
		        {
		            o++;
		        }
		    }
		    
		    if(o>0)
		    {
		        p=o/2;
		    }
		    System.out.println(p);
		}
		
    }
}