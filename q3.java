package hello;
import java.util.*;
public class q3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);     
		    long n=600851475143l;
		    long max=0l;
		     for(long i=2l;i<=Math.sqrt(n);i++)
		     {
		          if(n%i==0)
		               {
		                   int y=isprime(i);
		                   if(y==0)
		                    {max=i;}
		               }
		          
		     }
		     System.out.println("\nLARGEST PRIME FACTOR="+max);
	}
		     static int isprime(long i2)
		{
		     int flag=0;
		          for(long i=2l;i<i2;i++)
		     {
		          if(i2%i==0)
		          {
		               flag=1;
		               break;
		          }
		     }
		          if(flag==1)
		        	  return 1;
		          else
		               return 0;
		}

}
	

