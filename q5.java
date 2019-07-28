package hello;

public class q5
{

	public static void main(String[] args) 
	{
		long tlcm=1l;
		for(long i=1l;i<=20;i++)
			tlcm=lcmf(i,tlcm);
		System.out.println(tlcm+" is the smallest positive no. that is evenly divisibe by all of the numbers from 1 to 20 .");
	}
	static long lcmf(long a,long b)
	{
		long m=a,n=b,gcd=0;
		while(a!=b)
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		gcd=a;
		return (m*n)/gcd;
			
		
	}

}
