//EVEN FIBONACCI NUMBERS
#include<stdio.h>
void main()
{
     int s=2,t1=1,t2=2,nt=0;
     while(nt<4000000)
     {
          nt=t1+t2;
          t1=t2;
          t2=nt;
          if(nt%2==0)
               s+=nt;
     }
     printf("\nRESULT=%d",s);
}
