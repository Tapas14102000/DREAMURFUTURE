package hello;

public class q7 {

	public static void main(String[] args) 
	{
		  int i,j,k=0,c=2;
	     for(i=1;c<10001;i++)
	     {
	          if(isprime((6*i)-1)==0)
	               {k=(6*i)-1;c++;}
	          if(isprime((6*i)+1)==0&&c<10001)
	               {k=(6*i)+1;c++;}
	     }
	     System.out.println("Result="+k);
	}
	 static int isprime(int a)
	{
	     for(int i=2;i<=Math.sqrt(a);i++)
	     {
	          if(a%i==0)
	               return 1;
	          else
	               ;
	     }
	     return 0;
	}
}
