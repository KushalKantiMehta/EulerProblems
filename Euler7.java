
public class Euler7 {

	public static void main(String[] args) {
	   
		int n=1;
		int a;
		int c=0;
		int prime=0;
		while(c!=10001)
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
				c++;
				prime=n;
			}
		}
		System.out.println("the 10001 prime no is "+ prime);

	}

}
