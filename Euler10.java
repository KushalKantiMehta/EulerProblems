
public class Euler10 {

	public static void main(String[] args) {
		
		int n=1;
		int a;
		int prime=0;
		long sum=0;
		while(prime<2000000)
		{
			a=0;
			n++;
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
					a=a+1;
			}
			if(a==2)
				{
				     prime=n;
				     sum=sum+prime;
				}
		}
		System.out.println("sum of prime below 2 million is "+sum);
	}

}


