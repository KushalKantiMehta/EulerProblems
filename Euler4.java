
public class Euler4 {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		int e;
		int m,n;
		int c,rem;
		int f;
		int g=0;
		for (int i=100;i<1000;i++)
		{
			for(int j=i;i<1000;j++)
			{
				c=i*j;
				e=c;
				m=0;
				n=0;
				while(c!=0)
				{
					rem=c%10;
					a[m]=rem;
					c=c/10;
					n++;
					m++;
				}
				if(n%2==0) 
				{
				   if(a[0]==a[5] && a[1]==a[4] && a[2]==a[3])
				   {
					   f=e;
					   if(f>g)
						 g=f;
				   }
					   
				}
			}
			System.out.println("largest palindromic no is "+g);
		}

	}

}
