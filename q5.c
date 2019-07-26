//SMALLEST MULTIPLE
#include<stdio.h>
void main()
{
     int a=1,k=1;
     while(a!=0)
     {
          int flag=0;
          for(int i=1;i<=20;i++)
          {
               if(k%i!=0)
                    break;
                    else if(i==20)
                    {
                         flag=1;
                         break;
                    }
          }
          k++;
          if (flag==1)
          {
               a=0;
               printf("\n%d is the smallest positive no. that is evenly divisible by all of the numbers from 1 t0 20.",k-1);
          }
     }
}
