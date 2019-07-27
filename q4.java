package hello;

public class q4 {

	public static void main(String[] args)
	{
		 int max=-1,i,j=0;
	     for( i=100;i<1000;i++)
	     {
	          for( j=100;j<1000;j++)
	          {
	               int k=i*j;
	               int ans=ispalindrome(k);
	               if(ans==0&&k>max)
	               {max=k;}
	          }
	               
	     }
	     System.out.println(max+" is the largest palindrome number.");


	}
	static int ispalindrome(int a)
	{
	     int k=a,s=0;
	     while(a!=0)
	     {
	          int r=a%10;
	          s=s*10+r;
	          a/=10;
	     }
	     if(k==s)
	          return 0;
	     else
	          return 1;

	}


}
