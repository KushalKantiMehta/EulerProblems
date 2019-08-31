
public class Euler9 {

	public static void main(String[] args) {
		
		double c;
		double sqc;
		for(int a=1;a<1000;a++)
		{
			for(int b=a+1;b<1000;b++)
			{
				sqc=Math.pow(a, 2)+Math.pow(b, 2);
				c=Math.sqrt(sqc);
				if(a+b+c==1000)
				{
					System.out.println("the product of the req a,b,c is "+(a*b*c));
					break;
				}
				
			}
		}

	}

}
