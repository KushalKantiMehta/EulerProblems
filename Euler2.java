
public class Euler2 {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		for(int i=0;b<4000000;i++)
		{
			c=a+b;
			a=b;
			b=c;
		    if(b%2==0 && b<4000000)
			  sum=sum+b;
	    }
		System.out.println("Sum of even Fibonacci numbers below 4 million is "+sum);
	}

}
