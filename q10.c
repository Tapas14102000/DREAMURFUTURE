//SUMMATION OF PRIMES
#include<stdio.h>
void main()
{
     int s=0,i,j;
     for(i=2;i<2000000;i++)
     {
           for(j=2;j<i;j++)
          {
               if(i%j==0)
               {
                    break;
               }
          }
      if(j==i)
          s+=i;

     }

     printf("\nSUM=%d",s);
}
