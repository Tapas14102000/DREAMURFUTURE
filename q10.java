package hello;

public class q10 {

	public static void main(String[] args)
	{
		 double s=0;int i,j;
	     for(i=2;i<2000000;i++)
	     {
	      if(isprime(i)==0)
	      {  s+=i;}
	      	
	     }
	     System.out.println("\nSUM="+s);

	     

	}
	static int isprime(int a)
	{
	          for(int i=2;i<=Math.sqrt(a);i++)
	     {
	          if(a%i==0)
	          {
	           return 1;    
	          }
	          else
	        	  ;
	     }
	          return 0;
	     
	}


}
