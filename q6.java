package hello;

public class q6 {

	public static void main(String[] args) 
	{
		System.out.println(squarediff(100));
	}
	static int squarediff(int n)
	{
		int l,k,m;
		l=(n*(n+1)*(2*n+1))/6;
		k=(n*(n+1))/2;
		k*=k;
		m=(l-k);
		if(m<0)
		   return -m;
		else
			return m;
	}

}
