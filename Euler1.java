
public class Euler1 {

	public static void main(String[] args) {

		int a=3;
		int b=5;
		int c=0;
		int d=0;
		int e=0;
		for(int i=1;c<1000 && e<1000;i++) 
		{
			c=a*i;
			if (c<1000)
				d=d+c;
			e=b*i;
			if(e<1000)
			{
				if(e%3==0)
					continue;
				else
					d=d+e;
			}
		}
		System.out.println("The sum of multiples of 3 or 5 below 1000 is "+d);
	}

}
