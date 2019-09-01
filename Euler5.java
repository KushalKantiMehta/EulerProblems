
public class Euler5 {

	public static void main(String[] args) {
		int n=0;
		int range=20;//as we have find from 1 to 20
		int count=0;
		for (int i=20;i>0;i++)
		{  count=0;
			for(int j=1;j<=range;j++)
			{  
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==20)
			{
				n=i;
				break;
			}
		}
        System.out.println("the smallest no divisible by 1 to 20 is "+n);
	}

}
