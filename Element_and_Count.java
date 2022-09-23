
import java.util.*;

class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i;
		int[] x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		int[] y=new int[100];
        int l=0,j;
        for(i=0;i<n;i++)
        {
            int c=0;
            for( j=0;j<l;j++)
            {
                if(y[j]==x[i])
                {
                    c++;
                }
            }
            if(c==0)
            {
                y[l++]=x[i];
            }
        }
		for(j=0;j<l;j++)
		{
			int m=0;
			for(i=0;i<n;i++)
			{
				if(y[j]==x[i])
				{
					m++;
				}	
			}
			System.out.print(y[j]+" " +m+' ');
			
			
		}

	}

}
