package hello;

public class q7 {

	public static void main(String[] args) 
	{
		int i,c;
        for(i=2,c=1;c<=10001;i++)
        {
              int flag=0;
        for(int j=2;j<i;j++)
        {
             if(i%j==0)
             {
                  flag=1;
                  break;
             }
        }
        if(flag==0)
             c++;
        }
   System.out.println((i-1)+" is the 10001 st prime number.");

	}

}
