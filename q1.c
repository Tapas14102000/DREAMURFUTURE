//MULTIPLES OF 3 AND 5
#include<stdio.h>
void main()
{
     int s=0;
     for(int i=0;i<1000;i++)
     {
          if(i%3==0||i%5==0)
               s+=i;
     }
     printf("\nRESULT=%d",s);
}