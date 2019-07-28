package hello;

public class q4 {

	public static void main(String[] args)
	{
	int max=-1,i,j;
	     for( i=999;i>=100;i--)
	     {
	          for( j=100;j<=999;j++)
	          {
	               int k=i*j;
	               String ans=String.valueOf(k);
	               StringBuffer rev=new StringBuffer(ans);
	               rev.reverse();
	               if(ans.contentEquals(rev)&&k>max)
	               {max=k;}
	          }
	               
	     }
	     System.out.println(max+" is the largest palindrome number.");


	}


}
