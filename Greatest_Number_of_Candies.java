import java.util.*;

class Greater_no_of_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> L = new ArrayList<Integer>();
		//List<String> list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			L.add(sc.nextInt());
		}
		int k=sc.nextInt();
		int max=Collections.max(L);
		for(int i=0;i<n;i++)
		{
			if(L.get(i)+k>=max)
			{
				System.out.print("True"+" ");
			}
			else if(L.get(i)+k<max)
			{
				System.out.print("False"+" ");
			}
		}

	}

}
