import java.util.Scanner;
class fibonacciseries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),i,j,f=0;
		int[] arr=new int[a];
		arr[0]=0;
		arr[1]=1;
		for(i=2;i<a;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		for(i=0;i<a;i++)
		{
			if(a==arr[i])
			{
			    f=1;
			    break;
			}
		}
		if(f==1)
		{
		    System.out.print("True");
		}
		else
		{
		    System.out.print("False");
		}

	}

}