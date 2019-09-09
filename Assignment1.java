import java.util.Scanner;
public class Assignment1 
   {
      int real;
      int img;
      static void display(Assignment1 x) 
      {
    	  System.out.print("real part is "+ x.real);
    	  System.out.println(" and imaginary part is "+ x.img);
    	  System.out.println("so the complex no is "+x.real+"+"+x.img+"i");
      }
      static int rsum(Assignment1 a,Assignment1 b)
      {
    	  int sumr=a.real+b.real;
    	  return sumr;
      }
	  static int isum(Assignment1 a,Assignment1 b)
	  {
		  int sumi=a.img+b.img;
		  return sumi;
	  }
	public static void main(String[] args)
	 {
       Scanner ab=new Scanner(System.in);
       Assignment1 x=new Assignment1();
       Assignment1 y=new Assignment1();
       Assignment1 z=new Assignment1();
       System.out.println("Enter first complex no");
       x.real=ab.nextInt();
       x.img=ab.nextInt();
       x.display(x);
       System.out.println("Enter 2nd complex no");
       y.real=ab.nextInt();
       y.img=ab.nextInt();
       y.display(y);
       z.real=rsum(x,y);
       z.img=isum(x,y);
       System.out.println("The sum two complex no is and has ");
       z.display(z);
       
     }

}
