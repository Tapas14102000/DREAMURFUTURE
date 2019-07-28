package hello;

public class q5
{

	public static void main(String[] args) 
	{
		 int k=2520,flag=0;
		 while(flag==0)
		 {
	            for(int i=11;i<=20;i++)
	             {
	               if(k%i!=0)
	                    {k++;break;}
	               else if(i==20)
	                    {
	            	   	 flag=1;
	                    	 System.out.println(k+" is the smallest positive no. that is evenly divisible by all of the numbers from 1 t0 20.");  
	                         break;
	                    }
	             }
		 }    
	   
	     
	}

}
