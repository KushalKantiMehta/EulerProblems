
public class Euler6 {

	public static void main(String[] args) {
		int a=1;
		int n=20;
		int d=1;
		int sum;
		int sqsum;
		double diff;
		double sumsq;
		sum= (n*(2*a+(n-1)*d))/2;
		sumsq =Math.pow(sum, 2);
		sqsum = (n*(n+1)*(2*n+1))/6;
		diff=sumsq-sqsum;
        System.out.println("difference of sum of sq and sq of sums is "+diff);
	}

}
