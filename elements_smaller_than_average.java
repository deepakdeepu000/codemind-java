import java.util.Scanner;
class First
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int[] arr=new int[a];
	    int i,k=0,l=0;
	    for(i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	        k+=arr[i];
	    }
	    int avg;
	    avg=k/a;
	    for(int ele:arr)
	    {
	        if (ele<=avg)
	        {
	            l++;
	        }
	    }
	    System.out.print(l);
	}
}