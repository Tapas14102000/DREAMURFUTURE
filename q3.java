package hello;
import java.util.*;
public class q3 {

	public static void main(String[] args) 
	{
		    
	    long n=600851475143l;
	    long a=0l,b=2l;
	    while(b<=n)
	    {
	    	while(n%b==0)
	    	{
	    		a=b;
	    		n/=b;
	    	}
	    	b++;
	    }
	    System.out.println(b-1);

	}

}
	

