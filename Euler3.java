
public class Euler3 {

	public static void main(String[] args) {
		int a[] =new int [50];
	    long b=600851475143;
		int c=0;
		int d=0;
		for (int i=2;i<b;i++)
		{
			while(b%i==0)
			{
				a[c]=i;
				c++;
				b=b/i;
			}
		}
		for(int j=0;j<50;j++)
		{
			if(a[j=1]>a[j])
				d=a[j+1];
		}
		System.out.println("largest prime factor of number "+b+"is "+d);
	}

}
