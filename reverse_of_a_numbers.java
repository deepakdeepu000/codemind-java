import java.util.*;

class  Reverse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int s=0,k;
		        while(n!=0)
		        {
		            k=n%10;
		            s=s*10+k;
		            n=n/10;
		            
		        }
		        System.out.print(s);
		    
		

	}

}